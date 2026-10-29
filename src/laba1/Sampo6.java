package laba1;

import java.util.Scanner;

public class Sampo6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Как вас завут: ");
        String name = in.nextLine();

        int old = Sampo56.calculateAge();

        System.out.print(name + ", вам " + old + " лет");
    }
}
