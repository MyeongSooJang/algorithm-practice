package backjoon.sliver2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;

public class Problem1874 {
    public static void main(String[] args) throws IOException {
        BufferedReader br =
                new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw =
                new BufferedWriter(new OutputStreamWriter(System.out));
        int current = 1;
        int n = Integer.parseInt(br.readLine());
        int[] intArr = new int[n];
        for (int i = 0; i < n; i++) {
            intArr[i] = Integer.parseInt(br.readLine());
        }
        Stack<Integer> stack = new Stack<>();
        StringBuilder sb = new StringBuilder();

        for (int num : intArr) {
            while (num >= current) {
                stack.push(current);
                sb.append("+" + "\n");
                current++;
            }
            if (stack.peek() == num) {
                stack.pop();
                sb.append("-" + "\n");
            } else {
                sb.setLength(0);
                sb.append("NO");
                break;
            }
        }
        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}
