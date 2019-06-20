package kanayama.Ex0002;
/**
 * 例外クラス
 * IDが重複していた場合、処理を終了にする
 */
public class IdException extends Exception{
	public IdException(String msg) {
		super(msg);
	}
}
