package day05;

import java.util.Scanner;


public class ForStarQuize3 {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int userNumber = scan.nextInt();
		
		scan.close();
				
		for (int i = userNumber+1 ; i > 0; i-- ) {
			
			for (int j = 1; j < i ; j++) {
				
				System.out.print("*");
				
			}
			
			System.out.println();
		}
		
		
	}

}
