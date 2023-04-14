package example_super;

public class Airplane {

	
	
	public String planeCode;
	public int speed;
	public int gas;
	
	
	public Airplane(String planeCode) {
		
		this.planeCode = planeCode;
		this.speed = speed;
		this.gas = gas;
		
	}
	
	
	public void fly()
	{
		
		if (gas <0 == speed < 900) {
			
			speed += 100;
			gas -= 3;
			
		} else {
			
			System.out.println("최고 속도 900에 도달했습니다.");
			
		}
	
	}
	
	public void showStatus() {
		
		System.out.println("현재 속도는"+ speed + "이며 남은 가스는"+ gas+" 입니다.");
	}
		
}
