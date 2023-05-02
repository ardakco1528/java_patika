import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a,b,c;

        System.out.println("Bir sayi giriniz: ");
        a = scanner.nextInt();

        System.out.println("İkinci bir sayi giriniz: ");
        b = scanner.nextInt();

        System.out.println("Ücüncü bir sayi giriniz: ");
        c = scanner.nextInt();

        if((a<c) && (a<b)){
            if(b<c){
                System.out.println(a + "<" +b+ "<" +c);
            }
        }if((c<a) && (b<a)){
            if(c<b){
                System.out.println(c + "<" +b+ "<" +a);
            }
        }
    }
}