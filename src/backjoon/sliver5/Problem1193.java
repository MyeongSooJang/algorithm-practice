package backjoon.sliver5;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Problem1193 {
    public static void main(String[] args) throws IOException {
        BufferedReader br =
                new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw =
                new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());

        int row = 1;
        int sum = 0;
        int count = 0;

        while (sum < n) {
            sum += row;
            row++;
        }
        row--;
        count = n - (sum - row);

        if (row % 2 == 0) {
            bw.write(count + "/" + (row - count + 1));
        } else {
            bw.write((row - count + 1) + "/" + count);
        }

        bw.flush();
        bw.close();

    }
}
