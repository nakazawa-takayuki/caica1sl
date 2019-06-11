package kanayama.Ex0112;
import java.util.Scanner;

/**
 * @author 金山涼香
 *キーボードから文字列を入力し、文字列内に半角カナが含まれるか判定する 。
 *含まれる場合は「半角カナが含まれます」、
 *含まれない場合は「許可する文字列です」と 出力する。
 */
public class Ex0112 {
	public static void main(String[] args){

		System.out.print("文字列：");
		Scanner inp = new Scanner(System.in);
		String str = inp.nextLine();
		inp.close();

		if(str.isEmpty()){
			System.out.println("入力されていません");
			return;
		}

		System.out.println( str + "は許可されますか\n");

		if(judge(str)) {
			System.out.print("半角ｶﾅが含まれます");
		}else {
			System.out.print("許可する文字列です");
		}
	}

	private static boolean judge(String str) {
		boolean result = false;
		if(str.matches( ".*[\\uFF65-\\uFF9F].*")){
			result = true;
		}
		return result;
	}
}
