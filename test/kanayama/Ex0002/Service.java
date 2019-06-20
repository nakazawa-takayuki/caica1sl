package kanayama.Ex0002;

import java.util.ArrayList;
import java.util.List;

public class Service {
	List<Human> entrantList = new ArrayList<>();
	Manegement manegement = new Manegement();

	/**
	 * 参加者をlistに格納する
	 * */
	public void addEntrantList(Human human) throws IdException{
		for(Human human2 : entrantList) {
			if(human2.getEntryId() == human.getEntryId()){
				String message = "ID:" + human2.getEntryId() + "が重複しています。";
				throw new IdException(message);
			}
		}
		entrantList.add(human);
	}

	public List<Human> getEntrantList() {
		return entrantList;
	}

	public void moveDisplayEntry() {
		manegement.displayEntry(entrantList);
	}

}
