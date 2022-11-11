package protectedUse2;
import protectedUse.A;

public class A1 extends A {
	public void methodA1() {
		methodA();
		
//		default method is not accessible outside package
//		method1A();
		
		method2A();
	}

}
