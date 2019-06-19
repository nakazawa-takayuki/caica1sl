package hehangrui.Ex0002;

/**
 * 参加者の情報をサービスクラスに渡す
 * 結果を出力する
 *
 * @author Adrian
 */
public class Main {

	public static void main(String[] args) {

		//イベント取得
		Service service = new Service();

		try {
			//メンバー追加
			service.addPerson(new People(1000, "佐藤", true));
			service.addPerson(new People(2000, "鈴木", false));
			service.addPerson(new People(3000, "高橋", true));
			service.addPerson(new People(2000, "伊藤", true));
		} catch (SameIDAlreadyExistsException e) {
			System.out.println(e.getMessage());
		}

		//変数宣言
		int total = service.getTotal();
		int yesJoin = service.calcJoinning();
		int percentage = service.calcPercentage();

		//結果出力
		System.out.println("合計" + total + "名");
		System.out.println("参加" + yesJoin + "名");
		System.out.println("参加率" + percentage + "%");
	}

}
