
package tashirotakumi.ExAd099C;

public class ExAd099C {
	public static int argument = 0;
	public static int argument2 = 0;

	public static void main(String[] args) {

		int one = integerCange(args[0]);

		inputNumCheck(one);
		int too = one;
		int i = 5;
		while (one >= 5 || too >= 5) {
			boolean x = false;
			boolean y = false;
			if (one >= multiplication9(i)) {
				one = one - multiplication9(i);
				argument++;
				x = true;
			}

			if (one >= multiplication6(i)) {
				one = one - multiplication6(i);
				argument++;
				x = true;
			}
			if (too >= multiplication6(i)) {
				too = too - multiplication6(i);
				argument2++;
				y = true;
			}
			if (too >= multiplication9(i)) {
				too = too - multiplication9(i);
				argument2++;
				y = true;
			}
			if (x) {
				i++;
			}
			if (y) {
				i++;
			}
			i--;
		}
		multiplication1(one);
		multiplication2(too);
		if (one < too) {
			System.out.println(argument);
		} else {

			System.out.println(argument2);
		}
	}

	public static int integerCange(String args) {
		int inputNumber = 0;
		try {
			inputNumber = Integer.parseInt(args);
		} catch (NumberFormatException e) {
			System.out.println("入力エラー");
		}
		return inputNumber;
	}

	public static void inputNumCheck(int Number) {
		if (Number >= 1 && Number <= 100000) {
			return;
		}
		System.out.println("入力エラー");
		System.exit(0);
	}

	public static int multiplication9(int jyou) {
		int sum = 1;
		for (int i = 0; i < jyou; i++) {
			sum = sum * 9;
		}
		return sum;
	}

	public static int multiplication6(int jyou) {
		int sum = 1;
		for (int i = 0; i < jyou; i++) {
			sum = sum * 6;
		}
		return sum;
	}

	public static int multiplication1(int one) {
		for (int i = 5; i > 0; i--) {
			if (one > 0) {
				one = one - 1;
				argument++;
			}
		}

		return one;
	}

	public static int multiplication2(int too) {
		for (int i = 5; i > 0; i--) {
			if (too > 0) {
				too = too - 1;
				argument2++;
			}
		}

		return too;
	}
}


