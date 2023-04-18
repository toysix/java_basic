package exception.runtime;

class Animal{}
class Dog extends Animal{}
class Cat extends Animal{}


public class ClassCastExample {
	public static void main(String[] args) {
		
		Dog d = new Dog();
		Animal da = d;
		d = (Dog) da;
		
		System.out.println(new StringBuffer("타입 변환 성공 : Animal -> dog"));
		
		Animal c = new Cat();
		
		//Dog d2 = (Dog)c; // Cat은 dog 타입으로 변환 불가
		
		System.out.println(new StringBuffer("타입 변환 성공? : dog -> Cat)"));
		
				
		
		
		
	}

}
