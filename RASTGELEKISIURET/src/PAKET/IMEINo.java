/**
* @author Kadir ARSLAN && @kadars_
* @author Semih DEMIRCI && @smh67dmrc
*/

package PAKET;

import java.util.Random;
//Gerekli kutuphaneler eklendi

public class IMEINo {
   
       private String imei(){ //Rastgele IMEI numarasi ureten metod
       Random rand = new Random();
        
        int[] sayi = new int[15];
        int toplam = 0;
        int sonuc;
        for(int i = 0; i < 14; i++)
        {
            sayi[i] = rand.nextInt(8) + 1;
        }
        
        for(int i = 0; i < 14; i++)
        {
            if(i%2 == 0)
            {
                toplam += sayi[i];
            }
            
            else
            {
                int tmp = sayi[i]*2;
                
                if(tmp >= 10)
                {
                    int tmp2 = tmp%10;
                    tmp2 = tmp2 + (tmp/10);
                    toplam += tmp2;
                }
                
                else
                {
                    toplam += tmp;
                }
            } 
        }
        
        sonuc = (100 - toplam)%10;
        
        sayi[14] = sonuc;
        
        String imei="";
        
        for(int i = 0; i < 15; i++)
        {
            imei+=sayi[i];
        }
       
        return imei;
    }
    
    public String imeiGetir(){ //IMEI Degerini donduren metod
    
        String imei = imei();
        return imei;
        
    }
    
    public boolean IMEINoDogrula(String IMEI) { //IMEI numarasini dogrulayan metod
 
            int toplam = 0;
            boolean kontrol = false;
            
            if(IMEI.length() != 15){ //Uzunluk kontrolu yapiliyor.
                return false;
            }
            
            for (int i = IMEI.length() - 1; i >= 0; i--) //IMEI Kural kontrolu yapiliyor.
            {
                    int parse = Integer.parseInt(IMEI.substring(i, i + 1));
                    if (kontrol)
                    {
                            parse *= 2;
                            if (parse > 9)
                            {
                                    parse = (parse % 10) + 1;
                            }
                    }
                    toplam += parse;
                    kontrol = !kontrol;
            }
            return (toplam % 10 == 0); //Boolean deger donduruluyor
    }
}
