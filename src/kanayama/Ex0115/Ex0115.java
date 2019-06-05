package kanayama.Ex0115;

import java.util.Scanner;

public class Ex0115 {
	public static void main(String[] args){
		 System.out.print("文字列：");
	        Scanner inp = new Scanner(System.in);
	        String str1 = inp.nextLine();
	        inp.close();

	        if(str1.isEmpty()){
	        	System.out.println("入力されていません");
	        	return;
	        }
	        
	        String [] str = str1.split("\\s+");
	        String Kisuu = "";
	        String Guusuu = "";
	    	
	    	for(int i = 0 ; i < str.length; i++){
	    		if((i+1) % 2 != 0) {
	    		Kisuu += str[i] + " ";
	    		}else {
	    		Guusuu += str[i] + " ";
	    		}
	    	}
	    	System.out.println("奇数番号 : " + Kisuu);
	    	System.out.println("偶数番号 : " + Guusuu);
	    	return;
  }
}
