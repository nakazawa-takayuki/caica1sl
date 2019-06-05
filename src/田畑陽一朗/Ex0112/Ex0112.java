package 田畑陽一朗.Ex0112;
import java.util.Scanner;

/**
*
* キーボードから文字列を入力し、文字列内に半角カナが含まれるか判定する 。
* 含まれる場合は「半角カナが含まれます」、含まれない場合は「許可する文字列です」と 出力する。
*
* @author 田畑 陽一朗
*
*/
public class Ex0112 {

    private static Scanner scn;

    public static void main(String[] args) {

        scn = new Scanner(System.in);
        System.out.println("文字列:");
        String line1 = scn.nextLine();

        char[] chars = line1.toCharArray();

        if (line1.equals("") || line1 == null) {
            System.out.println("文字を入力してください。");
            return;
        }
        System.out.println("この文字列" + line1 + "は許可されますか。");
        System.out.println("");
        System.out.println("");

        for (int i = 0; i < chars.length; i++) {
            char c = chars[i];
            if (c >= '\uff61' && c <= '\uff9f') {
                System.out.println("半角カナが含まれます");
                return;
            }
        }
        System.out.println("許可する文字列です");
        return;

    }
}