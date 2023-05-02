import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
                  Scanner scanner = new Scanner(System.in);
                  int month,day;

                                  System.out.print("Gün giriniz: ");
                                  day = scanner.nextInt();

                                  System.out.print("Ay giriniz: ");
                                  month = scanner.nextInt();

                                  if((day == 21 && month == 3) || (day == 20 && month == 4)) {
                                      System.out.println("Koc burcusunuz.");
                                  } else if (day == 21 && ( (month == 4) || (month == 5) ) ) {
                                      System.out.println("Boga burcusunuz.");
                                  } else if (day == 22 && ( (month == 5) || (month == 6) ) ) {
                                      System.out.println("İkizler burcusunuz.");
                                  } if((day == 23 && month == 6) || (day == 22 && month == 7)) {
                                      System.out.println("Yengec burcusunuz.");
                                  } else if ((day == 23 && month == 7) || (day == 22 && month == 8)) {
                                      System.out.println("Aslan burcusunuz.");
                                  } else if ((day == 23 && month == 8) || (day == 22 && month == 9)) {
                                      System.out.println("Basak burcusunuz.");
                                  }else if ((day == 23 && month == 9) || (day == 22 && month == 10)) {
                                      System.out.println("Terazi burcusunuz.");
                                 }else if ((day == 23 && month == 10) || (day == 21 && month == 11)) {
                                      System.out.println("Akrep burcusunuz.");
                                 }else if ((day == 22 && month == 11) || (day == 21 && month == 12)) {
                                      System.out.println("Yay burcusunuz.");
                                 }else if ((day == 22 && month == 12) || (day == 21 && month == 1)) {
                                      System.out.println("Oglak burcusunuz.");
                                 }else if ((day == 22 && month == 1) || (day == 19 && month == 2)) {
                                    System.out.println("Kova burcusunuz.");
                                  } else if ((day == 20 && month == 2) || (day == 20 && month == 3)) {
                                    System.out.println("Balik burcusunuz");
                                 }

                 }
    }