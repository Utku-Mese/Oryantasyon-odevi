package proje;

import java.util.Scanner;

public class Carpım_Programı {

    public static void main(String[] args) {

        Scanner girdi = new Scanner(System.in);

        System.out.println("Birinci sayiyi giriniz... ");
        int sayi1 = girdi.nextInt();

        System.out.println("Ikinci sayiyi giriniz... ");
        int sayi2 = girdi.nextInt();

        int sonuc = sayi1 * sayi2;

        System.out.println("Sayilar Carpimi : " + sonuc);
    }

}
