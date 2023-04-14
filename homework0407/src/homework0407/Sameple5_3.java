package homework0407;


class Sample {
	

    int sum(int a23, int b23) {
    	
        return a23 + b23;
        
    }

}


class Sample23 {
	
    int sum(int a23, int b23) {  // a, b 는 매개변수
    	
        return a23+b23;
    }
}

class Sample423 {
	
    String say() {
    	
        return "Hi";
        
    }
}


class Sample523 {
	
    void sum(int a23, int b23) {
    	
        System.out.println(a23+"과 "+b23+"의 합은 "+(a23+b23)+"입니다.");
        
    }
}


class Sample623 {
	
    void say() {
    	
        System.out.println("Hi");
        
    }
}

class Sample723 {

    void sayNick(String nick723) {
    	
        if ("fool".equals(nick723)) {
        	
            return;
            
        }
        
        System.out.println("나의 별명은 "+nick723+" 입니다.");
    }
}


class Sample823 {

    void varTest(int a823) {
    	
        a823++;
    }
}
    

class Sample923 {
	
    int varTest(int a923) {
    	
        a923++;
        
        return a923;
    }
}






class Sameple5_3 {
	
    public static void main(String[] args) {
    	
        int a23 = 3;
        int b23 = 4;

        Sample sample23 = new Sample();
        
        int c = sample23.sum(a23, b23);

        System.out.println(c);
        
        
        Sample23 sample223 = new Sample23();
        
        int c23 = sample223.sum(3, 4);  // 3, 4는 인수

        System.out.println(c23);
        
        
        
        Sample423 sample423 = new Sample423();
        
        String a223 = sample423.say();
        
        System.out.println(a223);  // "Hi" 출력
        
        
        Sample523 sample523 = new Sample523();
        
        sample523.sum(3, 4);
        
        
        Sample623 sample623 = new Sample623();
        
        sample623.say();
        
        
        
        Sample723 sample723 = new Sample723();
        
        sample723.sayNick("angel");
        
        sample723.sayNick("fool");  // 출력되지 않는다.
        
        
        
        int a823 = 1;
        
        Sample823 sample823 = new Sample823();
        
        sample823.varTest(a823);
        
        System.out.println(a823);
        
        
        
        
        int a923 = 1;
        
        Sample923 sample923 = new Sample923();
        
        a923 = sample923.varTest(a923);
        
        System.out.println(a923);
        
        

        
        
        
    }
 }
    

