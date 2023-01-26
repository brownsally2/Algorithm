package repetition;

import java.util.Scanner;

public class repetition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        for(int i= 0; i < T; i++){
            int R = sc.nextInt();
            String S = sc.next();
            // 문자열을 순회
            for(int j =0 ; j < S.length(); j++){
                // R 만큼 반복 출력
                for(int k = 0; k < R; k++){
                    System.out.print(S.charAt(j));
                }
            }
            System.out.println();
        }
    }
}
