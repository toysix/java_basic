package day05;

public class BreakExample {

	public static void main(String[] args) {
		
		// 무한 루프는 보통 break 와 조합해 사용
		
		int i = 0;
		while(true) {
			
			if ( i == 15)
				
				break; // if, for, while등
			
			System.out.println(i);
			i++;
			
			
		}
		
		
	}
	
}
