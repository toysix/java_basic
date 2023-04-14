package homework0407;
import java.util.ArrayList;
import java.util.Arrays;


public class Sameple4_5 {

	public static void main(String[] args) {
		
		String[] numbers23 = {"one", "two", "three"};
		
		for(int i=0; i<numbers23.length; i++) {
			
		    System.out.println(numbers23[i]);
		    
		}
		
		
		String[] numbers223 = {"one", "two", "three"};
		
		for(String s: numbers223) {
			
		    System.out.println(s);
		    
		}
		
		
        ArrayList<String> numbers323 = new ArrayList<>(Arrays.asList("one", "two", "three"));
        
        for (String number : numbers323) {
        	
        
            System.out.println(number);
		
        }		
	}
}
