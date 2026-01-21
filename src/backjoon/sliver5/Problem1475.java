package backjoon.sliver5;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Problem1475 {
    public static void main(String[] args) throws IOException {
        BufferedReader br =
                new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw =
                new BufferedWriter(new OutputStreamWriter(System.out));
        String n = br.readLine();
        int[] nums = new int[9];
        for(int i = 0; i < n.length(); i++){
            switch(n.charAt(i)){
                case '0': nums[0]++;break;
                case '1': nums[1]++;break;
                case '2': nums[2]++;break;
                case '3': nums[3]++;break;
                case '4': nums[4]++;break;
                case '5': nums[5]++;break;
                case '6': nums[6]++;break;
                case '7': nums[7]++;break;
                case '8': nums[8]++;break;
                case '9': nums[6]++;break;
            }
        }
        if(nums[6] % 2 ==0 ){
            nums[6] = nums[6] / 2;
        } else{
            nums[6] = nums[6] / 2 + 1;
        }
        int max =0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] > max){
                max = nums[i];
            }
        }
        bw.write(String.valueOf(max));
        bw.flush();
        bw.close();
    }
}
