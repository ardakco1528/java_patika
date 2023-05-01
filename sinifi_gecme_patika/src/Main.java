import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
           int math,physics,turkish,chemistry,music; double avg;
           Scanner scanner = new Scanner(System.in);

           System.out.println("Matematik notunuzu giriniz: ");
           math = scanner.nextInt();
           math = math < 0 || math > 100 ?  0: math;

           System.out.println("Fizik notunuzu giriniz: ");
           physics = scanner.nextInt();
           physics = physics < 0 || physics > 100 ?  0: physics; // ? operatörü if-else yapısnın neredeyse aynısıdır.kontrol edilecek ifade ? ifade dogruysa calısacak kod : ifade yanlıs ise calısacak kod.

           System.out.println("Türkçe notunuzu giriniz: ");
           turkish = scanner.nextInt();
           turkish = turkish < 0 || turkish > 100 ?  0: turkish;

           System.out.println("Kimya notunuzu giriniz: ");
           chemistry = scanner.nextInt();
           chemistry = chemistry < 0 || chemistry> 100 ?  0: chemistry;

           System.out.println("Müzik notunuzu giriniz: ");
           music  = scanner.nextInt();
           music = music < 0 || music > 100 ?  0: music;

           avg = (math + physics + turkish + chemistry + music) / 5.0;

           System.out.println("Ortalamanız = " +avg);

           if (avg >= 55 && avg <= 100) System.out.println("Sinifi gectiniz.");
           else System.out.println("Sinifta kaldiniz.");
        }
    }
