package backjoon.sliver1;

import java.io.*;

public class Problem1629 {
    public static void main(String[] args)throws IOException{
        BufferedReader br =
                new BufferedReader(new InputStreamReader(System.in));
        String[] conditions = br.readLine().split(" ");
        int a = Integer.parseInt(conditions[0]);
        int b = Integer.parseInt(conditions[1]);
        int c = Integer.parseInt(conditions[2]);

        System.out.println(solution(a,b,c));


    }
    public static long solution (int a, int b, int c){
        if(b == 0) return 1 % c;

        long half = solution(a, b/2, c);

        long result = (half * half) % c;

        if(b % 2 == 1){
            result = (result * a) % c;
        }
        return result;

    }

}
