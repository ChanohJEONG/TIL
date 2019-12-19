# Python 크롤링

- KOSPI 불러오기

```python
import requests # requests를 사용하기 위해 필요한 모듈
from bs4 import BeautifulSoup # BeautifulSoup을 사용하기 위해 필요한 모듈

url = "https://finance.naver.com/sise/" #네이버 금융 URL

# request = requests.get(url) # url의 정보를 요청하여 받아오는 것
# requests는 HTTP 요청을 위한 모듈입니다.
# HTTP (Hyper Text Transfer Protocol) 은 www 상에서 문서를 주고받는 프로토콜 
# Client(request) -> Server(response) -> Client
# print(request) # 200 은 성공적으로 잘 접속했다는 뜻.

request = requests.get(url).text
#url의 서버로부터 응답받은 내용을 text형식으로 request 변수에 저장

soup = BeautifulSoup(request,'html.parser')
#가져온 html 코드를 parsing 한다
#python이 request를 단순 문자가 아닌 HTML코드로 인식시켜줌
#print(soup) 한글때문에 unicode err 뜰수도!
kospi = soup.select_one('#KOSPI_now')
#소스코드 중 #KOSPI_now 이름(id)을 가진 친구 하나만 골라줘
print(kospi.text)
```

- 달러환율 불러오기

```python
import requests
from bs4 import BeautifulSoup 

url = "https://finance.naver.com/marketindex/"

req = requests.get(url).text

soup = BeautifulSoup(req,'html.parser')

exc = soup.select_one('#exchangeList .value')# id값 = exchangeList 중 .value를 찾는다
# #은 id값 어떤 태그도 id를 가질 수있으니 div 혹은 ul 과같이 단정짓지 말것.
# .은 class값
# 바로 내부는 > 사용 부모형제의 경우
# 인접하위관계가 아니라 하부 전체를 검색할 경우에는 띄어쓰기 
print(exc.text)

```

- 네이버 실시간 검색어 불러오기

```python
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
```

