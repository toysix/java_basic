package interface_.example;

public class RobotClearRemoteController implements RemoteController {

	
	public String modelName;
	public String price;
	
	
	public RobotClearRemoteController(String modelName, String price) {
		
		this.modelName = modelName;
		this.price = price;
	}
	
	
	
	
	@Override
	public void turnOn() {
		
		System.out.println("로봇 청소기를 On 합니다.");
		
	}

	@Override
	public void turnOff() {
		
		System.out.println("로봇 청소기를 Off 합니다.");
		
	}

	
	
	
}
