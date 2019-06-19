package 高藝珈.Ex0002;

/**
 * 【課題2】
 * 呼び出しクラス
 *
 * @author 高藝珈
 */

public class Main {

	public static void main(String[] args) {

		AttendanceService service = new AttendanceService();

		Event event = service.getEvent();
		try {
			service.add(new Person(1, "大島先輩", true));
			service.add(new Person(2, "鶴田先輩", true));
			service.add(new Person(3, "中沢先輩", false));
			service.add(new Person(1, "タン先輩", true));
		} catch (SameIdException e) {
			System.out.println("重複IDは" + e.getId());
		}

		int allTotal = event.getAllTotal();

		if (allTotal > 0) {
			System.out.println("合計" + allTotal + "名" + " " + "参加" + event.calTotal() + "名");
			System.out.println("参加率" + event.calPercentage() + "%");
		} else {
			System.out.println("合計0名");
		}

	}
}
