package tashirotakumi.ExAd090B;

public class ExAd090B {
	public static void main(String[] args) {
		String reverse = "";
		int countup = 0;
		int firstNumber = 0;
		int secondNumber = 0;

		try {
			firstNumber = Integer.parseInt(args[0]);
			secondNumber = Integer.parseInt(args[1]);
		} catch (Exception e) {
			System.exit(0);
		}
		inputCheck(firstNumber,secondNumber);
		for (int i = firstNumber; i < secondNumber; i++) {
			reverse = "";
			char[] suuji = String.valueOf(i).toCharArray();
			for (int j = suuji.length - 1; j >= 0; j--) {
				reverse = reverse + suuji[j];
			}
			if (String.valueOf(i).equals(reverse)) {
				countup++;
			}
		}
		System.out.println(countup);
	}

	public static void inputCheck(int firstNumber,int secondNumber) {
		if(!(10000<=firstNumber&&firstNumber<=secondNumber&&secondNumber<=100000)) {
			System.out.println("起動時引数を正しい値で入力してください");
			System.exit(0);

		}
	}
}
