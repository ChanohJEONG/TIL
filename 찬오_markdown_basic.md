# 마크다운(Markdown)

> 일반텍스트 형식 구문을 사용하는 마크업 언어의 일종으로 사용법이 쉽고 간결하여 빠르게 문서 정리를 할 수 있습니다. 단, 모든 HTML 마크업을 대체하지는 않습니다.



## 1. 문법

### 1.1 Header

>헤더는 제목을 표현할 때 사용합니다. 단순히 글자의 크기를 표현하는 것이 아닌 의미론적인 중요도를나타냅니다.

- `<h1>`부터`<h6>`까지 표현 가능 합니다.
- `#` 의 개수로 표현하거나 `<h1></h1>`의 형태로 표현 가능합니다.

### 

# h1 태그입니다.

## h2 태그입니다.

### h3 태그입니다.

#### h4 태그입니다.

##### h5 태그입니다.

###### h6 태그입니다.



### 1.2 List

> 목록을 나열할 때 사용합니다. 순서가 필요한 항목과 그렇지 않은 항목으로 구분할 수 있습니다. 순서가 있는 항목 아래 순서가 없는 항목을 지정할 수 있으며 그 반대도 가능합니다.

- 순서가 없는 목록
  - `1.` 을 누르고 스페이스바를 누르면 생성할 수 있습니다.
  - `tab`키를 눌러서 하위 항목을 생성할 수 있고 `shift + tab` 키를 눌러서 상위 항목으로 이동할 수 있습니다.
- 순서가 있는 목록
  - `-` (하이픈)을 쓰고 스페이스바를 누르면 생성할 수 있습니다.
  - `tab` 키를 눌러서 하위 항목을 생성할 수 있고 `shift + tab` 키를 눌러서 상위항목으로 이동할 수 있습니다.

1. 순서가 있는 항목
2. 순서가 있는 항목
   1.  순서가 있는 하위 항목
   2.  순서가 있는 하위 항목

- 순서가 없는 항목
- 순서가 없는 항목
  - 순서가 없는 하위 항목
  - 순서가 없는 하위 항목

### 1.3 Code Block

> 코드 블럭은 작성한 코드를 정리하거나 강조하고 싶은 부분을 나타낼 때 사용합니다. 인라인과 블럭 단위로 구분할 수 있습니다.

