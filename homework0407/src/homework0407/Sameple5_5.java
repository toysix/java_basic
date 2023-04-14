package homework0407;


class Animall {
	
    String name23;

    void setName(String name) {
    	
        this.name23 = name;
        
    }
}

class Dog extends Animall {  // Animal 클래스를 상속한다.
	
    void sleep() {
    	
        System.out.println(this.name23+" zzz");
        
    }
    
}


class HouseDog extends Dog {
	
    void sleep() {
    	
        System.out.println(this.name23 + " zzz in house");
        
    }
    
    void sleep(int hour) {
    	
        System.out.println(this.name23 + " zzz in house for " + hour + " hours");
        
    }
    
    
}




public class Sameple5_5 {
	
    public static void main(String[] args) {
    	
        Dog dog = new Dog();
        
        dog.setName("poppy");
        
        System.out.println(dog.name23);
        
        dog.sleep();
        
        
        HouseDog houseDog = new HouseDog();
        
        houseDog.setName("happy");
        
        houseDog.sleep();  // happy zzz 출력
        
        houseDog.sleep(3);  // happy zzz in house for 3 hours 출력
         
    }
	

}