import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
              /*
              kullanıcının manavdan aldığı ürünlerin kilogram değerlerine göre toplam tutarını ekrana yazdıran program.
              Meyveler ve KG Fiyatları
              Armut : 2,14 TL
              Elma : 3,67 TL
              Domates : 1,11 TL
              Muz: 0,95 TL
              Patlıcan : 5,00 TL
             */
                    Scanner scanner = new Scanner(System.in);
                    double elma,armut,domates,muz,patlican,toplam_tutar;

                    System.out.print("Kac kilo armut aliyorsunuz ?: ");
                    armut = scanner.nextDouble();

                    System.out.print("Kac kilo elma aliyorsunuz ?: ");
                    elma = scanner.nextDouble();

                    System.out.print("Kac kilo domates aliyorsunuz ?: ");
                    domates = scanner.nextDouble();

                    System.out.print("Kac kilo muz aliyorsunuz ?: ");
                    muz = scanner.nextDouble();

                    System.out.print("Kac kilo patlican aliyorsunuz ?: ");
                    patlican = scanner.nextDouble();


                    toplam_tutar = (armut * 2.14) + (elma * 3.67) + (domates * 1.11) + (muz * 0.95) + (patlican * 5.00);
                    System.out.println("Toplam tutar = " +toplam_tutar+ " TL");
        }
    }
