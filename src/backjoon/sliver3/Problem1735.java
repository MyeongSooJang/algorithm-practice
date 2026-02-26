package backjoon.sliver3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Problem1735 {
    public static void main(String[] args) throws IOException {
        BufferedReader br =
                new BufferedReader(new InputStreamReader(System.in));

        String[] inputs1 = br.readLine().split(" ");
        int a = Integer.parseInt(inputs1[0]);
        int b = Integer.parseInt(inputs1[1]);

        String[] inputs2 = br.readLine().split(" ");
        int c = Integer.parseInt(inputs2[0]);
        int d = Integer.parseInt(inputs2[1]);

        int LCM = lcm(b, d);

        int a1 = LCM / b;
        int b1 = LCM / d;

        int sum = a * a1 + c * b1;

        int GCD = gcd(LCM, sum);

        System.out.println(sum / GCD);
        System.out.println(LCM / GCD);

    }

    public static int gcd(int a, int b) {
        while (b != 0) {
            int temp = a % b;
            a = b;
            b = temp;
        }
        return a;
    }

    public static int lcm(int a, int b) {
        return a / gcd(a, b) * b;
    }
}
