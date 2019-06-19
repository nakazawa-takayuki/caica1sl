package kanayama.Ex0002;
/**
 * */
public class Human {
	private int entryId;
	private String entryName;
	private boolean entryAvailability;

	public Human(int entryId, String entryName,boolean entryAvailability) {
		this.entryId = entryId;
		this.entryName = entryName;
		this.entryAvailability = entryAvailability;
	}

	public Human() {
	}
	public boolean isEntryAvailability() {
		return this.entryAvailability;
	}

	public void setEntryAvailability(boolean entryAvailability) {
		this.entryAvailability = entryAvailability;
	}



	public int getEntryId() {
		return entryId;
	}

	public void setEntryId(int entryId) {
		this.entryId = entryId;
	}

	public String getEntryName() {
		return entryName;
	}

	public void setEntryName(String entryName) {
		this.entryName = entryName;
	}

}
