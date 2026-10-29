package laba1;

import java.util.Scanner;

public class Sampo9 {
    static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("ВВедите любое число");
        int number = in.nextInt();

        System.out.println((number - 1) + " " + number + " " + (number + 1) + " " + ((number - 1) + number) * ((number - 1) + number));
    }
}
