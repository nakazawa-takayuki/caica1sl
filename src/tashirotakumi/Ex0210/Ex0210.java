package tashirotakumi.Ex0210;

import java.text.DecimalFormat;

public class Ex0210 {
	public static void main(String[] args) {
		int multiplication[][] = new int[9][9];
		DecimalFormat df1 = new DecimalFormat("00");
		for (int i = 1; i < 10; i++) {
			for (int j = 1; j < 10; j++) {
				multiplication[i - 1][j - 1] = i * j;
				System.out.print(df1.format(multiplication[i - 1][j - 1]) + "\t");
			}
			System.out.println();
		}
	}

}
