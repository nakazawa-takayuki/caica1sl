package TajimaRen.Ex0320;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class Ex0320 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("input number：");

		String inputNum = br.readLine();

		try {
			Integer.parseInt(inputNum);
		} catch(NumberFormatException ex) {
			System.out.println("数字を入力してください");
			return;
		}

		factorialCalculation(inputNum);
	}

	public static void factorialCalculation(String inputNum) {
		Ex0320 ex0320 = new Ex0320();
		String factorial = ex0320.factorialBigInt(new BigInteger(inputNum)).toString();
		System.out.println(inputNum + "の階乗は"+ factorial +"です");
	}

	public static BigInteger factorialBigInt(BigInteger bi){
		if(bi.longValue() == 0){
			return new BigInteger("1");
		}
		return bi.multiply(factorialBigInt(bi.subtract(new BigInteger("1"))));
	}
}