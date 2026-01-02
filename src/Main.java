import java.util.*;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();
        int[] inputs = new int[count];
        for(int i = 0; i< count; i++){
            inputs[i] = sc.nextInt();
        }
        solution(inputs);
    }
    public static void solution(int[] inputs){
        Arrays.stream(inputs).sorted().forEach(System.out::println);
    }
}