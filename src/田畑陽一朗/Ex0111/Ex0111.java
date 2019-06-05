package 田畑陽一朗.Ex0111;

import java.util.Scanner;

/**
*  キーボードから文字列を入力し、文字列内に「① ③ ⑤ ⑦ ⑨」が含まれるか判定する 。
*    含まれる場合は「許可しない文字文字： XX YY 桁目 が含まれます」、
*    含まれない場合は「許可する文字列です」と出力する。
*
* @author 田畑 陽一朗
*/

public class Ex0111 {

    private static Scanner scn;

    public static void main(String[] args) {
        String[] arrays = { "①", "③", "⑤", "⑦", "⑨" };

        scn = new Scanner(System.in);
        System.out.println("文字列:");
        String line1 = scn.nextLine();
        if (line1.equals("") || line1 == null) {
            System.out.println("エラーです。");
            return;
        }

        boolean judge = false;
        int count = 1;
        String[] str = line1.split("");
        System.out.println("この文字列" + line1 + "は許可されますか。");
        for (String a : str) {
            for (String s : arrays) {
                if (a.contains(s)) {
                    System.out.println("許可しない文字(文字:" + s + " " + count + "桁目)が含まれます");
                    judge = true;

                }
            }
            count++;
        }
        if (judge == false)
            System.out.println("許可する文字列です");
        return;
    }

}