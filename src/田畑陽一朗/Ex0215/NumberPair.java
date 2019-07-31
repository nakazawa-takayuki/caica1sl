package 田畑陽一朗.Ex0215;

public class NumberPair {

	private int firstNumber;

	private int secondnumber;

	public int getFirstNumber() {
		return firstNumber;
	}

	public int getSecondnumber() {
		return secondnumber;
	}

	public NumberPair(int firstNumber, int secondnumber) {
		this.firstNumber = firstNumber;
		this.secondnumber = secondnumber;
	}

	@Override
	public String toString() {
		String first = Integer.toString(firstNumber);
		String second = Integer.toString(secondnumber);
		return first + "と" + second;
	}
}
