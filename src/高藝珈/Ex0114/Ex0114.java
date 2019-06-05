package 高藝珈.Ex0114;

import java.util.Scanner;

public class Ex0114 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		System.out.println("文字列:");
		Scanner input = new Scanner(System.in);
		String s = input.nextLine();
		input.close();

		String[] words = s.split("\\s+");
		for (int i = words.length - 1; i >= 0; i--) {
			System.out.print(words[i] + " ");
		}
	}

}
