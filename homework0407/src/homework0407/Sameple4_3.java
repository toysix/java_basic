package homework0407;

public class Sameple4_3 {

	
	public static void main(String[] args) {
		
		int treeHit23 = 0;
		
		while (treeHit23 < 10) {
			
		    treeHit23++;
		    
		    System.out.println("나무를  " + treeHit23 + "번 찍었습니다.");
		    
		    if (treeHit23 == 10) {
		    	
		        System.out.println("나무 넘어갑니다.");
		    }
		}
		
		//while (true) {
			
		  //  System.out.println("Ctrl-C를 눌러야 while문을 빠져 나갈 수 있습니다.");
		    
		//}
		
		
		int coffee23 = 10;
		
		int money23 = 300;

		while (money23 > 0) {
			
		    System.out.println("돈을 받았으니 커피를 줍니다.");
		    
		    coffee23--;
		    
		    System.out.println("남은 커피의 양은 " + coffee23 + "입니다.");
		    
		    if (coffee23 == 0) {
		    	
		        System.out.println("커피가 다 떨어졌습니다. 판매를 중지합니다.");
		        
		        break;
		    }
		}
		
		
		int a23 = 0;
		
		while (a23 < 10) {
			
		    a23++;
		    
		    if (a23 % 2 == 0) {
		    	
		        continue;  // 짝수인 경우 조건문으로 돌아간다.
		    }
		    
		    System.out.println(a23);  // 홀수만 출력된다.
		    
		}
		
		
		
	}
}
