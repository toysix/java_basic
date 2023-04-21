package api.lang.wrapping;

import java.util.Arrays;

public class Wrapping {
	
	public static void main(String[] args) {
		
		int a = 100;
		double b = 2.41;
		char c = 'H';
		boolean d = false;
		
		// Wrapping : 기본타입을 참조형 타입으로 만들기
					// 취소선 : deprecated (사용중지)
		
		Integer val1 = a; // new Integer(a);
		Double val2 = b; // 2.41;
		Character val3 = c;
		Boolean val4 = d;
		Byte val5 = (byte)75;
		
		Object[] arr = {val1,val2,val3,val4,val5};
		System.out.println(Arrays.toString(arr));
		
		// Unwrapping : 래퍼 클래스를 다시 기본자료형으로 돌리기
		
		int i = val1.intValue();
		double j = val2.doubleValue();
		char k = val3.charValue();
		boolean x = val4.booleanValue();
		byte y = val5.byteValue();
		
		
		
	}

}
