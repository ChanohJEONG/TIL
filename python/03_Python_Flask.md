# Python Flask

## 1 .Flask 사용방법

- Flask web server 구축 코드

```python
from flask import Flask, escape, request

app = Flask(__name__)## __name__ 에서 name은 사용자 선택사항

@app.route('/') # root로 요청을 보냄
def hello():
    name = request.args.get("name", "World")
    return f'Hello, {escape(name)}!'
```

- Git에서 서버 구동 명령어

```shell
$ env FLASK_APP=hello.py flask run
```

- 단순 py파일 실행으로 서버 구동 하기 위해 추가해야할 명령어

```python
if __name__ == "__main__": #__name__은 flask 생성시 선정한 이름
    app.run(debug=True)
```

## 2. Flask 서버 활용 예시

- ### 기본

```python
from flask import Flask, escape, request, render_template
import random

app = Flask(__name__)
#app 서버 구동

@app.route('/')  # root로 요청을 보냄
# http://127.0.0.1:5000/가 생략된 내용임
def hello():
    name = request.args.get("name", "World")
    return f'Hello, {escape(name)}!'
#도메인주소창에 http://127.0.0.1:5000/로 접속 시 Hello, World 출력

@app.route('/hi')
#도메인주소창에 http://127.0.0.1:5000/hi 입력시 hi.html로 접속
def hi():
    name = "정찬오"
    return render_template('hi.html', html_name=name)
# hi.html을 랜더링 해달라는 뜻
# rener_template을 import 한 후
# Flask 디렉토리내의 반드시 'templates'의 디렉토리 생성 후
# hi.html파일을 생성해야 불러올 수 있음

@app.route('/greeting/<string:name>/')# name은 주소값에서 받아와 사용할 변수명임
#도메인 주소창에 http://127.0.0.1:5000/greeting/사용자 입력(문자열)/ 
#greeting.html로 접속되며 입력된 문자열은 string 형식으로 name 변수에 입력됨
def greeting(name):#name 값 받아옴
    def_name = name#def_name변수에 사용자로부터 받아온 name값 대입
    return render_template('greeting.html', html_name=def_name)
	#greeting.html에 def_name값을 html_name(사용자 지정)이란 이름으로 넘겨줌

@app.route('/cube/<int:num>')#웹에서 http://127.0.0.1:5000/cube/사용자 입력(숫자)
#^3.html로 접속되며 입력된 숫자는 int 형식으로 num에 저장됨
def cube(num): #num값 넘겨주기
    def_num1 = num# def_num1에 받아온 num값 대입
    def_num2 = num**3# def_num2에 num값의 3제곱 값 대입
    return render_template('^3.html', html_num=def_num1, html_num2=def_num2)
	#^3.html에 두 변수 넘겨줌
    
@app.route('/fstring')
def fstring():
    fstring = "정찬오"
    a = "구직자"
    return f"제 이름은 {fstring} {a}입니다."
#도메인 주소창에http://127.0.0.1:5000/fstring입력시 제 이름은 정찬오 구직자입니다.출력

@app.route('/dinner')
def dinner():
    menu = ['삼겹살', '등심', '안심', '우삼겹', '스테이크', '마라탕']
    dinmenu = random.choice(menu) # 랜덤함수를 이용하여 메뉴 무작위 선택
    menu_img = {'삼겹살': 'https://img1.daumcdn.net/thumb/R720x0/?fname=https%3A%2F%2Ft1.daumcdn.net%2Fliveboard%2Fdailylife%2F222d88e5c7dc496c8e8a8a56c3452e52.JPG',
                '등심': 'https://mblogthumb-phinf.pstatic.net/MjAxOD...',
                '안심': 'http://mlb26.cafe24.com/img/hanwoo/01section_ansimstk.png',
                '우삼겹': 'data:image/jpeg;base64,/9j......',
                '스테이크': 'https://mannabox.co.kr/images/detail/mannaboxplus/newsalchisteak/w_head.jpg',
                '마라탕': 'http://img1.tmon.kr/cdn3/deals/2019/05/24/2099407062/original_2099407062_front_935dc_1558688230production.jpg'
                }# '메뉴이름' = 키값, '이미지주소'
    img_url = menu_img[dinmenu]#무작위 선택된 메뉴의 이미지 주소 저장
    # dictionary의 내부 원소 중 키값에 해당하는 ' ' 값을 추출한것임
    return render_template('dinner.html', html_val=dinmenu, menu_img=img_url)
	#도메인 주소창에 http://127.0.0.1:5000/dinner 입력시 dinner.html 접속 및
    #무작위 선정된 메뉴명과 해당 이미지주소값을 html에 넘겨줌

@app.route('/movies')
#도메인 주소창에http://127.0.0.1:5000/movies 입력 시 movies.html로 이동
def movies():
    movies = ['조커', '겨울왕국2', '터미네이터', '어벤져스']
    return render_template('movies.html', movies=movies)
	# movies 값을 html로 넘겨줌

# terminal -> env FLASK_APP=hello.py flask run
# 아래 코드 작성시 단순 python hello.py 명령어로 flask 서버 실행가능
if __name__ == "__main__":
    app.run(debug=True)

# systax error : 오타났을 경우가 대부분
# invi어쩌고~ : 띄어쓰기 오류

```

