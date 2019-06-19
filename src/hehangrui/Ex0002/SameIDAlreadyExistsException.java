package hehangrui.Ex0002;

/**
 * Exception文を自作する
 *
 * @author Adrian
 */
public class SameIDAlreadyExistsException extends Exception {

	//warningを回避するための宣言
	private static final long serialVersionUID = 1L;

	//コンストラクタ
	public SameIDAlreadyExistsException(String message) {
		super(message);
	}

}
