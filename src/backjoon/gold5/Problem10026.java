package backjoon.gold5;

import java.util.*;
import java.io.*;

public class Problem10026 {
    static int n ;
    static String[][] field,field1;
    static boolean[][] visited,visited1;
    static int[] dx = {0, 0, -1, 1};
    static int[] dy = {1, -1, 0, 0};
    static StringBuilder sb = new StringBuilder();
    public static void main(String[] args)throws IOException{
        BufferedReader br =
                new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        field = new String[n][n];
        visited = new boolean[n][n];
        visited1 = new boolean[n][n];

        for(int i = 0; i < n; i++){
            String[] inputs = br.readLine().split("");
            for(int j =0; j < n; j++){
                field[i][j] = inputs[j];
            }
        }
        int sum = 0;
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                if(!visited[j][i    ]){
                    sum += bfs1(i,j);
                }
            }
        }
        field1 = new String[n][n];
        field1 = field;
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                if(field1[i][j].equals("G")){
                    field[i][j] = "R";
                }
            }
        }

        int sum1 = 0;
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                if(!visited1[j][i]){
                    sum1 += bfs2(i,j);
                }
            }
        }


        System.out.println(sum +" "+  sum1);


    }
    public static int bfs1(int x, int y){
        int[] current = new int[]{y,x};
        Queue<int[]> queue = new LinkedList<>();
        visited[y][x] = true;
        queue.add(current);
        while(!queue.isEmpty()){
            int[] indx = queue.poll();
            int Y = indx[0];
            int X = indx[1];
            String s = field[Y][X];
            visited[Y][X] = true;
            for(int i = 0; i < 4; i++){
                int newY = Y + dy[i];
                int newX = X + dx[i];

                if(0 <= newY && newY < n && 0 <= newX && newX < n
                        && !visited[newY][newX]
                        && field[newY][newX].equals(s)){
                    visited[newY][newX] = true;
                    queue.add(new int[]{newY,newX});
                }
            }
        }
        return 1;
    }
    public static int bfs2(int x, int y){
        int[] current = new int[]{y,x};
        Queue<int[]> queue = new LinkedList<>();
        visited[y][x] = true;
        queue.add(current);
        while(!queue.isEmpty()){
            int[] indx = queue.poll();
            int Y = indx[0];
            int X = indx[1];
            String s = field1[Y][X];
            visited1[Y][X] = true;
            for(int i = 0; i < 4; i++){
                int newY = Y + dy[i];
                int newX = X + dx[i];

                if(0 <= newY && newY < n && 0 <= newX && newX < n
                        && !visited1[newY][newX]
                        && field[newY][newX].equals(s)){
                    visited1[newY][newX] = true;
                    queue.add(new int[]{newY,newX});
                }
            }
        }
        return 1;
    }
}
