package day05;

import java.util.Scanner;

public class homework {

	public static void main(String[] args) {
		
		// if 문으로 작성해서 잔디로 보내기. 숙제임
		// for 문을 중첩으로 돌려서 하는걸로다가..
		
		Scanner scan = new Scanner(System.in);
		
		int userNumber = scan.nextInt();
		
		scan.close();
		
		for (int i = userNumber; i >= 1 ; i--) {
			
			for (int j = 1; j <= userNumber ; j++) {
								
				if (i > j) {
					
					System.out.print(" ");
					
				} else {
					
					System.out.print("*");	
					
				}
					
			} 
				
			System.out.println();
			
		}
		
	}
	
	
}
