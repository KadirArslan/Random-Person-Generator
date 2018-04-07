/**
* @author Kadir ARSLAN && @kadars_
* @author Semih DEMIRCI && @smh67dmrc
*/

package PAKET;

import java.util.Random;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;   //Gerekli Kutuphaneler Eklendi

public class RastgeleKisi {
   
    File dosyaYolu = new File("random_isimler.txt"); //Isimleri iceren dosyaya erisildi
    
    String satir;
    String isim;
    
    private String isimBul(int rastgeleDeger) throws FileNotFoundException, IOException{ //Parametre olarak random bir satir sayisi alan fonksiyon
        int i = 0;
        
        BufferedReader oku = new BufferedReader(new FileReader(dosyaYolu)); 
        
        while((satir = oku.readLine()) != null){ //Dosya yolu verilen txt dosyası okunmaya baslandi
            
            if(i == rastgeleDeger)  //Rastgele isimlere erisim kontrolu
            
                isim = oku.readLine(); //Random olarak gelen deger isim degiskenine atandi
            
            i++;
        }
        oku.close(); //Dosya kapatildi
        return isim; //Isim degiskeni gonderildi
    } 
   
    public String isimGetir() throws IOException{ //Isim getiren public fonksiyon
        Random rnd = new Random();
        int satir = rnd.nextInt(2999); //Parametre olarak random deger gonderiliyor.
        
        String isimYolla = isimBul(satir);
        return isimYolla;
    }
}
  
    
    
    
    
    
    
   

