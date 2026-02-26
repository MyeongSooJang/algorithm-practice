package backjoon.sliver1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Problem6064 {
    static int n, m, x, y;
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        BufferedReader br =
                new BufferedReader(new InputStreamReader(System.in));
        int test = Integer.parseInt(br.readLine());
        for (int i = 0; i < test; i++) {
            String[] inputs = br.readLine().split(" ");
            n = Integer.parseInt(inputs[0]);
            m = Integer.parseInt(inputs[1]);
            x = Integer.parseInt(inputs[2]);
            y = Integer.parseInt(inputs[3]);
            solution(n, m, x, y);
        }
        System.out.print(sb.toString());

    }

    public static void solution(int n, int m, int x, int y) {
        int GCD = gcd(n, m);
        int LCM = lcm(n, m);

        if (n <= m) {
            for (int i = x; i <= LCM; i += n) {
                if ((i - 1) % m + 1 == y) {
                    sb.append(i).append("\n");
                    return;
                }
            }
        } else {
            for (int i = y; i <= LCM; i += m) {
                if ((i - 1) % n + 1 == x) {
                    sb.append(i).append("\n");
                    return;
                }
            }
        }
        sb.append(-1).append("\n");
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
        return a * b / gcd(a, b);
    }
}
