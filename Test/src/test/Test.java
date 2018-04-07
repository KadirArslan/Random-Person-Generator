/**
* @author Kadir ARSLAN && @kadars_
* @author Semih DEMIRCI && @smh67dmrc
*/

package test;

import PAKET.*;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Test {

    
    public static void main(String[] args) throws IOException {
        
        while(true){
            System.out.println("1- Rastgele Kisi Uret");
            System.out.println("2- Uretilmis Dosya Kontrol Et");
            System.out.println("3- Cikis");
            System.out.print("Seciminiz :");
            Scanner secim = new Scanner(System.in);
               
            switch (secim.nextInt()){
            
                case 1: //1.menu secimi
                    
                    File dosya = new File("Kisiler.txt"); //Kisiler.txt dosyasinin oluşturulmasi
                    FileWriter yazici = new FileWriter(dosya);
                    BufferedWriter yaz = new BufferedWriter(yazici);
                    
                    System.out.print("Uretilecek Kisi Sayisini Giriniz:");
                    int adet = (new Scanner(System.in)).nextInt();
                    
                    for(int i = 0; i<adet;i++){ // Kisiler.txt icine satir satir kayit isleminin yapilmasi
                        Kisi deneme = new Kisi();
                        yaz.write(deneme.kimlikNo + " " + deneme.isim + " " + deneme.yas + " " + deneme.telNo + " (" + deneme.imei + ")" +"\n");
                    }
                    System.out.println(adet + " adet Kisi Kisiler.txt Dosyasina Basarili Sekilde Yazildi"+"\n");
                    
                    yaz.close();
                    break;
                    
                case 2: //2.menu secimi
 
                    String satir;
                    String tc;
                    int dogrutc=0;
                    int tumu = 0;
                    int dogruimei=0;
                    BufferedReader oku = new BufferedReader(new FileReader("Kisiler.txt"));
                    KimlikNo tcx = new KimlikNo();
                    IMEINo imeix = new IMEINo();
                    
                    while((satir = oku.readLine()) != null){ //Kisiler.txt icindekileri satir satir okuyup dogrulama yapan dongu yapisi
                       
                        tc = satir.substring(0,11);
                        
                        if(tcx.KimlikNoDogrula(tc))
                            dogrutc++;
                        
                        int ilk,son=0;
                        
                        ilk = satir.indexOf("(");
                        son = satir.indexOf(")");
                        String saltimei = satir.substring(ilk+1,son);
                        
                        if(imeix.IMEINoDogrula(saltimei))
                            dogruimei++;
                        
                        tumu++;
                    }
                        
                    System.out.println("\n"+"T.C. Kimlik Kontrol" + "\n" + dogrutc + "   Gecerli" + "\n" + (tumu-dogrutc) + "    Gecersiz" + "\n" + "\n" );
                    System.out.println("IMEI Kontrol" + "\n" + dogruimei + "   Gecerli" + "\n" + (tumu-dogruimei) + "    Gecersiz" + "\n" + "\n" );
                    break;
                    
                case 3: // 3.menu secimi
                    System.out.println("Programdan Cikiliyor...");
                    System.exit(0);
                    break;
                    
                default:
                    
                    System.out.println("Lutfen Gecerli Bir Secenek Tuslayiniz"); //Menu disinda deger girilmesi durumunda kullanicinin bilgilendirilmesi
                    break;
            
            
            }
            
        
        }
        
    }
    
}
