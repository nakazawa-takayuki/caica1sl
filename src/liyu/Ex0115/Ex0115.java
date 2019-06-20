package liyu.Ex0115;

import java.util.Scanner;

public class Ex0115 {

    public static void main(String[] args) {

        System.out.println("文字列を入力してください");
        Scanner input = new Scanner(System.in);
        String input1 = input.nextLine();
        input.close();

        if (input1.isEmpty()) {
            System.out.println("エラー：文字列が検出出来ません");
            return;
        }

        String[] str = input1.split("\\s+");
        String oddPosition = "";
        String evenPosition = "";

        for (int index = 0; index < str.length; index++) {
            if ((index + 1) % 2 != 0) {
                oddPosition = oddPosition + str[index] + " ";
            } else {
                evenPosition = evenPosition + str[index] + " ";
            }
        }
        System.out.println("奇数番目 : " + oddPosition);
        System.out.println("偶数番目 : " + evenPosition);
        return;
    }
}
