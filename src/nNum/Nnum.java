package nNum;

import java.util.Scanner;

public class Nnum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int cnt = A;
        for(int i = 1; i <= cnt; i++){
            System.out.println(A);
            A--;
        }
    }
}
