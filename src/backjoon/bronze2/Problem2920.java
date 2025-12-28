package backjoon.bronze2;

import java.util.Scanner;

public class Problem2920 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        solution(input);
    }

    public static void solution(String input) {
        String[] result = input.trim().split("\\s+");
        int count = 0;

        for (int i = 0; i < result.length; i++) {
            if (Integer.parseInt(result[i]) == i + 1) {
                count++;
            }
            if (Integer.parseInt(result[i]) == result.length - i) {
                count--;
            }
        }

        if (count == 8) {
            System.out.println("ascending");
        } else if (count == -8) {
            System.out.println("descending");
        } else {
            System.out.println("mixed");
        }
    }
}
