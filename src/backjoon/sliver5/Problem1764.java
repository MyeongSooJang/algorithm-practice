package backjoon.sliver5;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Problem1764 {
    public static void main(String[] args) throws IOException {
        BufferedReader br =
                new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw =
                new BufferedWriter(new OutputStreamWriter(System.out));
        String[] strs = br.readLine().split(" ");
        int n = Integer.parseInt(strs[0]);
        int m = Integer.parseInt(strs[1]);
        Set<String> set1 = new TreeSet<>();
        for(int i =0; i< n; i++){
            set1.add(br.readLine());
        }
        Set<String> set2 = new TreeSet<>();
        for(int i =0; i< m; i++){
            set2.add(br.readLine());
        }
        set1.retainAll(set2);


        bw.write(set1.size() + "\n");
        bw.write(String.join("\n", set1));
        bw.flush();
        bw.close();
    }
}
