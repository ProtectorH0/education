package laba1;

import java.util.Scanner;
import java.time.Year;

public class Sampo7 {
    static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Сколько Вам лет?");
        int old = in.nextInt();

        int year = Year.now().getValue() - old;
        System.out.println("Вы родились в " + year + " году");

    }
}
