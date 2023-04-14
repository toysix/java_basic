package equals_array;

import java.util.Arrays;

public class ArrayEqualsTest {
	
	public static void main(String[] args) {
		
		// 배열은 참조형 변수이기 때문에 단순 대입시 문제가 발생함
		int[] intArray1 = {1,2,3,4};
		
		System.out.println("배열 주소 : "+ intArray1);
		System.out.println(Arrays.toString(intArray1));
		System.out.println("-------------------------");
		
		//새로 생성하지 않고 intArray1 을 대입받는 intArray2
		
		// 단순 대입으로 주소를 복사하는 경우를 얕은 복사라고 함.
		// 단순히 주소만 복사 하는게 아닌..
		// 복사가 스택이 아닌 힙에서 복사야 되야 하는..
		// 힙에서 복사를 해서 새로 할당 받는걸 깊은 복사라고 함.
		
		int[] intArray2 = intArray1.clone();
		intArray1[0] = 100;
		
		System.out.println(Arrays.toString(intArray1));
		System.out.println(Arrays.toString(intArray2));
		System.out.println("배열2 주소 : "+(intArray2));
	}

}
