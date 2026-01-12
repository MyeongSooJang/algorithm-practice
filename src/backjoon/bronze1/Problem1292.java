package backjoon.bronze1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Problem1292 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] str = br.readLine().split(" ");
        int start = Integer.parseInt(str[0]);
        int end = Integer.parseInt(str[1]);
        int count = 1;
        int[] arr = new int[2000];
        for (int i = 1; i < 50; i++) {
            for (int j = 1; j <= i; j++) {
                arr[count] = i;
                count++;
            }
        }
        System.out.println(Arrays.stream(arr, start, end + 1).sum());
    }
}
