package TajimaRen.Ex0210;

/*下記実行例のように、九九の表を出力する。
 *
 */
public class Ex0210 {

	public static void main(String[] args) {
		for(int i =1; i <= 9;i++) {
			for(int j = 1; j <= 9;j++) {
				System.out.printf("%02d",i*j);
				System.out.print("　");
			}
			System.out.println();
			System.out.println();
		}
	}
}
