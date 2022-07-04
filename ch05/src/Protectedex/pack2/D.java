package Protectedex.pack2;

import Protectedex.pack1.A;

public class D extends A {
	public D() {
		//상속은 자식 클래스에게 접근 허용
		super();
		this.field = "value";
		this.method();
	}
}
