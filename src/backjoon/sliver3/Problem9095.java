package backjoon.sliver3;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Problem9095 {
    static int[] intArr = new int[11];

    public static void main(String[] args)throws IOException {
        BufferedReader br =
                new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw =
                new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        intArr[1] = 1;
        intArr[2] = 2;
        intArr[3] = 4;
        for (int i = 4; i < intArr.length; i++) {
            intArr[i] = intArr[i - 1] + intArr[i - 2] + intArr[i - 3];
        }

        for (int i = 0; i < n; i++) {
            int input = Integer.parseInt(br.readLine());
            bw.write(intArr[input] + "\n");
        }
        bw.flush();
        bw.close();
    }
}
