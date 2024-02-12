

public class Runner {
    // TODO Bu class da bir degisiklik yapmaniza gerek yok
    //   main METODUMUZ BURADA, DOLAYISIYLA PROGRAMIMIZ BURADAN ÇALIŞMAYA BAŞLIYOR.
    //   DEĞİŞİKLİKLERİ İLGİLİ METODLARA GİDEREK, O METODLAR İÇİNDE YAPMALISINIZ...
    public static void main(String[] args) throws InterruptedException {

        //PROGRAM ÇALIŞINCA 5 KİŞİLİK Bİ ÖĞRETMEN LİSTESİ OLUŞUYOR
        Veritabani.baslangicOgretmenVeritabaniOlustur();

        //PROGRAM ÇALIŞINCA 5 KİŞİLİK Bİ ÖĞRENCİ LİSTESİ OLUŞUYOR
        Veritabani.baslangicOgrenciVeritabaniOlustur();

        //ANA MENÜ BAŞLATILIYOR
        Helper.anaMenu();

    }

}