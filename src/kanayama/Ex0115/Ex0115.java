package kanayama.Ex0115;

import java.util.Scanner;

/**
 * @author 金山涼香
 *キーボードから文字列を入力し、
 *文字列内の半角空白で単語に分解する。
 *分解後，単語の出力順序が偶数と奇数でそれぞれ結合して出力する。
 */
public class Ex0115 {
	public static void main(String[] args){
		System.out.print("文字列：");
		Scanner inp = new Scanner(System.in);
		String str = inp.nextLine();
		inp.close();

		if(str.isEmpty()){
			System.out.println("入力されていません");
			return;
		}

		String [] str_arr = str.split("\\s+");
		String odd = "";
		String even = "";

		for(int index = 0 ; index < str_arr.length; index++){
			if((index + 1) % 2 != 0) {
				odd += str_arr[index] + " ";
			}else {
				even += str_arr[index] + " ";
			}
		}
		System.out.println("奇数番目 : " + odd);
		System.out.println("偶数番目 : " + even);
	}
}
