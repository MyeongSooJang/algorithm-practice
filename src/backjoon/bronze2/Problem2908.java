package backjoon.bronze2;

import java.util.ArrayList;
import java.util.List;
import java.util.*;

public class Problem2908 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input1 = sc.next();
        String input2 = sc.next();
        solution(input1, input2);
    }

    public static void solution(String input1, String input2) {
        String[] num1 = input1.split("");
        String[] num2 = input2.split("");

        List<String> result1 = new ArrayList<>();
        List<String> result2 = new ArrayList<>();

        for (int i = num1.length - 1; i >= 0; i--) {
            result1.add(num1[i]);
        }
        for (int i = num2.length - 1; i >= 0; i--) {
            result2.add(num2[i]);
        }

        String num1Result = String.join("", result1);
        String num2Result = String.join("", result2);

        int num1Int = Integer.parseInt(num1Result);
        int num2Int = Integer.parseInt(num2Result);

        if (num1Int > num2Int) {
            System.out.println(num1Int);
        } else {
            System.out.println(num2Int);
        }
    }
}
