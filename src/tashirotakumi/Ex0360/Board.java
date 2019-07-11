package tashirotakumi.Ex0360;

public class Board {
	//碁盤を作成
	//おいてあるのが白駒黒駒どちらであるかの確認を行う
	//反転処理を行う？人クラスを作成したほうがよいのか
	String[][] boardField = new String[9][9];
	SpinningTop spTop = new SpinningTop();
	private static int ARRAY_MAX = 9;

	/**コンストラクタ
	 *初期値の入力を行う
	 */
	public Board() {
		for (int i = 0; i < ARRAY_MAX; i++) {
			for (int j = 0; j < ARRAY_MAX; j++) {
				if ((i == 0 || j == 0) && !(i == 0 && j == 0)) {
					if (i == 0) {
						boardField[i][j] = String.valueOf(j + " ");
					} else if (j == 0) {
						boardField[i][j] = String.valueOf(i + " ");
					}
				} else if (i == 0 && j == 0) {
					boardField[i][j] = "  ";
				} else if ((i == 4 && j == 4) || (i == 5 && j == 5)) {
					boardField[i][j] = spTop.firstSecondCheck(spTop.endFlagConfirmation());
				} else if ((i == 4 && j == 5) || (i == 5 && j == 4)) {
					boardField[i][j] = spTop.firstSecondFilpCheck(spTop.endFlagConfirmation());
				} else {
					boardField[i][j] = spTop.blankConfirmation();
				}
			}
		}
	}
	public int getArrayMax() {
		return ARRAY_MAX;
	}
	//場面上の確認を行う(表示を行う)メソッドを作成
	/**
	 * BoardFieldConfirmationメソッド
	 *盤面の表示を行う
	 */
	public void BoardFieldConfirmation() {
		for (int i = 0; i < ARRAY_MAX; i++) {
			for (int j = 0; j < ARRAY_MAX; j++) {
				System.out.print(boardField[i][j]);
			}
			System.out.println();
		}
	}

	/**
	 *isPutCheckメソッド
	 *おける場所か確認を取る
	 * @param line 入力された行の値
	 * @param column 入力された列の値
	 * @param endFlag 駒の置かれた回数
	 * @return 入力された数値の場所が□の場合true、それ以外の場合falseを返す
	 */
	public boolean isPutCheck(int line, int column, int endFlag) {
		if (boardField[line][column].equals(spTop.blankConfirmation())) {
			return true;
		}
		return false;
	}

	//駒を置くメソッドの作成
	/**
	 *isPutメソッド
	 *入力された場所に指定の色をおく
	 * @param line 入力された行の値
	 * @param column 入力された列の値
	 * @param endFlag 駒の置かれた回数
	 */
	public void isPut(int line, int column, int endFlag) {
		boardField[line][column] = spTop.firstSecondCheck(endFlag);

	}

	//駒をひっくり返すか確認するメソッドの作成
	/**
	 *aroundIsFlipメソッド
	 *周りにひっくり返せる駒が存在するか確認
	 * @param line 入力された行の値
	 * @param column 入力された列の値
	 * @param endFlag 駒の置かれた回数
	 * @return ない場合trueある場合false
	 */
	public boolean aroundIsFlip(int line, int column, int endFlag) {
		boolean reverseCheck = true;
		//置いた周囲の駒を調べるため二次元配列で確認
		for (int i = -1; i < 2; i++) {
			for (int j = -1; j < 2; j++) {

				if (isFlipCheck(line, column, i, j, endFlag)) {
					isFlip(line, column, i, j, endFlag);
					reverseCheck = false;
				}
			}
		}
		return reverseCheck;
	}

	//ひっくり返す
	/**
	 * isFlipメソッド
	 * 駒がおかれた位置から見て一方向の反転を行う
	 * @param line 入力された行の値
	 * @param column 入力された列の値
	 * @param i 駒の周囲を確認した際の数値、行の値
	 * @param j 駒の周囲を確認した際の数値、列の値
	 * @param endFlag 駒の置かれた回数
	 */

	public void isFlip(int line, int column, int i, int j, int endFlag) {
		int confirmationLine = line + i;
		int confirmationColumn = column + j;
		while ((confirmationLine >= 1 && confirmationLine < ARRAY_MAX)
				&& (confirmationColumn >= 1 && confirmationColumn < ARRAY_MAX)) {

			if ((boardField[confirmationLine][confirmationColumn].equals(spTop.firstSecondFilpCheck(endFlag)))) {
				boardField[confirmationLine][confirmationColumn] = spTop.firstSecondCheck(endFlag);
			} else if (boardField[confirmationLine][confirmationColumn].equals(spTop.firstSecondCheck(endFlag))) {
				break;
			}
			confirmationLine = confirmationLine + i;
			confirmationColumn = confirmationColumn + j;
		}

	}

	//ひっくり返すための確認
	/**
	 * isFlipCheckメソッド
	 * 駒がおかれた位置から見て一方向の反転を行う必要があるか確認
	 * @param line 入力された行の値
	 * @param column 入力された列の値
	 * @param i 駒の周囲を確認した際の数値、行の値
	 * @param j 駒の周囲を確認した際の数値、列の値
	 * @param endFlag 駒の置かれた回数
	 * @return ない場合trueある場合false
	 */
	public boolean isFlipCheck(int line, int column, int i, int j, int endFlag) {
		boolean firstCheck = true;
		int confirmationLine = line + i;
		int confirmationColumn = column + j;
		while ((confirmationLine >= 1 && confirmationLine < ARRAY_MAX)
				&& (confirmationColumn >= 1 && confirmationColumn < ARRAY_MAX)) {

			if (!(boardField[confirmationLine][confirmationColumn].equals(spTop.firstSecondFilpCheck(endFlag)))
					&& firstCheck) {
				return false;
			}
			if (!firstCheck) {
				if (boardField[confirmationLine][confirmationColumn].equals(spTop.firstSecondCheck(endFlag))) {
					return true;
				}
			}
			firstCheck = false;
			confirmationLine = confirmationLine + i;
			confirmationColumn = confirmationColumn + j;
		}

		return false;
	}
}
