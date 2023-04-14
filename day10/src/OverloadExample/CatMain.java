package OverloadExample;

public class CatMain {

	public static void main(String[] args) {
		
		
		Cat c1 = new Cat();
		
		System.out.println(c1.kind);
		System.out.println(c1.age);
		System.out.println("-------------");
		
		Cat c2 = new Cat("나비");
		
		System.out.println(c2.kind);
		System.out.println(c2.age);
		System.out.println("---------------");
		
		c2.call();
		c2.call("냥냥이");
		
	}
	
}
