import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("İlk sayıyı girin efenim:");
        double x = scanner.nextDouble();
        System.out.println("İkinci sayıyı girin efenim:");
        double y = scanner.nextDouble();

        //ARİTMETİK OPERATÖRLER

        System.out.println("\n----- Aritmetik Operatörler -----");
        System.out.println("Toplam :" + (x+y) );
        System.out.println("Fark :" + (x-y) );
        System.out.println("Çarpım :" + (x*y) );
        System.out.println("Bölüm :" + (x/y) );

        System.out.println("Kalan :" + ((int)x % (int)y) );

        System.out.println("------ Karşılaştırma Operatörleri -----");
        System.out.println(x + ">" + y + " : " + (x > y));
        System.out.println(x + "<" + y + " : " + (x < y));
        System.out.println(x + "==" + y + " : " + (x == y));
        System.out.println(x + "!=" + y + " : " + (x != y));

        System.out.println("----- Birleşik Operatörler -----");
        int sayi = (int)x;

        sayi += 10;      //sayi = sayi +10;
        sayi *= 2;
        sayi /= 5;
        sayi -= 3;
        System.out.println(sayi);

        System.out.println("----- prefix ve suffix -----");
        int varsayilan = 10;
        System.out.println("Sayının ilk değeri " + varsayilan);
        System.out.println("++x:   " + ++varsayilan);  //önce artırır, sonra yazdırır
        System.out.println("x++:   " + varsayilan++);  //önce mevcut değeri yazdırır, sonra artırır
        System.out.println("Sayının şu anki değeri:   " + varsayilan);   //O anda değer 11’di. Ekrana 11 yazar, sonra değer 12 olur.

        System.out.println("----- Mantıksal Operatötler -----");

        boolean xPozitifMi = x > 0;
        boolean yPozitifMi = y > 0;

        System.out.println("Her ikisi de pozitif mi? " + (xPozitifMi && yPozitifMi)); //and, and
        System.out.println("En az biri pozitif mi? " + (xPozitifMi || yPozitifMi)); //or
        System.out.println("a negatif mi? " + (!xPozitifMi));




    }
}