package 高藝珈.Ex0002;

import java.util.ArrayList;
import java.util.List;

/**
 * 【課題2】
 * Event情報の取得
 * 同一IDで登録しようとした際、登録不可能な旨を出力
 *
 * @author 高藝珈
 */

public class AttendanceService {

	private List<Person> personList = new ArrayList<Person>();

	public Event getEvent() {
		return new Event(personList);
	}

	public void add(Person newPerson) throws SameIdException {
		for (Person person : personList) {
			if (person.getId() == newPerson.getId()) {
				throw new SameIdException(person.getId());
			}
		}
		personList.add(newPerson);
	}
}
