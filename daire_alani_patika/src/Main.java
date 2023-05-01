import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
           /*
           Kullanıcıdan dairenin yarıçapı ölçüsünü ve merkez açı ölçüsünü alarak daire diliminin alanını hesaplayan program.
            pi sayısı = 3.14
            formül: (pi * (r * r) * a) / 360
            */
               Scanner scanner = new Scanner(System.in);
               double pi_sayisi = 3.14,alan,a; int r;

               System.out.println("Dairenin yarıcapi olcusunu giriniz: ");
               r = scanner.nextInt();

              System.out.println("Dairenin merkez acisinin olcusunu giriniz: ");
              a = scanner.nextDouble();

              alan = (pi_sayisi * (r * r) * a) / 360;

              System.out.println("Daire diliminin alani: " +alan);
        }
    }
