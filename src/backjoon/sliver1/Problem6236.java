package backjoon.sliver1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Problem6236 {
    public static void main(String[] args) throws IOException {
        BufferedReader br =
                new BufferedReader(new InputStreamReader(System.in));

        String[] inputs = br.readLine().split(" ");
        int day = Integer.parseInt(inputs[0]);
        int count = Integer.parseInt(inputs[1]);
        int[] money = new int[day];

        for (int i = 0; i < day; i++) {
            money[i] = Integer.parseInt(br.readLine());
        }

        int start = Arrays.stream(money).max().getAsInt();
        int end = Arrays.stream(money).sum();
        int answer = 0;

        while (start <= end) {
            int average = (start + end) / 2;
            int change = 0;
            int repeat = 0;
            for (int m : money) {
                if (m > change) {
                    repeat++;
                    change = average;
                }
                change -= m;
            }
            if(repeat <= count){
                answer = average;
                end = average -1;
            } else {
                start = average + 1;
            }
        }
        System.out.println(answer);
    }
}
