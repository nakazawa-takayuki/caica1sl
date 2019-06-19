package kanayama.Ex0002;

import java.math.BigDecimal;
import java.util.List;

public class Manegement {

	/**
	 * 参加者の合計を計算する
	 * */
	public int getEntryTotal(List<Human> entrantList) {
		return entrantList.size();
	}

	/**
	 * 出席者をカウントする
	 * */
	public int getEntryCount(List<Human> entrantList) {
		int attendeeCount = 0;
		for(Human human : entrantList) {
			if(human.isEntryAvailability()) {
				attendeeCount++;
			}
		}
		return attendeeCount;
	}

	/**
	 *  出席率を計算する
	 *  */
	public BigDecimal entryRate(List<Human> entrantList) {
		BigDecimal attendeeCount = BigDecimal.valueOf(getEntryCount(entrantList));
		BigDecimal entrantTotal = BigDecimal.valueOf(entrantList.size());
		BigDecimal answer = attendeeCount.divide(entrantTotal);

		return answer;

	}

	/**
	 *  表示する
	 *  */
	public void displayEntry(List<Human> entrantList) {
		System.out.print("合計" + getEntryTotal(entrantList) +"名 ");
		if(!entrantList.isEmpty()) {
			System.out.println("参加" + getEntryCount(entrantList) + "名 ");
		}
	}
}