package tashirotakumi.Ex0111;

import java.util.Scanner;

public class Ex0111 {

	public static void main(String[] args) {
		System.out.println("文字列：");
		@SuppressWarnings("resource")
		String scan = new Scanner(System.in).nextLine(); //キーボードからの入力
		Comparison(scan);
	}

	private static void Comparison(String scan1) {
		char[] scan = scan1.toCharArray();
		char[] com = { '①', '③', '⑤', '⑦', '⑨' };
		int x = 0;
		for (int i = 0; i < scan1.length(); i++) {
			for (int j = 0; j < 5; j++) {
				if (scan[i] == com[j]) {
					x = 1;
					System.out.println("許可しない文字（文字：" + scan[i] + (i + 1) + "桁目）が含まれます");
				}
			}
		}
		if (x == 0) {
			System.out.println("許可する文字列です");
		}
	}
}
