package day08;

public class BasketbalPlayer {

	public String name;
	public int height;
	public int age;
	public int salary;
	
	//showInfo를 만들어라
	// 호출시 위 4가지 요소를 콘솔에 찍어줘라
	
	
	public BasketbalPlayer(String nM, int hG, int aG, int sL) {
		
		name = nM;
		height = hG;
		age = aG;
		salary = sL;
		
	}
	
	
	
	public void showInfo() {
		
		System.out.println("이름 : "+ name);
		System.out.println("키 : " + height);
		System.out.println("나이 : "+ age);
		System.out.println("연봉 : " + salary);
		
	}
	
	public void dunkShoot() {
		
		if(height > 190) {
			
			System.out.println("덩크슛 성공!");
			
		} else {
			
			System.out.println("골대에 안닿음");
		}

		
}
}

