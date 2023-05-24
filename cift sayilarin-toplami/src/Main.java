import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
           toplama();
    }
    public static void toplama(){
            int toplam = 0, sayi;
            while (true){
                Scanner scanner = new Scanner(System.in);
                System.out.println("Bir sayi giriniz: ");
                sayi = scanner.nextInt();
                if (sayi % 2 == 0){
                    toplam += sayi;
                } else break;
            }
             System.out.println("Sayilarin toplami = " +toplam);
        }
    }