package exception.Multi;

import java.util.*;


public class MultiCatchExample {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		try {
			System.out.println(new StringBuffer("1번째 데이터 : "));
			String data1 = scan.next();
			System.out.println(new StringBuffer("2번째 데이터 : "));
			String data2 = scan.next();
			
			//NumberFormatException 발생
			
			int i = Integer.parseInt(data1);
			int j = Integer.parseInt(data2);
			
			//ArithmeticException 발생 가능
			
			int result = i / j;
			
			System.out.println(new StringBuffer().append(i).append("/").append(j).append("=").append(result));
			
			//위 구문 이래 안가면 먼저 아래 구문으로 해도 됩니다.
			
			//System.out.println(i + "/" + j + "=" + result);
			
			
			// NullPointerException 발생 가능
			String str = null;
			str.charAt(0); // 문자열 0번째 문자만 인덱식.. 인데 null
			
			
		}catch (NumberFormatException | NullPointerException e){
			
			System.err.println(new StringBuffer("데이터를 숫자만 입력해주세요"));
		} catch (ArithmeticException e) {
				System.out.println(new StringBuffer("0으로 나눌 수 없습니다."));
		}catch ( Exception e) {
			System.err.println(new StringBuffer(" 알 수 없는 에러네잉.."));
			System.err.println(new StringBuffer(" 복구해불구 있어유"));
		}
		scan.close();
		
	}
	

}
