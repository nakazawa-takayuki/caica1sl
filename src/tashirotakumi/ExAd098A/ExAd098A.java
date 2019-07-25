package tashirotakumi.ExAd098A;

import java.util.ArrayList;
import java.util.List;

public class ExAd098A {
	public static final int MAX_INT=1000;
	public static final int MIN_INT=-1000;
	public static void main(String[] args) {
		int one=0;
		int too=0;
		try {
		one=integerCange(args[0]);
		too=integerCange(args[1]);
		}catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("スペースを入れ、値を二つ入力してください");
			System.exit(0);
		}
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
		if (Number >= MIN_INT && Number <= MAX_INT) {
			return;
		}
		System.out.println("入力エラー");
		System.exit(0);
	}

}
