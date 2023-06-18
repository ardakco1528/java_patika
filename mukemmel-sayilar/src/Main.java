import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Bir sayi giriniz: ");
        int sayi = scanner.nextInt();

        int toplam = 0;

        for (int i = 1; i < sayi; i++) {
               if (sayi % i == 0){
                   toplam += i;
               }
        } if (toplam == sayi){
            System.out.print(+sayi+ " sayi mukemmel sayidir.");
        } else System.out.println( +sayi+ " Mukemmel sayi degildir.");
    }
}