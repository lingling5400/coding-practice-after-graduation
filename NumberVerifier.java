package test;

import java.util.Scanner;

public class test {

    public static String check(Scanner sc, String numbers) {
        while (true) {
            if (numbers.length() != 9) {            
                System.out.println("要輸入九碼!!");
            } else {
                boolean allDigits = true;
                for (int i = 0; i < numbers.length(); i++) {
                    char ch = numbers.charAt(i);
                    if (ch < '0' || ch > '9') {
                        allDigits = false;
                        break;
                    }
                }
                if (allDigits) {
                    return numbers; // 合法輸入
                } else {
                    System.out.println("只能輸入數字!!");
                }
            }
            System.out.print("請重新輸入: ");
            numbers = sc.nextLine();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("請輸入九位數字: ");
        String input = sc.nextLine();

        String validInput = check(sc, input);
        System.out.println("合法輸入: " + validInput);

        sc.close();
    }
}
