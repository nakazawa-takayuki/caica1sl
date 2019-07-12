package tashirotakumi.ExAd097A;

public class ExAd097A {

	public static void main(String[] args) {

		int locationA = 0;
		int locationB = 0;
		int locationC = 0;
		int signalDistance = 0;

		try {
			try {
				locationA = Integer.parseInt(args[0]);
				locationB = Integer.parseInt(args[1]);
				locationC = Integer.parseInt(args[2]);
				signalDistance = Integer.parseInt(args[3]);
			} catch (ArrayIndexOutOfBoundsException e) {
				System.out.println("入力エラー");
				System.exit(0);
			}
		} catch (NumberFormatException e) {
			System.out.println("入力エラー");
			System.exit(0);
		}
		inputNumCheck(locationA);
		inputNumCheck(locationB);
		inputNumCheck(locationC);
		inputNumCheck(signalDistance);

		int signalAB = inputCheck(locationA, locationB);
		int signalBC = inputCheck(locationB, locationC);

		if(signalAB<=signalDistance&&signalBC<=signalDistance) {
			System.out.println("YES");
		}else {
			System.out.println("NO");
		}
	}

	public static int inputCheck(int location1, int location2) {

		int signal = Math.abs(location1 - location2);

		return signal;
	}

	public static void inputNumCheck(int location) {
		if (location >= 1 && location <= 100) {
			return;
		}
		System.out.println("入力エラー");
		System.exit(0);
	}

}
