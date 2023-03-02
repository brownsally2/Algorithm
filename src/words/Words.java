package words;

import java.util.Scanner;

public class Words {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[26]; // 영문자의 개수는 26개임
        String s = sc.next();

        for(int i = 0; i < s.length(); i++){
            if('A' <= s.charAt(i) && s.charAt(i) <= 'Z'){
                arr[s.charAt(i) - 'A']++;
            }else{
                arr[s.charAt(i) - 'a']++;
            }
        }
        
        int max =0;
        char answer = '?';
        for(int i = 0; i < arr.length; i++){
            if(max < arr[i]){
                max = arr[i];
                answer = (char)(i+'A');
            } else if (max == arr[i]) {
                answer = '?';
            }
        }
        System.out.println(answer);
    }
}
