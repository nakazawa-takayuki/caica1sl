package TajimaRen.Ex0370;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * 起動時引数として正解の4 桁の数字を与える。
 * 999 を入力してギブアップするか、正解を入力するまで予想数字の入力と当たり判定の結果を出力し続ける。
 * ヒット：位置も数字も一致している数
 * ブロー：位置は一致していないが、数字が一致している数
 * @author TajimaRen
 *
 */
public class Ex0370 {

	static final Pattern PATTERN = Pattern.compile("^[0-9]{4}+$");	//4桁の半角数字か判定するパターン

	static final String GIVE_UP_NUMBER = "999";						//ギブアップして答えを表示する数字

	public static void main(String[] args) throws IOException {

		//引数が空だったときの処理
		if(args.length == 0) {
			System.out.println("引数が入っていません");
			return;
		}

		//引数が4桁の半角数字ではなかったときの処理
		Matcher matcherArgs = PATTERN.matcher(args[0]);
		if(matcherArgs.find() == false) {
			System.out.println("引数が4桁の半角数字ではありません");
			return;
		}

		String input;
		String answer;
		int count = 0;

		while(true) {
			answer = args[0];
			count++;

			//入力
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("（" + count + "回目）予測数字を入力してください：");
			input = br.readLine();

			//答えを表示する「999」が入力されたときの処理と
			//入力された文字列が4桁の半角数字ではなかったときの処理
			Matcher matcherInput = PATTERN.matcher(input);

			if(input.equals(GIVE_UP_NUMBER)) {
				System.out.println("正解は" + answer + "でした。");
				break;
			}else if (matcherInput.find() == false) {
				System.out.println("4桁の半角数字を入力してください");
				break;
			}

			//出力
			if (input.equals(answer)){
				System.out.println("正解は" + answer + "でした。");
				break;
			} else {
				hitAndBrow(input,answer);
			}
		}
	}

	public static void hitAndBrow(String input,String answer) {

		int hit ;
		int brow ;
		String[] inputArrays = input.split("");
		String[] answerArrays = answer.split("");
		hit = 0;
		brow = 0;

		for (int i = 0; i < inputArrays.length; i++) {
			for (int j = 0; j < answerArrays.length; j++) {
				if (i == j && inputArrays[i].equals(answerArrays[j])) {
					hit++;
				} else if (inputArrays[i].equals(answerArrays[j])) {
					brow++;
				}
			}
		}
		System.out.println("ヒット：" + hit + "　ブロー：" + brow);
	}
}