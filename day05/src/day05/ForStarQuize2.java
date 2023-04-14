package day05;

import java.util.Scanner;

public class ForStarQuize2 {

	public static void main(String[] args) {
		
		// if 문으로 작성해서 잔디로 보내기. 숙제임
		
		
		Scanner scan = new Scanner(System.in);
		
		int userNumber = scan.nextInt();
		
		scan.close();
		
		for (int i = 1; i <= userNumber ; i++) {
			
			for (int j = userNumber - i; j >= 1 ; j--) {
								
						System.out.print(" ");

			}// 2번째 for문
			
			for (int k = 1; k <= i ; k++) {
				
						System.out.print("*");
				
			}
		
		System.out.println();
			
		}
		
	}
	
	
}
