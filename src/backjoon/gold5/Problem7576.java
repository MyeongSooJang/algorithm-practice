package backjoon.gold5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class Problem7576 {
    static int x,y;
    static int[][] field;
    static boolean[][] visited;
    static int[] dx = {0, 0, -1, 1};
    static int[] dy = {1, -1, 0, 0};
    static Queue<int[]> queue = new LinkedList<>();


    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] conditions = br.readLine().split(" ");
        x = Integer.parseInt(conditions[0]);
        y = Integer.parseInt(conditions[1]);

        field = new int[y][x];
        visited = new boolean[y][x];

        for(int i = 0; i < y; i++){
            String[] inputs = br.readLine().split(" ");
            for(int j = 0; j < x; j++){
                field[i][j] = Integer.parseInt(inputs[j]);
                if(field[i][j] == 1){
                    queue.add(new int[]{i,j,0});
                }
            }
        }
        int result = bfs();

        for(int i = 0; i < y; i++){
            for(int j = 0; j < x; j++){
                if(field[i][j] == 0){
                    System.out.println(-1);
                    return;
                }
            }
        }
        System.out.println(result);

    }
    public static int bfs(){
        int date = 0;
        while(!queue.isEmpty()){
            int[] current = queue.poll();
            visited[current[0]][current[1]] = true;
            if(current[2] > date) date = current[2];
            for(int i = 0; i < 4; i++){
                int Y = current[0] + dy[i];
                int X = current[1] + dx[i];
                int count = current[2];
                if(0 <= Y && Y < y && 0 <= X && X < x && !visited[Y][X] &&
                        field[Y][X] == 0){
                    field[Y][X] = 1;
                    visited[Y][X] = true;
                    queue.add(new int[]{Y,X,count + 1});
                }
            }
        }
        return date;
    }
}
