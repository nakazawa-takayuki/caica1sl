package kanayama.Ex0160;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ex0160 {
	public static void main(String[] args){

		Scanner inp = new Scanner(System.in);
		int numArray[] = new int[2];

		try{
			System.out.println("1つ目の数字(0～5): ");
			numArray[0] = inp.nextInt();
			System.out.println("2つ目の数字(0～5): ");
			numArray[1] = inp.nextInt();
			inp.close();

			if(!((numCheck(numArray[0])&&(numCheck(numArray[1]))))){
				System.out.println("0～5以外の半角数字が入力されています。");
				return;
			}

			System.out.print("占いの結果は" + fortunResult(numArray) + "です");

		}catch(InputMismatchException e){
			System.out.println("半角数字以外が入力されています。");
		}
	}

	private static boolean numCheck(int num) {
		final int FORTURE_ROW_INDEX = 0;
		final int FORTURE_HIGH_INDEX = 5;
		boolean result = false;
		if((FORTURE_ROW_INDEX <= num)&&(num <= FORTURE_HIGH_INDEX)) {
			result = true;
		}
		return result;
	}

	private static String fortunResult(int[] numArray) {
		final String[][] FORTURE_ARRAYS = {
				{"吉","吉","凶","凶","凶","吉"},
				{"吉","吉","凶","吉","凶","吉"},
				{"凶","凶","吉","吉","吉","吉"},
				{"凶","吉","吉","吉","凶","凶"},
				{"凶","凶","凶","吉","吉","凶"},
				{"凶","吉","吉","凶","凶","凶"},
		};
		return FORTURE_ARRAYS[numArray[0]][numArray[1]];
	}
}
