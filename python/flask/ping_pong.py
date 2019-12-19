from flask import Flask, render_template, request


app = Flask(__name__)


@app.route('/ping')
def ping():

    return render_template('ping.html')


@app.route('/pong')
def pong():
    data = request.args.get('keyword')  # 입력받은 keyword값 data에 대입
    return render_template('pong.html', data=data)  # pong.html에 data값과 같이 넘겨주기


@app.route('/naver')
def naver():
    data = request.args.get('keyword')  # 입력받은 keyword값 data에 대입
    # pong.html에 data값과 같이 넘겨주기
    return render_template('naver.html', data=data)


@app.route('/google')
def google():
    data = request.args.get('keyword')  # 입력받은 keyword값 data에 대입
    # pong.html에 data값과 같이 넘겨주기
    return render_template('google.html', data=data)


if __name__ == ("__main__"):
    # debug 모드로 실행, flask는 변경된 사항을 받아들이지 못해 서버를 재부팅 해야함, 자동으로 되게끔 해주는 모드
    app.run(debug=True)

# flask 실행하는 파일은 app.py
# 원래는 FLASK_APP = ping_pong.py flask run 으로 사용해야 실행이됨
