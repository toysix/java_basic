package example_modi.construdor.pack1;

public class B {
	
	
	A a1 = new A(false); // public 호출 문제 없음
	A a2 = new A(55); // default 호출 문제 없음
	// A a3 = new A("안됨"); // private 은 A 내부에서만 호출 가능
	
	
	

}
