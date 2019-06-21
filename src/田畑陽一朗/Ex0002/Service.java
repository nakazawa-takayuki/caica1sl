package 田畑陽一朗.Ex0002;

import java.util.ArrayList;
import java.util.List;

public class Service {

	List<Human> humanList = new ArrayList<>();
	int count = 0;

	public Event getEvent() {
		return new Event();
	}

	public void addHuman(Human newHuman) throws SameIdExistsException {

		if (humanList.size() == 0) {
			humanList.add(newHuman);
			return;
		}
		for (Human human : humanList) {
			if (human.getID().equals(newHuman.getID())) {
				throw new SameIdExistsException("ID重複です。");
			}
		}
		humanList.add(newHuman);
	}

	public List<Human> getHumanList() {
		return humanList;
	}

	public int getCount() {
		return count;
	}

}
