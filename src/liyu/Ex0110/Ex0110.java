package liyu.Ex0110;

import java.util.Arrays;
import java.util.Scanner;

public class Ex0110 {

	public static void main(String[] args)
    {
		System.out.println("文字列1を入力してください");
		Scanner input1 = new Scanner(System.in);
		String str1 = input1.nextLine();
		String str11 = str1.replaceAll(" +","");



		System.out.println("文字列2を入力してください");
		Scanner input2 = new Scanner(System.in);
		String str2 = input2.nextLine();
		String str21 = str2.replaceAll(" +","");
		input1.close();
		input2.close();


		if (str11.equals(str21))
		 {
			 System.out.println("２つの文字列は同じです"+"⇒"+ str1);
		 }
		 else
		 {
        // args is the list of guests
		String[] args1 = {str11,str21};
        Arrays.sort(args1);
        for(int i = 0; i < args1.length; i++)
            System.out.println(args1[i]);
		 }

    }

}
