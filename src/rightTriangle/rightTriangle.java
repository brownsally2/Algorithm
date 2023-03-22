package rightTriangle;

import java.util.Scanner;

public class rightTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            // 입력 받기
            int A = sc.nextInt();
            int B = sc.nextInt();
            int C = sc.nextInt();
            // 모두 0이 들어오면 입력 종료
            if (A == 0 && B == 0 && C == 0) {
                break;
            }
            // A가 가장 큰 변일 때
            if (Math.pow(A,2) == Math.pow(B,2) + Math.pow(C,2)) {
                System.out.println("right");
            }
            // B가 가장 큰 변일 때
            if (Math.pow(B,2) == Math.pow(A,2) + Math.pow(C,2)) {
                System.out.println("right");
            }// C가 가장 큰 변일 때
            if (Math.pow(C,2) == Math.pow(A,2) + Math.pow(B,2)) {
                System.out.println("right");
            } else {
                System.out.println("wrong");
            }
        }
    }
}
