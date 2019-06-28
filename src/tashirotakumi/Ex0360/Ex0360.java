package tashirotakumi.Ex0360;

import java.util.Scanner;

public class Ex0360 {
	public static final int DROP_END = 64;

	public static void main(String[] args) {
		String[][] field = new String[10][10];
		field = fieldCreation(field);
		upToEndingLoop(field);

	}

	public static String[][] fieldCreation(String[][] field) {
		for (int i = 0; i < 9; i++) {
			for (int j = 0; j < 9; j++) {
				if ((i == 0 || j == 0) && !(i == 0 && j == 0)) {
					if (i == 0) {
						field[i][j] = String.valueOf(j + " ");
					} else if (j == 0) {
						field[i][j] = String.valueOf(i + " ");
					}
				} else if (i == 0 && j == 0) {
					field[i][j] = "  ";
				} else {
					field[i][j] = "□";
				}
			}
		}
		for (int i = 0; i < 9; i++) {
			for (int j = 0; j < 9; j++) {
				System.out.print(field[i][j]);
			}
			System.out.println();
		}
		return field;
	}

	public static void upToEndingLoop(String[][] field) {

		int endFlag = 1;
		int line = 0;
		int column = 0;
		while (endFlag <= DROP_END) {
			if (endFlag % 2 == 1) {
				System.out.print("先行のターンです。");
			}else {
				System.out.println("後攻のターンです。");
			}
			System.out.println();
			@SuppressWarnings("resource")
			Scanner scan = new Scanner(System.in);
			System.out.print("行:");
			String inputStr1 = scan.nextLine();
			System.out.print("列:");
			String inputStr2 = scan.nextLine();
			try {
				line = Integer.parseInt(inputStr1);
				column = Integer.parseInt(inputStr2);
			} catch (NumberFormatException e) {
				System.err.println("数字を入力してください");
				upToEndingLoop(field);
			}
			if (field[line][column] == "□") {
				if (endFlag % 2 == 1) {
					field[line][column] = "●";
				}else {
					field[line][column] = "○";
				}

			}
			for (int i = 0; i < 9; i++) {
				for (int j = 0; j < 9; j++) {
					System.out.print(field[i][j]);
				}
				System.out.println();
			}
			endFlag++;
		}
	}
	public static void checkReversible(String[][] field) {
		//ここに縦横斜めを確認する処理を記載
	}

}
