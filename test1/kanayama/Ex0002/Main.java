package kanayama.Ex0002;

/**
 * メインクラス
 * */
public class Main {
	public static void main(String args[]) {
		//Scanner scanner = new Scanner(System.in);
		//String entryName = scanner.next(); //名前
		//Boolean entryAvailability = scanner.nextBoolean(); //出席可否
		//参加者
		Human human1 = new Human(1,"田中一郎",true);
		Human human2 = new Human(2,"田中二郎",false);
		Human human3 = new Human(3,"田中三郎",true);

		Service service = new Service();
			try {
				//参加者をリストに登録する
				service.addEntrantList(human1);
				service.addEntrantList(human2);
				service.addEntrantList(human2);
				service.addEntrantList(human3);

			} catch (IdException e) {
				System.out.println(e.getMessage());
				return;
			}

		service.moveDisplayEntry();

	}
}
