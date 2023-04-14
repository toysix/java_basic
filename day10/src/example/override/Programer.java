package example.override;

public class Programer extends Human {
	
	public String kind;
	public int career;
	
	@Override 
	public void 코딩하기 () {
		
		System.out.println("코딩을 해달라고요?");
		System.out.println("어떻게 아셨는지 모르겠지만 저는 "+ kind+ " 공부했습니다.");
		System.out.println(career + " 년차 일하고 있습니다. 근데 지금 당장 라잇 나우 여기서 해드려요..?");
		
	}
	
	@Override
	public void 자기소개하기() {
		
		System.out.println("이름 : " + name);
		System.out.println("나이 : " + age);
		System.out.println(kind + " " + career+ " 년차 개발자입니다.");
		
		
	}
	
}
