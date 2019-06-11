package kanayama.Ex0215;

import java.util.Arrays;
import java.util.Scanner;

public class Ex0215 {

	static final int TARGET_VALUE = 10;
	public static void main(String[] args){

		Scanner inp = new Scanner(System.in);
		System.out.println("input number：");
		String inputNums = inp.nextLine();
		inp.close();
		if(inputNums.isEmpty()){
			System.out.println("入力されていません");
			return;
		}
		String [] inputArray = inputNums.split("\\s+");
		Integer[] inputNumArray = checkInputNum(inputArray);

		System.out.println(Arrays.toString(inputArray));
		System.out.println(Arrays.toString(inputNumArray));

		if(checkTotalTen(inputNumArray)) {
			System.out.print(" は足して10 となるペアです");
		}else{
			System.out.print("ペアとなる数字はありません");
		}
	}

	private static Integer[] checkInputNum(String[] inputArray) {
		Integer[] NumArray = new Integer[inputArray.length];
		try {
			for(int index = 0; index < inputArray.length; index++){
				NumArray[index] = Integer.parseInt(inputArray[index]);
			}
		}catch(NumberFormatException e) {
			System.out.print("整数以外が含まれています。");
		}
		Arrays.sort(NumArray);
		return NumArray;
	}

	private static boolean checkTotalTen(Integer[] inputNumArray) {
		boolean result = false;
		int k = inputNumArray.length - 1;
		for (int i = 0; i < inputNumArray.length - 1; i++) {
			for( int j = k; i < j; j--) {
				if(inputNumArray[i] == TARGET_VALUE - inputNumArray[j]) {
					System.out.print(inputNumArray[i] + "と" + inputNumArray[j] );
					if(j - i > 2 ) {
						System.out.print("、");
					}
					result = true;
					k = j - 1;
					break;
				}
			}
		}
		return result;
	}
}
