package TajimaRen.Ex0215;

/*
 * キーボードから複数の数字を入力し、足して10 になる2 つの数値をペアとして出力する。
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Ex0215 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("input number：");

		String str = br.readLine();
		String[] words = str.split("\\s+");
		int[] numbers = new int[words.length];
		ArrayList<String> pairs = new ArrayList<String>();

		try {
			for (int i = 0; i < words.length; i++) {
				numbers[i] = Integer.parseInt(words[i]);
			}
		}catch(NumberFormatException ex) {
			System.out.println("数字を入力してください");
			return;
		}

		//足して10になるペアをリストに入れる
		for(int i = 0; i <= numbers.length -1; i++) {
			for(int j = i + 1; j <= numbers.length -1; j++) {
				if(numbers[i] + numbers[j] == 10) {
					pairs.add(numbers[i] + "と" + numbers[j]);
				}
			}
		}

		//出力
		if(pairs.size() == 0) {
			System.out.print("ペアとなる数字はありません");
			return;
		}
		for(int i = 0; i <= pairs.size() -1; i++) {
			System.out.print(pairs.get(i));
			if(pairs.size() >= 2 && pairs.size() -1 != i) {
				System.out.print("、");
			}
		}
		System.out.print("は足して10となるペアです");
	}
}
