import random
array = [1,2,3,"four","five",True]
# print(array)
# print(array[0:3])
# print(array[4:])
# print(array[-1])

dust = {'영등포구': 100 , '강남구' : 300}#key값은 반드시 string형식으로 만들어야함.
print(dust['영등포구'])

dust_two = dict(영등포구=100, 강남구=300)# 여기선 ㄱㅊ
print(dust_two)


num = list(range(1,46))
rotto = random.choice(num)

menu = ['20층','양자강','김밥카페','순남시레기','바나프레소']
phone_book = {'20층': '010'
              ,'양자강': '011'
              ,'김밥카페':'012'
              ,'순남시레기':'013'
              ,'바나프레소':'014'}
co = random.choice(menu)
print(co , phone_book[co])