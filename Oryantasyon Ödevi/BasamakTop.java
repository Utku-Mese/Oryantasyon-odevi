
package basamaktoplamı;

import java.util.Scanner;

public class BasamakTop {

    
    public static void main(String[] args) {
      
        Scanner klavye = new Scanner(System.in);
        
        System.out.println("LÜTFEN SAYIYI GİRİNİZ:");
        int sayi = klavye.nextInt();
        int top =0;
        while(sayi != 0){
        
            top = top+(sayi%10);
            
            sayi = sayi/10; 
        
        }
        System.out.println("RAKAMLAR TOPLAMI:" + top);
        
        
    }
    
}
