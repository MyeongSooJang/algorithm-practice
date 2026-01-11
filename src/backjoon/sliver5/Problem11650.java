package backjoon.sliver5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Problem11650 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[][] arr = new int[n][2];
        for (int i = 0; i < n; i++) {
            String[] str = br.readLine().split(" ");
            arr[i][0] = Integer.parseInt(str[0]);
            arr[i][1] = Integer.parseInt(str[1]);
        }
        Arrays.sort(arr, (a, b) -> {
            if (a[0] != b[0]) {
                return a[0] - b[0];
            }
            return a[1] - b[1];
        });
        StringBuilder sb = new StringBuilder();
        for (int[] arrs : arr) {
            sb.append(arrs[0]).append(" ").append(arrs[1]).append("\n");
        }
        System.out.println(sb);
    }
}
