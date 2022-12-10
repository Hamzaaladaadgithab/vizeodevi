import java.util.Scanner;


public class soru8 {
 public static void main(String[] args ) {
    // kullancı tarafından pozatif bir tamsayı girilmesi istenmektedir.
    // sonra bu sayı 3 ve 5  bölünebilirme mi inceleyeceğiz  , kullancı tarafından girilen bu sayı Eğer negatif ise
     // bir daha girilmesi isteniyor
     // girilen sayı = x olsun

     Scanner input= new Scanner (System.in);
     System.out.println(" sayı giriniz  ");
     int x = input.nextInt();
     if(x>0){
     if ( x%3==0 && x%5==0)
         System.out.println("Evet ");

     else
         System.out.println(" Hayır ");
     }
    else
         System.out.println(" Bir daha pozatif tamsayı girin ");
       }
     }











































