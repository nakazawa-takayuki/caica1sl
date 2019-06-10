package 高藝珈.Ex0200;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
*
* @author 高藝珈
 * @return
*/

public class Ex0200 {

	public static void main(String[] args) {

		int input1;

		while (true) {
			Scanner input = new Scanner(System.in);

			try {
				System.out.println("input number:");
				input1 = input.nextInt();

			} catch (InputMismatchException e) {
				System.out.println("数字以外が入力されています");
				continue;
			} catch (ArrayIndexOutOfBoundsException e) {
				System.out.println("範囲外です。もう一度数字を入力してください");
				continue;
			}

			if (input1 < 0) {
				System.out.println(" 0より大きな数字入力してください");
				continue;
			}

			System.out.println(sum(input1));
			input.close();
			break;
		}

	}

	public static int sum(int n) {
		if (n == 1) {
			return 1;
		}
		return n + sum(n - 1);
	}
}
