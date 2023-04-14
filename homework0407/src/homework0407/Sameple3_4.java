package homework0407;

public class Sameple3_4 {

	public static void main(String[] args) {
		
		String a23 = "Happy java";
		String b23 = "a";
		String c23 = "123";
		
		String aa23 = new String("Happy java");
		String bb23 = new String("a");
		String cc23 = new String ("123");
		
		boolean result = true;
		char a = 'A';
		int i = 10000; //int i = new int(10000;) String 말고 기본식에서 이런 식으로 X 리터럴 방식으로만 가능
		
		
		String aaa23 = "hello";
		String bbb23 = "java";
		String ccc23 = "hello";
		
		System.out.println(aaa23.equals(bbb23));
		System.out.println(aaa23.equals(ccc23));
		
		
		
		String aaaa23 = "hello";
		String bbbb23 = new String("hello");
		
		System.out.println(aaaa23.equals(bbbb23));
		System.out.println(aaaa23 == bbbb23);
		
		
		String aaaaa23 = "Hello java";
		System.out.println(aaaaa23.indexOf("java"));
		System.out.println(aaaaa23.contains("java"));
		System.out.println(aaaaa23.charAt(6));
		System.out.println(aaaaa23.replaceAll("java", "gava"));
		System.out.println(aaaaa23.substring(0,5));
		System.out.println(aaaaa23.toUpperCase());
		
		String aaaaaa23 = "a:b:c:d";
		String[] result23 = aaaaaa23.split(":");
		System.out.println(result23[3]);
		
		System.out.println(String.format("I eat %d apples.", 3));
		System.out.println(String.format("I eat %s aplles", "five"));
		
		
		int number23 = 10;
		String day23 = "three";
		System.out.println(String.format("%d %s", number23, day23));
		System.out.println(String.format("%s %s %s", "%s 는 다 됨",3.14,34));
		System.out.println(String.format("%d%%", 98));
		
		System.out.println(String.format("%10s", "hi"));
		System.out.println(String.format("%-10s bad", "good"));
		
		System.out.println(String.format("%.4f", 3.1457845454));
		System.out.println(String.format("%10.4f", 3.567890123));
		System.out.printf("i eat %d apples", 3);
		
	}
	
}
