package inflearn.basic;

import java.util.Scanner;

public class LongWordOutput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String sentence = sc.nextLine();
        String[] words = sentence.split(" ");

        String longestWord = "";

        for (String word : words) {
            if (word.length() > longestWord.length()) {
                longestWord = word;
            }
        }
        System.out.println(longestWord);
        sc.close();
    }
}
