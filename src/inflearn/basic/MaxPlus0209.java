package inflearn.basic;

import java.util.*;
import java.io.*;

public class MaxPlus0209 {
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[][] field = new int[n][n];
        int max = 0;
        for (int i = 0; i < n; i++) {
            String[] nums = br.readLine().split(" ");
            for (int j = 0; j < n; j++) {
                field[i][j] = Integer.parseInt(nums[j]);
            }
        }

        for (int i = 0; i < n; i++) {
            int sum = 0;
            for (int j = 0; j < n; j++) {
                sum += field[i][j];
            }
            max = Math.max(max, sum);
        }

        for (int i = 0; i < n; i++) {
            int sum = 0;
            for (int j = 0; j < n; j++) {
                sum += field[j][i];
            }
            max = Math.max(max, sum);
        }

        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += field[i][i];
        }
        max = Math.max(max, sum);

        sum = 0;
        for (int i = 0; i < n; i++) {
            sum += field[i][n - 1 - i];
        }
        max = Math.max(max, sum);

        System.out.println(max);


    }
}
