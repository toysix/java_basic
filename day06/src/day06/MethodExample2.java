package day06;

/*
 * 1. 매개변수는 메서드 호출시 불완전한 문장을 채워주기 위해 사용하는 변수이다.
 * 2. 매개변수에 어떤 값이 전달되는징 따라 메서드의 실행 결과가 달라진다.
 * 3. 어떤 매개변수를 이용해 문장을 완성 시킬지는 선언부에 작성
 * 4. 매개변수가 필요 없는 경우 비울 수 있다.
 * 
 */



public class MethodExample2 {

	public static void greet(String name) {
		
		System.out.println(name + " 님 어서오세요.");
	}
	
	public static void getThaiNumber () {
		
		System.out.println("능 : 1");
		System.out.println("썽 : 2");
		System.out.println("쌈 : 3");
		System.out.println("씨 : 4");
		
	}
	
	public static void main(String[] args) {
		
		//위 구문들은 return 구문이 없으므로 System.out.println(); 사이에 넣을수 없다.
		// 메서드 종료 후 호출 위치로 전달될 값이 없기 때문
		
		greet("이종현");
		System.out.println();
		// System.out.println(("이종현"));
		getThaiNumber();
		//System.out.println(getThaiNumber);
		
		
		
	}
	
	
}
