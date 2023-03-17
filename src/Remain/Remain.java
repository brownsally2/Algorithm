package Remain;

import java.util.Scanner;

public class Remain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[10];
        int cnt = 0;
        boolean bl;
        for(int i =0; i < 10; i++){
            arr[i] = sc.nextInt()%42;
        }
        for(int i = 0; i< 10; i++){
            // 기본값 초기화,
            // 다 같은 경우 9번째 배열은 10번째 배열이 없기 때문에 false상태 -> cnt++;
            bl = false;
            for(int j = i+1; j <10; j++) {
                // 같으면 break
                if (arr[i] == arr[j]) {
                   bl = true;
                   break;
                }
                // 서로 다르면 더 해줌
            }if(!bl) {
                cnt++;
                System.out.println(cnt);
            }
        }
        System.out.println(cnt);
    }
}
