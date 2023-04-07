package findDecimal;

import java.util.Scanner;

public class FindDecimal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 몇 개 받을 것인가
        int N = sc.nextInt();
        int cnt = 0;
        // N의 갯수만큼 for문 반복
        for(int i = 0; i < N; i++){
            int num = sc.nextInt();
            // 1은 소수가 아니므로 뺌
            for(int p = 2; p <= num; p++){
                // 자기 자신은 무조건 나눠지므로 cnt 증가함
                if(p == num) {
                    cnt++;
                    // p가 증가하면서 다른 수가 나머지가 있으면 소수가 아님!
                }if(num % p == 0){
                    break;
                }
            }
        }
        System.out.println(cnt);
    }
}
