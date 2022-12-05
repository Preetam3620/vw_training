package protectedUse;

public class B {
	void bMethod() {
		A ob = new A();
		ob.methodA();
		
		ob.method1A();
		
		ob.method2A();
	}
}
