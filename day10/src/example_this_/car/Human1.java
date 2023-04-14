package example_this_.car;

public class Human1 {
	
	public String name;
	public int age;
	
	
	public Human1 (String name, int age) {
		
		this.name = name;
		this.age = age;
	}
	
	
	
	
	public Human1(String name) {
		
		this(name, -1);
		
		//this.name = name;         
		//this.age = -1             
				
	}
	
	public Human1() {
		
		this("이름 없음",-2);
		
		//this.name = "이름없음"
		//this.age = -2
	}
	
	public void showInfo() {
		
		System.out.println("이름 : "+name+" , 나이 "+ age +" 입니다.");
	}
	
}
