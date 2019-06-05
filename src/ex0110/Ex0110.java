package ex0110;

import java.util.Scanner;
public class Ex0110 {

	public static void main(String[] args) {

		System.out.println("input word");
        Scanner scan = new Scanner(System.in);
        String str1 = scan.next();
        String str2 = scan.next();

        System.out.println(str1);
        System.out.println(str2);
        scan.close();

	}

}
