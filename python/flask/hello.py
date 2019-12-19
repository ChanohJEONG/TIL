from flask import Flask, escape, request, render_template

app = Flask(__name__)


@app.route('/')  # root로 요청을 보냄
def hello():
    name = request.args.get("name", "World")
    return f'Hello, {escape(name)}!'


@app.route('/hi')
def hi():
    name = "정찬오"
    return render_template('hi.html', html_name=name)
# hi.html을 랜더링 해달라는 뜻
# rener_template을 import 한 후
# Flask 디렉토리내의 반드시 'templates'의 디렉토리 생성 후
# hi.html파일을 생성해야 불러올 수 있음


@app.route('/greeting/<string:name>/')  # name은 주소값에서 받아와 사용할 변수명임
def greeting(name):
    def_name = name
    return render_template('greeting.html', html_name=def_name)


@app.route('/cube/<int:num>')
def cube(num):
    def_num1 = num
    def_num2 = num**3
    
    return render_template('^3.html', html_num=def_num1, html_name = def_num2)


# terminal -> env FLASK_APP=hello.py flask run
# 아래 코드 작성시 단순 python hello.py 명령어로 flask 서버 실행가능
if __name__ == "__main__":
    app.run(debug=True)

# systax error : 오타났을 경우가 대부분
# invi어쩌고~ : 띄어쓰기 오류
