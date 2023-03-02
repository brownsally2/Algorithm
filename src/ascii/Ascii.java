package ascii;

import java.util.Scanner;

public class Ascii {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String N = sc.next();
        int code = N.charAt(0);

        System.out.println(code);
    }
}
