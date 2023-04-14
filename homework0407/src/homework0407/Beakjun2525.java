package homework0407;

import java.util.*;


public class Beakjun2525 {
	
	public static void main(String[] args) {
		
	
	
	Scanner scan1 = new Scanner(System.in);
	Scanner scan2 = new Scanner(System.in);
	Scanner scan3 = new Scanner(System.in);
	
	
	int a = scan1.nextInt();
	
	int b = scan2.nextInt();
	
	int c = scan3.nextInt();
	
	if ( (0 < a <= 23) && ( 0 < b <= 59) && ( c <= c <= 1000))){
	
	
	if (b + c >= 60) {
		
		a += (b + c)/60;
		
		if (a > 23) {
			
			a = a % 24;
		}
	}
	
	

	}
}
}

	