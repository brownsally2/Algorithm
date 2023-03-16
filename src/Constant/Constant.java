package Constant;

import java.util.Scanner;

public class Constant {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();

        int C = (A/100) + (((A% 100) / 10) * 10 ) + ((A%10) *100);
        int D = (B/100) + (((B% 100) / 10) * 10) + ((B%10) *100);

        System.out.print(C > D ? C : D);

    }
}
