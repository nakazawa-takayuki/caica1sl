package tashirotakumi.ExAd099C2;

public class ExAd099C2 {
	public static int argument=0;
	public static void main(String[] args) {

		int one = integerCange(args[0]);

		inputNumCheck(one);

		for (int i = 5; i > 0; i--) {
			if(one>=multiplication9(i)) {
				one=one-multiplication9(i);
				argument++;
				i++;
			}

			if(one>=multiplication6(i)) {
				one=one-multiplication6(i);
				argument++;
				i++;
			}
		}
		multiplication1(one);
		System.out.println(argument);
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
		for (int i = 5; i> 0; i--) {
			if(one>0) {
				one = one-1;
				argument++;
			}
		}
		return one;
	}
}
