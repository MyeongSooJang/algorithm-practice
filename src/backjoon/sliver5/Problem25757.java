package backjoon.sliver5;

import java.util.Scanner;

public class Problem25757 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        sc.nextLine();

        String games = sc.nextLine();

        int[] count = new int[3];
        for (char c : games.toCharArray()) {
            if (c == 'Y') count[0]++;
            else if (c == 'F') count[1]++;
            else if (c == 'O') count[2]++;
        }

        int maxGames = 0;

        maxGames += count[0] / 2;

        maxGames += count[1] / 3;

        maxGames += count[2] / 4;

        maxGames = Math.min(maxGames, N);

        System.out.println(maxGames);

        sc.close();
    }
}
