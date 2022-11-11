package abstractExample;

public class Main {

	public static void main(String[] args) {
		Shape s;
		s = new Square(5);
		method(s);
//		System.out.println(s.calcArea());
//		System.out.println(s.calcPeri());
		
		s = new Rectangle(10, 5);
		method(s);
//		System.out.println(s.calcArea());		
//		System.out.println(s.calcPeri());
	}
	
	public static void method(Shape s) {
		System.out.println(s.calcArea());		
		System.out.println(s.calcPeri());
	}

}
