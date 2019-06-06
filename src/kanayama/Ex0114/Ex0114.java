package kanayama.Ex0114;

import java.util.Scanner;

/**
 * @author 金山涼香
 *キーボードから文字列を入力し、文字列内の半角空白で単語に分解する。
 *分解後、単語を逆順で出力する。
 *半角空白が連続で入力された場合は無視する 。
 */
public class Ex0114 {
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
		System.out.println("結果 : ");

		for(int index = str_arr.length - 1; 0 <= index; index--){
			System.out.print(str_arr[index] + " ");
		}
	}

}
