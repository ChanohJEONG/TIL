# Python Basic

## 변수/list/dictionary 및 기본 문법예시

### 1. list & dictionary

```python
array = [1,2,3,"four","five",True]
print(array) # [1, 2, 3, 'four', 'five', True] // 전체 출력
print(array[0:3]) # [1, 2, 3] // array[0],array[1],array[2] 출력
print(array[4:]) # ['five', True] // array[4],array[5] 출력
print(array[-1]) # True // array[5] 출력 & 맨 마지막 인자 출력

dust = {'영등포구': 100 , '강남구' : 300}#key값은 반드시 string형식으로 만들어야함.
print(dust['영등포구']) # 100출력

dust_two = dict(영등포구=100, 강남구=300)# key값이 string형식이 아닌 방법
print(dust_two) # {'영등포구': 100, '강남구': 300} 전체출력
#Python의 dictionary는 JavaScript의 JSON 형식과 같음!!
```



### 2. 단순 Quiz 예시

```python
# Quiz 1
str = input('문자를 입력하세요 : ') # str 변수에 문자열 입력받기
print(str[0], str[-1])# 첫번째 문자, 마지막 문자 출력

# Quiz 2
numbers = int(input('숫자를 입력하세요 : ')) ## 입력받은 String을 int형식으로 형변환
for n in range(numbers):# 0~ numbers-1까지 반복 // numbers = numbers칸의 list
    print(n)# 0 부터 numbers-1까지 출력

# Quiz 3
num = int(input('숫자를 입력하세요: '))
if num % 2 == True:
    print("홀수")
else:
    print("짝수")
    
```



## If문 사용법

```python
a = 1
if a : # a == True 라는 뜻
    print("a = 1 입니다.")
else :
    print("a = 1이 아닙니다")
    
a = 30
if a > 30 :
    print("30 초과입니다.")
elif a <= 20 :
    print("20 이하입니다.")
else : # 21~30
    print("둘다 아닙니다.")

if 30 <= a and a < 150:
    print("두 조건에 부합합니다.")
elif a > 150 or a > 10:
    print("둘 중 하나가 맞습니다.")
```

## 반복문 사용법

```python
n=0
while n<3:
    print('출력')
    n = n + 1
## n이 3보다작으면 반복문 수행
    
num = list(range(10))
print (num) ##[0,1,2,3,4,5,6,7,8,9] 출력

for n in num:# num내 원소 수만큼 반복문 수행
    print(n) #num[0]부터 출력
    
```

