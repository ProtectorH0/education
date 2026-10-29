package laba1;

import java.util.Scanner;

public class Sampo3 {
    static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Ведите день недели");
        String dayName = in.nextLine();

        System.out.println("Введите название месяца");
        String monthName = in.nextLine();

        System.out.println("Ведите номер месяца");
        int day = in.nextInt();

        System.out.printf("%s %s %d \n", dayName, monthName, day);
    }
}
