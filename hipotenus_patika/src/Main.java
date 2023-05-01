import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*
           kullanıcıdan kenar uzunlukları alarak  ücgenin alanını hesaplayan program
           ucgenin cevresi = 2u
           u = (a + b + c) / 2
           alan * alan = u * (u - a) * (u - b) * (u - c)
           */


               Scanner scanner = new Scanner(System.in);
               int a,b,c,cevre; double alan;

              System.out.print("Ücgenin alan hesaplamasi icin bir deger giriniz: ");
              a = scanner.nextInt();

              System.out.print("Ücgenin alan hesaplamasi icin ikinci bir deger giriniz: ");
              b = scanner.nextInt();

              System.out.print("Ücgenin alan hesaplamasi icin ucuncu bir deger daha giriniz: ");
              c = scanner.nextInt();

              cevre = (a + b + c) / 2;
              System.out.println("Ucgenin cevresi: " +cevre);

              alan = Math.sqrt(cevre * (cevre - a) * (cevre - b) * (cevre - c));
              System.out.println("Ucgenin alani: " +alan);
      }
    }
