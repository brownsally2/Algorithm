package maximum;

import java.util.Scanner;

public class Maximum {
    public static void main(String[] args) {
       int[] arr = new int[10];
       Scanner sc = new Scanner(System.in);
       arr[0] = 0;
       for(int i = 1; i < 10; i++){
           arr[i] = sc.nextInt();
           if(arr[0] < arr[i]){
               arr[0] = arr[i];
           }
       }
       System.out.println(arr[0]);
       for(int i = 1; i< 10; i++){
           if(arr[0] == arr[i]){
               System.out.println(i);
           }
       }
    }
}
