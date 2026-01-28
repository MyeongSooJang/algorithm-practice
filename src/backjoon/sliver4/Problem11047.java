package backjoon.sliver4;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Problem11047 {
    public static void main(String[] args) throws IOException {
        BufferedReader br =
                new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw =
                new BufferedWriter(new OutputStreamWriter(System.out));

        String[] inputs = br.readLine().split(" ");
        int count = Integer.parseInt(inputs[0]);
        int money = Integer.parseInt(inputs[1]);
        int[] moneys = new int[count];
        for (int i = 0; i < count; i++) {
            moneys[i] = Integer.parseInt(br.readLine());
        }
        int repeat = 0;
        for (int i = moneys.length - 1; i >= 0; i--) {
            while (money >= moneys[i]) {
                money -= moneys[i];
                repeat++;
            }
            if (money == 0) {
                break;
            }
        }
        bw.write(repeat + "\n");
        bw.flush();

    }
}
