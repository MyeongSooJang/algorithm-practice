package backjoon.bronze1;

import java.util.*;

public class Problem2775 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[][] apt = new int[15][15];

        for(int i = 0; i < 15; i++){
            apt[0][i] = i;
        }

        for(int i = 0; i < 15; i++){
            apt[i][1] = 1;
        }

        for(int i = 1; i < 15; i++){
            for(int j = 2; j < 15; j++){
                apt[i][j] = apt[i][j-1] + apt[i-1][j];
            }
        }
        int count = sc.nextInt();
        int[] result = new int[count];
        for(int i = 0; i < count; i++){
            int x = sc.nextInt();
            int y = sc.nextInt();
            result[i] = solution(apt, x ,y);
        }
        Arrays.stream(result).forEach(System.out::println);

    }
    public static int solution(int[][] apt, int a, int b){
        return apt[a][b];
    }
}
