import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double fiyat,kdv;

        System.out.print("Bir fiyat degeri giriniz: ");
        fiyat = scanner.nextDouble();

        System.out.println("Fiyat: " +fiyat);

        if(fiyat>0 && fiyat<=1000){
             kdv = 0.18;
             double kdv_tutar = kdv * fiyat;
             System.out.println("KDV tutar: " +kdv_tutar);
        }else{
            kdv = 0.8;
            double kdv_tutar_2 = kdv * fiyat;
            System.out.println("KDV tutar: " +kdv_tutar_2);
        }
    }
}