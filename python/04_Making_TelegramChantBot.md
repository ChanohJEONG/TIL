# 텔레그램 ChatBot 만들기

- ## 준비사항

  ### 1. Telegram api 및 사용법 숙지

  - telegram 검색 -> BotFather 검색 및 대화 시작 -> /newbot -> chatbot기본setting
  - 챗봇 사용 설명서 https://core.telegram.org/bots/api 홈페이지 참조

  

  ### 2. flask 서버 구축

  ```python
  from flask import Flask, escape, request
  
  app = Flask(__name__)## __name__ 에서 name은 사용자 선택사항
  
  @app.route('/') # root로 요청을 보냄
  def hello():
      name = request.args.get("name", "World")
      return f'Hello, {escape(name)}!'
  ```

  

  ### 3. webhook의 개념 및 사용법 숙지

  - webhook이란?

    **- 웹 서비스를 제공하는 서버 측에서 어떠한 이벤트(또는 데이터)를 외부에 전달하는 방법**

  ```python
  from decouple import config
  import requests
  
  token = config("TELEGRAM_BOT_TOKEN")
  url = "https://api.telegram.org/bot"
  pw_url = "https://chanohjeong.pythonanywhere.com/"
  #pythonanywhere 가입 후 web에 flask 서버 구축 후 리로드하여 획득
  ngrok_url = "https://0ba397b6.ngrok.io/"
  #ngrok 다운로드 -> ngrok.exe 실행시 위와 같은 주소 획득(실행마다 주소가 바뀜) 
  
  data = requests.get(f'{url}{token}/setwebhook?url={pw_url}{token}')
  print(data.text)
  # 텔레그램 챗봇에 요청이 들어오면 ngrok주소/pythonanywhere주소로 가세요~라는 뜻 webhook을 통해 flask서버와 telegram서버가 연동이 됨
  #(로컬서버 외부통신을 위해 ngrok사용)
  # Telegram Server -> WebHook -> Local Flask
  # 주소가 변경될때만 주소바꿔서 실행시키면 됨
  ```

  

  ### 4. 기타 python 제공 모듈 (request,decouple-config)

  - **개인정보를 감추기 위해 사용** ex) chat_id(메세지 주소), token(챗봇의 주민번호)

  ____

  

  ```shell
  $ pip install python-decouple
  ```

  - decouple 모듈 import 및 config를 통해 .env에 저장되어 있는 값 가져오기

  ```python
  from decouple import config
  
  token = config("TELEGRAM_BOT_TOKEN")
  #TELEGRAM_BOT_TOKEN명은 .env에서 실제data를 대입한 변수명(사용자지정)
  ```

  

  ### 5. Ngrok Or pythonanywhere 사용

  - ngrok 이란? 

    **- 외부에서 로컬에 접속 가능하게 하는 터널 프로그램 **

  - ngrok 사용법

  ```shell
  $ ngrok http 5000(port번호)
  ```

  - https://www.pythonanywhere.com/ 접속 후 Sign up & log in
  - flask 서버 file upload 및 web 생성(개인URL 할당 후 리로드)

  

  ## - 최종 소스코드

  - **ngrok or pythonanywhere 를 활용하여 flask 서버구축**

  ```python
  from flask import Flask, render_template, request
  from decouple import config
  import requests
  import random
  
  app = Flask(__name__)#flask app 구동
  
  token = config('TELEGRAM_BOT_TOKEN')#.env파일에 저장된 token값 불러오기
  #텔레그램api를 사용하기 위한 사용자 고유 키값
  
  chat_id = config('CHAT_ID')#.env파일에 저장된 chat_id값 불러오기
  #탤레그램 chatbot 생성시 부여한 ID(chtatbot고유번호)
  
  url = "https://api.telegram.org/bot"
  #탤레그램api 사용하기 위한 기초URL
  
  @app.route(f'/{token}', methods=["POST"])#get이 아닌 post형식으로 사용
  #telegram chatbot api 사용법 - 챗봇이 메시지 보내는법
  #f'{url}{token}/sendMessage?chat_id={chat_id}&text={text}'
  #https://api.telegram.org/bot/[부여받은 token값]/함수
  #chat id는 sendMessage함수 사용시 상대방 주소(메세지를 받을 사람 id값)
  #text는 보내고자 하는 메세지의 내용
  
  # 어떻게 작동했는지는 모르지만 app.route('f/{token}/)의 경로는 
  # https://api.telegram.org/bot/본인의 toekn값/ 으로 접속하게 됨
  # 위 URL에 접속하면 본인이 생성한 chatbot의 모든 데이터가 JSON형식으로 나와있음.
  def telegram():
      wholeJ = request.get_json()
      #본인이 생성하여 만든 챗봇의 모든 데이터를 Json형식으로 다 가져옴 
      text = wholeJ['message']['text']#상대가 챗봇에게 입력한 메세지 값 추출
      #python의 dictionary 형태 = JSON의 형태 -> 키값을 활용하여 데이터 추출 
      chat_id = wholeJ['message']['chat']['id']
      #챗봇에게 메세지를 보낸 상대 ID추출 
      
      if text == "안녕":
          return_text = "안녕하세요!"
      elif text == "로또":
          numbers = range(1, 46)
          return_text = random.sample(numbers, 6)
          # numbers안에서 6개 무작위 뽑아줌
      elif text == "배고파":
          return_text = "그만 먹어 뚱뚱아"
      else:
          return_text = "뭐임마?"
      
      requests.get(
          f'{url}{token}/sendMessage?chat_id={chat_id}&text={return_text}')
      	#챗봇이 상대방에게 text값을 메세지 전송하도록 요청
      return "ok", 200
  # Telegram은 요청에 대한 응답이 제대로 수행될때까지 반복하기 때문에 정상응답값 200을 return해야함
  
      
  ################################################################
  #@app.route('/')#메인페이지
  #def hello():
  #    return "Hello ChatBot"
  #
  #
  #@app.route('/write')
  #def write():
  #    return render_template('write.html')
  #
  #
  #@app.route('/send')
  #def send():
  #    text = request.args.get('text')
  #    requests.get(f'{url}{token}/sendMessage?chat_id={chat_id}&text=  
  #{text}') #해당 URL주소에 HTTP request 요청(telegram chatbot api 사용 문법참고)
  #    return render_template('send.html')
  ################################################################    
  
  if __name__ == ("__main__"):
      app.run(debug=True)
  # Debug 모드를 켜놓기 위해 설정 -> 수정사항 저장시 자동 적용
  
  ```

  

  