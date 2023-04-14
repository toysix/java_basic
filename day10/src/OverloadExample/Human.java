package OverloadExample;

public class Human {
	
	public String name ;
	public int age; 
	
	

	public Human (){
		
		name = "이름을 입력하세요";
		age = 0;
		
	}
	
	

	public Human (String s, int i){
		
		name = s;
		age = i;
		
	}

}
