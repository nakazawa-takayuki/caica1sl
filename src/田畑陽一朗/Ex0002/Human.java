package 田畑陽一朗.Ex0002;

public class Human {
	private String ID;
	private String Name;
	private boolean isAttend;

	public String getID() {
		return ID;
	}

	public String getName() {
		return Name;
	}

	public boolean isAttend() {
		return isAttend;
	}

	public Human(String iD, String name, boolean attend) {
		ID = iD;
		Name = name;
		this.isAttend = attend;
	}
}
