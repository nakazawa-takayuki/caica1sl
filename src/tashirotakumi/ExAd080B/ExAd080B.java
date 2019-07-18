package tashirotakumi.ExAd080B;

public class ExAd080B {
	public static final int INPUT_NUMBER_MAX = 100000000;
	public static final int INPUT_NIMBER_MIN = 1;

	public static void main(String[] args) {
		int inputNumber = 0;
		try {
			inputNumber = Integer.parseInt(args[0]);
		} catch (Exception e) {
			System.out.println("入力エラー");
			System.exit(0);
		}
		inputNumCheck(inputNumber, INPUT_NIMBER_MIN, INPUT_NUMBER_MAX);
		String[] strArray = args[0].split("");
		int harshadNumber = 0;
		if (inputNumber > 10) {
			for (String s : strArray) {
				harshadNumber = harshadNumber + Integer.parseInt(s);
			}
		} else {
			harshadNumber = inputNumber;
		}
		if ((inputNumber % harshadNumber) == 0) {
			System.out.println("YES");
		} else {
			System.out.println("NO");
		}
	}

	public static void inputNumCheck(int Number, int lowerLimit, int upperLimit) {

		if (Number >= lowerLimit && Number <= upperLimit) {

			return;
		}
		System.out.println("入力エラー");
		System.exit(0);
	}
}
