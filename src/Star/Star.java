package Star;

import java.util.Scanner;

public class Star{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        // 줄에 해당
        for(int i = 1; i <= N; i++){
            //공백 입력
            for(int j = N; j > i; j--){
                System.out.print(" ");
                // 별 찍는 갯수
            }for(int j = 0; j < i ; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
