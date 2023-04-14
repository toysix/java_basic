package strequals;

import java.util.Scanner;

public class UserMain {

	public static void main(String[] args) {
		
		/*
		 * 같은 클래스 안에서 동일한 문자열을 직접 대입하는 형식으로
		 * String 객체를 생성할 시 같은 주소값을 공유하게 된다.
		 * 
		 */
		
		String s1 = "홍길동";
		String s2 = "홍길동";
				System.out.println(s1 == s2);
		
		Scanner scan = new Scanner(System.in);
		
		User u = new User("abcd123");
		
		String pass = scan.next(); // new String으로 같은 원리로.. 힙에 생성이 따로 됨. 그래서 비번 같은거
		// 받을때는 equals로 비교를 해야 함.
		
		System.out.println("비번을 입력해주세요.");
		
		if (pass == u.pw) { // 이거는 서로 다른 주소를 비교하기 때문에 불일치로 나오게 되는거임.
			
			System.out.println("비번이 일치합니다.");
			
		
		} else {
			
			System.out.println("비번이 일치하지 않습니다.");
		}
		
		if (pass.equals (u.pw)) { // 이거는 실제 값을 비교하기 때문에 참으로 나옴
			
			System.out.println("비번이 일치합니다.");
			
		
		} else {
			
			System.out.println("비번이 일치하지 않습니다.");
		}
		
	}
	
}
