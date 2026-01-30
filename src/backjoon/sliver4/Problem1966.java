package backjoon.sliver4;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.LinkedList;
import java.util.Queue;

public class Problem1966 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        for(int i =0; i < n; i++){
            String[] inputs = br.readLine().split(" ");
            int x = Integer.parseInt(inputs[0]);
            int y = Integer.parseInt(inputs[1]);

            String[] nums = br.readLine().split(" ");
            Queue<int[]> queue = new LinkedList<>();
            for(int j = 0; j < x; j++){
                queue.add(new int[]{j, Integer.parseInt(nums[j])});
            }

            int rank =0;
            while(!queue.isEmpty()){
                int[] temp = queue.poll();

                boolean bigOne = false;
                for(int[] c : queue){
                    if(c[1] > temp[1]){
                        bigOne = true;
                        break;
                    }
                }
                if(bigOne){
                    queue.offer(temp);
                } else {
                    rank++;
                    if(temp[0] == y){
                        bw.write(rank+"\n");
                        break;
                    }
                }
            }
        }
        bw.flush();
        bw.close();

    }
}
