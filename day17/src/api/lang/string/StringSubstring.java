package api.lang.string;

public class StringSubstring {
	
	public static void main(String[] args) {
		
		String ssn = "840420-1344220";
		System.out.println(ssn);
		
		/*
		 * -subString() 메서드에 매개값으로 인덱스를 1개 지정시
		 * 해당 인덱스부터 마지막 지점까지의 문자를 추출하게 됨
		 */
		
		String last = ssn.substring(7); // 7~
		System.out.println(last);
		
		// 매개값을 2개 지정시 첫 번째 매개값 이상 두 번째 매개값 미만 범위 문자를 추출함
		
		String first = ssn.substring(0,6); // 0 ~ 5
		
		System.out.println(first);
		
	}

}
