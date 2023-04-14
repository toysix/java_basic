package day06;

/*
 *  임의로 실행문이 3줄 이상인 메서드를 만들어보자
 *  하나는 int 를 하나 입력받는 메서드로
 *  하나는 입력받은 자료가 없는 메서드로
 *  하나는 String과 int를 하나씩 입력받는 메서드로 구성
 *  모두 만들어서 잔디로 1:1
 */





public class gakje1 {
	
	public static void insertInt(int a) {
		
		System.out.println(a + " 를 선택 하셨군요");
		
		int b = a + 10;
		
		System.out.println(a + " + 10은 "+ b +"입니다. ^^");
		
	}
	
	
	public static void insertvoid () {
		
		System.out.println("입력받는 자료가 없는");
		System.out.println("메서드를 실행하셨습니다.");
		System.out.println("다음에 또 불러주세요.");
	}
	
	public static void insertStrings(String b, int c) {
		
		System.out.println("입력하신 성함은 "+ b + "이고 나이는 "+ c +" 시군요.");
		
		if (c > 30) {
		
			System.out.println("나이가 "+ c + "이시면 너무 많은것 같습니다.");
			
		} else {
			
			System.out.println("나이가 "+ c + "이시면 코딩 공부하기 아주 좋은 나이인것 같습니다!");
		}
		
	}
	
	
	

	public static void main(String[] args) {
		
		insertInt(10);
		
		insertvoid();
		
		insertStrings("이종현", 40);
		
		
	}
	
}
