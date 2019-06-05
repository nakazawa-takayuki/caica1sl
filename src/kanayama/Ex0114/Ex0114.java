package kanayama.Ex0114;

import java.util.Scanner;

public class Ex0114 {
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
	        System.out.println("結果 : ");
	    	
	    	for(int i = str.length - 1; 0 <= i; i--){
	    		System.out.print(str[i] + " ");
	    	}
	    	return;
   }

}
