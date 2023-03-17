package Constant;

import java.util.Scanner;

public class Constant2 {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();

        int C = Integer.parseInt(new StringBuilder().append(A).reverse().toString());
        int D = Integer.parseInt(new StringBuilder().append(B).reverse().toString());
        // 큰 값을 리턴
        System.out.println(Math.max(C,D));
    }
}
