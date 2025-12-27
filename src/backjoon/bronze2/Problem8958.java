package backjoon.bronze2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Problem8958 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        int[] inputs = new int[num];
        for (int i = 0; i < num; i++) {
            String input = br.readLine();
            inputs[i] = solution(input);
        }
        for (int i : inputs) {
            System.out.println(i);
        }

    }

    public static int solution(String input) {
        int score = 0;
        int result = 0;
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == 'O') {
                result++;
                score += result;
            } else {
                result = 0;
            }
        }
        return score;
    }
}
