package liyu.Ex0110;

import java.util.Arrays;
import java.util.Scanner;

public class Ex0110 {

	public static void main(String[] args)
    {
		System.out.println("文字列1を入力してください");
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		String str1 = input.next();

		System.out.println("文字列2を入力してください");
		input = new Scanner(System.in);
		String str2 = input.next();

		if (str1.equals(str2))
		 {
			 System.out.println("２つの文字列は同じです"+"⇒"+ str1);
		 }
		 else
		 {
        // args is the list of guests
		String[] args1 = {str1,str2};
        Arrays.sort(args1);
        for(int i = 0; i < args1.length; i++)
            System.out.println(args1[i]);
		 }
    }

}
