package kanayama.Ex0002;

import java.util.ArrayList;
import java.util.List;
/**
 * 参加者のID、名前、出欠可否をListに設定、取得する
 * <br>IDが重複した場合、エラー処理
 */
public class Service {
	List<Human> entrantList = new ArrayList<>();
	Manegement manegement = new Manegement();

	/**
	 * 管理クラスを設定する
	 */
	public void setManegement(Manegement manegement) {
		this.manegement = manegement;
	}

	/**
	 * 管理クラスを取得する
	 */
	public Manegement getManegement() {
		return manegement;
	}

	/**
	 * 参加者をlistに格納する
	 * */
	public void addEntrantList(Human human) throws IdException{
		for(Human entrant : this.entrantList) {
			if(entrant.getEntryId() == human.getEntryId()){
				String message = "ID:" + entrant.getEntryId() + "が重複しています。";
				throw new IdException(message);
			}
		}
		this.entrantList.add(human);
	}

	/**
	 * リストを設定する
	 */
	public List<Human> getEntrantList() {
		return this.entrantList;
	}

	/**
	 * 出力処理 displayEntry に遷移する
	 */
	public void moveDisplayEntry() {
		manegement.displayEntry(entrantList);
	}

}
