package TajimaRen.Ex0370;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 起動時引数として正解の4 桁の数字を与える。
 * 999 を入力してギブアップするか、正解を入力するまで予想数字の入力と当たり判定の結果を出力し続ける。
 * ヒット：位置も数字も一致している数
 * ブロー：位置は一致していないが、数字が一致している数
 * @author TajimaRen
 *
 */
public class Ex0370 {

	static final String GIVE_UP_NUMBER = "999";

	public static void main(String[] args) throws IOException {
		String input;
		String answer = args[0];
		int count = 1;

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		while(true) {
			System.out.println("（" + count +"回目）予測数字を入力してください：");
			input = br.readLine();

			try {
				Integer.parseInt(input);
			} catch(NumberFormatException ex) {
				System.out.println("数字を入力してください");
				return;
			}

			//4桁以下かつ999でない数字を入力されたとき
			if (input.length() < 4 && !input.equals(GIVE_UP_NUMBER)) {
				System.out.println("4桁の数字もしくは999を入力してください");
				return;

			//4桁以上の数字を入力されたとき
			} else if (4 < input.length()) {
				System.out.println("4桁の数字もしくは999を入力してください");
				return;
			}

			Match match = new Match();
			Match result = match.matchMethod(input,answer);

			//出力
			if (input.equals(GIVE_UP_NUMBER)){
				System.out.println("正解は" + answer + "でした。");
				break;
			} else {
				System.out.println("ヒット：" + result.hit + "　ブロー：" + result.brow);
				count++;
			}
		}
	}
}

class Match{
	static	int hit ;
	static int brow ;

	public Match matchMethod(String input,String answer) {
		Match match = new Match();
		String[] inputArrays = input.split("");
		String[] answerArrays = answer.split("");
		hit = 0;
		brow = 0;

		for (int i = 0; i < inputArrays.length; i++) {
			for (int j = 0; j < answerArrays.length; j++) {
				if (i == j && inputArrays[i].equals(answerArrays[j])) {
					hit++;
				} else if (inputArrays[i].equals(answerArrays[j])){
					brow++;
				}
			}
		}
		return match;
	}
}
