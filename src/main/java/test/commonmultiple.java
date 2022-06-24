package test;

import java.util.Scanner;

public class commonmultiple {
    public static void main(String[] args) {
        System.out.println("輸入兩數：");
         Scanner scanner = new Scanner(System.in);
         int x = scanner.nextInt();
         int y = scanner.nextInt();
         int tmp = 0, in1 = x, in2 = y;
         while(x % y != 0){
         tmp = y;
         y = x % y;
         x = tmp;
         }
         System.out.println(in1 * in2 / y);
    }

}
