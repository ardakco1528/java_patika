import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Java'da girilen sayilar arasindan minimum ve maximum değeri bulma

        System.out.println("Kac tane sayi girmek istiyorsunuz: ");
        int sayiAdeti = scanner.nextInt();

        int min = 0,max = 0;

        for (int i = 1; i <= sayiAdeti; i++) {
            System.out.println(+i+ ". sayiyi giriniz: ");
            int sayi = scanner.nextInt();
            if (sayi > max) max = sayi;
            else if (sayi < min) {
                min = sayi;
            }
        }
        System.out.println("En buyuk sayi: " +max);
        System.out.println("En kucuk sayi: " +min);
    }
}