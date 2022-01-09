package ortalama;

import java.util.Scanner;

public class Ortalama {

    public static void main(String[] args) {

        Scanner girdi = new Scanner(System.in);
        
        System.out.println("LÜTFEN VİZE NOTUNU GİRİNİZ :");
        double vize = girdi.nextInt();
        
        System.out.println("LÜTFEN FİNAL NOTUNU GİRİNİZ :");
        double finall = girdi.nextInt();
        
        double ort = (vize*0.4) + (finall*0.6);
        
        System.out.println(ort);
        
        if (vize<100 && finall<100 && vize>0 && finall>0) {
            
        if (ort >= 50) {
            System.out.println("ÖĞRENCİ DERSİ GEÇTİ!");
        }else{
            System.out.println("ÖĞRENCİ DERSİ GEÇEMEDİ!");
        }
        }else{
            System.out.println("100'DEN YÜKSEK VE YA 0'DAN KÜÇÜK NOT GİRİLEMEZ!");
        }
        
        
    }

}
