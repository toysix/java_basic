package homework0407;

class Animal {}


class Animal23 {
	
    String name23;
    
}


class Animal223 {
	
    String name23;

    public void setName(String name23) {
    	
        this.name23 = name23;
        
    }
}





public class Sameple5_2 {
	
	public static void main(String[] args) {
		
	     Animal cat23 = new Animal();
	     
	     Animal23 cat223 = new Animal23();
	     
	     System.out.println(cat223.name23);
	     
	     
	        Animal223 cat2223 = new Animal223();
	        
	        System.out.println(cat2223.name23);
	     
	        cat2223.setName("boby");  // 메서드 호출
	        
	        System.out.println(cat2223.name23);
	        
	        
	        Animal223 dog23 = new Animal223();
	        
	        dog23.setName("happy");
	        
	        System.out.println(dog23.name23);
	        
	}
	
	
	

}
