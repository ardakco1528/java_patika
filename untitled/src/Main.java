import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
          /* kombinasyon hesaplayan program
             kombinasyon formülü: C(n,r) = n! / (r! * (n-r)! )
             faktoriyel formülü : 5! = 5 * 4 * 3 * 2 * 1 = 120
          */

        Scanner scanner = new Scanner(System.in);
        int n,r;

        System.out.println("bir n sayisi giriniz: ");
        n = scanner.nextInt();

        System.out.println("bir r sayisi giriniz: ");
        r = scanner.nextInt();

        // n sayısının faktoriyeli
         int a = 1; long nn = 1;
            while (a <= n){
               nn *= a;
               a++;
            }
        System.out.println("n! = " +nn);

        // r sayısının faktoriyeli
        int b = 1; long rr = 1;
            while (b <= r){
                rr *= b;
                b++;
            }
        System.out.println("r! = " +rr);

       // n-r nin faktoriyeli
        int c = 1; long nnrr = 1;
            while (c <= (n-r) ){
                nnrr *= c;
                c++;
            }
        System.out.println("(n-r)! = " +nnrr);
        long sonuc = nn / ( rr * (nnrr) );
        System.out.println("C(n,r) = n! / (r! * (n-r)! )");
        System.out.println("C("+n+","+r+") = ("+n+"!) / ("+r+"! * ("+(n - r)+"!) = " +sonuc);
    }
}