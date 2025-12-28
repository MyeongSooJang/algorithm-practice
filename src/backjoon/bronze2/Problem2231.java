package backjoon.bronze2;

import java.util.*;

public class Problem2231 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        solution(sc.nextInt());
    }

    public static void solution(int input) {
        List<Integer> list = new ArrayList<>();
        for (int i = 1; i <= input; i++) {
            if (sumAll(i) == input) {
                System.out.println(i);
                return;
            }
        }
        System.out.println(0);
    }

    public static int sumAll(int input) {
        int sum = input;
        while (input > 0) {
            sum += input % 10;
            input = input / 10;
        }
        return sum;
    }
}
