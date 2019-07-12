package tashirotakumi.ExAd088A;

public class ExAd088A {
	public static void main(String[] args) {
		int n=0;
		int a=0;
		try {
			n=Integer.parseInt(args[0]);
			a=Integer.parseInt(args[1]);
		}catch (NumberFormatException e) {
			System.exit(0);
		}
		inputNumCheck(n);
		inputNumCheck2(a);
	}
	public static void inputNumCheck(int Number) {
		if (Number >= 1 && Number <= 10000) {
			return;
		}
		System.out.println("入力エラー");
		System.exit(0);
	}
	public static void inputNumCheck2(int Number) {
		if (Number >= 1 && Number <= 1000) {
			return;
		}
		System.out.println("入力エラー");
		System.exit(0);
	}
}
