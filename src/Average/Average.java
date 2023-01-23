package Average;

import java.util.Scanner;

public class Average {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        float M = 0;
        float[] score = new float[N];
        float avg = 0;
        for(int i = 0; i < N; i++) {
            score[i] = sc.nextInt();
            if (M < score[i]) {
                M = score[i];
            }
        }
        for(int j = 0; j < N; j++){
            avg += (score[j]/M*100)/N;
        }
        System.out.println(avg);
    }
}
