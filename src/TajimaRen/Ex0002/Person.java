package TajimaRen.Ex0002;

/**
 *参加者一人分の情報(ID、名前、出席可否)
 * @author TajimaRen
 *
 */

public class Person {

	int id;				//ID
	String name;		//名前
	boolean entry;		//出席可否

	public Person(int id,String name,boolean entry) {
		this.id = id;
		this.name = name;
		this.entry = entry;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public boolean isEntry() {
		return entry;
	}
}