package numberOfWords;

import java.util.Scanner;

public class NumberOfWords {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        str = str.trim();
        String[] numOfWords = str.split(" ");
        if(numOfWords[0].equals("")){
            System.out.println(0);
        }else {
            System.out.println(numOfWords.length);
        }
    }
}
