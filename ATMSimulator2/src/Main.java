import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        /*
        AMAÇ: Bir ATM cihazının genel hatlarıyla simüle edilmesi...
            1. Uygulama pin kodu ile açılır.
                3 hatalı girişte sistem yanıt vermez.
            2. Bir menü açılsın. Bu menüde;
                -Bakiye sorgulama,
                -Para yatır,
                -Para Çek,
                -Çıkış yap
            Her eylem çalışsın.
            4'e basılmadığı sürece bu menüye geri dönsün
         */

        Scanner scanner = new Scanner(System.in);
        double bakiye = 1500;
        int dogruPin = 5498;
        int girilenPin = 0;
        int hataliGiris = 0;
        double gunlukLimit = 10000;

        int secim = 0;
        do {
            System.out.println("PIN kodunu giriniz: ");
            girilenPin = scanner.nextInt();
            hataliGiris++;
            if (girilenPin != dogruPin){
                int kalanHak = 3 - hataliGiris;
                if (kalanHak <= 0){
                    System.out.println("PIN kodunuz yanlış güvenlik sebebiyle kartınızı yutuuoruz :D");
                    return;
                }
            }
        }while (girilenPin != dogruPin);

        System.out.println("Giriş Başarılı!");

        do {
            System.out.println("Hangi işlemi yapmak istiyorsunuz?");
            System.out.println("1. Bakiye Sorgula");
            System.out.println("2. Para Yatır");
            System.out.println("3. Para Çek");
            System.out.println("4. Çıkış Yap");

            System.out.println("Seçiminizi yapın: ");
            secim = scanner.nextInt();
            switch (secim){
                case 1:
                    System.out.println("Mevcut Bakiyeniz: " + bakiye + " TL");
                    break;
                case 2:
                    //Önce yatırılmak istenen tutar giricek
                    //tutar negatife uyar ve işlem yapma
                    //değilse bakiyeki tutar kadar artır
                    System.out.println("Yatırılacak tutar: ");
                    double tutar = scanner.nextDouble();
                    if (tutar<=0){
                        System.out.println("Tutar 0 ya da negatif olamaz?");
                    }
                    else{
                        bakiye += tutar;
                        System.out.println(tutar + " TL yatırıldı. Yeni bakiye "+bakiye + " TL");
                    }
                    break;
                case 3:
                    /*
                    Tutar girilir, 0 ya da negatif olamaz
                    bakiyeden fazla olamaz
                    günlük limitten fazla olamaz
                    eğer sorun yoksa bakiyeden tutat düşürülür.
                     */
                    System.out.println("Çekmek istediğiniz tutar: ");
                    double cekilecekTutar = scanner.nextDouble();
                    if (cekilecekTutar <= 0){
                        System.out.println("Çekilecek tutar negatif olamaz!");
                    } else if (cekilecekTutar > bakiye) {
                        System.out.println("Yeterli bakiyeniz yok");
                    } else if (cekilecekTutar > gunlukLimit) {
                        System.out.println("Günlük Limitiniz " + gunlukLimit + " TL'dir.");

                    }
                    else {
                        bakiye -= cekilecekTutar;
                        System.out.println(cekilecekTutar + " TL hesabınızdan çekildi. Kalan Bakiye: " + bakiye);

                    }
                    break;
                case 4:
                    System.out.println("Çıkış yapılıyor");
                    break;
                default:
                    System.out.println("Hatalı seçim. 1-4 arası bir seçim yapın.");
                    break;

            }

        }while (secim != 4);


    }
}