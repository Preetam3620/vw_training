package protectedUse;

public class A {
	protected void methodA() {
		System.out.println("method of a");
	}

	void method1A() {
		System.out.println("default method of a");
	}
	
	public void method2A() {
		System.out.println("default method of a");
	}
}
