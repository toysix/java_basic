package example.override;

public class OverrideExample {
	
	public static void main(String[] args) {
		
		//학생 클래스의 인스턴스를 생성해주세요.
		
		Student s1 = new Student();
		
		s1.name = "이종현";
		s1.age = 40;
		s1.major = "컴퓨터과학";
		
		s1.자기소개하기();
		s1.코딩하기();
		System.out.println();
		
		Programer p1 = new Programer();
		
		p1.name = "박프로";
		p1.age = 40;
		p1.kind = "자바";
		p1.career = 4;
		p1.자기소개하기();
		p1.코딩하기();
		
		
	}

}
