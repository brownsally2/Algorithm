package countOfNum;

import java.util.Scanner;

public class countOfNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();

        int ans = A * B * C;
        String strAns = String.valueOf(ans);

        int[] arr = new int[10];
        for(int i = 0; i < 10; i++){
            for(int j = 0; j < strAns.length(); j++) {
                if (i == Integer.parseInt(String.valueOf(strAns.charAt(j)))) {
                    arr[i] += 1;
                }
            }
            System.out.println(arr[i]);
        }
    }
}
