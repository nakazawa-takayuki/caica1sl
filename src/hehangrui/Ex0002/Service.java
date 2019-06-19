package hehangrui.Ex0002;

import java.util.ArrayList;
import java.util.List;

/**
 * 参加者情報をメインクラスから取得し、計算結果を渡す
 * 合計参加人数を取得する
 * 参加者をカウントする
 * 参加率を計算する
 *
 * @author Adrian
 */
public class Service {

	private List<People> peopleList = new ArrayList<People>();

	//リストにメンバーを代入する
	public void addPerson(People overlapsPerson) throws SameIDAlreadyExistsException {
		for (People person : peopleList) {
			if (person.getId() == overlapsPerson.getId()) {
				throw new SameIDAlreadyExistsException("ID:" + person.getId() + "が重複した");
			}
		}
		peopleList.add(overlapsPerson);

	}

	//リストからメンバーを取得する
	public List<People> getPeopleList() {
		return peopleList;
	}

	//リストからメンバーを設定する
	public void setPeopleList(List<People> peopleList) {
		this.peopleList = peopleList;
	}

	//メンバーの合計数を取得する
	public int getTotal() {
		return peopleList.size();
	}

	//メンバーの合計数を設定する
	public void setTotal(int total) {
	}

	//参加者の人数を計算する
	public int calcJoinning() {
		int yesJoin = 0;
		for (People person : peopleList) {
			if (person.join()) {
				yesJoin++;
			}
		}
		return yesJoin;
	}

	//参加率を計算する
	public int calcPercentage() {
		int percentage = 0;
		if (getTotal() > 0) {
			percentage = calcJoinning() * 100 / getTotal();
		}
		return percentage;
	}
}
