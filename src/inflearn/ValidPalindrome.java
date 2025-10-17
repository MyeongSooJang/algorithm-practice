package inflearn;

import java.util.*;

public class ValidPalindrome {
    public String solution(String s) {
        StringBuilder filtered = new StringBuilder();
        for (char c : s.toCharArray()) {
            if (Character.isAlphabetic(c)) {
                filtered.append(Character.toLowerCase(c));
            }
        }

        String reversed = new StringBuilder(filtered.toString()).reverse().toString();

        if (filtered.toString().equals(reversed)) {
            return "YES";
        } else {
            return "NO";
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ValidPalindrome solver = new ValidPalindrome();

        String input = sc.nextLine();
        System.out.println(solver.solution(input));

        sc.close();
    }
}
