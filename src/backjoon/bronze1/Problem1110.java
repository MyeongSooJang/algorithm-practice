package backjoon.bronze1;

import java.util.Scanner;

public class Problem1110 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        solution(input);
    }

    public static void solution(int input) {
        int result = input;
        int count = 0;
        do {
            if (input < 10) {
                int ten = input * 10;
                int one = input;
                input = ten + one;
            } else {
                int ten = input / 10;
                int one = input % 10;
                int sum = ten + one;
                if (sum >= 10) {
                    input = one * 10 + sum - 10;
                } else{
                    input = one * 10 + sum;
                }

            }
            count++;
        } while (input != result);
        System.out.println(count);
    }
}
