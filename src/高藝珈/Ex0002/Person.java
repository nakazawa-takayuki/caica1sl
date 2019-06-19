package 高藝珈.Ex0002;

/**
 *【課題２】
 * 参加者は"id"."名前","出席可否" の属性を持ちます。
 *
 * @author 高藝珈
 */

public class Person {

	private int id; // id
	private String name; // 名前
	private boolean isAttendance; //出席可否

	public Person(int id, String name, boolean isAttendance) {
		this.id = id;
		this.name = name;
		this.isAttendance = isAttendance;
	}

	/**
	 * @return id
	 */
	public int getId() {
		return id;
	}

	/**
	 * @param id セットする id
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * @return name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name セットする name
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return isAttendance
	 */
	public boolean isAttendance() {
		return isAttendance;
	}

	/**
	 * @param isAttendance セットする isAttendance
	 */
	public void setAttendance(boolean isAttendance) {
		this.isAttendance = isAttendance;
	}

}
