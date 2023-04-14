package example_this_.car;

public class Car {
	
	public String model;
	public int speed;
	
	
	public Car(String model) {
		
		this.model = model;
		speed = 0;
		
	}
	

	
	public void accel() {
		
		if(speed + 10 >= 150) {
			
			speed =150;
		} else {
			
			speed += 10;
		}
	}
		
		public void showStatus() {
			
			System.out.println("모델명 : "+model);
			System.out.println("현재속도 : "+speed);
		}
		
	
}
