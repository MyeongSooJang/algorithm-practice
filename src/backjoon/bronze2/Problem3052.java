package backjoon.bronze2;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Problem3052 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] result = new int[10];
        for(int i = 0; i <10; i++){
            int input = sc.nextInt();
            result[i] = input % 42;
        }
        solution(result);
    }

    public static void solution(int[] result){
        Set<Integer> unique = new HashSet<Integer>();
        for(int num : result){
            unique.add(num);
        }
        System.out.println(unique.size());
    }
}
