package TajimaRen.Ex0002;

import java.util.List;

/**
 * 参加者情報一覧の管理と参加者の集計
 * @author TajimaRen
 *
 */

public class Event {

	List<Person> personList;

	public Event(List<Person> personList) {
		this.personList = personList;
	}

	public List<Person> getPersonList(){
		return personList;
	}

	/**
	 * 合計参加人数
	 * @return
	 */
	public int calcCount() {
		return personList.size();
	}

	/**
	 * 参加者のカウント
	 * @return
	 */
	public int calcEntryCount() {
		int entryCount = 0;		//参加者のカウント
		for(Person person : personList) {
			if(person.isEntry()) {
				entryCount++;
			}
		}
		return entryCount;
	}

	/**
	 *参加率の計算
	 * @return
	 */
	public int entryRate() {
		int percentage = 0;		//参加率
		if(calcCount() > 0) {
			percentage = calcEntryCount() / calcCount()  * 100;
		}
		return percentage;
	}
}