package TajimaRen.Ex0002;

/**
 *メインクラス
 *参加者情報の呼び出し、出力
 * @author TajimaRen
 *
 */

public class ParticipantManagementMain {

	public static void main(String[] args) {

		Service service = new Service();
		Event event = service.getEvent();

		try {
			service.addPerson(new Person(1,"佐藤",true));
			service.addPerson(new Person(2,"田中",false));
			service.addPerson(new Person(3,"田島",false));
		} catch (SameIdAlreadyExistsException e) {
			System.out.println(e.getMessage());
			return;
		}

		/**
		 * 出力
		 */
		System.out.print("合計" + event.calcCount() + "名");
		System.out.print("　参加" + event.calcEntryCount() + "名");
	}
}