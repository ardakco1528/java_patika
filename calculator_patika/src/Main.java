import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
                 int number_1,number_2; String islem;
        System.out.print("İslem yapmak bir sayi giriniz: ");
        number_1 = input.nextInt();

        System.out.print("İslem yapmak icin ikinci bir sayı giriniz: ");
        number_2 = input.nextInt();

        System.out.println("""
                1-Toplama
                2-Cıkarma
                3-Carpma
                4-Bolme
                """);
        System.out.print("Yukaridan yapmak istediginiz islemi seciniz: ");
        islem = input.next();
                 switch (islem){
                     case "1":
                         System.out.println("Toplama isleminin sonucu = " +(number_1 + number_2));
                         break;
                     case "2":
                         System.out.println("Cikarma isleminin sonucu = " +(number_1 - number_2));
                         break;
                     case "3":
                         System.out.println("Carpma isleminin sonucu = " +(number_1 * number_2));
                         break;
                     case "4":
                         if(number_2 == 0){
                             System.out.println("Eger paydaya sifir girerseniz islem tanimsiz olur.\n" +
                                     "Lutfen sifirdan farkli bir sayi giriniz.");
                         }
                         else
                             System.out.println("Bolme isleminin sonucu = " +(number_1 / number_2));
                         break;
                     default:
                         System.out.println("Lutfen size verilenlerin disinda bir islem secmeyiniz.");
                         break;
            }
        }
    }