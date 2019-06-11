package 高藝珈.Ex0215;

import java.util.Scanner;

/**
 * キーボードから複数の数字を入力し、足して10になる2つの数値をペアとして出力する。
 *
 * @author 高藝珈
 */

public class Ex0215 {

	static final int TARGET_VALUE = 10;

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("input number:");
		String[] inputNums = scan.nextLine().split("\\s+");
		scan.close();

		int[] nums = new int[inputNums.length];
		try {
			for (int i = 0; i < inputNums.length; i++) {
				nums[i] = Integer.parseInt(String.valueOf(inputNums[i]));
			}
		} catch (NumberFormatException e) {
			System.out.println("数字以外が入力されています");
		}

		if (inputNums.length <= 1) {
			System.out.println("二つ数字以上を入力してください");

		}

		boolean isTarget = false;
		for (int i = 0; i < nums.length; i++) {
			for (int j = i + 1; j < nums.length; j++) {
				if (nums[i] + nums[j] == TARGET_VALUE) {
					isTarget = true;
					System.out.print(nums[i] + " と " + nums[j] + " 、");
				}
			}
		}

		if (isTarget) {
			System.out.println("は足して" + TARGET_VALUE + "となるペアです。");
		} else {
			System.out.println("ペアとなる数字はありません。");
		}

	}
}
