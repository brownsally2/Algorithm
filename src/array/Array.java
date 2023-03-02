package array;

import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] b = new int[N];
        int cnt = 0;

        for(int i = 0; i < N; i++){
            b[i] = sc.nextInt();
        }

        int v = sc.nextInt();
        for(int j : b){
            if(b[j] == v){
                cnt++;
            }
        }
        System.out.println(cnt);
    }
}
