package çift_tek_sayılar;

import java.util.Scanner;

public class Çift_Tek_Sayılar {

    public static void main(String[] args) {

        Scanner girdi = new Scanner(System.in);

        System.out.println("Sayıyı Giriniz...");
        int sayi = girdi.nextInt();

        if (sayi == 0) {
            System.out.println("Girdiğiniz Sayı Sıfır");
        } else if (sayi % 2 == 0) {

            System.out.println("Girdiğiniz Sayı Çifttir");

        } else {
            System.out.println("Girdiğiniz Sayı Tektir");
        }

    }

}
