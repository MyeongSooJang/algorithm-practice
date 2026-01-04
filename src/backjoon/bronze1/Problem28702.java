package backjoon.bronze1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Problem28702 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] inputs = new String[3];
        for (int i = 0; i < 3; i++) {
            inputs[i] = br.readLine();
        }
        solution(inputs);
        br.close();
    }

    public static void solution(String[] inputs) {
        int result = 0;
        for (int i = 0; i < inputs.length; i++) {
            if (!inputs[i].equals("Buzz") && !inputs[i].equals("Fizz") && !inputs[i].equals("FizzBuzz")) {
                result = Integer.parseInt(inputs[i]) + 3 - i;
            }
        }

        if (result % 3 == 0 && result % 5 == 0) {
            System.out.println("FizzBuzz");
        } else if (result % 3 == 0) {
            System.out.println("Fizz");
        } else if (result % 5 == 0) {
            System.out.println("Buzz");
        } else {
            System.out.println(result);
        }

    }
}
