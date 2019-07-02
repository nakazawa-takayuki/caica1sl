package tashirotakumi.Ex0360;

import java.util.Scanner;

public class Ex0360 {
	public static final int DROP_END = 64;
	public static final int INCREASE = 1;
	public static final int REDUCE = -1;
	public static final int STAY = 0;
	public static int ENDFLAG = 1;

	public static void main(String[] args) {
		String[][] field = new String[11][11];
		field = fieldCreation(field);
		upToEndingLoop(field);

	}

	public static String[][] fieldCreation(String[][] field) {
		for (int i = 0; i <= 9; i++) {
			for (int j = 0; j <= 9; j++) {
				if ((i == 0 || j == 0) && !(i == 0 && j == 0)) {
					if (i == 0) {
						field[i][j] = String.valueOf(j + " ");
					} else if (j == 0) {
						field[i][j] = String.valueOf(i + " ");
					}
				} else if (i == 0 && j == 0) {
					field[i][j] = "  ";
				} else if ((i == 4 && j == 4) || (i == 5 && j == 5)) {
					field[i][j] = "●";
				} else if ((i == 4 && j == 5) || (i == 5 && j == 4)) {
					field[i][j] = "○";
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

		int line = 0;
		int column = 0;
		while (ENDFLAG <= DROP_END) {
			if (ENDFLAG % 2 == 1) {
				System.out.print("先行のターンです。");
			} else {
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

			field = checkReversible(field, line, column, ENDFLAG);

			if (field[line][column].equals("□")) {
				if (ENDFLAG % 2 == 1) {
					field[line][column] = "●";
				} else {
					field[line][column] = "○";
				}
			}

			for (int i = 0; i < 9; i++) {
				for (int j = 0; j < 9; j++) {
					System.out.print(field[i][j]);
				}
				System.out.println();
			}

			ENDFLAG++;
		}
	}

	public static String[][] checkReversible(String[][] field, int line, int column, int endFlag) {
		int recordLine = 0;
		int recodeColumn = 0;
		int turnOverFlag = 0;

		//ここに縦横斜めを確認する処理を記載
		recordLine = line + REDUCE;
		recodeColumn = column + REDUCE;
		//左上
		if (endFlag % 2 == 1) {
			if (field[recordLine][recodeColumn].equals("○")) {
				if (continuationCheckReversibleBlack(field, line, column, REDUCE, REDUCE)) {
					continuationCheckBlack(field, line, column, REDUCE, REDUCE);
				} else {
					turnOverFlag++;
				}
			} else {
				turnOverFlag++;
			}
		} else {
			if (field[recordLine][recodeColumn].equals("●")) {
				if (continuationCheckReversibleWhite(field, line, column, REDUCE, REDUCE)) {
					continuationCheckWhite(field, line, column, REDUCE, REDUCE);
				} else {
					turnOverFlag++;
				}
			} else {
				turnOverFlag++;
			}
		}

		//真上
		recordLine = line + REDUCE;
		recodeColumn = column + STAY;

		if (endFlag % 2 == 1)

		{

			if (field[recordLine][recodeColumn].equals("○")) {
				if (continuationCheckReversibleBlack(field, line, column, REDUCE, STAY)) {
					continuationCheckBlack(field, line, column, REDUCE, STAY);
				} else {
					turnOverFlag++;
				}
			} else {
				turnOverFlag++;
			}
		} else {
			if (field[recordLine][recodeColumn].equals("●")) {
				if (continuationCheckReversibleWhite(field, line, column, REDUCE, STAY)) {
					continuationCheckWhite(field, line, column, REDUCE, STAY);
				} else {
					turnOverFlag++;
				}
			} else {
				turnOverFlag++;
			}
		}

		//右上
		recordLine = line + REDUCE;
		recodeColumn = column + INCREASE;


		if (endFlag % 2 == 1) {
			if (field[recordLine][recodeColumn].equals("○")) {
				if (continuationCheckReversibleBlack(field, line, column, REDUCE, INCREASE)) {
					continuationCheckBlack(field, line, column, REDUCE, INCREASE);
				} else {
					turnOverFlag++;
				}
			} else {
				turnOverFlag++;
			}
		} else {
			if (field[recordLine][recodeColumn].equals("●")) {
				if (continuationCheckReversibleWhite(field, line, column, REDUCE, INCREASE)) {
					continuationCheckWhite(field, line, column, REDUCE, INCREASE);
				} else {
					turnOverFlag++;
				}
			} else {
				turnOverFlag++;
			}
		}

		//真左
		recordLine = line + STAY;
		recodeColumn = column + REDUCE;

		if (endFlag % 2 == 1) {
			if (field[recordLine][recodeColumn].equals("○")) {
				if (continuationCheckReversibleBlack(field, line, column, STAY, REDUCE)) {
					continuationCheckBlack(field, line, column, STAY, REDUCE);
				} else {
					turnOverFlag++;
				}
			} else {
				turnOverFlag++;
			}
		} else {
			if (field[recordLine][recodeColumn].equals("●")) {
				if (continuationCheckReversibleWhite(field, line, column, STAY, REDUCE)) {
					continuationCheckWhite(field, line, column, STAY, REDUCE);
				} else {
					turnOverFlag++;
				}
			} else {
				turnOverFlag++;
			}
		}

		//真右
		recordLine = line + STAY;
		recodeColumn = column + INCREASE;
		if (endFlag % 2 == 1) {
			if (field[recordLine][recodeColumn].equals("○")) {
				if (continuationCheckReversibleBlack(field, line, column, STAY, INCREASE)) {
					continuationCheckBlack(field, line, column, STAY, INCREASE);
				} else {
					turnOverFlag++;
				}
			} else {
				turnOverFlag++;
			}
		} else {
			if (field[recordLine][recodeColumn].equals("●")) {
				if (continuationCheckReversibleWhite(field, line, column, STAY, INCREASE)) {
					continuationCheckWhite(field, line, column, STAY, INCREASE);
				} else {
					turnOverFlag++;
				}
			} else {
				turnOverFlag++;
			}
		}

		//左下
		recordLine = line + INCREASE;
		recodeColumn = column + REDUCE;
		if (endFlag % 2 == 1) {
			if (field[recordLine][recodeColumn].equals("○")) {
				if (continuationCheckReversibleBlack(field, line, column, INCREASE, REDUCE)) {
					continuationCheckBlack(field, line, column, INCREASE, REDUCE);
				} else {
					turnOverFlag++;
				}
			} else {
				turnOverFlag++;
			}
		} else {
			if (field[recordLine][recodeColumn].equals("●")) {
				if (continuationCheckReversibleWhite(field, line, column, INCREASE, REDUCE)) {
					continuationCheckWhite(field, line, column, INCREASE, REDUCE);
				} else {
					turnOverFlag++;
				}
			} else {
				turnOverFlag++;
			}
		}

		//真下
		recordLine = line + INCREASE;
		recodeColumn = column + STAY;

		if (endFlag % 2 == 1) {
			if (field[recordLine][recodeColumn].equals("○")) {
				if (continuationCheckReversibleBlack(field, line, column, INCREASE, STAY)) {
					continuationCheckBlack(field, line, column, INCREASE, STAY);
				} else {
					turnOverFlag++;
				}
			} else {
				turnOverFlag++;
			}
		} else {
			if (field[recordLine][recodeColumn].equals("●")) {
				if (continuationCheckReversibleWhite(field, line, column, INCREASE, STAY)) {
					continuationCheckWhite(field, line, column, INCREASE, STAY);
				} else {
					turnOverFlag++;
				}
			} else {
				turnOverFlag++;
			}
		}

		//右下
		recordLine = line + INCREASE;
		recodeColumn = column + INCREASE;

		if (endFlag % 2 == 1) {
			if (field[recordLine][recodeColumn].equals("○")) {
				if (continuationCheckReversibleBlack(field, line, column, INCREASE, INCREASE)) {
					continuationCheckBlack(field, line, column, INCREASE, INCREASE);
				} else {
					turnOverFlag++;
				}
			} else {
				turnOverFlag++;
			}
		} else {
			if (field[recordLine][recodeColumn].equals("●")) {
				if (continuationCheckReversibleWhite(field, line, column, INCREASE, INCREASE)) {
					continuationCheckWhite(field, line, column, INCREASE, INCREASE);
				} else {
					turnOverFlag++;
				}
			} else {
				turnOverFlag++;
			}
		}

		if (turnOverFlag == 8) {
			upToEndingLoop(field);
		}
		return field;
	}

	public static boolean continuationCheckReversibleWhite(String[][] field, int line, int column, int lineTurnOver,
			int columnTurnOver) {
		boolean reversibleFlag = false;
		line = line + lineTurnOver;
		column = column + columnTurnOver;
		if ((column <= 0 || column >= 9) || line <= 0 || line >= 9) {
			return reversibleFlag;
		}
		for (int i = line; i >= 1 && i <= 7; i = i + lineTurnOver) {
			if (field[i][column].equals("●")) {

			}
			if (field[(i + lineTurnOver)][(column + columnTurnOver)].equals("○")) {
				reversibleFlag = true;

			}
			column = column + columnTurnOver;
			if (column <= 1 || column >= 7) {
				break;
			}
		}

		return reversibleFlag;

	}

	public static boolean continuationCheckReversibleBlack(String[][] field, int line, int column, int lineTurnOver,
			int columnTurnOver) {
		boolean reversibleFlag = false;
		line = line + lineTurnOver;
		column = column + columnTurnOver;
		if ((column<= 0 || column >= 9) ||( line <= 0 || line >= 9)) {
			return reversibleFlag;
		}
		for (int i = line; i >= 2 && i <= 7; i = i + lineTurnOver) {
			if (field[i][column].equals("○")) {

			}
			if (field[(i + lineTurnOver)][(column + columnTurnOver)].equals("●")) {
				reversibleFlag = true;

			}
			column = column + columnTurnOver;
			if (column <= 1 || column >= 7) {
				break;
			}
		}

		return reversibleFlag;

	}

	public static String[][] continuationCheckWhite(String[][] field, int line, int column, int lineTurnOver,
			int columnTurnOver) {
		line = line + lineTurnOver;
		column = column + columnTurnOver;
		for (int i = line; i >= 1 && i <= 8; i = i + lineTurnOver) {
			if (field[i][column].equals("●")) {
				field[i][column] = "○";

			} else if (field[i][column].equals("○")) {

			}
			column = column + columnTurnOver;
			if (column <= 1 || column >= 8) {
				break;
			}
		}
		return field;

	}

	public static String[][] continuationCheckBlack(String[][] field, int line, int column, int lineTurnOver,
			int columnTurnOver) {
		line = line + lineTurnOver;
		column = column + columnTurnOver;
		for (int i = line; i >= 1 && i <= 8; i = i + lineTurnOver) {
			if (field[i][column].equals("○")) {
				System.out.println("1");
				field[i][column] = "●";

			} else if (field[i][column].equals("●")) {
			}
			column = column + columnTurnOver;
			if (column <= 1 || column >= 8) {
				break;
			}
		}
		return field;

	}
}
