import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*
        Gidilen mesafeye (KM) göre taksimetre tutarını ekrana yazdıran program.
        KM başına taksimetre 20tl tutmaktadır.
        Taksimetre KM başına 2.20 TL tutmaktadır.
        Minimum ödenecek tutar 20 TL'dir. 20 TL altında ki ücretlerde yine 20 TL alınacaktır.
        Taksimetre açılış ücreti 10 TL'dir.
         */
             Scanner scanner = new Scanner(System.in);
             int acilis_ucreti = 10,km,ucret;
             double km_ucreti = 2.20;

             System.out.println("******************* TAKSİMETRE ACİLİYORRR ******************");

             System.out.print("Gideceginiz mesafeyi giriniz: ");
             km = scanner.nextInt();

             System.out.println("Mesafe (KM): " +km);

             ucret = (km * acilis_ucreti * (int) km_ucreti);

             if (ucret <= 20){
                 System.out.println("Ucretiniz: 20 tl." );
             }else System.out.println("Ucretiniz: " +ucret+ " tl");
      }
    }
