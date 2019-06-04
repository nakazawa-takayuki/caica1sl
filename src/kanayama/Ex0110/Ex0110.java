package kanayama.Ex0110;
import java.util.Scanner;

public class Ex0110 {
	 public static void main(String[] args){
		 Scanner inp = new Scanner(System.in);

		System.out.println("文字列1：");
        String str1 = inp.nextLine();


        System.out.println("文字列2：");
        String str2 = inp.nextLine();


        if(str1.isEmpty()||str2.isEmpty()) {
        	System.out.println("入力されていません");
        }else if(str1.compareTo(str2) == 0){
            System.out.println("２つの文字列は同じです -> " + str1);
        }else if(str1.compareTo(str2) < 0){
            System.out.println(str1 + "　" + str2);
        }else{
            System.out.println(str2 + "　" + str1);
        }
        inp.close();
    }
}

