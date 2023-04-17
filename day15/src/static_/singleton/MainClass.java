package static_.singleton;

public class MainClass {

	
	public static void main(String[] args) {
		
		// singleton 객체는 생성자가  private 이므로 인스턴스 생성 불가
		
		// Singleton s1 = new Singleton();
		// s1.getInstance();
		
		Singleton s1 = Singleton.getInstance();
		
		System.out.println("s1 의 주소 : " + s1);
		
		Singleton s2 = Singleton.getInstance();
		
		System.out.println("s1 의 주소 : " + s2);
		
		
	}
}
