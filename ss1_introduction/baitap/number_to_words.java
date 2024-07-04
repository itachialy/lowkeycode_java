
package ss1_introduction.baitap;

import java.util.Scanner;

public class number_to_words {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số cần đọc :");
        int num = Integer.parseInt(sc.nextLine());
        System.out.println(readOne(num));
        System.out.println(readTwo(num));
    }

    public static String readOne(int num) {
        switch (num) {
            case 0 :
                return "zero";
            case 1 :
                return "one";
            case 2 :
                return "two";
            case 3 :
                return "three";
            case 4 :
                return "four";
            case 5 :
                return "five";
            case 6 :
                return "six";
            case 7 :
                return "seven";
            case 8 :
                return "eight";
            case 9 :
                return "nine";
            default :
                return "out of ability";
        }
    }
    public static String readTwo (int num) {
        switch (num) {
            case 10 :
                return "ten";
            case 11 :
                return "eleven";
            case 12 :
                return "twelve";
            case 13 :
                return "thirteen";
            case 14 :
                return "fourteen";
            case 15 :
                return "fifteen";
            case 16 :
                return "sixteen";
            case 17 :
                return "seventeen";
            case 18 :
                return "eighteen";
            case 19 :
                return "nineteen";
            default :
                return "out of ability";
        }
    }
}
