package day08;

public class CarMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//자동차를 한 대 생성해주고 초기값은 연료 100, 속도 0,
		// 엑셀 3번 밝고, 계기판 조회,브레이크 2벌 밟고 계기판 조회
		
		Car car1 = new Car("카이엔",5,0,"이종현",50);
		

		
		car1.accelerate();
		car1.accelerate();
		car1.accelerate();
		
		car1.showStatus();
		
		car1.break_();
		car1.break_();
		
		car1.showStatus();
		
	}

}
