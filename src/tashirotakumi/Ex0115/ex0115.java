package tashirotakumi.Ex0115;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ex0115 {
	public static void main(String[] args) {
		System.out.println("文字列：");
		Scanner scan = new Scanner(System.in); //キーボードからの入力
		String input = scan.nextLine();
		scan.close();
		List<String> listStr = cutOutString(input);

		System.out.print("奇数番目：");
		for (int i = 0; i < listStr.size(); i = i + 2) {
			System.out.print("\t"+listStr.get(i) );
		}
		System.out.println();
		System.out.print("偶数番目：");
		for (int i = 1; i < listStr.size(); i = i + 2) {
			System.out.print(  "\t"+listStr.get(i));
		}

	}

	public static List<String> cutOutString(String input) {
		String placementString;
		List<String> listStr = new ArrayList<>();
		while (input.length() != 0 ) {
			if(input.indexOf(" ")==0) {
				input = input.substring(1, input.length());
			}else if(input.indexOf(" ")!=-1) {
				placementString = input.substring(0, input.indexOf(" "));
				input = input.substring(input.indexOf(" "), input.length());
				listStr.add(placementString);
			}else {
				placementString = input;
				listStr.add(placementString);
				break;
			}
		}
		return listStr;
	}
}