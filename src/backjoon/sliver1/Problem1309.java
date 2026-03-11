package backjoon.sliver1;

import java.util.Scanner;

public class Problem1309 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if(n == 1){
            System.out.println(3);
            return;
        }
        if(n == 2){
            System.out.println(7);
            return;
        }
        long[] arr = new long[n+ 1];
        arr[1] = 3;
        arr[2] = 7;
        for(int i =3; i < n + 1; i++){
            arr[i] = (arr[i - 1] * 2 + arr[i - 2]) % 9901;
        }

        System.out.println(arr[n] % 9901);
    }
}
