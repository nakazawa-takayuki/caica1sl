package 田畑陽一朗.Ex0002;

public class Main {

	public static void main(String[] args) {

		Event event = new Event();
		Service service = new Service();

		Human human1 = new Human("1111", "山本", true);
		Human human2 = new Human("2222", "山本", true);
		Human human3 = new Human("1224", "山本", false);
		Human human4 = new Human("1224", "山本", true);

		try {
			service.addHuman(human1);
			service.addHuman(human2);
			service.addHuman(human3);
			service.addHuman(human4);
		} catch (SameIdExistsException e) {
			System.out.println(e.getMessage());
			return;
		}

		event.getTotalEntry(service);
		event.countEntry(service);
		event.calcEntryRate(service);
	}
}
