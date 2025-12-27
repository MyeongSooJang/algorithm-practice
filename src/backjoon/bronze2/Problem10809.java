package backjoon.bronze2;

import java.util.Scanner;

public class Problem10809 {
    class Main {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            String input = sc.next();
            solution(input);
        }

        public static void solution(String input) {
            int[] result = new int[123];
            for (int i = 0; i < 123; i++) {
                result[i] = -1;
            }
            for (int j = 0; j < input.length(); j++) {
                for (int i = 97; i < 123; i++) {
                    if (input.charAt(j) == i && result[i] == -1) {
                        result[i] = j;
                    }
                }
            }
            StringBuilder sb = new StringBuilder();
            for (int i = 97; i < 123; i++) {
                sb.append(result[i]).append(" ");
            }
            if (sb.length() > 0) {
                sb.deleteCharAt(sb.length() - 1);
            }
            System.out.println(sb.toString());
        }
    }
}
