package 田畑陽一朗.Ex0210;

/**
 * 九九の表を出力する。
 *
 * @author 田畑 陽一朗
 *
 */
public class Ex0210 {

	public static void main(String[] args) {

		for (int i = 1; i <= 9; i++) {
			for (int j = 1; j <= 9; j++) {
				System.out.printf("%02d  ", i * j);
			};
			System.out.println(" ");
		}
	}
}
