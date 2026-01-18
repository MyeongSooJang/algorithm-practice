package backjoon.sliver5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Problem2563 {
    public static void main(String[] args) throws IOException {
        BufferedReader br =
                new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        boolean[][] square = new boolean[100][100];
        for (int i = 0; i < n; i++) {
            String[] strs = br.readLine().split(" ");
            int k = Integer.parseInt(strs[0]);
            int l = Integer.parseInt(strs[1]);
            for (int x = k; x < k + 10; x++) {
                for (int y = l; y < l + 10; y++) {
                    square[x][y] = true;
                }
            }
        }
        int count = 0;
        for (int i = 0; i < 100; i++) {
            for (int j = 0; j < 100; j++) {
                if(square[i][j]) {
                    count++;
                }
            }
        }

        System.out.println(count);

    }
}
