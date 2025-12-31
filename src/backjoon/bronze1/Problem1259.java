package backjoon.bronze1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Problem1259 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        List<String> list = new ArrayList<>();
        while (!input.equals("0")) {
            list.add(solution(input));
            input = sc.next();
        }
        list.forEach(System.out::println);
    }

    public static String solution(String input) {
        StringBuilder sb = new StringBuilder();
        for (int i = input.length() - 1; i >= 0; i--) {
            sb.append(input.charAt(i));
        }
        int num = Integer.parseInt(input);
        int result = Integer.parseInt(sb.toString());

        if (num == result) {
            return "yes";
        } else {
            return "no";
        }
    }
}
