package day07;

import java.util.*;




public class ForStarQuize5 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int userNumber = scan.nextInt();
		
		scan.close();
		
		for (int i = 0; i < userNumber; i++){
				
				for (int j = userNumber-i; j >= 1; j--) {
					
					System.out.print(" ");
					
				}
		
				for (int k = 1; k <= 2*i+1; k++) {
					
					
					System.out.print("*");
					
				}
		
				System.out.println();
		
		
		
		
		}
	}
}
