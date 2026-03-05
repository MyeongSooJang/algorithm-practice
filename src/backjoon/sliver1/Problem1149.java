package backjoon.sliver1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Problem1149 {
    static int[][] nums,sums;
    static int n;
    public static void main(String[] args)throws IOException {
        BufferedReader br =
                new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        nums = new int[n][3];
        sums = new int[n][3];
        for(int i = 0; i < n; i++){
            String[] numbers = br.readLine().split(" ");
            for(int j = 0; j < 3; j++){
                nums[i][j] = Integer.parseInt(numbers[j]);
            }
        }
        sum();
        int min = Integer.MAX_VALUE;
        for(int n : sums[n -1]){
            min = Math.min(min, n);
        }
        System.out.println(min);

    }
    public static void sum(){
        sums[0][0] = nums[0][0];
        sums[0][1] = nums[0][1];
        sums[0][2] = nums[0][2];
        for(int i = 1; i < n; i++){
            sums[i][0] = Math.min(sums[i-1][1],sums[i-1][2]) + nums[i][0];
            sums[i][1] = Math.min(sums[i-1][0],sums[i-1][2]) + nums[i][1];
            sums[i][2] = Math.min(sums[i-1][0],sums[i-1][1]) + nums[i][2];
        }
    }
}
