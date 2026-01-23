package backjoon.sliver4;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Problem2839 {
    public static void main(String[] args) throws IOException {
        BufferedReader br =
                new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw =
                new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        int result = 0;

        while (n >= 0) {
            if (n % 5 == 0) {
                result += n / 5;
                bw.write(String.valueOf(result));
                bw.flush();
                bw.close();
                return;
            }
            n -= 3;
            result++;
        }
        bw.write(String.valueOf(-1));
        bw.flush();
        bw.close();
    }
}
