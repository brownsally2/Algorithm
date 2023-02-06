package Plus;

import java.util.Scanner;

public class Plus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] arr = new int[N];
        int sum = 0;
        String str = sc.next();
        for(int i = 0; i< N; i++){
                // str.chatAt(i)를 숫자배열에 넣으면 아스키코드 값으로 변환됨
                arr[i] = str.charAt(i) - '0';
                sum += arr[i];
            }
        System.out.println(sum);
    }
}
