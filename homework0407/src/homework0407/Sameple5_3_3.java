package homework0407;

public class Sameple5_3_3 {

    int a23;  // 객체변수 a

    void varTest23() {
    	
        this.a23++;
        
    }

    public static void main(String[] args) {
    	
    	Sameple5_3_3 sample = new Sameple5_3_3();
        
        sample.a23 = 1;
        
        sample.varTest23();
        
        System.out.println(sample.a23);
        
    }
}