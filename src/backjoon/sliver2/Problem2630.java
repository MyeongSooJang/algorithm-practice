package backjoon.sliver2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Problem2630 {
    static int[][] field;
    static int[] count;
    public static void main(String[] args)throws IOException {
        BufferedReader br =
                new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        field = new int[n][n];
        for(int i = 0; i < n; i++){
            String[] inputs = br.readLine().split(" ");
            for(int j =0; j < n; j++){
                field[j][i] = Integer.parseInt(inputs[j]);
            }
        }
        count = new int[2];
        divide(0,0,n);
        System.out.println(count[0]);
        System.out.println(count[1]);
    }

    public static boolean isSame(int x, int y, int size){
        int value = field[x][y];
        for(int i = y; i < y + size; i++){
            for(int j = x; j < x + size; j++){
                if(field[j][i] != value) return false;
            }
        }
        return true;
    }

    public static void divide(int x, int y, int size){
        if(isSame(x,y,size)){
            int value = field[x][y];
            count[value]++;
            return;
        }
        int half = size / 2;

        divide(x,y,half);
        divide(x+half,y,half);
        divide(x,y+half,half);
        divide(x + half, y + half, half);
    }

}
