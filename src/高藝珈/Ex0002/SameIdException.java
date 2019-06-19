package 高藝珈.Ex0002;

/**
 * 【課題2】
 *
 * @author 高藝珈
 */

public class SameIdException extends Exception {

	private int id; // id

	public SameIdException(int id) {
		super("重複ID" + id);
		this.id = id;
	}

	public int getId() {
		return id;
	}

}
