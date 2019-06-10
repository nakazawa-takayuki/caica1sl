package hehangrui.Ex0210;

/**
 * 問題
 * 九九の表を出力する.
 *
 * @author Adrian
 */

public class Ex0210 {

	public static void main(String[] args) {

		for (int i = 1; i <= 9; i++) {
			for (int j = 1; j <= 9; j++) {
				if(i * j <10) {
					System.out.printf("0" + i * j + "  ");
				}else {
				System.out.printf(i * j + "  ");
				}
			}
			System.out.println();
		}
	}

}
