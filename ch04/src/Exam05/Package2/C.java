package Exam05.Package2;

import Exam05.Package1.A;

public class C {
	
	public C() {
		A a = new A();
		a.field1 = 1;
		//a.field2 //다른 패키지 접근 불가
		//a.field3 
		
		a.method1();
		//a.method2(); //다른 패키지 접근 불가
		//a.method3();
	}
	
}
