package tashirotakumi.Ex0140;

import java.util.Scanner;

public class Ex0140 {

	public static void main(String[] gras) {
		double input1 = 0;
		double input2 = 0;
		int calculatingFlag = 0;
		System.out.println("input number1：");
		Scanner scan = new Scanner(System.in); //キーボードからの入力
		String inputStr1 = scan.nextLine();
		System.out.println("input number2：");
		String inputStr2 = scan.nextLine();
		System.out.println("input number3：");
		String inputStr3 = scan.nextLine();
		scan.close();
		try {
			input1 = Double.parseDouble(inputStr1);
			input2 = Double.parseDouble(inputStr2);
			calculatingFlag = Integer.parseInt(inputStr3);
		} catch (NumberFormatException e) {
			System.err.println("数字を入力してください");
			return;
		}
		double result = basicArithmeticOperationsResult(input1, input2, calculatingFlag);
		System.out.println(result);
	}

	/**
	 * basicArithmeticOperationsResultメソッド
	 * 四則演算をおこない結果を返す
	 * @param input1 四則演算に使用する一つ目の値
	 * @param input2 四則演算に使用する二つ目の値
	 * @param input3 四則演算 和差積商からどれを使用するか判断する値
	 * @return 四則演算結果
	 */
	public static double basicArithmeticOperationsResult(double input1, double input2, int calculatingFlag) {
		double result;
		switch (calculatingFlag) {
		case 0:
			result = input1 + input2;
			break;
		case 1:
			result = input1 - input2;
			break;
		case 2:
			result = input1 * input2;
			break;
		default:
			result = input1 / input2;
		}
		return result;

	}
}
