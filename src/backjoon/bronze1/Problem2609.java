package backjoon.bronze1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Problem2609 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input1 = sc.nextInt();
        int input2 = sc.nextInt();
        solution(input1, input2);
    }

    public static void solution(int input1, int input2) {
        List<Integer> list1 = new ArrayList<>();
        for (int i = 1; i <= input1; i++) {
            if (input1 % i == 0) {
                list1.add(i);
            }
        }
        List<Integer> list2 = new ArrayList<>();
        for (int i = 1; i <= input2; i++) {
            if (input2 % i == 0) {
                list2.add(i);
            }
        }
        list1.retainAll(list2);
        int resultMax = list1.get(list1.size() - 1);
        int a = input1;
        int b = input2;

        while (a != b) {
            if (a < b) {
                a = a + input1;
            } else {
                b = b + input2;
            }
        }
        System.out.println(resultMax);
        System.out.println(a);
    }
}
