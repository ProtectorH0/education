package laba1;

import java.util.Scanner;

public class sampo1 {
    static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Напиши фамилию");
        String sername = in.nextLine();

        System.out.println("Напиши имя");
        String name = in.nextLine();

        System.out.println("Напиши отчество");
        String patronymic = in.nextLine();

        System.out.printf("Привет %s %s %s \n", sername, name, patronymic);
        in.close();
    }
}
