package backjoon.sliver2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class Problem1654 {
    public static void main(String[] args) throws Exception {
        BufferedReader br =
                new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw =
                new BufferedWriter(new OutputStreamWriter(System.out));
        String[] inputs = br.readLine().split(" ");
        int test = Integer.parseInt(inputs[0]);
        int count = Integer.parseInt(inputs[1]);
        int[] nums = new int[test];
        for (int i = 0; i < test; i++) {
            nums[i] = Integer.parseInt(br.readLine());
        }

        long start = 1;
        long answer= 0;
        long end = Arrays.stream(nums).max().getAsInt();
        while (start <= end) {
            long divide = (start + end) / 2;
            long result = 0;
            for (int i = 0; i < nums.length; i++) {
                result += nums[i] / divide;
            }
            if (result >= count) {
                answer = divide;
                start = divide + 1;
            } else {
                end = divide - 1;
            }
        }
        bw.write(answer + "\n");
        bw.flush();
        bw.close();

    }
}
