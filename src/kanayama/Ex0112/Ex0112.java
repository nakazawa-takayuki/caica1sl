package kanayama.Ex0112;
import java.util.Scanner;

public class Ex0112 {
	public static void main(String[] args){

        System.out.print("文字列：");
        Scanner inp = new Scanner(System.in);
        String str1 = inp.nextLine();
        inp.close();
        
        if(str1.isEmpty()){
        	System.out.println("入力されていません");
        	return;
        }
        System.out.println( str1 + "は許可されますか\n");
        
        
        if(str1.matches( ".*[\\uFF65-\\uFF9F].*")){
                System.out.print("半角ｶﾅが含まれます");
            }else {
            	System.out.print("許可する文字列です");
            }
        return;
    }
}
