package tashirotakumi.ExAd085C;

public class ExAd085C {
	public static final int A_MAX = 2000;
	public static final int A_MIN = 1;
	public static final int N_MAX = 20000000;
	public static final int N_MIN = 1;
	public static final int THOUSAND=1000;
	public static final int FIVE_THOUSAND=5000;
	public static final int TEN_THOUSAND=10000;

	public static void main(String[] args) {
		try {
			inputNumCheck(Integer.parseInt(args[0]), A_MIN, A_MAX);
			inputNumCheck(Integer.parseInt(args[1]), N_MIN, N_MAX);
		} catch (Exception e) {
			System.out.println("入力エラー");
			System.exit(0);
		}
		int settingAmount = Integer.parseInt(args[1]);
		int countAmount = 0;
		boolean kFlag = false;
		boolean jFlag = false;
		boolean iFlag = false;
		boolean hasSameFlag = false;
		for (int i = 0; i <= Integer.parseInt(args[0]); i++) {
			if (settingAmount >= TEN_THOUSAND) {
				settingAmount = settingAmount - (TEN_THOUSAND * i);
				countAmount = countAmount + i;
				iFlag = true;
			}
			if (Math.abs(settingAmount) > Integer.parseInt(args[1])) {
				break;
			}

			for (int j = 0; j <= Integer.parseInt(args[0]); j++) {
				if (settingAmount >= FIVE_THOUSAND) {
					settingAmount = settingAmount - (FIVE_THOUSAND * j);
					countAmount = countAmount + j;
					jFlag = true;
				}

				for (int k = 0; k <= Integer.parseInt(args[0]); k++) {

					if (settingAmount >= THOUSAND) {
						settingAmount = settingAmount - (THOUSAND * k);
						countAmount = countAmount + k;
						kFlag = true;
					}
					if (settingAmount == 0 && countAmount == Integer.parseInt(args[0])) {

						System.out.println(i + " " + j + " " + k);
						hasSameFlag = true;
						System.exit(0);

					}
					if (kFlag) {
						settingAmount = settingAmount + (THOUSAND * k);
						countAmount = countAmount - k;
						kFlag = false;
					}
				}
				if (jFlag) {
					settingAmount = settingAmount + (FIVE_THOUSAND * j);
					countAmount = countAmount - j;
					jFlag = false;
				}
			}
			if (iFlag) {

				settingAmount = settingAmount + (TEN_THOUSAND * i);
				countAmount = 0;
				iFlag = false;
			}
		}
		if (!hasSameFlag) {
			System.out.println("-1 -1 -1");
		}
	}

	public static void inputNumCheck(int Number, int lowerLimit, int upperLimit) {

		if (Number >= lowerLimit && Number <= upperLimit) {

			return;
		}
		System.out.println("入力エラー");
		System.exit(0);
	}
}
