import requests
from bs4 import BeautifulSoup
a = 30
# if a : # a == True 라는 뜻
#     print("a = 0 입니다.")
# else :
#     print("a=0이 아닙니다")
# a = 30
# if a > 30 :
#     print("30 초과입니다.")
# elif a <= 20 :
#     print("20 이하입니다.")
# else :
#     print("둘다 아닙니다.")

if 30 <= a and a < 150:
    print("두 조건에 부합합니다.")
elif a > 150 or a > 10:
    print("둘 중 하나가 맞습니다.")


# # dust 변수에 들어 있는 내용을 출력해보세요.
# print('{} 기준 미세먼지 농도는 {}입니다.'.format(time, dust))
# print(f'{time} 기준 미세먼지 농도는 {dust}입니다.')
# dust 변수에 들어 있는 값을 기준으로 상태 정보를 출력해부세요.

if dust <= 30:
  print('좋음')
elif dust <= 80:
  print('보통')
elif dust <= 150:
  print('나쁨')
else:
  print('매우나쁨')
