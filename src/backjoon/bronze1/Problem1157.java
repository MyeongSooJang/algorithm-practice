package backjoon.bronze1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Problem1157 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] intArr = new int[100];
        String input = br.readLine().toUpperCase();
        char[] chars = input.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            intArr[chars[i]]++;
        }
        int max = Arrays.stream(intArr).max().getAsInt();

        char a = 0;
        int count = 0;
        for (int i = 0; i < intArr.length; i++) {
            if (intArr[i] == max) {
                a = (char) i;
                count++;
            }
        }

        if (count == 1){
            System.out.println(a);
        } else{
            System.out.println("?");
        };
    }
}
