package tashirotakumi.ExAd086B;

public class ExAd086B {
	public static void main(String[] args) {
		String str = "";
		try {
			str = args[0] + args[1];
		} catch (ArrayIndexOutOfBoundsException e) {
			System.exit(0);
		}
		int number = 0;
		try {
			number = Integer.parseInt(str);
		} catch (NumberFormatException e) {
			System.exit(0);
		}
		int i = 0;
		while (true) {

			if (squareRoot(i) > number) {
				System.out.println("NO");
				break;
			}
			if (squareRoot(i) == number) {
				System.out.println("YES");
				break;
			}

			i++;
		}
	}

	public static int squareRoot(int i) {
		i = i * i;
		return i;

	}
}
