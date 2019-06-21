package tashirotakumi.Ex0215;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ex0215 {
	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		StringBuilder str = new StringBuilder();
		@SuppressWarnings("resource")
		String scan = new Scanner(System.in).nextLine();
		list = store(scan);
		str = comparison(list);
		//最後の区切り文字削除
		if (str.toString().length() != 1) {
			if (str.toString().length() != 0) {
				System.out.println(str.deleteCharAt(str.toString().length() - 1) + "は足して 10 となるペアです");
			} else {
				System.out.println("ペアになる組み合わせは存在しません");
			}
		}
	}

	public static StringBuilder comparison(List<String> list) {
		StringBuilder str = new StringBuilder();
		int value = 0;
		for (int i = 0; i < list.size(); i++) {
			for (int j = i + 1; j < list.size(); j++) {
				try {
					value = Integer.parseInt(list.get(i)) + Integer.parseInt(list.get(j));
				} catch (NumberFormatException e) {
					System.out.println("数字を入力してください");
					str.append(" ");
					return str;
				}
				if (value == 10) {
					str.append(list.get(i) + "と" + list.get(j) + "、");
				}
			}
		}
		return str;
	}

	public static List<String> store(String scan) {
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
