/**
* @author Kadir ARSLAN && @kadars_
* @author Semih DEMIRCI && @smh67dmrc
*/

package PAKET;

import java.util.Random;
//Gerekli kutuphaneler eklendi
public class KimlikNo {
    
    private String KimlikNoUret() { //Rastgele T.C. Kimlik numarasi ureten fonksiyon
        
        Random rand = new Random();
        
        int calc;
        int ten;
        int sum = 0;
        int eleven;       
        int NineDigit = rand.nextInt(899999999) + 100000000;
             
        String temp = Integer.toString(NineDigit);
        int[] NewNumber = new int[temp.length() + 2];
        
        for (int i = 0; i < temp.length(); i++)
        {
            NewNumber[i] = temp.charAt(i) - '0';
        }
        
        calc = 7*(NewNumber[0] + NewNumber[2] + NewNumber[4] + NewNumber[6] + NewNumber[8])
                - (NewNumber[1] + NewNumber[3] + NewNumber[5] + NewNumber[7]);
        
        ten = calc%10;       
        NewNumber[9] = ten;
        
        for (int i = 0; i < temp.length() + 1; i++)
        {
            sum += NewNumber[i];
        }
        
        eleven = sum%10;       
        NewNumber[10] = eleven;
        
        String deneme = "";
        
        for(int i = 0; i < 11; i++)
        {
            deneme+=NewNumber[i];
        }
       
        return deneme;

    }
  
    public String kimlikNoGetir(){ //Uretilen kimlik numarasını getiren metot
        String kimlikNo = KimlikNoUret();
        return kimlikNo;
    }
    
    public boolean KimlikNoDogrula(String TC) {//Kimlik numarası doğrulaması yapan metot
          
          if(TC.length() != 11)
              return false;
          
          if(Character.getNumericValue(TC.charAt(0)) == 0)
              return false;
          
          int toplam = 0;
          
          for(int i = 0;i<10;i++)
          {
              int X = Character.getNumericValue(TC.charAt(i));
              toplam += X;
          }
           
          if(toplam%10 != Character.getNumericValue(TC.charAt(10)))
              return false;
           
            int toplam2 = 0; // 1 3 5 :..
          
          for(int i = 0;i<10;i = i+2)
          {
              int Y = Character.getNumericValue(TC.charAt(i));
              toplam2 += Y;
          }
          
          int toplam3 = 0; // 2 4 6 ...
          
          for(int i = 1;i<9;i=i+2){
              int Z = Character.getNumericValue(TC.charAt(i));
              toplam3 += Z;
          }
          
          if((toplam2*7-toplam3)%10 != Character.getNumericValue(TC.charAt(9)))
              return false;
         
          
          return true;
          
      }
    
 
}
