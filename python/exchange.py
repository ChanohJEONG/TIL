import requests
from bs4 import BeautifulSoup 

url = "https://finance.naver.com/marketindex/"

req = requests.get(url).text

soup = BeautifulSoup(req,'html.parser')

exc = soup.select_one('#exchangeList .value')
# 은 id값
# .은 class값
# 바로 내부는 >
# 바로 내부 아닌 경우에는 띄어쓰기 
print(exc.text)
