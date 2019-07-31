package liyu.Ex0114;

import java.util.Scanner;

public class Ex0114 {

    public static void main(String[] args) {

        System.out.println("文字列を入力してください");
        Scanner input = new Scanner(System.in);
        String input1 = input.nextLine();
        input.close();

        if (input1.isEmpty()) {
            System.out.println("エラー：文字列が検出出来ません");
            return;
        }

        String[] words = input1.split("\\s+");
        for (int i = words.length - 1; i >= 0; i--) {
            System.out.print(words[i] + " ");
        }
    }

}