package inflearn;

import java.util.Scanner;


public class LongestWord {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 문장 입력받기
        String sentence = sc.nextLine();

        // 공백으로 단어 분리
        String[] words = sentence.split(" ");

        // 가장 긴 단어 찾기
        String longestWord = "";
        int maxLength = 0;

        for (String word : words) {
            // 현재 단어의 길이가 최대 길이보다 크면 갱신
            if (word.length() > maxLength) {
                maxLength = word.length();
                longestWord = word;
            }
        }

        // 결과 출력
        System.out.println(longestWord);

        sc.close();
    }
}
