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
		String str1 = inp.nextLine();
		inp.close();

		if(str1.isEmpty()){
			System.out.println("入力されていません");
			return;
		}
		System.out.println( str1 + "は許可されますか\n\n");

		String[] strArrays = str1.split("");
		boolean flag = true;
		int count = 1;

		for(String str : strArrays) {
			for(String target: TARGET_CHAR_ARRAY){
				if(str.equals(target)){
					System.out.print("許可しない文字(文字 : " + target + "　" +  count + "桁目)が含まれます\n");
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

