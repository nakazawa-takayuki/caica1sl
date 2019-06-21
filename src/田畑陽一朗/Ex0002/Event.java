package 田畑陽一朗.Ex0002;

public class Event {
	int count = 0;

	//合計参加人数の取得
	public void getTotalEntry(Service service) {
		System.out.print("合計" + service.humanList.size() + "名 ");
	}

	//参加者のカウント
	public void countEntry(Service service) {
		for (Human human : service.humanList) {
			if (human.isAttend()) {
				count++;
			}
		}
		System.out.print("参加" + count + "名 ");
	}

	//参加率の計算
	public void calcEntryRate(Service service) {
		double entryRate = 0;
		entryRate = (double) count / service.humanList.size() * 100;
		System.out.print("参加率" + String.format("%.2f", entryRate) + "%");
	}
}