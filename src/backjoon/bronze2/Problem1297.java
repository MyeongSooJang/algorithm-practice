package backjoon.bronze2;

import java.util.Scanner;

public class Problem1297 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] inputs = new int[3];
        for (int i = 0; i < 3; i++) {
            inputs[i] = sc.nextInt();
        }
        solution(inputs);
    }
    public static void solution(int[] inputs){
        int inch = inputs[0];
        int a =  inputs[1];
        int b = inputs[2];
        double pow = Math.pow(inch, 2) / (Math.pow(a, 2) + Math.pow(b, 2));
        double sqrt = Math.sqrt(pow);
        System.out.println((int) (sqrt * a) + " " + (int) (sqrt * b));
    }
}
