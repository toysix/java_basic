package poly.instanceof_;

public class Human {

	
	private String name;
	
	private int age;
	
	//생성자를 만들어주세요.
	// name, age를 파라미터로 전달받아 초기화해주세요.
	
	//만약 void 파라미터로 생성사 호출시
	//"noname", 0을 이름과 나이로 초기화하는 생성자도 만들어 주세요.
	
	//showInfo() 를 만들어 주세요. 이름과 나이를 콘솔에 찍어줍니다.
	
	public Human() {
		
		//this.name = "noname";
		//this.age = 0;
		
		this("noname",0);//  일케하면 한줄이니께.. 이런식으로 ㄱㄱ
	}

	

	
	public Human(String name, int age) {
		
		this.name = name;
		this.age = age;
		
	}
	
	
	

	

	
	public void showInfo() {
		
		System.out.println("이름 : " + this.name);
		System.out.println("나이 : " + this.age);
	}
	
}
