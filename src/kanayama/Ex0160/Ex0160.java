package kanayama.Ex0160;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ex0160 {
	static final int FORTURE_ROW_INDEX = 0;
	static final int FORTURE_HIGH_INDEX = 5;
	static final String[][] FORTURE_ARRAYS = {
			{"吉","吉","凶","凶","凶","吉"},
			{"吉","吉","凶","吉","凶","吉"},
			{"凶","凶","吉","吉","吉","吉"},
			{"凶","吉","吉","吉","凶","凶"},
			{"凶","凶","凶","吉","吉","凶"},
			{"凶","吉","吉","凶","凶","凶"},
	};
	public static void main(String[] args){

		Scanner inp = new Scanner(System.in);
		int inputArray[] = new int[2];

		try{
			System.out.println("1つ目の数字(0～5): ");
			inputArray[0] = inp.nextInt();
			System.out.println("2つ目の数字(0～5): ");
			inputArray[1] = inp.nextInt();
			inp.close();

			if(!(checkNum(inputArray[0]))){
				System.out.println("0～5以外の半角数字が入力されています。");
				return;
			}
			if(!(checkNum(inputArray[1]))){
				System.out.println("0～5以外の半角数字が入力されています。");
				return;
			}
			System.out.print("占いの結果は" + FORTURE_ARRAYS[inputArray[0]][inputArray[1]] + "です");

		}catch(InputMismatchException e){
			System.out.println("半角数字以外が入力されています。");
		}
	}

	private static boolean checkNum(int num) {
		boolean result = false;
		if((FORTURE_ROW_INDEX <= num)&&(num <= FORTURE_HIGH_INDEX)) {
			result = true;
		}
		return result;
	}

}