- ### 심화(naver&google 검색)

```python
from flask import Flask, render_template, request


app = Flask(__name__)


@app.route('/ping')
def ping():
    # http://127.0.0.1:5000/ping입력 시 ping.html접속
    return render_template('ping.html')# ping.html
	# input태그를 통해 입력받은 값을 form 태그(/pong 지정)를 통해 
    #http://127.0.0.1:5000/pong으로 이동
    
@app.route('/pong')
def pong():
    #data = request.form.get POST방식일 경우 form으로 받아야함
    data = request.args.get('keyword')#/ping에서 넘겨받은 keyword값을 data에 저장
    return render_template('pong.html', data=data)
	#pong.html에 data값 넘겨주며 접속

@app.route('/naver')
def naver():
    data = request.args.get('keyword')  # 입력받은 keyword값 data에 대입
    # pong.html에 data값과 같이 넘겨주기
    return render_template('naver.html', data=data)
#http://127.0.0.1:5000/naver app 생성 및 naver.html에 data값을 넘겨주며 접속

@app.route('/google')
def google():
    data = request.args.get('keyword')  # 입력받은 keyword값 data에 대입
    # pong.html에 data값과 같이 넘겨주기
    return render_template('google.html', data=data)
#http://127.0.0.1:5000/google app 생성 및 google.html에 data값을 넘겨주며 접속

if __name__ == ("__main__"):
    # debug 모드로 실행, flask는 변경된 사항을 받아들이지 못해 서버를 재부팅 해야함, 자동으로 되게끔 해주는 모드
    app.run(debug=True)

# flask 실행하는 파일은 app.py
# 원래는 FLASK_APP = ping_pong.py flask run 으로 사용해야 실행이됨

```

- ### 심화2(op.gg롤 유저 정보 가져오기)

```python
from flask import Flask, render_template, request
from bs4 import BeautifulSoup
import requests

app = Flask(__name__)


@app.route('/search')
def search():
    return render_template('search.html')

@app.route('/opgg')
def opgg():
    userName = request.args.get('userName')
    # search에서 입력한 user이름 받아오기
    url = f"http://www.op.gg/summoner/userName={userName}"
    req = requests.get(url).text
    soup = BeautifulSoup(req,'html.parser')
    tier = soup.select_one('#SummonerLayoutContent > div.tabItem.Content.SummonerLayoutContent.summonerLayout-summary > div.SideContent > div.TierBox.Box > div > div.TierRankInfo > div.TierRank')
    wins = soup.select_one('#SummonerLayoutContent > div.tabItem.Content.SummonerLayoutContent.summonerLayout-summary > div.SideContent > div.TierBox.Box > div > div.TierRankInfo > div.TierInfo > span.WinLose > span.wins')# URL에서 필요 데이터 가져오기(크롤링)
    return render_template('opgg.html',userName = userName, tier = tier.text, wins = wins.text)
# opgg.html에 크롤링한 값 넘겨주며 접속


if __name__ == ("__main__"):
    app.run(debug=True)

```

