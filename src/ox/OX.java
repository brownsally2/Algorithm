package ox;

import java.util.Scanner;

public class OX {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        String[] ans = new String[N];

        for(int i =0; i< N; i++){
            ans[i] = sc.next();

            // 문자열마다 합을 구하기 위해 초기화
            int cnt = 0;
            int sum = 0;

            // 배열에 문자열이 있으므로 문자열 안에 문자를 비교해야하므로
            for(int j = 0; j < ans[i].length(); j++){
                if(ans[i].charAt(j) == 'O'){
                    sum += cnt++ ;
                    System.out.println("sum" + sum);
                    System.out.println(cnt);
                }if(ans[i].charAt(j) == 'X') {
                    cnt = 0;
                }
            }

            System.out.println(sum);
        }
    }
}
