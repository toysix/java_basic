package homework0407;

public class Sameple4_4 {
	
	public static void main(String[] args) {
		
		String[] numbers23 = {"one", "two", "Three"};
		
		for (int i = 0; i < numbers23.length; i++) {
			
			System.out.println(numbers23[i]);
			
		}
		
		
		int[] marks23 = {90, 25, 67, 45, 80};
		
		for(int i=0; i<marks23.length; i++) {
			
		    if (marks23[i] >= 60) {
		    	
		        System.out.println((i+1)+"번 학생은 합격입니다.");
		        
		    }else {
		    	
		        System.out.println((i+1)+"번 학생은 불합격입니다.");
		    }
		}
		
		
		int[] marks223 = {90, 25, 67, 45, 80};
		
		for(int i=0; i<marks223.length; i++) {
			
		    if (marks223[i] < 60) {
		    	
		        continue;  // 조건문으로 돌아간다.
		        
		    }
		    
		    System.out.println((i+1)+"번 학생 축하합니다. 합격입니다.");
		    
		}
		
		
		for(int i=2; i<10; i++) {
			
		    for(int j=1; j<10; j++) {
		    	
		        System.out.print(i*j+" ");
		        
		    }
		    
		    System.out.println("");  // 줄을 바꾸어 출력하는 역할을 한다.
		    
		}
		
		
		
	}

}
