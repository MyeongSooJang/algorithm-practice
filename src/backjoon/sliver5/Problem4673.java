package backjoon.sliver5;

import java.io.BufferedWriter;
import java.io.OutputStreamWriter;

public class Problem4673 {
    public static void main(String[] args) throws Exception {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int[] result = new int[10001];
        for (int i = 1; i < result.length; i++) {
            result[i] = i;
        }
        for (int i = 1; i < 10000; i++) {
            int num = i;
            while (num <= 10000) {
                String[] s = String.valueOf(num).split("");
                for (int j = 0; j < s.length; j++) {
                    num += Integer.parseInt(s[j]);
                }
                if (num <= 10000) {
                    result[num] = 0;
                }
            }
        }
        for (int i = 1; i < result.length; i++) {
            if (result[i] == i) {
                bw.append(result[i] + "\n");
            }
        }
        bw.flush();
        bw.close();
    }
}
