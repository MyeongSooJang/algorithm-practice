package backjoon.sliver5;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Problem1676 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int count = 0;
        for (int i = 1; i <= n; i++) {
            int num = i;
            while(num % 5 == 0){
                count++;
                num /= 5;
            }
        }
        System.out.println(count);
    }
}