- Inline
  - 인라인 블럭으로 처리하고 싶은 부분을 `(백틱) 으로 감싸줍니다.
- Block
  - ` (백틱)`을 3번 입력하고  `Enter` 를 눌러 생성합니다



`add` 한 요소를 remote 저장소에 올리려면 `$ git push origin master`를 터미널에 입력합니다.

``` shell
$ git add .
$ git commit -m "first commit"
$ git push origin master
```



### 1.4 Image

> 로컬에 있는 이미지를 삽입하거나 이미지 링크를 활용하여 이미지를 나타낼 때 사용합니다.

- `![ ] ( )` 을 작성하고 `( )`안에 이미지 주소를 입력합니다. `[ ]` 안에는 이미지 파일의 이름을 작성합니다.
- 로컬에 이미지파일을 저장한 경우 절대 경로가 아닌 상대 경로를 사용하여 이미지를 저장합니다.

![(git)](C:\Users\정찬오\Desktop\git.png)![github](data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAAXEAAACICAMAAAAmsyvzAAAAY1BMVEX///8PDQ4YFhYAAAAJBgj7+/sWFBW3t7fs7Ozw8PDU1NTk5OQ9PDyNjY3f39+goKCUlJQdGxybmpuDg4PDw8MiICHNzc2np6d8e3s1NDVycnJeXl5PTk9aWVlJSEhtbGwsKytEbdroAAAJk0lEQVR4nO2daYOjIAyGa0GtWrWt9m7V//8rVzyAIJ6j7Yyb59OsxesVE0iCu9kgCIIgCIIgCIIgCIIgCIIgCIIgCIIgCIIgCIIgCIJ8CSdw7WuO7QbOt69l9Tix/yKAlx+b376q1eKd7rnEhrWVsIx8UxLuvn1ta8Te52pvteSqJ/a3r29lmH6r3Fz0E1qX+TgQYnXpXdgXQsJvX+daiI/9epeaZ/G3r3UNmM9hepe25YGm5afElAzVm0GOl29f8R/nMLyD190crflPSEd18KqbP7591X+Y1wTBc8mf377uP8s0wXPJ39++8j9KMlFwlHwiz8mC55Knw89j5ix3F3+I6AeC55IfBpzCs6PEKkOQxv3pX4PFb+o3YwvBKekJqpSwKCIVkvdNP80wY1JTg0FpKfxj9KQ1cCuUx1VvdgeG8L2W43wMT4zDaRrEp6QnspJ31dfpEjyp2NB9q34tNoCQvdQm6L97R0TqPXm7zTdng+7XFMdxB+0wO4nUW4tL2HVFsyxCw0LgWHozXh2Hdw3SlLvo7Nvappu3otP3mPgdP46qeL1537YrwBTH+Y7iIZHUrDeeCNtqUDkFRNlTEFFDUzL+pD1kbuv6d3m/9VjeoYUGhHYnO9aiuCN1Z0P0VSdlb2l6sC9B4HlBcLEPKTPGN9ERE0N6VG39027p4Ox+r1WbPRmk2FoUf8hd1Zd+iOOGdd7Fl7Y9I/3R3XbBDVKZ7lgo0OlMV6J4IA8MyWnMrmBMSbQWwWw1KWzMUr0XvlCgfuLuoUZyqCtRHMSv+Hs+iBDsetM1ucEuzt0Cew58sioa8YP43HlIY/11KO6Buc+guQwHzpt0ltwDgucDoFcaRf4tfZ1lMQ/NPs43yW/dOhRXVGuxxnpSCvbVWKSHpHjudF3xUHbxjda3K2w9qd3EehU3LTDuNu5jdr6DyallNI8uC554mkOUvOqxCh8qrVfxWAmokHZZGgTqvo0c3FUo3hnuMu/MsFOS8XdgvYpDwzCuj5sZDMA0fedb3FrPgQ+5YTckJ7JaxU04me+Ljyh4yt60cXRj+K3BKO5qFb9Aw9AxV9cSKrurIT1xZ2OzFkJxKXe9lOI7N7Zj9zPllAcg2Ti/yYB2RR3NhwPnkhu7hjfjkyKSlr+whzlQ8Qs/HG/h8E1MV0nxYBPf6pH/+ROlfW84vhtdwWmDJ0YV78hnNnx2qScQwTJm1YLrg0j2qCqk3gxWXBOLPfFNzNdIivtHEUjOp2ejJoCToLIhFoHDwUA/YG3hr3uuRFcwlynOFXDYUFETTS/CjJLiwARAxc1jvbdQnL9txYRD9i/wTOPmIxPYdXbRISgvCXS8/HZ6prJQ8UQX+1IUp8lLYs/PU/TxMYo3zjNq0j0eOBqf8k5B3wldp/Tydpur8YobRIb3058rbqjef2agGZ4yVFKeGXCQkhHgc6PkeJY5FmOYCYq3yDWD4sk0KQdygnqNmG/WBB1vSdB0dGbeIWVI4VK/rDgFtnzZTq6EsSYsZoOeAAazdIrDuzOo9W3Fc6O0zWRXDZIys/OYW3HgdyYq/i5rWiRJiqzzZhHFydPemRszPgunnE0UcxCPua2KD3+bpLjpOI4pZkAH9m+n6AzzK85NiLMV7nfJdauPjpHGMC7zK17QE1eZTXF+bJEAb4ZAZ+QG9ZpwKnuYVamf5WyKg9Gh2H264tLkYcm1k9Hc43HgOUXKjY8a1UTzVMXJ1ZaI4Cx/muJP3mRJ13n6QcqtREm8gWfmSALV25ROOVnxjln+RMXFY9OmyGci/mHoUE28KSFC8aLyZ2nuchxeoDJZ8a5I1jTFT7zJkgtt1PD4aC/tdQbIMxjvELi/UHH7I4o7P0tINFMS8JGlTSVLLv+t4hv4bQljWApFQsnmH+GvJ3Fn0Cn/RsV5FnxRO755wsTy2PGhUgmg9g4p6wbjQ79R8RNoshhwsDK6k6vJfHV4KY2fgU/9jYpHujPOj6uWnIw6m6/urU5a+RjXoIZsyX+j4tzpLDoDUg35OLuiVhdZltpCqh0neynV+SnF+Ys1QPGsudci3FTVhqclYnXhisYAylHQrbiTMaNDaQY4THEpz8mtXL/i0gR52TIKtZ/mkg98qa6NlUKahyWqZlmqfH+IPcfxXPvWqzj3Y1Qa/wzs42euOE9o39oU5+pyo0LH59fHca50s2iV17dIOuAhe80lt0amaQfiKM3QU6viomKRJKwit6jYGqj4XTSL2K67q7xlIytOye1SHFkqYV/6QwNVjZCVpW+j6rWERD2R8uBBqCq4PhAWS51cQ6viF7Ff/nyybEy9Sirve9+fQX5DyUiwJQQZayJaLF2zsitlZsMMM9zSqpuT17VV9CBMiG6Js37t1aNT8lbFHXk3lhC9bwYrHoJ9YbRSm+eEL+Li1XCl7zT2zmYXig9Q5L3j/D7ZaiHh1X8dW9Y0t00ctGnLXsWlstyy4QjFg44z9ufyJxTtjKTKVBbD0GsgLaa1KNk6aluiDid7uvhGlONrFTfaFI+nK951xn7FJ6Qex1KlJSwSbjwPlLU103CNoY1o217MFJHWOyyXdesUl63xWMU9zfmqawCKa65r6ZqsArMuPsyH/mYqRQOpxmsnLV9JUEsOAW6m1Tz3WlHxYmgVF1WLoxVvLpMmZF+aKVlx8vbV6/rQR6jqXCWr9Hw6Yk6kG5lfWzp5z0QtTtTyTVYnUlcPS7W1smmK5Pq2bFMYtZqeLyG4VNIy//tu5/5Uqq2t/w4S6Rz0c5/NrMfW7JUy7agc+Vlar62u/akF7/U3u2sKksGvUDJZdlgBn/HOP9fNk+KJXv0KGP4x682+eO52wk919tmpnKJBVJzVLluz+wv8jE8S/I9979vhdoX1I9d9Fhfw1k0+He03KYzjoFp3J7hU3zIf7J7YLvZlUmGaGcQ2O1evjKyhbX9ojURF7RDZ6N/cXG5eEAfmVWcozKNO8W99puQPc6rHK8UahYezI6Gp/ea1VvEPLC1YH1V1lnGvzEPbK6ZTfPGFBeuk+iACPXcbCI3i+FnPibzrueez+qyKqXNvTcVR8MnUn/1gw9fX+7XXBoobii+b+V45ER/5sYCHYZw1bRTFrWXr21ePDaKCVr/iS2dh10+QkTGKk/v//WHOWYhEN+9TfOEVM/8Nwb225t2KWyTBDj4TtlX28y7FDXJECz4j1zMLH+oVZ195oiRDvWcmZqFVrZl+5D+k+F+kLIDZFiJ1L/jJdgRBEARBEARBEARBEARBEARBEARBEARBEARBEARBkCn8Ax1UhsHGgblNAAAAAElFTkSuQmCC)



### 1.5 Link

> 특정 주소로 링크를 걸 때 사용합니다.

- `[]()` 을 작성하고 `()`안에 링크 주소를 작성하고 `[]` 안에 어떤 링크 주소인지 작성합니다.



[git 공식문서](https://git-scm.com/)

[github 공식문서](https://github.com/)



### 1.6 Table

> 표를 작성하여 요소를 구분할 수 있습니다.

- `|` (파이프) 사이에 컬럼을 작성하고 `enter`를 입력합니다.
-  마지막 칼럼을 작성하고 뒤에 `|` 를 붙여줍니다.

| Working directory | statging area | remoe repo |
| ----------------- | ------------- | ---------- |
| working tree      | index         | history    |
| working copy      | cache         | tree       |



### 1.7 기타

__인용문__

- `>` 을 입력하고 `enter`키를 누릅니다.

> git은 컴퓨터 파일의 변경사항을 추적하고 여러 명의 사용자들 간에 해당 파일들의 작업을 조율하기 위한 분산버전 관리 시스템입니다.

- 인용문 안에 인용문을 작성하면 중첩해서 사용할 수 있습니다.

> $ git add.
>
> > $ git commit -m "first commit"
> >
> > > $ git push origin master



**수평선**

- `---`,`***`,`___` 을 입력하여 작성합니다.

working Directory

________________________________________________

Staging Area

_____________

Remote Repository

____



강조

- 이탤릭체는 해당 부분을 `*` 혹은 `_`(언더바) 로 감싸줍니다.
- 보드체는 해당부분을 `**` 혹은 `__`(언더바 2개)fh rkaTkwnqslek.
- 취소선은 `~~` 표시를 사용합니다.

이것은 *이탤릭체*입니다.

이것은 **보드체**입니다.

이것은 ~~취소선~~입니다.



## 2. 과제

> 현재의 pdf **문서**를 마크다운 문법을 활용하여 `00_markdown_basic.md`로 만들어 보세요.











