package has_a;

public class MainClass {
	
	public static void main(String[] args) {
		
		//Gun 은 new 키워드로 생성해야 Police 생성자에게 전달 가능
		
		Gun gun = new Gun("엠포","123456");
		
		
		// gun을 사전에 생성하지 않으면 넘길 방법이 없음
		Police police = new Police(gun, "나경찰", 180);
		
		police.shoot();
		police.shoot();
		police.shoot();
		police.shoot();
		police.shoot();
		police.shoot();
		police.reload();
		police.shoot();
		
		
		
		
		
	}

}
