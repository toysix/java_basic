package example.override;

public class Student extends Human {
	
	public String major;
	
	
	@Override // 를 이제는 안붙여줘도 되지만 유지보수를 위해서 꼭 써주자.. 혹시 오타라도 있으면 override 가 안될수도 있으니까 (오타가 있으면 새로운 매서드로 인식 하기 때문)
	public void 자기소개하기() {
		
		
		System.out.println("이름 : " + name);
		System.out.println("나이 : " + age);
		System.out.println("전공은 : "+ major);
		
	}

}
