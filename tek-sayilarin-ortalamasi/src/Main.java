import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
          int sinir = sinirBelirle();
          ortalama(sinir);
    }
    static public int sinirBelirle(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Bir sinir belirleyiniz: ");
        int sinir = scanner.nextInt();
        return sinir;
    }
    static public void ortalama(int sinir){
        int toplam = 0,sayac = 0;
        for (int i = 0; i < sinir; i++) {
              if((i % 3 == 0) && (i % 4 == 0)){
                  toplam += i;
                  sayac++;
              }
        }
         System.out.println("Sayilarin toplami = " +toplam);
         double ortalama = (double) toplam / sayac;
         System.out.println("Sayilarin ortalamasi = " +ortalama);
    }
}