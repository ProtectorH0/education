package laba1;

import java.util.Scanner;

public class Sampo10 {
    static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Введите первое число");
        int numberOne = in.nextInt();

        System.out.println("Введите первое число");
        int numberTwo = in.nextInt();

        System.out.println("Сумма чисел " + (numberOne + numberTwo));
        System.out.println("Разность чисел " + (numberOne - numberTwo));

    }
}
