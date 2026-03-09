package backjoon.sliver1;

import java.util.*;
import java.io.*;

public class Problem2156 {
    public static void main(String[] args)throws IOException{
        BufferedReader br =
                new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n+1];
        int[] sum = new int[n + 1];
        for(int i = 1; i < n + 1; i++){
            arr[i] = Integer.parseInt(br.readLine());
        }
        if(n == 1) {
            sum[1] = arr[1];
            System.out.println(sum[1]);
            return;
        }
        if(n == 2){
            sum[1] = arr[1];
            sum[2] = arr[1] + arr[2];
            System.out.println(sum[2]);
            return;
        }
        sum[1] = arr[1];
        sum[2] = arr[1] + arr[2];

        for (int i = 3; i <= n; i++) {
            sum[i] = Math.max(sum[i-1],
                    Math.max(sum[i-2] + arr[i],
                            sum[i-3] + arr[i-1] + arr[i]));
        }
        System.out.println(sum[n]);


    }
}
