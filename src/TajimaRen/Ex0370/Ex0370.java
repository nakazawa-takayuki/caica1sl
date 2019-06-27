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

	static final int DIGIT = 4;
	static final String GIVE_UP_NUMBER = "999";

	public static void main(String[] args) throws IOException {
		String input;
		String answer;
		int count;

		//引数が空、もしくは4桁でなかったときの処理
		if(args.length == 0) {
			System.out.println("引数が入っていません");
			return;
		}else if(args[0].length() < DIGIT || DIGIT < args[0].length()) {
			System.out.println("引数が4桁ではありません");
			return;
		}

		while(true) {
			answer = args[0];
			count = 1;

			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("（" + count +"回目）予測数字を入力してください：");
			input = br.readLine();

			//入力された文字列が数字ではなかったときの処理
			Pattern pattern = Pattern.compile("^[0-9]*$");
			Matcher matcher = pattern.matcher(input);
			if (matcher.find() == false) {
				System.out.println("数字を入力してください");
				continue;
			}

			//4桁以下かつ999でない数字を入力されたときの処理
			if (input.length() < DIGIT && !input.equals(GIVE_UP_NUMBER)) {
				System.out.println("4桁の数字もしくは999を入力してください");
				continue;

			//4桁以上の数字を入力されたときの処理
			} else if (DIGIT < input.length()) {
				System.out.println("4桁の数字もしくは999を入力してください");
				continue;
			}

			//MatchクラスとMatchクラスで求めたhitの数とbrowの数を持ってくる
			Match match = new Match();
			Match result = match.matchMethod(input,answer);

			//出力
			if (result.hit == DIGIT || input.equals(GIVE_UP_NUMBER)){
				System.out.println("正解は" + answer + "でした。");
				break;
			} else {
				System.out.println("ヒット：" + result.hit + "　ブロー：" + result.brow);
				count++;
			}
		}
	}
}