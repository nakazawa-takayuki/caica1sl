package tashirotakumi.ExAd097A;

public class ExAd097A {

	public static void main(String[] args) {

		int locationA=0;
		int locationB=0;
		int locationC=0;
		int signalDistance=0;

		try {
			locationA=Integer.parseInt(args[0]);
			locationB=Integer.parseInt(args[1]);
			locationC=Integer.parseInt(args[2]);
			signalDistance=Integer.parseInt(args[3]);

		}catch (NumberFormatException e) {
			System.out.println("入力エラー");
			System.exit(0);
		}

	}

	public static void inputCheck(int locationA,int locationB,int locationC,int signalDistance) {

	}
}
