import javax.swing.plaf.synth.SynthDesktopIconUI;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        //döngü bir koşul sağlandığı sürece yapılan eylemlerdir
        //klavyeden girilen sayıları toplayan uygulama, 0 girilire işlem tamamlanacak

        int toplam = 0;
        int sayi;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Birazdan girdiğiniz sayıları toplayacağım, çıkmak için 0'a basın.");

        while (true){
            System.out.print("Sayı: ");
            sayi = scanner.nextInt();
            //eğer sayı 0 girilirse döngüden çık:
            if (sayi == 0){
                break;
            }

            toplam += sayi;
            System.out.println("Anlık Toplam: " + toplam);
        }

        System.out.println("Toplam: " + toplam);


        //Kullanıcı belirli bir pin değerini 3 deneme içinde doğru girmek zorundadır.
        //KOŞUL: PIN değeri yanlış ise ve hak 0 değilse
        //EYLEM: Kullanıcıya PIN kodunu sor
        int hak = 3;
        System.out.println("Lütfen PIN kodunu giriniz: ");
        String pin = scanner.next();

        while (!pin.equals("1234") && hak > 0){
            System.out.println("Lütfen PIN kodunu giriniz. Kalan hakkınız: " + hak--);
            pin = scanner.next();

        }

        String girilenPIN = "";
        int deneme = 3;
        do {
            System.out.println("do while için pin kodu girin. Kalan denem hakkı: " +deneme-- );
            girilenPIN = scanner.next();
        }while(!girilenPIN.equals("9876") && deneme > 0 );

        System.out.println("Geri sayım yapacağız. Kaçtan başlayalım: ");
        int baslangic = scanner.nextInt();

        for (int sayac = baslangic; sayac >= 0; sayac--){
            System.out.println(sayac + " ");
        }


    }
}