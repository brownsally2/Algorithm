package cycleSum;

import java.util.Scanner;

public class CycleSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 입력 받는 수
        int a = sc.nextInt();
        // a값 저장, 같은지 비교하기 위해
        int x = a;
        // 사이클 수
        int i = 0;
        while(true) {
            i++;
            a = ((a % 10) * 10) + (((a / 10) + (a % 10)) % 10);
            if (a == x) {
                break;
            }
        }
        System.out.println(i);
    }
}
