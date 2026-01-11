package backjoon.bronze1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Problem1236 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        int n = Integer.parseInt(str.split(" ")[0]);
        int m = Integer.parseInt(str.split(" ")[1]);
        int[][] inputs = new int[n][m];
        for (int i = 0; i < n; i++) {
            str = br.readLine();
            for (int j = 0; j < m; j++) {
                if(str.charAt(j) == 'X'){
                    inputs[i][j] = 1;
                };
            }
        }
        int count = 0;
        int result1 = 0;
        int result2 = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (inputs[i][j] == 0) {
                    count++;
                }
            }
            if (count == m) {
                result1++;
            }
            count = 0;
        }
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (inputs[j][i] == 0) {
                    count++;
                }
            }
            if (count == n) {
                result2++;
            }
            count = 0;
        }
        System.out.println(Math.max(result1, result2));

    }
}
