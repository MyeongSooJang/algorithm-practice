package backjoon.sliver1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Problem9465 {
    static int[][] stickers;
    static int width;
    static StringBuilder sb = new StringBuilder();
    public static void main(String[] args)throws IOException {
        BufferedReader br =
                new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        for(int i = 0; i < n; i++){
            width = Integer.parseInt(br.readLine());
            stickers = new int[2][width];
            for(int k = 0; k < 2; k++){
                String[] inputs = br.readLine().split(" ");
                for(int j = 0; j < width; j++){
                    stickers[k][j] = Integer.parseInt(inputs[j]);
                }
            }
            sb.append(dp() + "\n");
        }
        System.out.println(sb.toString());
    }

    public static long dp(){
        long[][] dp = new long[2][width];

        dp[0][0] = stickers[0][0];
        dp[1][0] = stickers[1][0];

        if(width > 1) {
            dp[0][1] = stickers[0][1] + dp[1][0];
            dp[1][1] = stickers[1][1] + dp[0][0];
        }

        for(int i = 2; i < width; i++){
            dp[0][i] = stickers[0][i] + Math.max(dp[1][i-1], dp[1][i-2]);
            dp[1][i] = stickers[1][i] + Math.max(dp[0][i-1], dp[0][i-2]);
        }

        return Math.max(dp[0][width-1], dp[1][width-1]);
    }

}
