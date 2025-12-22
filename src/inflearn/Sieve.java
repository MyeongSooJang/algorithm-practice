package inflearn;

import java.util.Scanner;

public class Sieve {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int input1 = in.nextInt();
        solution(input1);
    }

    public static void solution(int input1) {
        int[] nums = new int[input1+1];
        int count = 0;
        for (int i =2; i < input1; i++) {
            if (nums[i] == 0) {
                count++;
                for (int j = i; j< input1; j = j + i) nums[j] =1;
            }
        }
        System.out.println(nums[0]);
    }
}
