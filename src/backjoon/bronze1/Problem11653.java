package backjoon.bronze1;

import java.util.Scanner;

public class Problem11653 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        solution(input);
    }

    public static void solution(int input) {
        if(input == 1){
            return;
        }
        for(int i = 2; i <= input; i++){
            while(input%i==0){
                input/=i;
                System.out.println(i);
            }
        }
    }
}
