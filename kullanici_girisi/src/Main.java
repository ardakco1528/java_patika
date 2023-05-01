import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*
            Kullanıcıdan kullanıcı adı ve sifre bilgilerini alarak if-else ile doğrulunu kontrol eden ve sifre yanlış ise kullanıcıya sifreyi sıfırlayıp sıfırlamamak istedigini soran basit bir program.
         */
        Scanner input = new Scanner(System.in);
        String userName,password,choice,newPassword;

        System.out.print("Sisteme giris yapmak icin kullanici adinizi giriniz: ");
        userName = input.nextLine();

        System.out.print("Sifrenizi de giriniz: ");
        password = input.nextLine();

        if (userName.equals("ardakoca") && password.equals("12345arda")) {
            System.out.println("Giris basarili.");
        } else if (!password.equals("12345arda")) {
            System.out.print("Sifreniz hatalidir.\n " +
                    "Sifrenizi sifirlamak ister misiniz ? (y/n): ");
                     choice = input.nextLine();
            if(choice.equals("y")){
                System.out.print("Yeni sifrenizi giriniz: ");
                newPassword = input.nextLine();
            if(newPassword.equals("rdakco48")){
                System.out.println("Sifreniz basariyla degistirildi.");
                }else System.out.println("Sifre olusturulamadi,lutfen baska bir sifre giriniz.");
            }
        }
    }
}