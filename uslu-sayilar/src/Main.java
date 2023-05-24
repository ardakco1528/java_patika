import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //kullanıcnın belirlediği sınır ile 4 ve 5 in kuvvetlerini yazdırma.
            Scanner scanner = new Scanner(System.in);
            System.out.print("Bir sayi giriniz: ");
            int sayi = scanner.nextInt();
                  for (int i = 1; i <= sayi; i *= 4) {
                    System.out.println(i);
          }
        for (int i = 1; i < sayi; i *= 5) {
            System.out.println(i);
           }
       }
    }
