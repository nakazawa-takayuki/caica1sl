package TajimaRen.Ex0250;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * キーボードから2 桁の数値を入力し、その数値が 100 以下の素数か判断し出力する。
 * 数値が素数か否かの判断は、100 以下の素数を要素に持つ配列の中から二分探索を 使用して行う。
 * @author TajimaRen
 *
 */
public class Ex0250 {

	static final int [] PRIME = {
			2,3,5,7,11,13,17,19,23,29,31,37,41,43,47,53,59,61,67,71,73,79,83,89,97};

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("input number：");

		String str = br.readLine();
		int inputNum = 0;

		try {
			inputNum = Integer.parseInt(str);
		} catch(NumberFormatException ex) {
			System.out.println("数字を入力してください");
			return;
		}

		if(inputNum < 10 || inputNum >= 100) {
			System.out.println("2桁の自然数を入力してください");
			return;
		}

		//出力
		primeDecision(inputNum);
	}

	//素数かどうか判定するメソッド
	public static void primeDecision(int inputNum){
		int low = 0;					//下限
		int high = PRIME.length;		//上限
		boolean decision = false;

		while(low <= high) {
			int mid = (low + high) / 2;
			if (PRIME[mid] == inputNum) {
				System.out.println("素数です");
				decision = true;
				break;
			} else if (PRIME[mid] < inputNum) {
				low = mid + 1;
			} else {
				high = mid - 1;
			}
		}
		if(!decision) {
			System.out.println("素数ではありません");
		}
	}
}