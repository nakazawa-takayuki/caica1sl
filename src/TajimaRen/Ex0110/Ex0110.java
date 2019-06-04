/*キーボードから
2 つの文字列を入力し、辞書順で小さい方から値を出力する。
同じ値の場合は、「
2 つの文字列は同じです」と出力する。
 */

package Ex0110;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Ex0110 {

	public static void main(String[] args) throws IOException {

			BufferedReader br1 = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("文字列１：");

			String str1 = br1.readLine();

			BufferedReader br2 = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("文字列２：");

			String str2 = br2.readLine();
			if(str1.equals(str2)) {
				System.out.println("2つの文字列は同じです");
			}else {
				String[] st = {str1,str2};
				Arrays.sort(st);
				System.out.println(Arrays.asList(st));
		}
	}
}
