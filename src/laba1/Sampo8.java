package laba1;

import java.util.Scanner;

public class Sampo8 {
    static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Напиши первое число");
        int one = in.nextInt();

        System.out.println("Напиши первое число");
        int two = in.nextInt();

        int sum = one + two;
        System.out.println("Их сумма " + sum);
    }
}
