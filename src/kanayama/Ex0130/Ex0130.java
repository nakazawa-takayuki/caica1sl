package kanayama.Ex0130;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * @author 金山涼香
 *キーボードから3つの整数値を入力し、最大値、中央値 平均値 小数第3 位を四捨五入を出力する。
 */
public class Ex0130 {

	public static void main(String[] args){
		Scanner inp = new Scanner(System.in);
		try{
			int numArray[] = new int[3];

			System.out.print("input number1: ");
			numArray[0] = inp.nextInt();
			System.out.print("input number2: ");
			numArray[1] = inp.nextInt();
			System.out.print("input number3: ");
			numArray[2] = inp.nextInt();

			inp.close();
			Arrays.sort(numArray);

			System.out.print("最大値 =" + numMax(numArray));
			System.out.print(" 中央値 =" + numMedian(numArray));
			System.out.print(" 平均値 =" + String.format("%.3f", numAverage(numArray)));

		}catch(InputMismatchException e){
			System.out.println("半角数字以外が入力されています。");
		}
	}

	private static int numMax(int[] numArray){
		double max = numArray[0];
		for (double num : numArray) {
			if (max < num) {
				max = num;
			}
		}
		return (int) max;
	}

	private static int numMedian(int[] numArray){
		int middle = numArray.length / 2;
		if (numArray.length % 2 == 1) {
			return (int)numArray[middle];
		} else {
			return (int)(numArray[middle - 1] + numArray[middle]) / 2;
		}
	}

	private static double numAverage(int[] numArray) {
		int sum = 0;

		for (int num : numArray) {
			sum += num;
		}
		return (double)sum / numArray.length;
	}
}