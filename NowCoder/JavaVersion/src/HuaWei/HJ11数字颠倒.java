package HuaWei;

import java.util.Scanner;

public class HJ11数字颠倒 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        System.out.println(new StringBuilder(input).reverse());
    }
}
