package backjoon.sliver1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Problem11660 {
    static int size, problem;
    static int[][] field, sumField;
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] conditions = br.readLine().split(" ");
        size = Integer.parseInt(conditions[0]);
        problem = Integer.parseInt(conditions[1]);

        field = new int[size + 1][size + 1];
        sumField = new int[size + 1][size + 1];

        for(int i = 1; i <= size; i++) {
            String[] nums = br.readLine().split(" ");
            for(int j = 1; j <= size; j++) {
                field[i][j] = Integer.parseInt(nums[j - 1]);
            }
        }

        sum();

        for(int i = 0; i < problem; i++) {
            String[] numbers = br.readLine().split(" ");
            int x1 = Integer.parseInt(numbers[0]);
            int y1 = Integer.parseInt(numbers[1]);
            int x2 = Integer.parseInt(numbers[2]);
            int y2 = Integer.parseInt(numbers[3]);

            int minX = Math.min(x1, x2);
            int maxX = Math.max(x1, x2);
            int minY = Math.min(y1, y2);
            int maxY = Math.max(y1, y2);

            int result = sumField[maxX][maxY]
                    - sumField[minX - 1][maxY]
                    - sumField[maxX][minY - 1]
                    + sumField[minX - 1][minY - 1];

            sb.append(result).append("\n");
        }

        System.out.println(sb.toString());
    }

    public static void sum() {
        for(int i = 1; i <= size; i++) {
            for(int j = 1; j <= size; j++) {
                sumField[i][j] = field[i][j]
                        + sumField[i - 1][j]
                        + sumField[i][j - 1]
                        - sumField[i - 1][j - 1];
            }
        }
    }
}
