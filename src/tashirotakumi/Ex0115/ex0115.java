package tashirotakumi.Ex0115;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ex0115 {
	public static void main(String[] args) {
		List<String> list = new ArrayList<>();

		System.out.println("文字列：");
		@SuppressWarnings("resource")
		String scan = new Scanner(System.in).nextLine(); //キーボードからの入力
		list = Comparison(scan);
		{
			System.out.print("奇数番目：");
			for (int i = 0; i < list.size(); i = i + 2) {
				System.out.print(list.get(i) + "\t");
			}
			System.out.println();
			System.out.print("偶数番目：");
			for (int i = 1; i < list.size(); i = i + 2) {
				System.out.print(list.get(i) + "\t");
			}
		}
	}

	public static List<String> Comparison(String scan) {
		String chipped;
		List<String> list = new ArrayList<>();
		while (0 != scan.length()) {
			if (0 != scan.indexOf(" ")) {
				if (-1 == scan.indexOf(" ")) {
					chipped = scan;
					list.add(chipped);
					break;
				}
				chipped = scan.substring(0, scan.indexOf(" "));
				scan = scan.substring(scan.indexOf(" "), scan.length());
				list.add(chipped);

			} else {
				scan = scan.substring(1, scan.length());
			}
		}
		return list;
	}

}
