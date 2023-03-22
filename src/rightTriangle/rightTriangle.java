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
            // 가장 긴 변을 구함
            int maxlength = Math.max(Math.max(A, B), C);
            // 모두 0이 들어오면 입력 종료
            if (A == 0 && B == 0 && C == 0) {
                break;
            }
            // A가 가장 큰 변일 때
            if (maxlength == A) {
                if (maxlength * maxlength == B * B + C * C) {
                    System.out.println("right");
                }else {
                    System.out.println("wrong");
                }
            }
            // B가 가장 큰 변일 때
            if (maxlength == B) {
                if (maxlength * maxlength == A * A + C * C) {
                    System.out.println("right");
                }else {
                    System.out.println("wrong");
                }
            }
            // C가 가장 큰 변일 때
            if (maxlength == C) {
                if (maxlength * maxlength == A * A + B * B) {
                    System.out.println("right");
                }else {
                    System.out.println("wrong");
                }
            }
        }
    }
}
