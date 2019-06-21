package TajimaRen.Ex0235;

/**
 * キーボードから入力された0～255 の範囲の10 進数整数値を2 進数と16 進数に変換して出力する。
 * @author TajimaRen
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex0235 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("0～255の範囲の10進数：");

		String str = br.readLine();
		int inputNum;

		try {
			inputNum = Integer.parseInt(str);
		}catch(NumberFormatException ex) {
			System.out.println("数字を入力してください");
			return;
		}

		if(inputNum < 0 || inputNum > 255) {
			System.out.println("0～255の範囲の数字を入力してください");
			return;
		}

		String binaryNumber = toBinaryNumber(inputNum);		//2進数
		String decimalNumber = toDecimalNumber(inputNum);	//16進数

		//出力
		System.out.println("2進数の変換結果：" + String.format("%08d",Integer.parseInt(binaryNumber)));
		System.out.println("16進数の変換結果：" + decimalNumber);
	}

	//2進数に変換
	public static String toBinaryNumber(int inputNum) {
		String bin = Integer.toBinaryString(inputNum);
		return bin;
	}

	//16進数に変換
	public static String toDecimalNumber(int inputNum) {
		String hex = Integer.toHexString(inputNum);
		return hex;
	}
}