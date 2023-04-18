package exception.runtime;

public class ArrayIndexExample {
	
	public static void main(String[] args) {
		
		int[] arr = {3,6,9};
		
		System.out.println(arr[3]); // 있지도 않은 인덱스 번호 하면 ArrayIndex 익셉션 발생
		
	}

}
