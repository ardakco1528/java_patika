import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bir sayi giriniz: ");
        int sayi1 = scanner.nextInt();

        System.out.println("Bir sayi daha giriniz: ");
        int sayi2 = scanner.nextInt();

        int ebob = 0;

        for (int i = 1; i <= sayi1 && i<= sayi2; i++) {
             if (sayi1 % i == 0 && sayi2 % i == 0){
                       ebob = i;
             }
        }
        System.out.println("Ebob = " +ebob);
    }
}