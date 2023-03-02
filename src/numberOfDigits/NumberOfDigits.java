package numberOfDigits;

import java.util.Scanner;

public class NumberOfDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();

        int ans = A*B*C;
        // 길이를 알기 위해 형 변환
        String strAns = Integer.toString(ans);

        // 0부터 9까지 수가 몇 개인지 세기 위함, 고정되어 있고 strAns에서 몇개인지 알아야 함
        for(int i = 0; i< 10; i++){
            int cnt = 0;
            // 자리마다 확인해봄
            for(int j = 0; j < strAns.length(); j++){
                // 문자열이여서 숫자로 변환하기 위해 아스키코드 값만큼을 빼줌
                if ((strAns.charAt(j) -'0') == i){
                    cnt++;
                }
            }
            System.out.println(cnt);
        }
    }
}
