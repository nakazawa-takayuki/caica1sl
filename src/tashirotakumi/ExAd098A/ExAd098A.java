package tashirotakumi.ExAd098A;

import java.util.ArrayList;
import java.util.List;

public class ExAd098A {
	public static void main(String[] args) {

		int one=integerCange(args[0]);
		int too=integerCange(args[1]);
		inputNumCheck(one);
		inputNumCheck(too);


		int addition=one+too;
		int subtraction=one-too;
		int multiplication=one*too;

		win(addition,subtraction,multiplication);

	}

	public static void win(int addition,int subtraction,int multiplication) {
		List<Integer> list = new ArrayList<Integer>();
		list.add(addition);
		list.add(subtraction);
		list.add(multiplication);
		list.sort(null);
		System.out.println(list.get(list.size()-1));
	}

	public static int integerCange(String args) {
		int inputNumber = 0;
		try {
			inputNumber = Integer.parseInt(args);
		} catch (NumberFormatException e) {
			System.out.println("入力エラー");
		}
		return inputNumber;

	}
	public static void inputNumCheck(int Number) {
		if (Number >= -1000 && Number <= 1000) {
			return;
		}
		System.out.println("入力エラー");
		System.exit(0);
	}

}
