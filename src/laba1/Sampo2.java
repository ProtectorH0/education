package laba1;

import java.util.Scanner;

public class Sampo2 {
    static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Ведите имя");
        String name = in.nextLine();

        System.out.println("Ведите возраст");
        int age = in.nextInt();

        System.out.printf("Имя %s Возраст: %d \n", name, age);
        in.close();
    }
}
