package collection.map;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LottoQuize2 {

public static void main(String[] args) {
		
		
		/*
		 * 1. Lotto복권은 1~45범위의 숫자중 6개를 뽑아 추첨하는 복권입니다.

				List<Integer> 타입 변수에 구현체를 대입해주시고
				해당 변수에 중복 없이 6개의 번호가 들어가도록 해 주세요.
				
				2. 1번 과제를 마친 분들은 당첨될때까지 다시 번호를 무작위로 계속 뽑는 코드를
				작성해서 몇 번 만에 로또복권이 당첨되는지 확인하는 시뮬레이션 코드를 만들어주세요.
				
				hint : .equals()로 배열끼리 비교할 때는 배열 내부 요소의 순서와 자료 모두를 비교합니다
				ex) [1, 2, 3] 과 [1, 2, 3]은 true로 비교되지만
				[1, 2, 3]과 [1, 3, 2]는 false로 비교됩니다.
		 */
		
		List<Integer> lotto = new ArrayList<>();
		List<Integer> lotto2 = new ArrayList<>();
		
		
		boolean b = true;
		
		while(b) {
			
			int i = (int)(Math.random()*45+1);	
			
			if (lotto.size() != 6) {
				
				
				if (!lotto.contains(i)) {
					lotto.add(i);
				}
				
			}else {
				System.out.println(lotto);
				b = false;
			}
			
		}
		
	
		int count = 0;
		
		while(!lotto.equals(lotto2)) {
			
			int i = (int)(Math.random()*45+1);	
			
			if (lotto2.size() != 6) {
				
				if (!lotto2.contains(i)) {
					lotto2.add(i);
				}
				
			}else {
				System.out.println(count + "번째 시도중");
				count++;
			
			}
			
		
		}
		
		System.out.println(count + " 번 만에 로또 성공!");
		
		
		
	}
}
