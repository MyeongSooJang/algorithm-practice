package backjoon.sliver3;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Problem9461 {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        for(int i = 0; i < n; i++){
            int m = Integer.parseInt(br.readLine());
            if(m <= 3){
                bw.write(1 + "\n");
                continue;
            }

            long[] intArr = new long[m + 1];
            intArr[1] = 1;
            intArr[2] = 1;
            intArr[3] = 1;
            for(int j = 4; j <= m; j++){
                intArr[j] = intArr[j -2] + intArr[j -3];
            }
            bw.write(intArr[m]+"\n");
        }
        bw.flush();
        bw.close();

    }
}
