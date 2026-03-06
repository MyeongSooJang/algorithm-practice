package backjoon.gold5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Problem1931 {
    static int n;
    static List<int[]> times = new ArrayList<>();
    public static void main(String[] args)throws IOException {
        BufferedReader br =
                new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        for(int i = 0; i < n; i++){
            String[] nums = br.readLine().split(" ");
            int start = Integer.parseInt(nums[0]);
            int end = Integer.parseInt(nums[1]);
            times.add(new int[]{start,end});
        }
        times.sort((x1,x2)->{
            if(x1[1]!= x2[1]) return x1[1] - x2[1];
            return x1[0] - x2[0];
        });
        int last = times.get(0)[1];
        int count = 1;
        for(int i = 1; i < n; i++) {
            int start = times.get(i)[0];
            int end = times.get(i)[1];
            if(start >= last) {
                count++;
                last = end;
            }
        }

        System.out.println(count);
    }
}
