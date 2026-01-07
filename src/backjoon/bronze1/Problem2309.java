package backjoon.bronze1;

import java.util.Arrays;
import java.util.Scanner;

public class Problem2309 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[9];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        solution(arr);
    }

    public static void solution(int[] arr) {
        Arrays.sort(arr);
        int sum = Arrays.stream(arr).sum();
        int a =0;
        int b =0;
        for(int i = 0; i < arr.length; i++){
            for(int j = i + 1; j < arr.length; j++){
                if(sum - arr[i] -arr[j] == 100){
                    a = i;
                    b = j;
                }
            }
        }
        for(int i = 0; i < arr.length; i++){
            if(i != a && i !=b){
                System.out.println(arr[i]);
            }
        }
    }
}
