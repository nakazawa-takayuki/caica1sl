package kanayama.Ex0240;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * 課題Ex0240<br>
 * 2桁の数字を入力し、九九の表に値があるかどうか出力する。
 */
public class Ex0240 {
	public static void main(String[] args){
		int inputNum = 0;

		Scanner inp = new Scanner(System.in);

		while(true) {
			System.out.println("input number：");
			try {
				inputNum = inp.nextInt();
			}catch(InputMismatchException e) {
				System.out.print("整数以外が含まれています。");
				return;
			}

			if((inputNum < 10)&&(81 < inputNum)) {
				System.out.print("10～81で入力してください");
				continue;
			}

			break;
		}
		inp.close();
		checkMultiplication(inputNum);

	}

	/**
	 * 九九の表から値があるかチェックする
	 * */
	private static void checkMultiplication(int inputNum) {
		for(int column = 1; column <= 9; column++) {
			for(int line = 1; line <= 9; line++) {
				if(inputNum == column * line) {
					System.out.println("九九の表（" + column + " * " + line  + "）にあります");
					return;
				}
			}
		}
		System.out.println("九九の表にありません");
	}
}
