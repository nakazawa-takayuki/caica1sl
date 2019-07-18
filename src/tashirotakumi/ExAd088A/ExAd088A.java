package tashirotakumi.ExAd088A;

public class ExAd088A {
	public static final int A_MAX = 1000;
	public static final int A_MIN = 0;
	public static final int N_MAX = 10000;
	public static final int N_MIN = 1;
	public static final int FIVEHUNDRED = 500;
	public static final int ONE = 1;

	public static void main(String[] args) {

		int n = 0;
		int a = 0;

		try {
			try {

				n = Integer.parseInt(args[0]);
				a = Integer.parseInt(args[1]);
			} catch (ArrayIndexOutOfBoundsException e) {
				System.out.println("正しい数値を入力してください");
				System.exit(0);
			}
		} catch (NumberFormatException e) {

			System.out.println("正しい数値を入力してください");
			System.exit(0);
		}

		inputNumCheck(n, N_MAX, N_MIN);
		inputNumCheck(a, A_MAX, A_MIN);

		if (oneSubtract(fiveHundredSubtract(n), a)) {

			System.out.println("YES");
		} else {

			System.out.println("NO");
		}

	}

	public static int fiveHundredSubtract(int n) {

		while (n >= FIVEHUNDRED) {

			n = n - FIVEHUNDRED;
		}
		return n;

	}

	public static boolean oneSubtract(int n, int a) {

		for (int i = 0; i <= a; i++) {

			if (n == 0) {

				return true;
			}
			n = n - ONE;
		}
		return false;

	}

	public static void inputNumCheck(int Number, int upperLimit, int lowerLimit) {

		if (Number >= lowerLimit && Number <= upperLimit) {

			return;
		}
		System.out.println("入力エラー");
		System.exit(0);
	}

}
