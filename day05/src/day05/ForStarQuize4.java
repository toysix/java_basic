package day05;
import java.util.Scanner;

public class ForStarQuize4 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int userNumber = scan.nextInt();
		
		scan.close();
		
		for (int i = 0; i < userNumber ; i++) {
			
			for (int j = i; j <= 1; j++) {
				
				System.out.print(" ");
			}
			
			for (int k = userNumber - i; k >= 1 ; k--) {
				
				System.out.print("*");
			}
			
			System.out.println();
			
			
		}
		
		
		
		
	}
	
	
}
