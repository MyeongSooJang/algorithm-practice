package backjoon.gold5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Problem14719 {
    static int[][] field;
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] size = br.readLine().split(" ");
        int y = Integer.parseInt(size[0]);
        int x = Integer.parseInt(size[1]);
        field = new int[y][x];
        String[] heights = br.readLine().split(" ");
        for(int i = 0; i < heights.length; i++){
            int n = Integer.parseInt(heights[i]);
            for(int j = n; j > 0; j--){
                field[j-1][i] = 1;
            }
        }
        int sum = 0;

        for(int i = y-1; i>= 0; i--){
            int plus = 0;
            boolean leftWall = false;

            for(int j = 0; j < x; j++){
                if(field[i][j] == 1){
                    if(leftWall) sum += plus;
                    plus = 0;
                    leftWall = true;
                } else if(leftWall){
                    plus++;
                }
            }
        }
        System.out.println(sum);
    }
}
