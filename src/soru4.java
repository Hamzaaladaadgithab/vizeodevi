import java.util.Scanner;
import java.math.*;


public class soru4 {
  public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      System.out.println(" Hoşgeldiniz ALAN VE ÇEVRE Hesaplama ");
      System.out.println(" 1 ydad 2 basınca ");
      int a = input.nextInt();
      switch (a) {
          // Diküçgen için
          case 1: {
              System.out.println(" input uzunluk1 =x ");
              int x = input.nextInt();
              System.out.println(" input uzunluk 2 =y ");
              int y = input.nextInt();
              double ALAN = (0.5) * (x) * (y);
              System.out.println(" ALAN =" + ALAN);
              break;
          }
          case 2: {
          // kare için
              System.out.println("input uzunluk =L ");
              int L = input.nextInt();
              double ALAN = Math.pow(L, 2);
              double cevre = 4 * (L);
              System.out.println(" ALAN=" + ALAN);
              System.out.println(" cevre ="+cevre);
              break;
          }


      }


  }
}
