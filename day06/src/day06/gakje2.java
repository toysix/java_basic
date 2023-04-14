package day06;


/*
 * 점메추, 저메추 해주는 코드를 짜주세요.
 * 난수를 발생시켜서 점심이나 저녁메뉴를 콘솔에 하나 띄우면 됨.
 */

import java.util.*;


public class gakje2 {

	public static void main(String[] args) {
		
		
		int nansu = (int)((Math.random() * 6));
		
		String[] menu = {"한식", "중식", "일식", "분식", "셀러드", "Chat gpt : 휴먼.. 밥먹을때가 아닙니다.. 공부나 하시죠!"};
		
		
			
		System.out.println("뭘 먹을까 고민중이시면 "+ menu[nansu] +" 이라고 합니다."
				+ "");
		
			
	}
	
	
}
