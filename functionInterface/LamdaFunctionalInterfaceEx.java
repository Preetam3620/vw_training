package functionInterface;

interface Addable {
	int add(int a, int b);
}

class Calculator implements Addable {
	public int add(int a, int b) {
		return a + b;
	}
}

public class LamdaFunctionalInterfaceEx {
	public static void main(String[] args) {
		Addable ob = new Calculator();

		int r = ob.add(10, 20);

		System.out.println(r);

		meth(ob);

		meth(new Calculator());

		// using lambda expression

		System.out.println("Implementing Functional Interface Addable on fly using Lamda expression..");

		Addable ob1 = (a, b) -> a + b;

		r = ob1.add(100, 120);
		System.out.println("result=" + r);

		System.out.println("result=" + (ob1.add(50, 70)));

		System.out.println(
				"Overriding abstract method of interface using lambda exprsn on fly and passing it to function..");
		meth((a, b) -> {

			System.out.println("a=" + a + ", b=" + b + ", result=" + (a + b));
			return a + b;
		});

		meth((a, b) -> a + b);
	}

	static void meth(Addable ref) {
		int r = ref.add(10, 20);

		System.out.println(r);
	}

}
