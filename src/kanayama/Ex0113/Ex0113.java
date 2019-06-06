package kanayama.Ex0113;

import java.util.Scanner;

/**
 * @author 金山涼香
 *キーボードから文字列を入力し、文字列内に全角数字が含まれる場合は半角数字に置換して出力する。
 */
public class Ex0113 {
	public static void main(String[] args){
		System.out.print("文字列：");
		Scanner inp = new Scanner(System.in);
		String str = inp.nextLine();
		inp.close();

		if(str.isEmpty()){
			System.out.println("入力されていません");
			return;
		}

		StringBuffer str_Buffer = new StringBuffer(str);
		for (int i = 0; i < str_Buffer.length(); i++) {
			char c = str_Buffer.charAt(i);
			if ('０' <= c && c <= '９') {
				str_Buffer.setCharAt(i, (char) (c - '０' + '0'));
			}
		}
		System.out.print("結果 : " + str_Buffer);
	}


}
