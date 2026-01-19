package backjoon.sliver5;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Problem1010 {
    public static void main(String[] args) throws IOException {
        BufferedReader br =
                new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw
                = new BufferedWriter(new OutputStreamWriter(System.out));
        int q = Integer.parseInt(br.readLine());

        for (int i = 0; i < q; i++) {
            String[] strs = br.readLine().split(" ");
            int n = Integer.parseInt(strs[0]);
            int m = Integer.parseInt(strs[1]);

            bw.write(solution(n, m) + "\n");
        }
        bw.flush();
        bw.close();
    }

    public static long solution(int n, int m) {
        long result = 1;
        for (int i = 1; i <= n; i++) {
            result = result * (m - n + i) / i;
        }
        return result;
    }
}
