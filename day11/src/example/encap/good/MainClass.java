package example.encap.good;

public class MainClass {

	
	public static void main(String[] args) {
		
		MyBirthday mb = new MyBirthday(-2033,2,22);
		
		//mb.day = 1026;   private 타입이라 다른곳에서 변경 못시킴
		//mb.month = 96;
		//mb.year = 9999;
		
		mb.showDataInfo();
		
		
	}
}
