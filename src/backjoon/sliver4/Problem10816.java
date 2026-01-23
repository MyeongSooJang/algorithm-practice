package backjoon.sliver4;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashMap;
import java.util.Map;

public class Problem10816 {
    public static void main(String[] args) throws IOException {
        BufferedReader br =
                new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw =
                new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        String[] inputs = br.readLine().split(" ");
        int m = Integer.parseInt(br.readLine());
        String[] inputs2 = br.readLine().split(" ");

        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < inputs.length; i++) {
            if(!map.containsKey(Integer.parseInt(inputs[i]))){
                map.put(Integer.parseInt(inputs[i]), 1);
            } else{
                int value = map.get(Integer.parseInt(inputs[i]));
                map.put(Integer.parseInt(inputs[i]), value + 1);
            }
        }
        for (int i = 0; i < inputs2.length; i++) {
            if(map.containsKey(Integer.parseInt(inputs2[i]))){
                bw.write(map.get(Integer.parseInt(inputs2[i])) + " ");
            } else{
                bw.write("0 ");
            }
        }

        bw.flush();
        bw.close();
    }
}
