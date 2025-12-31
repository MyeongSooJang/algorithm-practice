package backjoon.bronze1;

import java.util.Arrays;
import java.util.Scanner;

public class Problem1546 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();
        int[] scores = new int[count];
        for (int i = 0; i < scores.length; i++) {
            scores[i] = sc.nextInt();
        }
        solution(scores);
    }

    public static void solution(int[] scores) {
        Arrays.sort(scores);
        int sum = Arrays.stream(scores).sum();
        double average = (double) sum / scores[scores.length - 1] * 100 / scores.length;
        System.out.println(average);
    }
}
