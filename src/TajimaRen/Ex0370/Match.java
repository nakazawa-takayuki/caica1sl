package TajimaRen.Ex0370;

/**
 * hitとbrowを判定するクラス
 * @author TajimaRen
 *
 */
public class Match {
	static	int hit ;
	static int brow ;

	public Match matchMethod(String input,String answer) {
		Match match = new Match();
		String[] inputArrays = input.split("");
		String[] answerArrays = answer.split("");
		hit = 0;
		brow = 0;

		for (int i = 0; i < inputArrays.length; i++) {
			for (int j = 0; j < answerArrays.length; j++) {
				if (i == j && inputArrays[i].equals(answerArrays[j])) {
					hit++;
				} else if (inputArrays[i].equals(answerArrays[j])) {
					brow++;
				}
			}
		}
		return match;
	}
}