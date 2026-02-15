package backjoon.sliver1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Problem1992 {
    static int[][] field;
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        BufferedReader br =
                new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        field = new int[n][n];
        for (int i = 0; i < n; i++) {
            String[] inputs = br.readLine().split("");
            for (int j = 0; j < n; j++) {
                field[i][j] = Integer.parseInt(inputs[j]);
            }
        }
        divide(0, 0, n);

        System.out.println(sb.toString());

    }

    public static boolean isSame(int n, int m, int size) {
        int value = field[n][m];
        for (int i = n; i < n + size; i++) {
            for (int j = m; j < m + size; j++) {
                if (field[i][j] != value) {
                    return false;
                }
            }
        }
        return true;
    }

    public static void divide(int n, int m, int size) {
        if (isSame(n, m, size)) {
            sb.append(field[n][m]);
            return;
        }
        int half = size / 2;
        sb.append("(");
        divide(n, m, half);
        divide(n , m+ half, half);
        divide(n+half, m, half);
        divide(n+half, m + half, half);
        sb.append(")");
    }
}
