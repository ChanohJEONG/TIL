import requests
from bs4 import BeautifulSoup 

url = "https://finance.naver.com/sise/"

# request = requests.get(url)
# print(request) # 200 은 성공적으로 잘 접속했다.

request = requests.get(url).text# html 소스코드 받아오기
#가져온 html 코드를 parsing 한다/python이 compile할수 있도록
soup = BeautifulSoup(request,'html.parser')
#print(soup) 한글때문에 unicode err 뜰수도!
kospi = soup.select_one('#KOSPI_now')#소스코드 중 #KOSPI_now 이름을 가진 친구 하나만 골라줘
print(kospi.text)

