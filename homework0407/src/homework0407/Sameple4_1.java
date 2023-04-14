package homework0407;

import java.util.ArrayList;

public class Sameple4_1 {

	public static void main(String[] args) {
		
		boolean money23 = true;
		if (money23) {
			
			System.out.println("택시를 타고 가라");
			
		} else {
			
			System.out.println("걸어가라");
			
		}
		
		
		int x23 = 3;
		int y23 = 2;
		
		System.out.println(x23>y23);
		System.out.println(x23<y23);
		System.out.println(x23==23);
		System.out.println(x23!=23);
		
		int money223 = 2000;
		if (money223 >= 3000) {
			
			System.out.println("택시를 타고 가라");
			
		}else {
			
			System.out.println("조용히 걸어 가세요");
			
		}
		
		
		int money323 = 2000;
		boolean hasCard23 = true;
		
		if (money323 >= 3000 || hasCard23) {
			
			System.out.println("택시 타고 가세요");
			
		}else {
			
			System.out.println("걸어가세요");
			
		}
		
		
		ArrayList<String> pocket23 = new ArrayList();
		pocket23.add("paper");
		pocket23.add("handphone");
		pocket23.add("money");
		
		if (pocket23.contains("money")) {
			
			System.out.println("택시를 타고 가라");
			
		} else {
			
			System.out.println("걸어가라");
			
		}
		
		
		boolean hasCard323 = true;
		
		ArrayList<String> pocket = new ArrayList<String>();
		
		pocket.add("paper");
		pocket.add("handphone");

		if (pocket.contains("money")) {
			
		    System.out.println("택시를 타고 가라");
		    
		}else {
			
		    if (hasCard323) {
		    	
		        System.out.println("택시를 타고 가라");
		        
		    }else {     
		    	
		        System.out.println("걸어가라");
		    }
		}
		
		
		
		boolean hasCard423 = true;
		
		ArrayList<String> pocket223 = new ArrayList<String>();
		
		pocket223.add("paper");
		pocket223.add("handphone");

		if (pocket.contains("money")) {
			
		    System.out.println("택시를 타고 가라");
		    
		}else if(hasCard423) {
			
		    System.out.println("택시를 타고 가라");
		    
		}else {       
			
		    System.out.println("걸어가라");
		}
		
		
		
		
		
		
		
		
		
	}
	
}
