package backjoon.sliver2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Problem4963 {
    static int wide;
    static int height;
    static int[][] field;
    static boolean[][] visited;
    static int[] dx = {0, 0, -1 , 1, -1, 1, 1, -1};
    static int[] dy = {1, -1, 0, 0, 1, 1, -1, -1};


    public static void main(String[] args)throws IOException {
        BufferedReader br =
                new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw =
                new BufferedWriter(new OutputStreamWriter(System.out));

        while(true){
            String[] inputs = br.readLine().split(" ");
            wide = Integer.parseInt(inputs[0]);
            height = Integer.parseInt(inputs[1]);
            if(wide == 0 && height == 0) break;

            field = new int[wide][height];
            visited = new boolean[wide][height];

            for(int i = 0; i < height; i++){
                String[] nums = br.readLine().split(" ");
                for(int j =0; j < wide; j++){
                    field[j][i] = Integer.parseInt(nums[j]);
                }
            }
            int result = 0;
            for(int i = 0; i < height; i++){
                for(int j =0; j < wide; j++){
                    if(!visited[j][i] && field[j][i] == 1){
                        dfs(j,i);
                        result++;
                    }
                }
            }
            bw.write(result+"\n");
        }
        bw.flush();
        bw.close();
    }
    public static void dfs(int x, int y){
        visited[x][y] = true;
        for(int i =0; i < 8; i++){
            int X = x + dx[i];
            int Y = y + dy[i];
            if(0 <= X && X < wide && 0 <=Y && Y < height
                    && field[X][Y] ==1 && !visited[X][Y]){
                dfs(X,Y);
            }
        }
    }
}
