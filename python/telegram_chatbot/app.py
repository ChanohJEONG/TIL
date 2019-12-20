from flask import Flask, render_template, request
from decouple import config
import requests
import random

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
    wholeJ = request.get_json()
    text = wholeJ['message']['text']
    chat_id = wholeJ['message']['chat']['id']
    if text == "안녕":
        return_text = "안녕하세요!"
    elif text == "로또":
        numbers = range(1, 46)
        return_text = random.sample(numbers, 6)  # numbers안에서 6개 무작위 뽑아줌
    else:
        return_text = "뭐임마?"
    requests.get(
        f'{url}{token}/sendMessage?chat_id={chat_id}&text={return_text}')
    return "ok", 200  # Telegram은 요청에 대한 응답이 제대로 수행될때까지 반복하기 때문에 정상응답값 200을 return
    # telegram과 연동이 되어 요청받고 return값으로 200 응답


if __name__ == ("__main__"):
    app.run(debug=True)
# Debug 모드를 켜놓기 위해 설정 -> 수정사항 저장시 자동 적용
