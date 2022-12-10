 import java.util.Scanner;


public class soru5 {
  public static void main ( String[] args) {
   Scanner input = new Scanner (System.in) ;
      System.out.println(" input 5 ders puanı ");
      double d1,d2,d3,d4,d5;
      d1= input.nextDouble();
      d2= input.nextDouble();
      d3= input.nextDouble();
      d4= input.nextDouble();
      d5= input.nextDouble();
      double ortalama = ( d1+d2+d3+d4+d5)/5;
      System.out.println("ortalama=" +ortalama );
      if (ortalama>=90)
      System.out.println(" AA");
      else if ( ortalama>=80)
          System.out.println("BA");

      else if (ortalama>=70 )
          System.out.println("BB");
      else if (ortalama>=50)
          System.out.println(" DD");
      else

          System.out.println(" maalesef sen kaldın ");





  }






















}
