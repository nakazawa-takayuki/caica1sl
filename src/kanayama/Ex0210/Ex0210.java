package kanayama.Ex0210;

public class Ex0210 {
	public static void main(String[] args) {
		for(int column = 1; column <= 9; column++) {
			for(int line = 1; line <= 9; line++) {
				System.out.printf(" %02d ", column * line);
			}
			System.out.println("\n");
		}
	}
}
