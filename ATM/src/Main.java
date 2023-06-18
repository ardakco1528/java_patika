import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        /*
       Kullanicidan kullanici adi ve sifre bilgisi alarak bazi islemler yaptıran temel atm programı.

        String kullaniciAdi, sifre; Scanner scanner = new Scanner(System.in);

        System.out.println("Kullanici adinizi giriniz: ");
        kullaniciAdi = scanner.nextLine();

        System.out.println("Sifrenizi giriniz: ");
        sifre = scanner.nextLine();

        int secim,bakiye = 1500;

        while (kullaniciAdi.equals("ardakco") && sifre.equals("12345arda")){
             do {
                 System.out.println("""
                         1-ParaYatir
                         2-ParaCekme
                         3-BakiyeGoster
                         4-CikisYap
                         """);
                 System.out.println("Yapmak istediginiz islemi seciniz: ");
                 secim = scanner.nextInt();
               if (secim == 1){
                    System.out.print("Ne kadar para yatirmak istiyorsunuz: ");
                    int para = scanner.nextInt();
                    bakiye += para;
                    System.out.println("Guncel bakiyeniz: " +bakiye+ " TL");
               } else if (secim == 2) {
                   System.out.print("Ne kadar para cekmek istiyorsunuz: ");
                   int para = scanner.nextInt();
                     if( bakiye < para) System.out.println("Bakiyeniz yetersiz.")
                     else bakiye -= para;
                   System.out.println("Kalan bakiyeniz: " +bakiye+ " TL");
               } else if (secim == 3) {
                   System.out.println("Anlik olarak hesaptaki bakiyeniz: "+bakiye+ " TL");
               }
             } while (secim != 4);
            System.out.println("Bankamizi kullandiginiz icin tesekkurler...");
            break;
        }
      */

        // ayni ornegin switch-case ve metodlarla yapilmis hali

        String kullaniciAdi, sifre; Scanner scanner = new Scanner(System.in);

        int secim, bakiye = 1500,islemHakki = 3;

        System.out.println("Bankamiza hosgeldiniz...");

        while (islemHakki > 0){
            System.out.println("Kullanici adinizi giriniz: ");
            kullaniciAdi = scanner.nextLine();
            System.out.println("Sifrenizi giriniz: ");
            sifre = scanner.nextLine();

            if (kullaniciAdi.equals("ardakco") && sifre.equals("122345arda")){
                System.out.println("Bankamiza Hosgeldiniz...");
                do {
                    System.out.println("1-Para Yatirma \n" +
                            "2-Para Cekme \n" +
                            "3-Bakiye Sorgulama \n" +
                            "4-Cikis Yap");
                    System.out.print("Lutfen yapmak istediginiz islemi seciniz: ");
                    secim = scanner.nextInt();
                    switch (secim){
                        case 1:
                            paraYatir(bakiye);
                            break;
                        case 2:
                            paraCek(bakiye);
                            break;
                        case 3:
                            bakiyeGoster(bakiye);
                            break;
                        case 4:
                            System.out.println("Sistemden cikis yapiliyor...");
                            return;
                        default:
                            System.out.println("Lutfen islemler disinde bir secenek secmeyin...");
                    }
                } while (secim != 4);
            } else{
                islemHakki--;
                System.out.println("Hatali kullanici veya sifre.Tekrar deneyiniz.");
            }
              if (islemHakki == 0){
                  System.out.println("Hesabiniz bloke olmustur.");
              } else System.out.println("Kalan hakkiniz: " +islemHakki);
        }
    }

    private static void bakiyeGoster(int bakiye) {
        System.out.println("Guncel bakiyeniz: " +bakiye);
    }

    private static void paraCek(int bakiye) {
       Scanner scanner = new Scanner(System.in);
       System.out.println("Cekmek istediginiz para miktarini girin: ");
       int para = scanner.nextInt();
       if (bakiye < para){
           System.out.println("Yetersiz bakiye.");
       } else {
           bakiye -= para;
       }
        System.out.println("Guncel bakiyeniz: " +bakiye+ " TL");
    }

    private static void paraYatir(int bakiye) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Yatirmak istediginiz para miktarini girin: ");
        int para = scanner.nextInt();
        bakiye += para;
        System.out.println("Bakiyeniz: " +bakiye+ " TL");
    }
}