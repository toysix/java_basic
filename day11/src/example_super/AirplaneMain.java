package example_super;

public class AirplaneMain {
	
	public static void main(String[] args) {
		
		Airplane a1 = new Airplane("대한항공");
		
		SuperAirplane s1 = new SuperAirplane("제트기");
		
		
		
		for (int i = 0; i <8; i++) {
		
			s1.fly();
			
		}
		
		s1.showStatus();
		
		System.out.println("--------------------");
		
		for (int i = 0; i < 3; i++) {
			
			s1.fly();
			
		}
		
		s1.showStatus();
		
		
		
		
	}

}
