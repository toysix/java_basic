package interface_.example;

public class TVRemoteController implements RemoteController{

	public final int inch;

	public int channel;
	
	public TVRemoteController(int inch) {
		
		this.inch = inch;
		this.channel = 1;
	}
	
	
	@Override
	public void turnOn() {
		System.out.println("TV 를 on 합니다.");
		
	}

	@Override
	public void turnOff() {
		System.out.println("tv를 off 합니다.");
		
	}
	
	
	public void setChannelUp() {
		
		this.channel++;
	}
	
	
	public void setChannelDown() {
		
		if(this.channel - 1 < 1) {
			this.channel = 1;
			
		}else {
			this.channel--;
		}
	}
		
		public void setChannel(int channel) {
			
			if(channel < 1) {
				this.channel = 1;
			}else {
				this.channel = channel;
			}
		}
		
	}
	
	
	

