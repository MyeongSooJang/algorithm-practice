package backjoon.sliver2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class Problem2512 {
    public static void main(String[] args) throws IOException {
        BufferedReader br =
                new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw =
                new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        int[] intArr = new int[n];
        String[] nums = br.readLine().split(" ");
        for (int i = 0; i < nums.length; i++) {
            intArr[i] = Integer.parseInt(nums[i]);
        }
        int max = Integer.parseInt(br.readLine());

        int start = 1;
        int end = Arrays.stream(intArr).max().getAsInt();
        int answer = 0;
        while (start <= end) {
            int average = (start + end) / 2;
            int sum = 0;
            for (int g : intArr) {
                if (g > average) {
                    sum += average;
                } else {
                    sum += g;
                }
            }
            if (max >= sum) {
                answer = average;
                start = average + 1;
            } else {
                end = average - 1;
            }
        }
        bw.write(String.valueOf(answer));
        bw.flush();
        bw.close();
    }
}
