import requests
from bs4 import BeautifulSoup
url = 'http://openapi.airkorea.or.kr/openapi/services/rest/ArpltnInforInqireSvc/getCtprvnRltmMesureDnsty?serviceKey={}&numOfRows=10&pageNo=3&sidoName=서울&ver=1.6'.format(key)
request = requests.get(url).text
soup = BeautifulSoup(request,'xml')
item = soup('item')[5]
time = item.dataTime.text
dust = int(item.pm10Value.text)

# dust 변수에 들어 있는 내용을 출력해보세요.
print('{} 기준 미세먼지 농도는 {}입니다.'.format(time, dust))
print(f'{time} 기준 미세먼지 농도는 {dust}입니다.')
# dust 변수에 들어 있는 값을 기준으로 상태 정보를 출력해부세요.

if dust <= 30:
  print('좋음')
elif dust <= 80:
  print('보통')
elif dust <= 150:
  print('나쁨')
else:
  print('매우나쁨')