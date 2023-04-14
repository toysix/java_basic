package day07;

public class CatMain {

	// 고양이를 조회하는 용도로 사용할 전용 메서드를 작성
	
	public static void showCatInfo(Cat cat) {
		
		System.out.println("고양이 이름 : "+ cat.catName);
		System.out.println("고양이 품종 : "+ cat.catkind);
		System.out.println("고양이 나이 : "+ cat.catage);
		System.out.println(cat);
		System.out.println();
		
	}
	
	
	public static void main(String[] args) {
		
		Cat c1 = new Cat();
		
		c1.catName = "뚱이";
		c1.catkind = "페르시아";
		c1.catage = 5;
		
		
		// c2, c3를 새롭게 생성해주고
		// 이 고양이들도 showCatInfo로 조회할때
		// 메모리 구조가 어떻게 전개될지 직접 그려보기까지 해보기
		// 그림을 c1, c2, c3를 조회하는 각각의 순간
		// 총 3 장
		
		Cat c2 = new Cat();
		
		c2.catName = "2뚱이";
		c2.catkind = "2페르시아";
		c2.catage = 25;
		
		Cat c3 = new Cat();
		
		c3.catName = "3뚱이";
		c3.catkind = "3페르시아";
		c3.catage = 35;
		
		
		
		showCatInfo(c1);
		showCatInfo(c2);
		showCatInfo(c3);
		
		
		
		
	}
	
}
