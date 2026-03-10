package backjoon.sliver2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Problem1912 {
    public static void main(String[] args) throws IOException {
        BufferedReader br =
                new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n + 1];
        int[] dp = new int[n + 1];
        String[] nums = br.readLine().split(" ");
        for (int i = 1; i < n + 1; i++) {
            arr[i] = Integer.parseInt(nums[i - 1]);
        }
        if (n == 1) {
            dp[1] = arr[1];
            System.out.println(dp[1]);
            return;
        }
        dp[1] = arr[1];
        for (int i = 2; i < n + 1; i++) {
            dp[i] = Math.max(arr[i], dp[i-1] + arr[i]);
        }
        int max = dp[1];
        for(int i = 2; i < n + 1; i++){
            max = Math.max(max, dp[i]);
        }
        System.out.println(max);
    }
}
