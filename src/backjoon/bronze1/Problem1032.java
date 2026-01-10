package backjoon.bronze1;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Problem1032 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        String[] inputs = new String[N];
        for (int i = 0; i < N; i++) {
            inputs[i] = br.readLine();
        }
        solution(inputs);
    }

    public static void solution(String[] inputs) {
        if (inputs.length == 1) {
            System.out.println(inputs[0]);
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(inputs[0]);

        for (int i = 1; i < inputs.length; i++) {
            for (int j = 0; j < inputs[i].length(); j++) {
                if (inputs[i].charAt(j) != sb.charAt(j)) {
                    sb.setCharAt(j, '?');
                }
            }
        }
        System.out.println(sb.toString());
    }
}
