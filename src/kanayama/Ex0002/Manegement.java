package kanayama.Ex0002;

import java.math.BigDecimal;
import java.util.List;

/**
 * 参加者一覧の表示、集計機能クラス
 */
public class Manegement {
	private List<Human> entrantList;

	public void setEntrantList(List<Human> entrantList) {
		this.entrantList = entrantList;
	}
	public List<Human> getEntrantList() {
		return entrantList;
	}
	/**
	 * 参加者の合計を計算する
	 * @return entrantList.size()
	 */
	public int getEntryTotal() {
		return this.entrantList.size();
	}

	/**
	 * 出席者をカウントする
	 * @return attendeeCount
	 */
	public int getEntryCount() {
		int attendeeCount = 0;
		for(Human human : this.entrantList) {
			if(human.isEntryAvailability()) {
				attendeeCount++;
			}
		}
		return attendeeCount;
	}

	/**
	 *  出席率を計算する
	 *  @return answer
	 */
	public BigDecimal entryRate() {
		BigDecimal attendeeCount = BigDecimal.valueOf(getEntryCount());
		BigDecimal entrantTotal = BigDecimal.valueOf(this.entrantList.size());
		BigDecimal answer = attendeeCount.divide(entrantTotal);

		return answer;
	}

	/**
	 *  参加者の合計人数、出席人数を表示する
	 */
	public void displayEntry(List<Human> entrantList) {
		this.entrantList = entrantList;
		System.out.print("合計" + getEntryTotal() +"名 ");
		if(!this.entrantList.isEmpty()) {
			System.out.println("参加" + getEntryCount() + "名 ");
		}
	}
}