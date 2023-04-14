package day05;

public class homework2 {
	
	public static void main(String[] args) {
		
		/*
		 *  중첩반복문을 이용해서
*
*			4x + 5y = 60
*			
			이 방정식의 양수 해를 모두 구하는 반복문을 작성해주세요.
		 */
		

			for (int i = 1; i <= 15; i++) {
				
				for (int j = 1; j <= 12; j++) {
					
					if ((i*4)+(j*5) == 60) {
						
						System.out.println("4 ("+ i +") + 5 (" + j +") = 60");
					}
					
				}
				
			}
		
		
		
	}

}
