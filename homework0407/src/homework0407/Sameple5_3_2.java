package homework0407;

 class Sample5_3_2 {

    int a23;  // 객체변수 a

    void varTest(Sample5_3_2 sample) {
    	
        sample.a23++;
        
    }

    public static void main(String[] args) {
    	
        Sample5_3_2 sample23 = new Sample5_3_2();
        
        sample23.a23 = 1;
        
        sample23.varTest(sample23);
        
        System.out.println(sample23.a23);
        
    }
}