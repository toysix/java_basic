package day08;

public class CatMain {

	public static void main(String[] args) {
		
		Cat cat1 = new Cat();
		
		Cat cat2 = new Cat();
		
		cat1.name = "뚱이";
		cat1.age = 1;
		cat1.kind = "코리안숏헤어";
		cat1.col = "블랙";
		
		
		cat2.name = "2뚱이";
		cat2.age = 21;
		cat2.kind = "2코리안숏헤어";
		
		cat2.col = "2블랙";
		
		
		cat1.showCatInfo();
		cat2.showCatInfo();
		
		
	}

}
