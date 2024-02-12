

import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class OgrenciManager extends Veritabani {

    static Scanner scan = new Scanner(System.in);

    public static void ogrenciMenu() throws InterruptedException {

        // TODO  Bu menunun calismasi icin gerekli duzenlemeleri yapiniz

        //do while döngüde kalmayı sağlar, switch veya if menülere yönlenmeyi sağlar...

        // bu kisimda Do While döngüsünü olusdurduk

        String tercih = "";
        do {

            System.out.println(
                    "\n============= TECHNO STUDY BOOTCAMP =============\n" +
                            "================== OGRENCI MENU =================\n" +
                            "\t   1- Ogrenci Listesi Yazdir\n" +
                            "\t   2- Soyisimden Ogrenci Bulma\n" +
                            "\t   3- Sinif ve Sube Ile Ogrenci Bulma\n" +
                            "\t   4- Bilgilerini Girerek Ogrenci Ekleme\n" +
                            "\t   5- Kimlik No Ile Kayit Silme \t\n" +
                            "\t   A- ANAMENU\n" +
                            "\t   Q- CIKIS");

            System.out.print("Lutfen Menuden tercihinizi yapiniz:");

            tercih = scan.nextLine().toLowerCase();

            switch (tercih) {
                case "1":  // Ogrenci Listesi Yazdir
                    ogrenciListeYazdir();
                    break;
                case "2":  // soyisimden Ogretmen bulma
                    soyisimdenOgrenciBulma();
                    break;
                case "3":  // sinif ve subeden bulma
                    sinifVeSubeIleOgrenciBulma();
                    break;
                case "4":
                    ogrenciEkle();
                    break;
                case "5":
                    tcNoIleOgrenciSilme();
                    break;
                case "a":
                    Helper.anaMenu();
                    break;
                case "q":
                    break;
                default:
                    System.out.print("Lutfen gecerli bir tercih giriniz:");
            }
        }while (!tercih.equalsIgnoreCase("q"));

        Helper.projeDurdur();
    }
         /*       // "1":
                    ogrenciListeYazdir();

                // "2": // Soyisimden Ogrenci Bulma
                    soyisimdenOgrenciBulma();

                // "3": // Sinif ve Sube Ile Ogrenci Bulma
                    sinifVeSubeIleOgrenciBulma();

                // "4": // Bilgilerini Girerek Ogrenci Ekleme
                    ogrenciEkle();

                // "5":
                    tcNoIleOgrenciSilme();

                // "A" VEYA "a":
                    Helper.anaMenu();

                // "Q" VEYA "q":
                    Helper.projeDurdur();

                    //   HATALI TERCİH DURUMUNDA TEKRAR SEÇİM İSTENMELİ
                    System.out.println("Lutfen gecerli tercih yapiniz:");



        }

        // ÇIKIŞ YAPILIRSA
        Helper.projeDurdur();

    }*/

    private static void tcNoIleOgrenciSilme() throws InterruptedException {
        System.out.println("Silinecek ogrenci kimlik no giriniz");
        String silinecekOgrenci = scan.nextLine();

        String silinecekValue = ogrenciMap.get(silinecekOgrenci);
        String sonucValue = ogrenciMap.remove(silinecekOgrenci);

        System.out.print(silinecekOgrenci + "Siliniyor...");
        for (int i = 0; i < 20; i++) {
            Thread.sleep(100);
            System.out.print(">");
        }
        //  Programın çalışmaya devam etmesi için gerekli
        try {
            boolean sonuc = sonucValue.equals(silinecekValue);
        } catch (Exception e) {
            System.out.println("Istediginiz TC numarasi ile ogrenci bulunamadi");
        }

    }

    ///////////////////////////////////////////////////////////////////////////////////

    // TODO ogrenciEkle() methodunu doldurunuz
    private static void ogrenciEkle() { // bu metodu biz yazdik, kisim bosdu
            System.out.println("Ögrenci Kimlik No giriniz :");
            String OgrenciTC=scan.nextLine();
            System.out.println("Ögrenci ismini, soyismini, dogumyilini, okulNo, sinifi, subesini aralarina virgül koyarak giriniz : ");
            String OgrenciBilgi=scan.nextLine();
            Veritabani.ogrenciMap.put(OgrenciTC,OgrenciBilgi);
        // burayi doldurduktan sonra asagidaki kodu siliniz (sout u)
        // System.out.println("KONSOLDAN ALDIĞINIZ BİLGİLERLE MAP'E ÖĞRENCİ EKLEYİNİZ ");



    }

    ///////////////////////////////////////////////////////////////////////////////////

    // TODO sinifVeSubeIleOgrenciBulma() methodunu doldurunuz
    // OgretmenManager classindaki branstanOgretmenBulma() methodundan faydalanabilirsiniz
    private static void sinifVeSubeIleOgrenciBulma() throws InterruptedException {
        System.out.println("Aradiginiz Ögrencinin sinifini Giriniz:");
        String istenenSinif = scan.nextLine();

        System.out.println("Aradiginiz Ögrencinin subesini Giriniz");
        String istenenSube = scan.nextLine();

        System.out.print(istenenSinif +" "+ istenenSube+ " Ögrencileri Listeleniyor...");
        for (int i = 0; i < 20; i++) {
            Thread.sleep(100);
            System.out.print(">");
        }

        Set<Map.Entry<String, String>> ogrenciEntrySet = ogrenciMap.entrySet();
        System.out.println(
                "\n============= TECHNO STUDY BOOTCAMP =============\n" +
                        "============Sinif ve Sube ile Ögrenci ARAMA ============\n" +
                        "TcNo : Isim , Soyisim , D.Yili , Brans");

        // Daha düzgün bi görünüm için printf veya String.format kullanılabilir... İsteğe bağlı
        for (Map.Entry<String, String> each : ogrenciEntrySet) {
            String eachKey = each.getKey();
            String eachValue = each.getValue();

            String[] eachValuarr = eachValue.split(", ");
            if (istenenSinif.equalsIgnoreCase(eachValuarr[4])&&istenenSube.equalsIgnoreCase(eachValuarr[5])) {
                System.out.println(eachKey + " : " + eachValue + " | ");
            }
        }

        // burayi doldurduktan sonra asagidaki kodu siliniz (sout u)
       // System.out.println("///// KONSOLDAN ALDIGINIZ BILGILERLE, ARANAN OGEYI (SINIF VE SUBE) ICEREN MAP ELEMANLARINI LISTELEYINIZ ////////");




    }

    ///////////////////////////////////////////////////////////////////////////////////

    // TODO soyisimdenOgrenciBulma() methodunu doldurunuz
    // bu kismi biz doldurduk
    private static void soyisimdenOgrenciBulma() throws InterruptedException {
            System.out.println("Aradiginiz Ögrencinin Soyismini Giriniz:");
            String istenenSoyisim = scan.nextLine();

            System.out.print(istenenSoyisim+ " Ögrenci Listeleniyor...");
            for (int i = 0; i < 20; i++) {
                Thread.sleep(100);
                System.out.print(">");
            }

            Set<Map.Entry<String, String>> ogrenciEntrySet = ogrenciMap.entrySet();
            System.out.println(
                    "\n============= TECHNO STUDY BOOTCAMP =============\n" +
                            "============SOYISIM ILE OGRETMEN ARAMA ============\n" +
                            "TcNo : Isim , Soyisim , D.Yili , Brans");

            // Daha düzgün bi görünüm için printf veya String.format kullanılabilir... İsteğe bağlı
            for (Map.Entry<String, String> each : ogrenciEntrySet) {
                String eachKey = each.getKey();
                String eachValue = each.getValue();

                String[] eachValuarr = eachValue.split(", ");
                if (istenenSoyisim.equalsIgnoreCase(eachValuarr[1])) {
                    System.out.println(eachKey + " : " + eachValue + " | ");
                }
            }

        // burayi doldurduktan sonra asagidaki kodu siliniz (sout u)
        // System.out.println("///// KONSOLDAN ALDIGINIZ BILGILERLE (SOYISIM), ARANAN OGEYI ICEREN MAP ELEMANLARINI LISTELEYINIZ ////////");




    }

    ///////////////////////////////////////////////////////////////////////////////////

    // TODO ogrenciListeYazdir() methodunu doldurunuz
    // BU kismi biz doldurduk
    private static void ogrenciListeYazdir() throws InterruptedException {
        Set<Map.Entry<String, String>> ogrenciEntrySet = ogrenciMap.entrySet();
        System.out.println(
                "\n============= TECHNO STUDY BOOTCAMP =============\n" +
                        "============ ÖGRENCI LISTESI ============\n" +
                        "TcNo : Isim , Soyisim , D.Yili , Brans");
        for (Map.Entry<String, String> each : ogrenciEntrySet)
            System.out.println(each.getKey()+" :  "+ each.getValue());


        // burayi doldurduktan sonra asagidaki kodu siliniz (sout u)
        // System.out.println("/////VERITABANI SINIFINDAKI MAP'TE BULUNAN OGRENCILERIN LISTESINI YAZDIRINIZ///////// ");




    }
}
