package backjoon.bronze2;

import java.util.Scanner;

public class 문자열반복 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();
        String[] result = new String[count];
        for (int i = 0; i < count; i++) {
            int num = sc.nextInt();
            String input = sc.next();
            result[i] = solution(num, input);
        }
        for (String s : result) {
            System.out.println(s);
        }
    }

    public static String solution(int num, String input) {
        StringBuilder result = new StringBuilder();
        for (int j = 0; j < input.length(); j++) {
            for (int i = 0; i < num; i++) {
                result.append(input.charAt(j));
            }
        }
        return result.toString();
    }
}
