/**
* @author Kadir ARSLAN && @kadars_
* @author Semih DEMIRCI && @smh67dmrc
*/

package PAKET;

import java.util.Random;
//Gerekli kutuphaneler eklendi
public class Yas {
     
    private int randomYasUret(){ // 0 - 100 arasında random yas degeri donduren metod 
        int sayi;
        Random rnd = new Random();
        sayi = rnd.nextInt(98)+1;
        return sayi;
    }
    
    public int  yasGetir(){ // Yas degerini donduren metod
        
        int yas = randomYasUret();
        return yas;
    
    }
}
