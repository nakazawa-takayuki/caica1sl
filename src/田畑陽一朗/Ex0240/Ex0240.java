package 田畑陽一朗.Ex0240;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ex0240 {

	final static int multiplicationNumber = 9;

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		int inputNum = 0;
		try {
			System.out.println("input number :");
			inputNum = scn.nextInt();
		} catch (InputMismatchException e) {
			System.out.println("整数を入力してください。");
			return;
		} finally {
			scn.close();
		}
		checkExistMultiplication(inputNum);

	}

	public static void checkExistMultiplication(int inputNum) {
		boolean judge = true;
		for (int i = 0; i <= multiplicationNumber; i++) {
			for (int j = 0; j <= multiplicationNumber; j++) {
				if (inputNum == i * j) {
					System.out.println("九九の表" + i + "*" + j + "にあります");
					judge = false;
				}
			}
		}
		if (judge) {
			System.out.println("九九の表にはありません");
		}
	}
}
