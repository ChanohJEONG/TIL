from decouple import config
import requests

token = config("TELEGRAM_BOT_TOKEN")
url = "https://api.telegram.org/bot"
ngrok_url = "https://0ba397b6.ngrok.io"


data = requests.get(f'{url}{token}/setwebhook?url={ngrok_url}/{token}')
# 텔레그램 챗봇에 요청이 들어오면 ngrok주소로 가세요~라는 뜻 webhook을 통해 우리서버와 telegram서버가 연동이 됨(로컬서버기때문에 ngrok사용)
# Telegram Server -> WebHook -> Local Flask
print(data.text)
