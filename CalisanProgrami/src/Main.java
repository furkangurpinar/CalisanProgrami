import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Çalışanlar Programına Hoşgeldiniz");
        String islemler = "işlemler ...\n"
                + "1.Yazılımcı işlemleri\n"
                + "2.Yönetici işlemleri\n "
                + "Çıkış için q'ya basınız";
        System.out.println("*******************");
        System.out.println(islemler);
        System.out.println("*******************");
        while (true) {
            System.out.println("İşlem Seçiniz:");
            String islem = input.nextLine();
            if (islem.equals("q")) {
                System.out.println("Programdan çıkılıyor ...");
                break;

            } else if (islem.equals("1")) {
                Yazilimci yazilimci = new Yazilimci("Furkan", "Gürpınar", 61, "Java");
                String yazilimciIslem = "1.Format At\n"
                        + "2.Bilgileri Göster\n"
                        + "Çıkış için q basın";
                System.out.println(yazilimciIslem);
                while (true) {
                    System.out.println("İşlem seçin:");
                    String yIslem = input.nextLine();

                    if (yIslem.equals("q")) {
                        System.out.println("Bir üst menüye çıkılıyor...");
                        break;
                    } else if (yIslem.equals("1")) {
                        System.out.print("İşletim sistemi:");
                        String isletimSistemi = input.nextLine();
                        yazilimci.formatAt(isletimSistemi);


                    } else if (yIslem.equals("2")) {
                        yazilimci.bilgileriGoster();
                    } else {
                        System.out.println("Geçersiz işlem");
                    }

                }
            } else if (islem.equals("2")) {
                Yonetici yonetici = new Yonetici("Mesut", "Yılmaz", 98, 25);
                String yoneticiIslem = "Yonetici Işlemleri\n"
                        + "1.Zam miktarı belirle\n"
                        + "2.Bilgileri Goster :\n"
                        + "Çıkış için q basınız:";
                System.out.println(yoneticiIslem);
                while (true) {
                    System.out.println(" İşlem Seçin : ");
                    String yonIslem = input.nextLine();
                    if (yonIslem.equals("q")) {
                        System.out.println("Bir üst Menüye Çıkılıyor...");
                        break;
                    } else if (yonIslem.equals("1")) {
                        System.out.print("Yönetici Ne Kadar Zam Yapsın ?: ");
                        int zamMiktari = input.nextInt();
                        input.nextLine();
                        yonetici.zamYap(zamMiktari);

                    } else if (yonIslem.equals("2")) {
                        yonetici.bilgileriGoster();
                    } else {
                        System.out.println("Geçersiz İşlem");
                    }


                }
            }
        }


    }
}
