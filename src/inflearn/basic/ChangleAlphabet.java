package inflearn.basic;

import java.util.Scanner;

public class ChangleAlphabet {

    public String solution(String word){
        StringBuilder answer = new StringBuilder();
        for(char c : word.toCharArray()){
            if(Character.isLowerCase(c)){
                answer.append(Character.toUpperCase(c));
            } else {
                answer.append(Character.toLowerCase(c));
            }
        }

        return answer.toString();
    }

    public static void main(String[] args) {
        ChangleAlphabet main = new ChangleAlphabet();
        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        System.out.println(main.solution(input));
        sc.close();
    }
}
