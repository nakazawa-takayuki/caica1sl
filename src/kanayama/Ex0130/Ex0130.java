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
			int inputArray[] = new int[3];

			System.out.print("input number1: ");
			inputArray[0] = inp.nextInt();
			System.out.print("input number2: ");
			inputArray[1] = inp.nextInt();
			System.out.print("input number3: ");
			inputArray[2] = inp.nextInt();

			inp.close();
			Arrays.sort(inputArray);

			System.out.print("最大値 =" + calcMax(inputArray));
			System.out.print(" 中央値 =" + calcMedian(inputArray));
			System.out.print(" 平均値 =" + String.format("%.3f", calcAverage(inputArray)));

		}catch(InputMismatchException e){
			System.out.println("半角数字以外が入力されています。");
		}
	}

	private static int calcMax(int[] numArray){
		int max = numArray[0];
		for (int num : numArray) {
			if (max < num) {
				max = num;
			}
		}
		return max;
	}

	private static int calcMedian(int[] numArray){
		int middle = numArray.length / 2;
		if (numArray.length % 2 == 1) {
			return numArray[middle];
		} else {
			return (numArray[middle - 1] + numArray[middle]) / 2;
		}
	}

	private static double calcAverage(int[] numArray) {
		int sum = 0;

		for (int num : numArray) {
			sum += num;
		}
		return (double)sum / numArray.length;
	}
}