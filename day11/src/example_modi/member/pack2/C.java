
package example_modi.member.pack2;

import example_modi.member.pack1.*;

public class C {

	public C() {
		
		A a = new A();
		
		a.a = 1;
		//a.b = 2; // 패키지가 다르면 접근 불가 default
		//a.c = 3; // 파일이 다르면 접근 불가 private
		
		a.method1();
		//a.method2();
		//a.method3();
	}
	
	
	
	
}
