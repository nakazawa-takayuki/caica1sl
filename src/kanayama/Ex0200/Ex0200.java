package kanayama.Ex0200;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ex0200 {
	public static void main(String[] args){

		Scanner inp = new Scanner(System.in);
		int inputNum = 0;

		try{
			System.out.println("input number：");
			inputNum = inp.nextInt();
			inp.close();

			System.out.print("合計値 = " + inputNumSum(inputNum));

		}catch(InputMismatchException e){
			System.out.println("半角数字以外が入力されています。");
		}
	}

	private static int inputNumSum(int inputNum) {
		int sum = 0;
        for (int index = 1; index <= inputNum; index++) {
            sum = sum + index;
        }
        return sum;
	}
}
