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

	public void setCountUpGameEndTimes() {
		gameEndTimes++;
	}
	public int getGameEndTimes() {
		return gameEndTimes;
	}
	/**
	 *
	 */
	public void endFlagCountUp() {
		endFlag++;
	}
	/**
	 *
	 * @return
	 */
	public int endFlagConfirmation() {
		return endFlag;
	}
	public String blankConfirmation() {
		return blank;

	}
	//ターンによりどちらを置くかを判断する
	/**
	 *
	 * @param endFlag
	 * @return
	 */
	public String firstSecondCheck(int endFlag) {
		if (endFlag % 2 == 1) {
			return this.black;
		}
		return this.white;

	}
	/**
	 *
	 * @param endFlag
	 * @return
	 */
	public String firstSecondFilpCheck(int endFlag) {
		if (endFlag % 2 == 1) {
			return this.white;
		}
		return this.black;

	}

	//駒の数の確認を行う
	/**
	 *
	 * @param boardField
	 * @param endFlag
	 * @return
	 */
	public boolean spinningTopCount(String[][] boardField, int endFlag) {
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
	 *
	 */
	public void winOrLose(){
		System.out.println("勝負あり");
		System.out.println("黒：" + blackCount + "白：" + whiteCount);
	}
}
