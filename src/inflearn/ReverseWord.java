package inflearn;

import java.util.Scanner;

public class ReverseWord {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        sc.nextLine(); // 버퍼 비우기

        for (int i = 0; i < n; i++) {
            String word = sc.nextLine();
            String reversed = new StringBuilder(word).reverse().toString();
            System.out.println(reversed);
        }

        sc.close();
    }
}

