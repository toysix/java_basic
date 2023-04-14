package homework0407;


class Calculator {
	
    static int result23 = 0;

    static int add(int num) {
    	
        result23 += num;
        
        return result23;
    }
}


class Calculator1 {
	
    static int result23 = 0;

    static int add(int num) {
    	
        result23 += num;
        
        return result23;
        
    }
}



class Calculator2 {
	
    static int result23 = 0;

    static int add(int num) {
    	
        result23 += num;
        
        return result23;
        
    }
}


class Calculator11 {
    int result23 = 0;

    int add(int num) {
    	
        result23 += num;
        
        return result23;
    }
    
    int sub(int num) {
    	
        result23 -= num;
        
        return result23;
    }
}




public class Sameple5_1 {
	
	public static void main(String[] args) {
		
        System.out.println(Calculator1.add(3));
        System.out.println(Calculator1.add(4));

        System.out.println(Calculator2.add(3));
        System.out.println(Calculator2.add(7));
        
        
        Calculator11 cal123 = new Calculator11();  // 계산기1 객체를 생성한다.
        Calculator11 cal223 = new Calculator11();  // 계산기2 객체를 생성한다.

        System.out.println(cal123.add(3));
        System.out.println(cal123.add(4));

        System.out.println(cal223.add(3));
        System.out.println(cal223.add(7));
        
        
        
        
    }
}







