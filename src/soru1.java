import java.util.Scanner;

public class soru1 {

    public static void main (String [] args){


// Bir çalışan çalışma saati ve saatlik ücreti vrrilmektetdir
    // bilgisayara giriş olarak veriliyor
    // maaşını hesaplayan java kodunu yazacağız
    // çalışma saati =x , olsun
    // saatlik ücreti =y , olsun
        Scanner input =new Scanner(System.in);
        System.out.println("x"); // kullancı tarafından değeri girelecek
      int x =input.nextInt();

        System.out.println(" y");             //kullancı tarafından değeri girelecek
        int y = input.nextInt();
        double maaş=(x)*(y);       // not maaş = saatlik ücreti * çalışma saati
        System.out.println(" maaş=" + maaş);



        }
    }














