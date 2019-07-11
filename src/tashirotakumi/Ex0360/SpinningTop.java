package tashirotakumi.Ex0360;

public class SpinningTop {
	//駒は白と黒,□が存在することを定義する
	private String black = "●";
	private String white = "○";
	private String blank = "□";
	private int blackCount = 0;
	private int whiteCount = 0;
	private int endFlag=1;
	private  int gameEndTimes=60;

	public void firstSecondCheck() {
		if (endFlag % 2 == 1) {
			System.out.println("先攻です");
		}else {
			System.out.println("後攻です");
		}
	}
	/**
	 * setCountUpGameEndTimesメソッド
	 * パスが行われた場合ゲームカウントを増やす
	 */
	public void setCountUpGameEndTimes() {
		gameEndTimes++;
	}
	/**
	 * getGameEndTimesメソッド
	 * 石の数の確認
	 * @return 石の置かれた数
	 */
	public int getGameEndTimes() {
		return gameEndTimes;
	}
	/**
	 * endFlagCountUpメソッド
	 *駒が置かれるたびに１増やす
	 */
	public void endFlagCountUp() {
		endFlag++;
	}
	/**
	 * endFlagConfirmationメソッド
	 * 駒が置かれた回数を渡す
	 * @return 駒の置かれた数
	 */
	public int endFlagConfirmation() {
		return endFlag;
	}
	/**
	 * blankConfirmationメソッド
	 * 石を置いていないマスの値を示す
	 * @return 置いていないますの値
	 */
	public String blankConfirmation() {
		return blank;

	}
	/**
	 * firstSecondCheckメソッド
	 *ターンによりどちらが自駒か判定する
	 * @param endFlag ゲーム回数
	 * @return 先攻後攻を判断し正しい色
	 */
	public String firstSecondCheck(int endFlag) {
		if (endFlag % 2 == 1) {
			return this.black;
		}
		return this.white;

	}
	/**
	 * firstSecondFilpCheckメソッド
	 *ターンによりどちらが敵駒か確認。
	 * @param endFlag 石を置いた回数
	 * @return 対応した駒
	 */
	public String firstSecondFilpCheck(int endFlag) {
		if (endFlag % 2 == 1) {
			return this.white;
		}
		return this.black;

	}

	//駒の数の確認を行う
	/**
	 * spinningTopCountメソッド
	 *駒の数の確認を行う
	 * @param boardField 盤面
	 * @return どちらかがおかれていない場合falseを出力
	 */
	public boolean spinningTopCount(String[][] boardField) {
		blackCount = 0;
		whiteCount = 0;
		for (int i = 0; i < 9; i++) {
			for (int j = 0; j < 9; j++) {
				if (boardField[i][j].equals(black)) {
					blackCount++;
				}
				if (boardField[i][j].equals(white)) {
					whiteCount++;
				}
			}
		}
		if (blackCount == 0 || whiteCount == 0) {
			System.out.println("勝負あり");
			System.out.println("黒：" + blackCount + "白：" + whiteCount);
			return false;
		}
		return true;

	}
	/**
	 * winOrLoseメソッド
	 *駒の数の集計結果を表示
	 */
	public void winOrLose(){
		System.out.println("勝負あり");
		System.out.println("黒：" + blackCount + "白：" + whiteCount);
	}
}
