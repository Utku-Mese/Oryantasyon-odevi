package hesap_makinası;

import java.util.Scanner;

public class Hesap_Makinası {

    public static void main(String[] args) {

        Scanner girdi = new Scanner(System.in);

        System.out.println("1.Sayıyı giriniz:");
        double sayi1 = girdi.nextDouble();

        System.out.println("2.Sayıyı giriniz:");
        double sayi2 = girdi.nextDouble();

        System.out.println("1: Toplama");
        System.out.println("2: Çıkartma");
        System.out.println("3: Çarpma");
        System.out.println("4: Bölme");
        System.out.println("5: Mod alma");

        System.out.println("Yapmak istediğiniz işlemi seçiniz:");
        int islem = girdi.nextInt();

        switch (islem) {
            case 1 -> System.out.println("Sonuç= " + (sayi1 + sayi2));
            case 2 -> System.out.println("Sonuç= " + (sayi1 - sayi2));
            case 3 -> System.out.println("Sonuç= " + (sayi1 * sayi2));
            case 4 -> System.out.println("Sonuç= " + (sayi1 / sayi2));
            case 5 -> System.out.println("Sonuç= " + (sayi1 % sayi2));     
            default -> System.out.println("Yanlış bir değer girdiniz.");
        }

    }

}
