서버응답 형식 3가지 : HTML , IMG, FILE

FrameWork : 어떻게 동작하는지 모르지만 A를넣으면 B가 나온다는 사실을 활용하여 사용.

서버 구축 사용 도구 : flask, spring 등등..



응답

- HTML : String, Map, void ...

- JSON : 복합 데이터 + @ResponseBody

  ​			또는 복합 데이터 + @RestController



요청

- @RequestParam : ?뒤의 파라미터 지정/컨트롤러 메소드의 인자명과 동일
- @ModelAttribute : 모델 클래스의 변수명과 동일