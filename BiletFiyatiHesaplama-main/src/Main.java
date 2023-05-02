import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int yas,bilet; double km;

        System.out.print("Gideceginiz yerin mesafesini giriniz: ");
        km = scanner.nextInt();

        System.out.print("Yasınızı giriniz: ");
        yas = scanner.nextInt();

        System.out.print(" \n Biletinizi seciniz => 1-Gidis-Donus, 2-SadeceGidis:  ");
        bilet = scanner.nextInt();

         double normal_fiyat,bilet_indirimi,yas_indirimi;
        if(km>0 && yas>0 && (bilet == 1 || bilet == 2)) {
            normal_fiyat = km * 0.10;
            System.out.println("Girdiginiz veriler dogrudur.\n İsleminize devam edebilirsiniz.");
            if (yas < 12) {
                yas_indirimi = normal_fiyat * 0.5;
            } else if (yas > 12 && yas < 24) {
                yas_indirimi = normal_fiyat * 0.1;
            } else if (yas >= 65) {
                yas_indirimi = normal_fiyat * 0.3;
            } else {
                yas_indirimi = 0;
            }normal_fiyat -= yas_indirimi;
            if(bilet == 1){
                bilet_indirimi = normal_fiyat * 0.2;
                normal_fiyat -= (bilet_indirimi) * 2;
            }
            System.out.println("Biletinizin fiyatı = " + (normal_fiyat) + "$");
        }else{
            System.out.println("Girdiginiz veriler eksik veya yanlıstır.Lutfen tekrar deneyiniz.");
        }
      }
   }

