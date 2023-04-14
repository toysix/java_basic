package day07;

public class HumanMain {

	public static void main(String[] args) {
		
		
		/*
		 * 타 클래스에 정의된 요소를 main 내부에서 생성해 쓸 수 있다.
		 * new 키워드는 heep에 자료를 저장한다.
		 * 자료형 변수 - new ();
		 * 위 명령어로 구조체의 인스턴스를 생성할 수 있다.
		 * 
		 * 사람 1 생성
		 * 
		 */
		
		Human h1 = new Human();
		
		h1.name = "이종현";
		h1.age = 40;
		h1.height = 178;
		
		System.out.println("사람 1의 이름 : " +h1.name);
		
		
		Human h2 = new Human();
		
		h2.name = "이종현2";
		h2.age = 240;
		h2.height = 2178;
		
		System.out.println("사람 2의 키는 "+ h2.height);
		
		
	}
	
}
