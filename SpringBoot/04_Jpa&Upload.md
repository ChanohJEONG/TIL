# Jpa

- @Autowired
  - 다른 package에서 class 불러올때 사용하는 일반적인 방법:
    - [불러오고자 하는 Class명] [지정이름] = new [Class명] ();
  - Autowired를 사용했을 경우 
    - [불러오고자 하는 Class명] [지정 이름]  => 컴퓨터內에 저장되어 있는 클래스 자동으로 불러오도록 함 ex) ProducRepository productRepository
    - findByName(name) or findAllByName(name)와같은 양식으로 뒤 변수이름만 변경해서 사용

```java
	@Autowired // 자동으로 메모리에 만들어져있는 ProductRepository를 불러옴=>IOc/DI
	// spring이 알고있는 내용은 다 가져올 수 있음!
	// Product p = new Product(); 원래는 이렇게 클래스를 불러와야하는데 AutoWired덕분에 따로 선언할 필요
	// 없이아래와같이 가져옴
	ProductRepository productRepository;

	@GetMapping("/jpa/product2")
	public Product product2(String name) {
		Product list = null;
		try {
			list = productRepository.findByName(name);
		} catch (NonUniqueResultException e) {
			list = new Product();
			list.setName("오류!!!");
		}
		return list;
	}// 예외처리상황 : 동일한 이름이 들어가 있을 경우 -> return을 list형식으로 둘다 출력하거나 위와같이 try catch

	@GetMapping("/jpa/product3")
	public List<Product> product3(String name) {
		List<Product> list = productRepository.findAllByName(name);
		return list;
	} 
```



# Upload

- 파일을 업로드하여 데이터베이스에 저장하는 기술(실제파일은 HDD, DB에는 metadata 저장)
- MultipartHttpServletRequest 사용

```java
		List<MultipartFile> mFiles = mRequest.getFiles("file");
		// 리스트 형식으로 파일저장->여러개 파일 저장가능
		// 동일한 이름의 파일을 업로드했을때 1개씩밖에 안돼지만 위와같이 하면 가능
		for (int i = 0; i < mFiles.size(); i++) {
			// 업로드된파일정보가 다 들어가 있음
			MultipartFile mFile = mFiles.get(i);
            // file 이란 이름으로 업로드한 file을 mFile에저장
			// 지정 경로에 지정 파일명으로 저장해줌
			String oName = mFile.getOriginalFilename();
            // 저장한 파일의 본래 이름을 가져와 String으로 저장
//		mFile.transferTo(new File("c:/dev/" + oName));
         //지정 경로에 oName으로 저장하라는 뜻! ->이 구문을 try catch구문으로 예외처리
			result += oName + "\n";
			
			try {
				mFile.transferTo(new File("c:/dev/" + oName));
			} catch (IllegalStateException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} // 지정 경로에 oName으로 저장하라는 뜻!
		}
		return result;
	}
```

