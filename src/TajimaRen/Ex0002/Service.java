package TajimaRen.Ex0002;

import java.util.ArrayList;
import java.util.List;

/**
 * 参加者の登録と参加者情報の取得
 * @author TajimaRen
 *
 */

public class Service {

	Person person;											//参加者一人分の情報
	List<Person> personList = new ArrayList<Person>();		//参加者情報のリスト

	/**
	 * リストに参加者情報(ID、名前、出席可否)を入れる
	 * @param person
	 */
	public void addPerson(Person newPerson)
			throws SameIdAlreadyExistsException{
		for(Person person : personList) {
			if(person.getId() == newPerson.getId()) {
				throw new SameIdAlreadyExistsException("ID重複者がいます。登録し直してください。");
			}
		}
		personList.add(newPerson);
	}

	public List<Person> getPersonList(){
		return personList;
	}

	public Event getEvent() {
		return new Event(personList);
	}
}