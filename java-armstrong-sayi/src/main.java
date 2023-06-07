package src;

import java.util.Scanner;

public class main{
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

           System.out.print("Üc basamakli bir sayi giriniz: ");
           int sayi = scanner.nextInt();

           System.out.println("Girdiginiz sayi: " +sayi);

            int adet = 0; int toplam = 0;
            
            while(sayi != 0){
                toplam = (sayi % 10) + toplam;
                 sayi /= 10;
                 adet++;
            }
        System.out.println("Basamak sayilarinin toplami = " +toplam);
        scanner.close();
  }
}
