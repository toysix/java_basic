package day05;

import java.util.Scanner;

public class BreakQuize1 {
	
	public static void main(String[] args) {
		
		/*
		 * 1. 1~10 범위의 난수 2개를 발생
		 * 
		 * 2. while 문을 무한루프로 만들어주고 위에서 발생된 난수 2개를
		 *    a * b 의 답은?  이라고 질문해서 문제를 출제하게 해보셈
		 *    
		 * 3. if문으로 비교해 정답시 break로 루프문을 빠져나오고
		 *    오답인경우 "오답입니다." 라는 멘트와 함께 답을 재입력받도록 해보셈   
		 */
		
		int a = (int)((Math.random() * 10) + 1);
		int b = (int)((Math.random() * 10) + 1);
		
		System.out.println(" 난수 2개의 곱의 답은?");
		
		while (true) {
			

			Scanner scan = new Scanner(System.in);
			
			int userNumber = scan.nextInt();
			
			if ( (a*b)== userNumber ) {
				
				break;
				
			}else {
				
				System.out.println("오답입니다.");
			}
				
			
			
		}
		
		
		
		
	}

}
