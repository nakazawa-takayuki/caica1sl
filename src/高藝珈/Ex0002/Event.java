package 高藝珈.Ex0002;

import java.util.List;

/**
 * 【課題2】
 * 管理機能として｢合計参加人数の取得｣ ｢参加者のカウント｣ ｢参加率の計算｣ を持ちます。
 *
 * @author 高藝珈
 */

public class Event {

	private List<Person> personList;

	public Event(List<Person> personList) {
		this.personList = personList;
	}

	public List<Person> getPersonList() {
		return personList;
	}

	public int getAllTotal() {
		return personList.size();
	}

	public int calTotal() {
		int total = 0;
		for (Person person : personList) {
			if (person.isAttendance() == true) {
				total++;
			}
		}
		return total;

	}

	public int calPercentage() {
		int percentage = 0;
		int allTotal = getAllTotal();
		percentage = calTotal() * 100 / allTotal;
		return percentage;
	}

}
