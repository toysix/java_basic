package day05;

import java.util.Scanner;


public class ForStarQuiz1 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int userNumber = scan.nextInt();
		
		
		for (int i = 1; i <= userNumber; i++) {
			
			for (int j = 0; j < i; j++) {
				
				System.out.print("*");
			}
			
			System.out.println();
			
		}

	}
	
}
