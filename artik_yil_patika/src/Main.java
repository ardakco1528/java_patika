import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int year;
        System.out.print("Bir yil giriniz: ");
        year = scanner.nextInt();

        if((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0)) System.out.println(year + " Bir artik yildir."); else System.out.println(year + " Bir artik yil degildir.");

    }
         
}