package backjoon.sliver5;
import java.io.*;

public class Problem1436 {
    public static void main(String[] args) throws Exception {
        BufferedReader br =
                new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int count = 0;
        int num = 666;
        while (count != n) {
            if (String.valueOf(num).contains("666")) {
                count++;
            }
            num++;
        }
        System.out.println(num -1);
    }
}
