/**
* @author Kadir ARSLAN && @kadars_
* @author Semih DEMIRCI && @smh67dmrc
*/

package PAKET;

import java.io.IOException;
//Gerekli kutuphaneler eklendi

public class Kisi {
    public String isim;
    public String telNo;
    public int yas;
    public String imei;
    public String kimlikNo;
    //Gerekli kutuphaneler eklendi, kurucu metod olusturuldu
     public Kisi() throws IOException {
       
        RastgeleKisi isimUret = new RastgeleKisi();
        isim = isimUret.isimGetir();
       
        Telefon telNoUret = new Telefon();
        telNo = telNoUret.telGetir();
        
        Yas yasUret = new Yas();
        yas = yasUret.yasGetir();
        
        IMEINo IMEIUret = new IMEINo();
        imei = IMEIUret.imeiGetir();
        
        KimlikNo kimlikNoUret = new KimlikNo();
        kimlikNo = kimlikNoUret.kimlikNoGetir();
       
        // Kurucu metod icerisinde T.C. Kimlik No, IMEI Numarasi, Telefon Numarasi, Yas ve Isim Soyisim degerleri rastgele uretildi
    }
}
