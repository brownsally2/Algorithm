package findAlp;

import java.util.Scanner;

public class FindAlp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word = sc.next();
        int[] arr = new int[26];
        // 해당 값이 없을 경우 -1을 넣어줘야 하므로
        for (int j = 0; j < arr.length; j++){
            arr[j] = -1;
        }
        for(int i = 0; i < word.length(); i++){
            char ch = word.charAt(i);
            // -1인 상태인 경우 처음 값을 넣는 것이기 때문에 중복값 판별
            if(arr[ch - 'a'] == -1){
                // a만큼 빼면 알파벳이 몇번째에 있는지 구하고 i는 단어의 몇번째 인지 기록
                arr[ch - 'a'] = i;
            }
        }
        for(int var : arr){
            System.out.print(var + " ");
        }
    }
}
