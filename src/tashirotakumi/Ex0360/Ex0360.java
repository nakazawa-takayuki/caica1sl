package tashirotakumi.Ex0360;

import java.util.Scanner;

public class Ex0360 {
	private static int PASS_NUMBER = 9;
	private static int EXCEPTION_NUMBER = 0;


	public static void main(String[] args) {
		Board board = new Board();
		board.BoardFieldConfirmation();
		SpinningTop spTop = new SpinningTop();
		while (true) {
			spTop. firstSecondCheck();
			System.out.println("行："); //キーボードによる受付入力チェック
			int line = inputReception();
			if (line == EXCEPTION_NUMBER) {
				board.BoardFieldConfirmation();
				System.out.println("数字を入力してください");
				continue;
			}
			System.out.println("列：");
			int column = inputReception();
			if (column == EXCEPTION_NUMBER) {
				board.BoardFieldConfirmation();
				System.out.println("数字を入力してください");
				continue;
			}
			if (line == PASS_NUMBER || column == PASS_NUMBER) {
				spTop.endFlagCountUp();
				board.BoardFieldConfirmation();
				spTop.setCountUpGameEndTimes();
				System.out.println("パスしました。");
				continue;
			}
			if (!board.isPutCheck(line, column, spTop.endFlagConfirmation())) { //置ける場所か確認問題なければおく。
				board.BoardFieldConfirmation();
				System.out.println("おける場所を選択してください");
				continue;
			}
			if (board.aroundIsFlip(line, column, spTop.endFlagConfirmation())) {
				board.BoardFieldConfirmation();
				System.out.println("おける場所を選択してください");
				continue;
			}
			board.isPut(line, column, spTop.endFlagConfirmation());
			board.BoardFieldConfirmation(); //駒の表示
			if (!(spTop.spinningTopCount(board.boardField))) { //駒が一色になった場合にゲーム終了
				break;
			}
			if (spTop.endFlagConfirmation() >= spTop.getGameEndTimes()) { //駒を打ちつくした場合にゲーム終了
				spTop.winOrLose();
				break;
			}
			spTop.endFlagCountUp();
		}
	}

	/**
	 * inputReceptionメソッド
	 * キーボードから入力を受け付け入力チェックを行う
	 * @return 入力された数値
	 */
	public static int inputReception() {
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		String inputStr = scan.nextLine();
		Board board = new Board();

		int inputNumber = 0;
		try {
			inputNumber = Integer.parseInt(inputStr);
		} catch (NumberFormatException e) {
			inputNumber = EXCEPTION_NUMBER;
		}
		if (inputNumber < 0 || inputNumber > board.getArrayMax()) {
			inputNumber = EXCEPTION_NUMBER;
		}

		return inputNumber;

	}
}

//以下はメソッド化のみ使用した処理の記述

/*
	public static void main(String[] args) {
		String[][] field = new String[10][10];
		field = fieldCreation(field);
		upToEndingLoop(field);

	}
*/
/**
 * fieldCreationメソッド
 * 配列に初期値の設定を行う
 * @param field 空の配列
 * @return 盤面管理用配列
 */
/*
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
*/
/**
 * upToEndingLoopメソッド
 * 先攻後攻の判断、また入力、盤面の表示を行う。
 * @param field 盤面管理用配列
 */
/*public static void upToEndingLoop(String[][] field) {

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
		if (line == PASS_NUMBER && column == PASS_NUMBER) {
			ENDFLAG++;
			DROP_END++;
			System.out.println("パスしました");
			upToEndingLoop(field);
		}
		if ((line < 1 || line > 8) || (column < 1 || column > 8)) {
			System.err.println("範囲内の数字を入力してください");
			upToEndingLoop(field);
		}

		if (!field[line][column].equals("□")) {
			System.out.println("おいてあります");
			upToEndingLoop(field);
		}
		field = checkReversible(field, line, column, ENDFLAG);
		if (ENDFLAG % 2 == 1) {
			field[line][column] = "●";
		} else {
			field[line][column] = "○";
		}

		for (int i = 0; i < 9; i++) {
			for (int j = 0; j < 9; j++) {
				System.out.print(field[i][j]);
			}
			System.out.println();
		}
		intermediateWinOrLoss(field);
		endWinOrLoss(field);

		ENDFLAG++;
	}
}
*/
/**
 * checkReversibleメソッド
 * 置いた際に回りに色の違うまるが存在するか確認する
 * @param field 盤面管理用の配列
 * @param line 入力された配列を指定する行の値
 * @param column 入力された配列を指定する列の値
 * @param endFlag 先攻後攻どちらかを判断する値
 * @return 変更を保存した場面管理用配列
 */
/*	public static String[][] checkReversible(String[][] field, int line, int column, int endFlag) {
		int recordLine = 0;
		int recodeColumn = 0;
		int turnOverFlag = 0;

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

		if (endFlag % 2 == 1) {
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
*/
/**
 * continuationCheckReversibleWhiteメソッド
 * 黒を置いた際にひっくり返す処理を行ってよいかの判断をする
 * @param field 盤面管理用の配列
 * @param line 入力された配列を指定する行の値
 * @param column 入力された配列を指定する列の値
 * @param lineTurnOver 各方向に対応した行をずらす値
 * @param columnTurnOver 各方向に対応した列をずらす値
 * @return 処理が必要かをtrue、falseで返す
 */
