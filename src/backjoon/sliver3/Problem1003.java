package backjoon.sliver3;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.List;

public class Problem1003 {
    public static void main(String[] args) throws IOException {
        BufferedReader br =
                new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw =
                new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        int[] intArrZero = new int[2];
        intArrZero[0] = 1;
        intArrZero[1] = 0;
        List<int[]> list = new ArrayList<>();
        list.add(intArrZero);
        int[] intArrOne = new int[2];
        intArrOne[0] = 0;
        intArrOne[1] = 1;
        list.add(intArrOne);
        int count = 2;
        while (count < 41) {
            int[] intArr1 = list.get(count - 2);
            int[] intArr2 = list.get(count - 1);
            int[] newArr = {intArr1[0] + intArr2[0], intArr1[1] + intArr2[1]};
            list.add(newArr);
            count++;
        }
        for (int i = 0; i < n; i++) {
            int input = Integer.parseInt(br.readLine());
            int[] result = list.get(input);
            bw.write(result[0] + " " + result[1] + "\n");
        }
        bw.flush();
        bw.close();
    }
}
