package importex;


import fruit.Apple;
import fruit.Banana;
import Hello.hi.Hi;
import Hello.bye.Bye;
import java.util.Scanner;

/*
 * 같은 프로젝트 내의 코드끼리나 혹은 자바에서 기본으로 제공하는 클래스파일은
 * 언제든 가져다가 사용할 수 있습니다.
 * 다만 다른 패키지에 있는 클래스를 사용하려면 반드시 package 선언부 아래 (1번라인 아래)
 * import 선언을 통해 도입하고 싶은 클래스의 경로 (패키지명과 클래스명를 적어야 합니다.
 * 
 * 
 */



public class ImportExample {

	public static void main(String[] args) {
		
		Apple a = new Apple();
		
		// 나머지 과일 하나랑 hello.hi, hello.bye 패키지 내부 클래스도 위와같이 작성해보자
		
		Banana b = new Banana();
		Hi h = new Hi();
		Bye by = new Bye();
		
		Scanner scan = new Scanner(System.in);
		
		int userNumber = scan.nextInt();
		
		// 같은 패키지인 경우 import 없이 코드 활용 가능.
		
		Test t = new Test();
		
		
		
	}
	
	
	
}
