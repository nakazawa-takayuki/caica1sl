package kanayama.Ex0116;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * @author 金山涼香
 *2つの整数値 i1 、 i2 を入力する。
 *i1が偶数であり、かつ i2 が偶数の場合、「 2 つの値ともに偶数です」と表示する
 *i1が奇数であり、かつ i2 が偶数の場合、「 i1 は奇数です。 i2 は偶数です」と表示する。
 *i1が偶数であり、かつ i2 が奇数の場合、「 i1 は偶数です。 i2 は奇数です」と表示する。
 *i1が奇数であり、かつ i2 が奇数の場合、「 2 つの値ともに奇数です」と表示する。
 */
public class Ex0116 {
	public static void main(String[] args){
		Scanner inp = new Scanner(System.in);
		try{
			System.out.print("input number1 : ");
			int num1 = inp.nextInt();

			System.out.print("input number2 : ");
			int num2 = inp.nextInt();

			inp.close();
			checkNum(num1,num2);

		}catch(InputMismatchException e){
			System.out.println("半角数字以外が入力されています");


		}

	}


	private static void checkNum(int num1,int num2){

		if ((num1 % 2 == 0)&&(num2 % 2 == 0)){
			System.out.println("2 つの値ともに偶数です");
		} else if((num1 % 2 != 0)&&(num2 % 2 == 0)) {
			System.out.println("i1 は奇数です。 i2 は偶数です。");
		} else if((num1 % 2 == 0)&&(num2 % 2 != 0)) {
			System.out.println("i1 は偶数です。 i2 は奇数です。");
		} else if((num1 % 2 != 0)&&(num2 % 2 != 0)){
			System.out.println("2 つの値ともに奇数です」と表示する。");
		}

	}
}
