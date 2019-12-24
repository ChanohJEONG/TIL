# Spring 사용법

## 1. 프로젝트 생성 절차

- STS 다운로드 / Eclipse나 VScode로 사용해도 되지만 STS 사용
  - https://spring.io/tools
- Lombok 다운로드
  - https://projectlombok.org/all-versions
- 프로젝트 생성 절차
  1. New Spring Starter project 클릭
  2. 프로젝트 생성 시 체크 사항 (Name,Group,Package, **Type -> Gradle**)

```markdown
# Spring Web : 웹 프로젝트
# Thymeleaf : 뷰 탬플릿 (HTML)
# JPA : 데이터베이스 템플릿
# H2 : 데이터베이스
# Lombok : 메소드 등 기능 보조(get,set 함수 자동 불러오기)
```

## 2. CODE

- ### Main Class 생성 

  - ( Class 선언 위에 @SpringBootApplication 작성)

  - annotation : 컴퓨터가 알아보는 주석 처리 ex) @SpringBootApplication, @Controller

```java
package com.chan.basic;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BasicApplication {

	public static void main(String[] args) {
		SpringApplication.run(BasicApplication.class, args);
	}

}
```

- ### Controller 생성(Class 선언 위에 @Controller 작성) 

```java
package com.chan.basic.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController { //Java Class 생성
	@RequestMapping("/") // localhost:8000/ 의 웹페이지 주소 mapping
	public String home() {
		return "home"; // templates폴더에 있는 home.html을 불러옴(Viewing JSP)
	}
}
```

- ### Controller가 불러올 Html 파일 생성( templates 폴더 內)

```html
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

</body>
</html>
```

### @RequestMapping 이란?

클라이언트에서 요청하는 URL을 MVC 패턴의 컨트롤러 내의 클래스 혹은 메소드에 매핑시킴으로서 해당 URL에 해당하는 경로를 지정하고 처리를 가능케 해주는 애노테이션이다. 

**1. 일반적인 사용 방식**

컨트롤러 애노테이션을 이용하고 내부 메소드에 @RequestMapping("/") 를 달아서 해당 URL로 클라이언트의 요청이 들어오면 이후에 home(.jsp 생략) 뷰 페이지를 반환한다.

##### RequestMapping -> GET,POST,PUSH,DELETE 방식으로 선택하여 사용 가능

```java
@RequestMapping(value = "/", method = {RequestMethod.POST/GET/PUSH/DELETE})

== PostMapping("") / GetMapping("/") / PushMapping("/") / DeleteMapping("/")
```





JSP(Java Server Pages)란
Java 언어를 기반으로 하는 Server Side 스크립트 언어

HTML 코드에 Java 코드를 넣어 동적인 웹 페이지를 생성하는 웹 어플리케이션 도구
JSP를 통해 정적인 HTML과 동적으로 생성된 contents(HTTP 요청 파라미터)를 혼합하여 사용할 수 있다. 즉, 사용자가 입력한 contents에 맞게 동적인 웹 페이지를 생성한다.

### @ResponseBody & RestController 란?