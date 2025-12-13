package inflearn;

import java.util.Scanner;

public class VisibleStudent {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] heights = new int[n];

        for (int i = 0; i < n; i++) {
            heights[i] = sc.nextInt();
        }

        int count = 0;
        int maxHeight = 0;

        for (int i = 0; i < n; i++) {
            if (heights[i] > maxHeight) {
                count++;
                maxHeight = heights[i];
            }
        }

        System.out.println(count);
    }
}
