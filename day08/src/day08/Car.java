package day08;

public class Car {

	// 차종, 최대승객, 속도, 주인, 연료량
	
	public String modelName; // 차종
	public int maxPassengers; // 최대승객
	public int currentSpeed; // 속도
	public String owner; // 주인
	public int gas; // 연료량
	
	public final static int BOOST_SPEED = 10; //(상수는 대문자랑 언더바로만 만듬)
	public final static int BREAK_SPEED = 10;
	
	
	// 생성자 들어갈 자리
	public Car(String mN, int mP, int cS, String own, int g) {
	
		modelName = mN;
		maxPassengers = mP;
		currentSpeed = cS;
		owner = own;
		gas = g;
		
		
	}
	
	
	//accelerate (가속) 기능
	public void accelerate() {
		
		currentSpeed += BOOST_SPEED;
		
	}
	
	// 감속기능
	public void break_() {
		
		currentSpeed -= BREAK_SPEED;
	}
	
	public void showStatus() {
		
		System.out.println("차종 : "+ modelName);
		System.out.println("최대승객 : "+ maxPassengers);
		System.out.println("현재 속도 : "+ currentSpeed);
		System.out.println("주인 : "+ owner);
		System.out.println("연료량 : "+ gas);
		
	}
	
}
