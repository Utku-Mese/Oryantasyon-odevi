package yakılan_kalori;

import java.util.Scanner;

public class Yakılan_Kalori {

    public static void main(String[] args) {

        Scanner girdi = new Scanner(System.in);

        System.out.println("Cinsiyetiniz ERKEK ise '1' KADIN ise '2' Değerlerini Giriniz...");
        int cinsiyet = girdi.nextInt();

        int adim;
        int sonuc;

        if (cinsiyet == 1) {
            System.out.println("Attığınız Adım Sayısını Giriniz");
            adim = girdi.nextInt();
            sonuc = (adim * 45) / 500;
            System.out.println("Yakılan Kalori:" + sonuc);

        } else if (cinsiyet == 2){
            System.out.println("Attığınız Adım Sayısını Giriniz");
            adim = girdi.nextInt();
            sonuc = (adim * 30) / 500;
            System.out.println("Yakılan Kalori:" + sonuc);
        }

        else {
            System.out.println("Geçersiz Değer Girdiniz");
        }
    }

}
