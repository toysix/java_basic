package day06;

import java.util.*;


public class ForStarExample4 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int userNumber = scan.nextInt();
		
		scan.close();
		
		for (int i = 1; i <= userNumber; i++) {
			
			for (int j = 1; j < i; j++) {
				
				System.out.print(" ");
				
			}
				
			for (int k = userNumber; k >= i; k--) {
				
				System.out.print("*");
				
			}
			
			System.out.println();
			
		}
		
		
		
		
		
		
	}
	
}
