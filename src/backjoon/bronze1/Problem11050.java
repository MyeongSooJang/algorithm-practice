package backjoon.bronze1;

import java.util.*;

public class Problem11050 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int input1 = sc.nextInt();
        int input2= sc.nextInt();
        solution(input1, input2);
    }
    public static void solution(int input1, int input2){
        int result1 = 1;
        for(int i = input1; i > 1; i--){
            result1 = result1 * i;
        }
        int result2 = 1;
        for(int i = input2; i > 1; i--){
            result2 = result2 * i;
        }
        int result3 = 1;
        for(int i = input1 - input2; i > 1; i--){
            result3 = result3 * i;
        }
        System.out.println(result1/(result2*result3));
    }
}
