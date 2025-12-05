package inflearn.basic;

import java.util.Scanner;

public class InjectNumber {
        public static int solution(String input) {
            char[] c = input.toCharArray();
            int answer= 0;
            for(int i =0; i<c.length; i++){
                if(48<= c[i] && c[i]<=57){
                    answer = answer * 10 + (c[i]-48);
                }
            }
            return answer;
        }

        public static void main(String[] args){
            Scanner in=new Scanner(System.in);
            String input2 = in.nextLine();
            int result = InjectNumber.solution(input2);
            System.out.println(result);
        }
}
