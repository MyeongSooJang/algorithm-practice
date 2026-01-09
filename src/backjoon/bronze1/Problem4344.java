package backjoon.bronze1;

import java.util.Scanner;

public class Problem4344 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();
        sc.nextLine();
        String[] result = new String[count];
        for (int i = 0; i < count; i++) {
            String scores = sc.nextLine();
            result[i] = solution(scores);
        }

        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i] + "%");
        }
    }

    public static String solution(String input2) {
        String[] scoreArr = input2.split(" ");
        int input1 = Integer.parseInt(scoreArr[0]);
        int sum = 0;
        for (int i = 1; i < scoreArr.length; i++) {
            sum += Integer.parseInt(scoreArr[i]);
        }
        double average = (double) sum / input1;
        int win = 0;
        for (int i = 1; i < scoreArr.length; i++) {
            if (average < Integer.parseInt(scoreArr[i])) {
                win++;
            }
        }
        double score = (double) win / input1 * 100;

        return String.format("%.3f", score);
    }
}
