package scale;

import java.util.Scanner;

public class Scale {
    public static void main(String[] args) {
        int[] A = new int[8];
        Scanner sc = new Scanner(System.in);

        for(int i = 0; i < 8; i++){
            A[i] = sc.nextInt();
        }
        String ans = "";
        for(int i = 0; i<A.length-1; i++){
            // 1 ,2 .. , 8 : 1씩 증가 즉, 해당 i번째 배열은 다음 배열 수 -1 같음
            if(A[i] == A[i+1] - 1 ){
                ans = "ascending";
            } else if (A[i] == A[i+1] + 1) {
                ans = "descending";
            }else {
                    ans ="mixed";
                    break;
                }
        }
        System.out.println(ans);
    }
}
