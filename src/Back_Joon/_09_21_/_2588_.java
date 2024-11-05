package Back_Joon._09_21_;

import java.util.Scanner;

public class _2588_ {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int first = scan.nextInt();
        int second = scan.nextInt();

        System.out.println(first * (second % 10));
        System.out.println(first * ((second / 10) % 10));
        System.out.println(first * (second / 100));
        System.out.println(first * second);
    }
}
