package inflearn.basic;

import java.util.Scanner;

public class ReturnBigNumber {
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int input1 = in.nextInt();
        in.nextLine();
        String input2 = in.nextLine();

        String[] input3 = input2.split(" ");
        int[] arr = new int[input3.length];

        for(int i =0; i<input3.length; i++){
            arr[i] = Integer.parseInt(input3[i]);
        }
        System.out.print(arr[0] + " ");

        for(int i =1; i<arr.length; i++){
            if(arr[i]>arr[i-1]) System.out.print(arr[i] + " ");
        }

    }
}
