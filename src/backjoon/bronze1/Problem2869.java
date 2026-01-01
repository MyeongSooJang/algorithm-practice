package backjoon.bronze1;

import java.util.Scanner;

public class Problem2869 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long A = sc.nextLong();
        long B = sc.nextLong();
        long V = sc.nextLong();

        long days = calculateDays(V, A, B);

        System.out.println(days);
    }

    public static long calculateDays(long V, long A, long B) {
        if (A >= V) {
            return 1;
        }

        long days = (V - B - 1) / (A - B) + 1;

        return days;
    }
}
