package backjoon.bronze1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Problem14626 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        solution(br.readLine());
        br.close();
    }

    public static void solution(String input) {
        String[] inputs = input.split("");
        int num = 0;
        int sum = 0;
        for (int i = 0; i < inputs.length - 1; i++) {
            if (inputs[i].equals("*")) {
                num = i;
            } else if (i % 2 == 0) {
                sum += Integer.parseInt(inputs[i]);
            } else {
                sum += Integer.parseInt(inputs[i]) * 3;
            }
        }
        int result = 0;
        if (num % 2 == 0) {
            for (int i = 0; i < 10; i++) {
                if (Integer.parseInt(inputs[inputs.length - 1]) == (10 - ((sum + i) % 10)) % 10) {
                    result = i;
                    break;
                }
            }

        } else {
            for (int i = 0; i < 10; i++) {
                if (Integer.parseInt(inputs[inputs.length - 1]) == (10 - ((sum + (i * 3)) % 10)) % 10) {
                    result = i;
                    break;
                }
            }
        }
        System.out.println(result);
    }
}
