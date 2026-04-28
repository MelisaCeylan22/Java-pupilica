import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        /*
        Amaç1: Sadece Melisa kullanıcısı bu uygulamayı kullanabilir.
        Amaç2: Melisa ve Artun bu uygulamayı kullanabilir.
         */

        System.out.print("Kullanıcı adını giriniz efenim:");
        Scanner scanner = new Scanner(System.in);
        String kullaniciAdi = scanner.next();

        System.out.println("Şifrenizi giriniz efenim: ");
        String sifre = scanner.next();

        if (kullaniciAdi.equals("Melisa") && sifre.equals("abc123")){
            System.out.println("Hoş geldin Melisa");
        } else if (kullaniciAdi.equals("Artun") && sifre.equals("xyz98")) {
            System.out.println("Merhaba Artun");

        } else {
            System.out.println("Tanınmayan kullanıcı. Uygulamadan çıkılıyor");
            return;
        }

        System.out.println("Burası ne olursa olsun çalışır!");

    }
}