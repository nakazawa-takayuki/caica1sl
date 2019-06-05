package kanayama.Ex0111;
import java.util.Scanner;


public class Ex0111 {
	public static void main(String[] args){
        String[] mojiary = {"①","③","⑤","⑦","⑨"};

        System.out.print("文字列：");
        Scanner inp = new Scanner(System.in);
        String str1 = inp.nextLine();
        inp.close();

        if(str1.isEmpty()){
        	System.out.println("入力されていません");
        	return;
        }
        System.out.println( str1 + "は許可されますか\n");

        String[] strchar = str1.split("");
        boolean flag = false;
        
        for(int i = 0; i < strchar.length; i++) {
	        for(String moji: mojiary){
	            if(strchar[i].equals(moji)){
	                System.out.print("許可しない文字(文字 : " + moji + "　" +  (i + 1) + "桁目)が含まれます\n");
	                flag = true;

	            }
	        }
        }
        if(flag == false) {
        System.out.print("許可する文字列です");
        }

        return;
    }
}

