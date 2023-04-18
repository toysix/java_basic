package exception.trycatch;

import java.util.*;

public class NoTryCatchExample {

	
	public static void main(String[] args) {
	
		
		Scanner scan = new Scanner(System.in);
		
		int prevValue = scan.nextInt();
		int nextValue = scan.nextInt();
		
		System.out.println(prevValue / nextValue);
		
		scan.close();
		
}
	
}
