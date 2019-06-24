package tashirotakumi.Ex0114;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ex0114 {

	public static void main(String[] args) {

		System.out.println("文字列：");
		Scanner scan = new Scanner(System.in); //キーボードからの入力
		String input = scan.nextLine();
		scan.close();

		List<String> listStr = cutOutString(input);

		for (int i = listStr.size(); i > 0; i--) {
			System.out.print(listStr.get(i - 1) + "	");
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
				return listStr;
			}
		}
		return listStr;
	}
}