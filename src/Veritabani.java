

import java.util.HashMap;
import java.util.Map;

public class Veritabani {

    // TODO BU SINIFTA BİRŞEY DEĞİŞTİRMENİZE GEREK YOK.
    //  PROGRAM BAŞLAR BAŞLAMAZ, AŞAĞIDAKİ METODLAR, main METODU İÇEREN CLASS'TA ÇALIŞACAK,
    //  BÖYLECE AŞAĞIDAKİ ÖĞRENCİLER ÖĞRENCİ LİSTESİNE; ÖĞRETMENLER ÖĞRETMEN LİSTESİNE EKLENMİŞ OLACAKTIR.
    //  SİZ DE OgrenciManager VE OgretmenManager'da YAZACAĞINIZ METODLARLARLA,
    //  ASLINDA BU LİSTELERİ DEĞİŞTİRMİŞ OLACAKSINIZ.


    // ÖĞRETMEN MENÜDEKİ LİSTELEME-EKLEME-SİLME-ARAMA METODLARI BU LİSTEYİ ETKİLEYECEK.
    static Map<String, String> ogretmenlerMap = new HashMap<>();

    public static void baslangicOgretmenVeritabaniOlustur() {
        ogretmenlerMap.put("125377443411", "Yesim, Akbag, 1980, Matematik");
        ogretmenlerMap.put("121234587412", "Veli, Denli, 1981, Fizik");
        ogretmenlerMap.put("127659877413", "Ayse, Yesil, 1982, Kimya");
        ogretmenlerMap.put("134657667414", "Mehmet, Can, 1983, Kimya");
        ogretmenlerMap.put("198765437415", "Alp, Can, 1984, Matematik");
    }

    static Map<String, String> ogrenciMap = new HashMap<>();
    // ÖĞRENCİ MENÜDEKİ LİSTELEME-EKLEME-SİLME-ARAMA METODLARI BU LİSTEYİ ETKİLEYECEK.

    public static void baslangicOgrenciVeritabaniOlustur() {
        ogrenciMap.put("469922399405", "Ali, Can, 2008, 3569, 12, A");
        ogrenciMap.put("165776787406", "Hikmet, Ran, 2008, 3559, 12, B");
        ogrenciMap.put("143244487408", "Ayse, Can, 2007, 4569, 12, A");
        ogrenciMap.put("648643787403", "Ahmet, Yesil, 2009, 1569, 11, A");
        ogrenciMap.put("124366967407", "Zehra, Kara, 2009, 3769, 11, A");
    }
}
