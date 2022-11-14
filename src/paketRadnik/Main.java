package paketRadnik;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        RadnikPoDanu rd = new RadnikPoDanu();
        System.out.println("unesi ime radnika po danu");
        rd.ime = sc.next();

        System.out.println("unesi prezime radnika po danu");
        rd.prezime = sc.next();


        System.out.println("unesi jmbg radnika po danu");
        rd.jmbg = sc.nextInt();


        System.out.println("unesi ziro racun radnika po danu");
        rd.ziroRacun = sc.next();


        System.out.println("unesi platu");
        rd.plata = sc.nextDouble();


        System.out.println("unesi broj dana koliko radnik radi");
        rd.brojDana = sc.nextInt();


        System.out.println(rd);
        rd.isplatiPlatu();

    }
}
