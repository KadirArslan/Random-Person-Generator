/**
* @author Kadir ARSLAN && @kadars_
* @author Semih DEMIRCI && @smh67dmrc
*/

package PAKET;

import java.util.Random;
//Gerekli kutuphaneler eklendi
public class Telefon {
    
    private String randomTelefon() //Rastgele telefon numarasi ureten metod
    {
        Random rnd = new Random();
        
        String telefon;
       
        int secim = rnd.nextInt(3);
        
        switch (secim) {
            case 0:
                telefon = "05";
                telefon += Integer.toString(rnd.nextInt(19) + 30 ) ; 
                break;
            case 1:
                telefon = "05";
                telefon += Integer.toString(rnd.nextInt(5) + 51 )  ;
                break;
            
            default:
                telefon="050";
                telefon += Integer.toString(rnd.nextInt(3) + 5 )  ;
                        
        }
                telefon += Integer.toString(rnd.nextInt(500 - 100) + 100);
                telefon += Integer.toString(rnd.nextInt(50 - 1) + 50);
                telefon += Integer.toString(rnd.nextInt(50 - 1) + 50);
        return telefon;
    }
    
      public String telGetir(){ //Telefon numarasini gonderen metod
        String telefon = randomTelefon();
        return telefon;
    }
}
    
    
    
