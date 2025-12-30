package backjoon.bronze2;

import java.util.Scanner;

public class Problem2292 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        solution(sc.nextInt());
    }
    public static void solution(int input){
        int num = 1;
        int range = 1;
        int jump = 6;
        while(input >  range){
            num++;
            range = range + jump;
            jump = jump + 6;
        }
        System.out.println(num);
    }
}
