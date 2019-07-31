package hehangrui.Ex0002;

/**
 * メインクラスから参加者の情報を取得し、設定する
 *
 * @author Adrian
 */
public class People {

	private int id;
	private String name;
	private Boolean yes;

	public People(int id, String name, Boolean yes) {
		this.id = id;
		this.name = name;
		this.yes = yes;
	}

	//メンバーのIDを取得する
	public int getId() {
		return id;
	}

	//メンバーのIDを取得する
	public void setId(int id) {
		this.id = id;
	}

	//メンバーの氏名を取得する
	public String getName() {
		return name;
	}

	//メンバーの氏名を設定する
	public void setName(String name) {
		this.name = name;
	}

	//メンバーの出欠を判断する
	public Boolean join() {
		return yes;

	}

}
