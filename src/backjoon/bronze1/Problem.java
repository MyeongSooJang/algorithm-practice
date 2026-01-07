package backjoon.bronze1;

import java.util.Arrays;
import java.util.Scanner;

public class Problem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();
        String[] strs = new String[count];
        for (int i = 0; i < count; i++) {
            strs[i] = sc.next();
        }
        int[] arr = new int[150];
        for (int i = 0; i < strs.length; i++) {
            arr[strs[i].charAt(0)]++;
        }
        int max = Arrays.stream(arr).max().getAsInt();
        if (max < 5) {
            System.out.println("PREDAJA");
        } else {
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] >= 5 ) {
                    System.out.print((char) i);
                }
            }
        }
    }
}
