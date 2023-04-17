package interface_.example;

public interface RemoteController {
	
	
	//최대 배터리량, 최소 배터리량 상수로 지정 (자동으로 final 붙어짐)
	int Max_BATTERY = 100;
	int MIN_BATTERY = 0;

	// 리모컨이 가져야 하는 필수 기능에 대해서만 정의
	public void turnOn();
	
	public void turnOff();
	
	
	
}
