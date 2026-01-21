package backjoon.sliver5;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Problem7785 {
    public static void main(String[] args)throws IOException {
        BufferedReader br =
                new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw =
                new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        Set<String> people = new HashSet<>();
        for(int i =0; i < n; i++){
            String[] strs = br.readLine().split(" ");
            if(strs[1].equals("enter")){
                people.add(strs[0]);
            } else {
                people.remove(strs[0]);
            }
        }
        List<String> result = people.stream().sorted((a, b) -> b.compareTo(a)).collect(Collectors.toList());
        bw.write(String.join("\n", result));
        bw.flush();
        bw.close();
    }
}
