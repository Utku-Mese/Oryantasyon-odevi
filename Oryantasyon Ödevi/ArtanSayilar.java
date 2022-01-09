
package artansayilar;

import java.util.Scanner;


public class ArtanSayilar {

    public static void main(String[] args) {
        
        Scanner girdi = new Scanner(System.in);
        
        System.out.println("LÜTFEN BAŞLANGIÇ SAYISINI GİRİNİZ :");
        int baslangıc = girdi.nextInt();
        
        System.out.println("LÜTFEN ARALIK GİRİNİZ :");
        int aralik = girdi.nextInt();
        
        System.out.println("LÜTFEN ADET GİRİNİZ :");
        int adet = girdi.nextInt();
        
        for (int i=1; i<=adet; i++) {
            
            System.out.print(baslangıc + ",");
            
            baslangıc = baslangıc + aralik;
            
            
        }
        
    }
    
}
