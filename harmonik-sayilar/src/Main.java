import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Bir sayi giriniz: ");
        int sinir = scanner.nextInt();
        System.out.println("Toplam = " +harmonikSayilar(sinir));
    }
      public static double harmonikSayilar(int sayi){
        double toplam = 0;
          for (int i = 1; i <= sayi; i++) {
              toplam += (double) 1 / i;
          }
        return toplam;
      }
}