package net_maaş;

import java.util.Scanner;

public class Net_Maaş {

    public static void main(String[] args) {

        Scanner girdi = new Scanner(System.in);

        System.out.println("Sicil numarasını giriniz:");
        int sicil = girdi.nextInt();

        System.out.println("çalışma saatini giriniz:");
        double saat = girdi.nextDouble();

        System.out.println("saatlik ücreti giriniz:");
        int ucret = girdi.nextInt();

        double brut = ucret * saat;

        double prim = brut * 0.14;

        double vergi = brut * 0.15;

        double net = brut - (vergi + prim);

        System.out.println(sicil + " sicil nolu kişinin maaşı:");
        System.out.println("brüt = " + brut);
        System.out.println("net = " + net);
    }

}
