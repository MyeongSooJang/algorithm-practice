package backjoon.sliver2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.PriorityQueue;

public class Problem1927 {
    public static void main(String[] args)throws IOException {
        BufferedReader br =
                new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw =
                new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int i = 0; i < n; i++){
            int k = Integer.parseInt(br.readLine());
            if(k ==0 && pq.isEmpty()){
                bw.write(0 + "\n");
            }
            else if(k ==0){
                bw.write(pq.poll()+"\n");
            }
            if(k > 0){
                pq.add(k);
            }
        }
        bw.flush();
        bw.close();
    }
}
