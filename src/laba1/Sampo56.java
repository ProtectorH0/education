package laba1;

import java.util.Scanner;
import java.time.Year;

public class Sampo56 {
    public static int calculateAge() {
        Scanner in = new Scanner(System.in);
        System.out.print("Напишите год вашего рождения: ");
        int year = in.nextInt();

        int currentYear = Year.now().getValue();
        int old = currentYear - year;

        return old;
    }
}
