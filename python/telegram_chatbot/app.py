from flask import Flask, render_template, request
from decouple import config
import requests

app = Flask(__name__)

token = config('TELEGRAM_BOT_TOKEN')
chat_id = config('CHAT_ID')

url = "https://api.telegram.org/bot"


@app.route('/')
def hello():
    return "Hello ChatBot"


@app.route('/write')
def write():
    return render_template('write.html')


@app.route('/send')
def send():
    text = request.args.get('text')
    requests.get(f'{url}{token}/sendMessage?chat_id={chat_id}&text={text}')
    return render_template('send.html')


@app.route(f'/{token}', methods=["POST"])  # 어렵게 만든 이유 : 다른사람이 악용하는것을 막는것.
def telegram():
    # chat_id = request.get_json.[][][]
    # if text == "로또" or "roto":
    #     text
    # elif
    # elif
    # elif
    return "ok", 200  # Telegram은 요청에 대한 응답이 제대로 수행될때까지 반복하기 때문에 정상응답값 200을 return
    # telegram과 연동이 되어 요청받고 return값으로 200 응답

if __name__ == ("__main__"):
    app.run(debug=True)
# Debug 모드를 켜놓기 위해 설정 -> 수정사항 저장시 자동 적용
