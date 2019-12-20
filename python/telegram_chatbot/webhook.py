from decouple import config
import requests

token = config("TELEGRAM_BOT_TOKEN")
url = "https://api.telegram.org/bot"
pw_url = "https://chanohjeong.pythonanywhere.com/"


data = requests.get(f'{url}{token}/setwebhook?url={pw_url}{token}')
print(data.text)
# 텔레그램 챗봇에 요청이 들어오면 ngrok주소로 가세요~라는 뜻 webhook을 통해 우리서버와 telegram서버가 연동이 됨(로컬서버기때문에 ngrok사용)
# Telegram Server -> WebHook -> Local Flask
# 주소가 변경될때만 주소바꿔서 실행시키면 됨