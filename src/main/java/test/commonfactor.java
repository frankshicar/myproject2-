package test;

import java.util.Scanner;

public class commonfactor {
    public static void main(String[] args) {
        System.out.println("輸入兩數：");
         Scanner scanner = new Scanner(System.in);
         int x = scanner.nextInt();
         int y = scanner.nextInt();
         int tmp = 0;
         while(x % y != 0){
         tmp = y;
         y = x % y;
         x = tmp;
         }
         System.out.println(y);
    }
}
