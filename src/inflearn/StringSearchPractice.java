package inflearn;

import java.util.*;

public class StringSearchPractice {
    public int solution(String word, char c){
        int answer = 0;
        String input1 = word.toUpperCase();
        char input2 = Character.toUpperCase(c);

        for(int i = 0; i < input1.length(); i++){
            if(input1.charAt(i) == input2){
                answer++;
            }
        }
        return answer;
    }

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        StringSearchPractice main = new StringSearchPractice();
        String word = in.next();
        char c = in.next().charAt(0);
        System.out.println(main.solution(word, c));
    }

}
