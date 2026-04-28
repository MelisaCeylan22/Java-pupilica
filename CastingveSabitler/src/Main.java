import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        //Sabitler:
        final double PI = 3.1459;
        final int MAX_OGRENCI_SAYISI = 30;
        final String EVET = "Evet";

        //Casting:
        int tamSayi = 46;
        //implicit casting (widening - genişletme) küçük → büyük veri tipi otomatik dönüşüm
        double deger = tamSayi;
        System.out.println(deger);

        long buyukSayi = tamSayi;
        System.out.println(buyukSayi);

        //explicit casting (narrowing - daraltma) Büyük → küçük dönüşüm sen yaparsın
        byte sekizBit = (byte) tamSayi;
        System.out.println(sekizBit);

        /*
        int sayi = 129;
        byte b = (byte) sayi;
        System.out.println(b);
        129 - 256 = -127
        Java’da byte 8 bit’tir.
        129 değeri bu aralığı aştığı için taşma (overflow) olur.
         */

        char adinizinIlkHarfi = 'M';
        int asciiCode = (char)adinizinIlkHarfi;
        System.out.println(asciiCode);
        char harf = (char) 67;
        System.out.println(harf);

        Scanner scanner = new Scanner(System.in);
        System  .out.println("Bir sayı giriniz efenim:");

        String ifade = scanner.next();
        int sayi = Integer.parseInt(ifade);

        System.out.println(ifade + " " + sayi);

    }
}