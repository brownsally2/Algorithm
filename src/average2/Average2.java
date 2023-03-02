package average2;

import java.util.Arrays;
import java.util.Scanner;

public class Average2 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        // 과목 갯수만큼 배열 생성
        double[] arr = new double[in.nextInt()];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = in.nextDouble();
        }
        in.close();

        double sum = 0;
        // 배열의 모든 요소를 오름차순으로 정렬
        Arrays.sort(arr);

        for(double i : arr){
            // 최댓값이 배열 중 제일 오른쪽에 위치함
            sum += ((i / arr[arr.length-1]) * 100);
        }
        System.out.print(sum / arr.length);
    }
}
