package backjoon.sliver1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Problem1932 {
    static int[][] tri,sum;
    static int size;
    public static void main(String[] args)throws IOException {
        BufferedReader br =
                new BufferedReader(new InputStreamReader(System.in));
        size = Integer.parseInt(br.readLine());
        tri = new int[size][size];
        sum = new int[size][size];
        for(int i = 0; i < size; i++){
            String[] nums = br.readLine().split(" ");
            for(int j = 0; j < nums.length; j++){
                tri[i][j] = Integer.parseInt(nums[j]);
            }
        }
        sum();
        int max = 0;
        for(int i = 0; i < size; i++){
            max = Math.max(sum[size - 1][i], max);
        }
        System.out.println(max);
    }

    public static void sum(){
        sum[0][0] = tri[0][0];
        if(size > 1){
            sum[1][0] = sum[0][0] + tri[1][0];
            sum[1][1] = sum[0][0] + tri[1][1];
            for(int i = 2; i < size; i++){
                for(int j = 0; j <= i; j++){
                    if(j == 0) sum[i][0] = sum[i-1][0] + tri[i][0];
                    if(0 < j && j <i){
                        sum[i][j] = Math.max(sum[i-1][j],sum[i-1][j-1]) + tri[i][j];
                    }
                    if(j == i) sum[i][j] = sum[i-1][j-1] + tri[i][j];
                }
            }
        }
    }
}
