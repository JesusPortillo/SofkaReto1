package app;

import java.util.Scanner;

import static java.lang.System.*;

public class HolaMundo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String userName = "";
        long phoneNumber = 0;
        int age = 0;
        System.out.println("Nombre de usuario: ");
        userName = sc.nextLine();
        System.out.println("Celular: ");
        phoneNumber = sc.nextLong();
        System.out.println("Edad: ");
        age = sc.nextInt();
        System.out.println("Bienvenido señor "+userName+", es un placer para nosotros contar con una persona de "+age+" años." +
                "\n" +
                "Próximamente nos comunicaremos con usted al numero "+phoneNumber+".");

    }
}
