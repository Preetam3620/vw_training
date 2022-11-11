package protectedUse2;

import protectedUse.A;

public class B1 {
	void methodB1() {
		A ob = new A();
		
//		protected method is not accessible outside package
//		ob.methodA();
		
		ob.method2A();
	}

}
