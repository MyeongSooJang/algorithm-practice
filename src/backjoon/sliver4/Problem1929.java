package backjoon.sliver4;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Problem1929 {
    public static void main(String[] args) throws IOException {
        BufferedReader br =
                new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw =
                new BufferedWriter(new OutputStreamWriter(System.out));
        String[] inputs = br.readLine().split(" ");
        int min = Integer.parseInt(inputs[0]);
        int max = Integer.parseInt(inputs[1]);

        boolean[] result = new boolean[max + 1];
        result[1] = true;
        for (int i = 2; i < max + 1; i++) {
            if (!result[i]) {
                for (int j = i + i; j <= max; j += i) {
                    result[j] = true;
                }
            }
        }
        for (int i = min; i < max + 1; i++) {
            if (!result[i]) {
                bw.write(i + "\n");
            }
        }
        bw.flush();
        bw.close();


    }
}
