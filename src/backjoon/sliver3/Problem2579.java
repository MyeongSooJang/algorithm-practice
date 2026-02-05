package backjoon.sliver3;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Problem2579 {
    public static void main(String[] args) throws IOException {
        BufferedReader br =
                new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw =
                new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        int[] points = new int[n + 1];

        for (int i = 1; i < points.length; i++) {
            points[i] = Integer.parseInt(br.readLine());
        }
        int result = solution(points);
        bw.write(String.valueOf(result));
        bw.flush();
        bw.close();
    }

    public static int solution(int[] points) {
        int n = points.length - 1;
        if (n == 1) {
            return points[1];
        } else if (n == 2) {
            return points[1] + points[2];
        }
        int[] position = new int[n + 1];

        position[1] = points[1];
        position[2] = points[1] + points[2];

        position[3] = Math.max(points[1] + points[3], points[2] + points[3]);

        for (int i = 3; i < n + 1; i++) {
            position[i] = Math.max(position[i - 2] + points[i], position[i - 3] + points[i - 1] + points[i]);
        }
        return position[n];
    }
}
