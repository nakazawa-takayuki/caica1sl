package kanayama.Ex0002;
/**
 * 参加者クラス
 * ID、名前、出欠可否を設定、取得する
 * */
public class Human {
	private int entryId;
	private String entryName;
	private boolean entryAvailability;
/**
 * ID、名前、出欠可否を設定
 * @param entryId ID
 * @param entryName 参加者の名前
 * @param entryAvailability 出欠可否
 * */
	public Human(int entryId, String entryName,boolean entryAvailability) {
		this.entryId = entryId;
		this.entryName = entryName;
		this.entryAvailability = entryAvailability;
	}

	/**
	 * ID、名前、出欠可否を設定
	 * <br>引数なし
	 * */
	public Human() {
	}

	/**
	 * 出欠可否を取得するメソッド
	 * @return this.entryAvailability
	 * */
	public boolean isEntryAvailability() {
		return this.entryAvailability;
	}

	/**
	 * 出欠可否を設定するメソッド
	 * */
	public void setEntryAvailability(boolean entryAvailability) {
		this.entryAvailability = entryAvailability;
	}

	/**
	 * IDを取得するメソッド
	 * @return this.entryId
	 * */
	public int getEntryId() {
		return this.entryId;
	}

	/**
	 * IDを設定するメソッド
	 * */
	public void setEntryId(int entryId) {
		this.entryId = entryId;
	}

	/**
	 * 名前を取得するメソッド
	 * @return this.entryName
	 * */
	public String getEntryName() {
		return this.entryName;
	}

	/**
	 * 名前を設定するメソッド
	 * */
	public void setEntryName(String entryName) {
		this.entryName = entryName;
	}

}
