package kanayama.Ex0111;
import java.util.Scanner;

/**
 * @author 金山涼香
 *キーボードから文字列を入力し、文字列内に「① ③ ⑤ ⑦ ⑨」が含まれるか判定する 。
 *含まれる場合は「許可しない文字（文字： XX YY 桁目 ）が含まれます」、
 *含まれない場合は「許可する文字列です」と出力する。
 */
public class Ex0111 {
	public static void main(String[] args){
		final String[] TARGET_CHAR_ARRAY = {"①","③","⑤","⑦","⑨"};

		System.out.print("文字列：");
		Scanner inp = new Scanner(System.in);
		String str = inp.nextLine();
		inp.close();

		if(str.isEmpty()){
			System.out.println("入力されていません");
			return;
		}
		System.out.println( str + "は許可されますか\n\n");

		String[] strArrays = str.split("");
		boolean flag = true;
		int count = 1;

		for(String strChar : strArrays) {
			for(String targetChar: TARGET_CHAR_ARRAY){
				if(strChar.equals(targetChar)){
					System.out.print("許可しない文字(文字 : " + targetChar + "　" +  count + "桁目)が含まれます\n");
					flag = false;
				}
			}
			count++;
		}
		if(flag) {
			System.out.print("許可する文字列です");
		}
	}

}

