package backjoon.sliver4;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class Problem11399 {
    public static void main(String[] args) throws IOException {
        BufferedReader br
                = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw
                = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        String[] inputs = br.readLine().split(" ");
        for(int i = 0; i < n; i++){
            arr[i] = Integer.parseInt(inputs[i]);
        }
        Arrays.sort(arr);
        int num = n;
        int sum = 0;
        for(int i =0; i < n; i++){
            sum = sum + (arr[i] * num);
            num --;
        }
        bw.write(sum + "\n");
        bw.flush();
        bw.close();
    }
}
