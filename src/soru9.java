import java.sql.SQLOutput;

public class soru9 {

   public static void main (String[] args){

     int x=5;
     int y=3;
       System.out.println(" x=" + x++);
       System.out.println(" y=" + y--);
       int b = x; // x in yeni dğeri için
       int c= y ; // y in yeni değeri için
       System.out.println(b);
       System.out.println(c);

   }
}
