package backjoon.sliver4;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.List;

public class Problem11866 {
    public static void main(String[] args) throws IOException {
        BufferedReader br =
                new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw =
                new BufferedWriter(new OutputStreamWriter(System.out));
        String[] inputs = br.readLine().split(" ");
        int size = Integer.parseInt(inputs[0]);
        int num = Integer.parseInt(inputs[1]);
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            list.add(i + 1);
        }
        int[] result = new int[size];
        int index = num - 1;
        int repeat =0;
        while (!(list.size() == 0)) {
            result[repeat] = list.remove(index);
            if(list.size() == 0) break;
            index = (index + num -1)% list.size();


            repeat++;
        }
        bw.write("<");
        for (int i = 0; i < size; i++) {
            bw.write(String.valueOf(result[i]));
            if (i < size - 1) {
                bw.write(", ");
            }
        }
        bw.write(">");
        bw.flush();
        bw.close();


    }
}
