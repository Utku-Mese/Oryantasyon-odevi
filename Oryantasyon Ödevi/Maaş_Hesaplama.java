package maaş_hesaplama;

import java.util.Scanner;

public class Maaş_Hesaplama {

    public static void main(String[] args) {

        Scanner girdi = new Scanner(System.in);

        System.out.println("Lütfen sicil numaranızı giriniz:");
        int sicil = girdi.nextInt();

        System.out.println("Lütfen saatlik ücreti giriniz:");
        int ucret = girdi.nextInt();

        System.out.println("Lütfen çalışma saatinizi giriniz:");
        double saat = girdi.nextDouble();

        double maas = ucret * saat;

        System.out.println(sicil + " sicil nolu çalışanın maaşı:" + maas);

    }

}
