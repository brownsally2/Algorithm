package ACMHotel;

import java.util.Scanner;

public class ACMHotel {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();
        for(int i = 0; i < count; i++){
            int H = sc.nextInt();
            int W = sc.nextInt();
            int N = sc.nextInt();

            // 나머지가 없으면 층수는 H
            // 호수는 1이여야 함
            if(N % H == 0){
                System.out.println((H * 100) + N/H);
            }else{
                // H는 몫이 0일 경우 호수는 1부터 시작하기 때문
                System.out.println(((N % H) * 100) + (N/H + 1));
            }
        }
    }
}
