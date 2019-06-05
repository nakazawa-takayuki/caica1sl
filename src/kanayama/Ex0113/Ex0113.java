package kanayama.Ex0113;


import java.util.Scanner;

public class Ex0113 {
	public static void main(String[] args){
		 System.out.print("文字列：");
	        Scanner inp = new Scanner(System.in);
	        String str1 = inp.nextLine();
	        inp.close();

	        if(str1.isEmpty()){
	        	System.out.println("入力されていません");
	        	return;
	        }

	        StringBuffer str = new StringBuffer(str1);
	        for (int i = 0; i < str.length(); i++) {
	            char c = str.charAt(i);
	            if ('０' <= c && c <= '９') {
	                str.setCharAt(i, (char) (c - '０' + '0'));
	            }
	        }
	        System.out.print("結果 : " + str);
	        return;
    }

}
