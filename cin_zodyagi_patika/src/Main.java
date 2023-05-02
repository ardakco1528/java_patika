import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
               Scanner input = new Scanner(System.in);
               int year;

                  System.out.print("Dogum yilinizi giriniz: ");
                  year = input.nextInt();

                  if(year % 12 == 0){
                      System.out.println("Cin burcunuz maymun.");
                  } else if (year % 12 == 1) {
                      System.out.println("Cin burcunuz horoz.");
                  } else if (year % 12 == 2) {
                      System.out.println("Cin burcunuz kopek.");
                  } else if (year % 12 == 3) {
                      System.out.println("Cin burcunuz domuz.");
                  } else if (year % 12 == 4) {
                      System.out.println("Cin burcunuz fare.");
                  } else if (year % 12 == 5) {
                      System.out.println("Cin burcunuz okuz.");
                  } else if (year % 12 == 6) {
                      System.out.println("Cin burcunuz tavsan.");
                  } else if (year % 12 == 7) {
                      System.out.println("Cin burcunuz kaplan.");
                  } else if (year % 12 == 8) {
                      System.out.println("Cin burcunuz ejderha.");
                  } else if (year % 12 == 9) {
                      System.out.println("Cin burcunuz yilan.");
                  } else if (year % 12 == 10) {
                      System.out.println("Cin burcunuz at.");
                  } else if (year % 12 == 11) {
                      System.out.println("Cin burcunuz koyun.");
                  }
    }
    }