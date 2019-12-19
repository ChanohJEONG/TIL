import requests
from bs4 import BeautifulSoup

url = 'https://www.naver.com/'

req = requests.get(url).text
data = BeautifulSoup(req,'html.parser')

#이부분 연습해야할 듯

sel = '#PM_ID_ct .ah_l .ah_k'
search = data.select(sel)

for item in search:
    print(item.text)