package streams;

import java.util.function.Predicate;

public class CheckPrime_PredicateInterface {

	public static void main(String[] args) {

		Predicate<Integer> f = (no) -> {

			if (no <= 0) {
				return false;
			} else if (no > 0 && no <= 2) {
				return true;
			} else {
				for (int i = 2; i < no; i++) {
					if (no % i == 0) {
						return false;
					}
				}
				return true;
			}
		};

		System.out.println(f.test(9));
		System.out.println(f.test(19));

		meth(f = (no) -> {
			if (no <= 0) {
				return false;
			} else if (no > 0 && no <= 2) {
				return true;
			} else {
				for (int i = 2; i < no; i++) {
					if (no % i == 0) {
						return false;
					}
				}
				return true;
			}
		}); // invoke meth method

	}

	static void meth(Predicate<Integer> f) {
		System.out.println(f.test(9));
		System.out.println(f.test(19));
	}

}