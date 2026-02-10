package backjoon.sliver3;

import java.util.Scanner;

public class Problem11726 {
    public static void main(String[] args)  {

        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
        if(n==1){
            System.out.println(1);
            return;
        }
        if(n==2){
            System.out.println(2);
            return;
        }

        long[] intArr=new long[n+1];

        intArr[1] = 1L;
        intArr[2] = 2L;
        for(int i=3;i<=n;i++){
            intArr[i] = (intArr[i-1]+intArr[i-2]) % 10007;
        }
        System.out.println(intArr[n]);
    }
}
