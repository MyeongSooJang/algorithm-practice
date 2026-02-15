package backjoon.sliver3;

import java.io.*;

public class Problem11659 {
    public static void main(String[] args) throws IOException {
        BufferedReader br =
                new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw =
                new BufferedWriter(new OutputStreamWriter(System.out));
        String[] inputs = br.readLine().split(" ");
        int size = Integer.parseInt(inputs[0]);
        int test = Integer.parseInt(inputs[1]);

        int[] sumArr = new int[size + 1];

        int sum = 0;
        String[] nums = br.readLine().split(" ");
        for (int i = 1; i < size + 1; i++) {
            sum += Integer.parseInt(nums[i - 1]);
            sumArr[i] = sum;
        }

        for (int i = 0; i < test; i++) {
            String[] testCase = br.readLine().split(" ");
            int start = Integer.parseInt(testCase[0]);
            int end = Integer.parseInt(testCase[1]);
            int result = solution(start, end, sumArr);
            bw.write(result + "\n");
        }
        bw.flush();
        bw.close();

    }

    public static int solution(int n, int m, int[] sumArr) {
        return sumArr[m] - sumArr[n-1];
    }
}
