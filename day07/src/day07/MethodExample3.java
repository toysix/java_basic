package day07;

public class MethodExample3 {
	
/*
 * 반환 유형 (return type)
 * 
 * 1. 반환값은 메서드를 호추랗ㄴ 곳으로 전달해주는 return 구문 우측 값을 의미
 * 
 * 2. 매개 변수는 여겨래를 입력받을 수 있지만 반환값은 오로지 하나여야만 함.
 * 
 * 3. return 키워드를 사용해 반환 값을 지정할 수 있음
 * 
 * 4. 전달할 반환값의 자료형을 반환 유형이라고 함.
 * 
 * 5. 반환값이 있는 메서드는 호출문 위치에 하나의 값이 전달되기 때문에
 *    매직넘버 대신 사용할 수 있음.
 *    
 * 6. 반환값이 없는 매서드는 viod를 기입, 이때는 return 구문을 쓰지 않아도 된다. (break 문 대신 사용 가능)
 * 
 * 7. 모든 메서드는 return을 만나는 순간 즉시 종료된다.
 *    분기가 아닌 return 구문 하단에는 추가 코드를 작성하면 경고가 뜸
 * 	
 */
	
	
	public static int add(int n1, int n2) {
		
		return n1 + n2;
		
	}
	
	public static void callMyName(String name) {
		
		//문자열도 배열이므로 .lenght() 로 문자 개수를 셀 수 있음. 
		
		if (name.length() <2) {
			
			System.out.println("이름은 최소 2글자 이상 입력해야 합니다.");
			return;
			
		}
		
		System.out.println("내 이름은 "+ name + " 입니다.");
	}
	
	
	// 배열 리턴시 자료형에도 배욜암울 묭사 햐여 험,
	
	 public static int[] totalOperate(int n1, int n2) {
		 
		 int[] total = {n1+n2, n1-n2, n1*n2, n1/n2};
		 
		 return total;
		 
	 }
	
	
	public static void main(String[] args) {
		
		int resert1 = add(3,5);
		
		System.out.println(resert1);
		// System.out.println(add(3,5))와 결과 동일
		
		
		int resert2 = add(add(2,4), add(5,6));
		System.out.println(resert2);
		
		int[] tot = totalOperate(20, 7);
		
		System.out.println(tot[0]);
		System.out.println(tot[1]);
		System.out.println(tot[2]);
		System.out.println(tot[3]);
		
		
		callMyName("김자바"); // 반환값이 void이며 return 구문 실행 안됨
		callMyName("채"); // 반환값이 void 이며 return 구문 실행 안됨 
		
		
	}
	

}