/*public static boolean continuationCheckReversibleWhite(String[][] field, int line, int column, int lineTurnOver,
		int columnTurnOver) {
	boolean reversibleFlag = false;
	line = line + lineTurnOver;
	column = column + columnTurnOver;
	if ((column <= 0 || column > 9) || line <= 0 || line > 9) {
		return reversibleFlag;
	}
	for (int i = line; i >= 1 && i <= 8; i = i + lineTurnOver) {
		if (field[i][column].equals("□")) {
			break;
		}
		if (field[(i + lineTurnOver)][(column + columnTurnOver)].equals("○")) {
			reversibleFlag = true;

		}
		column = column + columnTurnOver;
		if (column <= 1 || column > 9) {
			break;
		}
	}

	return reversibleFlag;

}
*/
/**
 * continuationCheckReversibleBlackメソッド
 * 白を置いた際にひっくり返す処理を行ってよいかの判断をする
 * @param field 盤面管理用の配列
 * @param line 入力された配列を指定する行の値
 * @param column 入力された配列を指定する列の値
 * @param lineTurnOver 各方向に対応した行をずらす値
 * @param columnTurnOver 各方向に対応した列をずらす値
 * @return 処理が必要かをtrue、falseで返す
 */
/*public static boolean continuationCheckReversibleBlack(String[][] field, int line, int column, int lineTurnOver,
		int columnTurnOver) {
	boolean reversibleFlag = false;
	line = line + lineTurnOver;
	column = column + columnTurnOver;
	if ((column <= 0 || column > 9) || line <= 0 || line > 9) {
		return reversibleFlag;
	}
	for (int i = line; i >= 1 && i <= 8; i = i + lineTurnOver) {
		if (field[i][column].equals("□")) {
			break;
		}
		if (field[(i + lineTurnOver)][(column + columnTurnOver)].equals("●")) {
			reversibleFlag = true;

		}
		column = column + columnTurnOver;
		if (column <= 1 || column > 9) {
			break;
		}
	}

	return reversibleFlag;

}
*/
/**
 * continuationCheckWhiteメソッド
 * 白を置いた際、指定方向に黒がおいてある場合に色を反転させる
 * @param field 盤面管理用の配列
 * @param line 入力された配列を指定する行の値
 * @param column 入力された配列を指定する列の値
 * @param lineTurnOver 各方向に対応した行をずらす値
 * @param columnTurnOver 各方向に対応した列をずらす値
 * @return 変更を加えた盤面管理用配列
 */
/*public static String[][] continuationCheckWhite(String[][] field, int line, int column, int lineTurnOver,
		int columnTurnOver) {
	line = line + lineTurnOver;
	column = column + columnTurnOver;
	for (int i = line; i >= 1 && i <= 8; i = i + lineTurnOver) {
		if (field[i][column].equals("□")) {
			return field;
		}
		if (field[i][column].equals("●")) {
			field[i][column] = "○";

		} else if (field[i][column].equals("○")) {
			return field;
		}
		column = column + columnTurnOver;
		if (column <= 1 || column > 9) {
			break;
		}
	}
	return field;

}
*/
/**
 * continuationCheckBlackメソッド
 * 黒を置いた際、指定方向に白が置かれている場合に色を反転させる
 * @param field 盤面管理用の配列
 * @param line 入力された配列を指定する行の値
 * @param column 入力された配列を指定する列の値
 * @param lineTurnOver 各方向に対応した行をずらす値
 * @param columnTurnOver 各方向に対応した列をずらす値
 * @return 変更を加えた盤面管理用配列
 */
/*public static String[][] continuationCheckBlack(String[][] field, int line, int column, int lineTurnOver,
		int columnTurnOver) {
	line = line + lineTurnOver;
	column = column + columnTurnOver;
	for (int i = line; i >= 1 && i <= 9; i = i + lineTurnOver) {
		if (field[i][column].equals("□")) {
			return field;

		}
		if (field[i][column].equals("○")) {
			field[i][column] = "●";

		} else if (field[i][column].equals("●")) {
			return field;
		}
		column = column + columnTurnOver;
		if (column <= 1 || column > 9) {
			break;
		}
	}
	return field;

}
*/
/**
 * winOrLossメソッド
 * 盤面にどちらか片方の色しかない場合にゲームを終了させる
 * @param field盤面管理用の配列
 */
/*public static void intermediateWinOrLoss(String[][] field) {
	boolean whiteCehck = false;
	boolean blackCheck = false;
	for (int i = 0; i < 9; i++) {
		for (int j = 0; j < 9; j++) {
			if (field[i][j].equals("○")) {
				whiteCehck = true;
			} else if (field[i][j].equals("●")) {
				blackCheck = true;
			}
		}
	}
	if (!whiteCehck) {
		System.out.println("先攻の勝利");
		System.exit(0);
	} else if (!blackCheck) {
		System.out.println("後攻の勝利");
		System.exit(0);

	}
}

public static void endWinOrLoss(String[][] field) {
	boolean squareCheck = true;
	int whiteCount = 0;
	int blackCount = 0;
	for (int i = 0; i < 9; i++) {
		for (int j = 0; j < 9; j++) {
			if (field[i][j].equals("□")) {
				squareCheck = false;
			}
		}
	}
	if (squareCheck) {
		for (int i = 0; i < 9; i++) {
			for (int j = 0; j < 9; j++) {
				if (field[i][j].equals("○")) {
					whiteCount++;
				} else if (field[i][j].equals("●")) {
					blackCount++;
				}
			}
		}
		if (whiteCount > blackCount) {
			System.out.println("後攻の勝ち" + whiteCount + "枚");
			System.exit(0);
		} else {
			System.out.println("先攻の勝ち" + blackCount + "枚");
			System.exit(0);
		}
	}

}
}
*/