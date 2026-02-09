package backjoon.sliver3;

import java.util.Scanner;

public class Problem11727 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n == 1){
            System.out.println(1);
            return;
        }
        if(n == 2){
            System.out.println(3);
            return;
        }
        int[] intArr = new int[n + 1];
        intArr[1] = 1;
        intArr[2] = 3;
        for(int i = 3; i < n + 1; i++){
            intArr[i] = (intArr[i-1] + 2 * (intArr[i-2]))%10007;
        }
        System.out.println(intArr[n]);

    }
}
