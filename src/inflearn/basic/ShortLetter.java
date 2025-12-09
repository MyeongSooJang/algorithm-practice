package inflearn.basic;

import java.util.Scanner;

public class ShortLetter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();

        int length = s.length();

        int[] distances = new int[length];

        for (int i = 0; i < length; i++) {
            distances[i] = Integer.MAX_VALUE;
        }

        int lastT = -1000; // 충분히 큰 음수
        for (int i = 0; i < length; i++) {
            if (s.charAt(i) == 'e') {
                lastT = i;
                distances[i] = 0;
            } else {
                if (lastT >= 0) {
                    distances[i] = Math.min(distances[i], i - lastT);
                }
            }
        }

        lastT = 1000; // 충분히 큰 양수
        for (int i = length - 1; i >= 0; i--) {
            if (s.charAt(i) == 'e') {
                lastT = i;
                distances[i] = 0;
            } else {
                if (lastT < length) {
                    distances[i] = Math.min(distances[i], lastT - i);
                }
            }
        }

        for (int i = 0; i < length; i++) {
            System.out.print(distances[i] + " ");
        }
    }
}
