package laba1;

import java.util.Scanner;

public class Sampo4 {
    static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Введите любой месяц");
        String mounth = in.nextLine();

        System.out.println("Сколько в этом месяце дней");
        int day = in.nextInt();

        System.out.printf("В мксяце %s содержит %d дней", mounth, day);
    }
}
