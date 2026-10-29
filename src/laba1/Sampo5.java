package laba1;

import java.util.Scanner;
import java.time.Year;

public class Sampo5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Напишите год вашего рождения: ");
        int year = in.nextInt();

        int currentYear = Year.now().getValue();
        int old = currentYear - year;

        System.out.println("Вам " + old + " лет.");
    }
}
