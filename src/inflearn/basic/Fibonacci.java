package inflearn.basic;

import java.util.*;
import java.util.stream.*;

public class Fibonacci {
    public static String solution(int input1){
        int[] answer= new int[input1];
        answer[0] = 1;
        answer[1] = 1;
        for(int i = 2; i < input1; i++){
            answer[i] = answer[i-1] + answer[i-2];
        }
        return Arrays.stream(answer)
                        .mapToObj(String::valueOf)
                        .collect(Collectors.joining(" "));
    }

    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int input1 = in.nextInt();
        System.out.println(solution(input1));
    }
}
