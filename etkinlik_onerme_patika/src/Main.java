import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*
          Kullanıcdan alınan sıcaklık bilgisine gore etkinlik oneren basit bir program.
         */
        Scanner scanner = new Scanner(System.in);
               int temp;

               System.out.print("Hava sicakligini giriniz: ");
               temp = scanner.nextInt();

               if(temp < 5){
                   System.out.println("Hava kayak yapmak icin cok uygun.");
               } else if (temp > 5 && temp <= 15) {
                   System.out.println("Sinemada cok guzel filmler var.");
               } else if (temp >= 15 && temp <= 25) {
                   System.out.println("Hadi piknige gidelim.");
               }else if(temp > 25){
                   System.out.println( "Hadi yüzmeye gidelim.");
               }
    }
    }
