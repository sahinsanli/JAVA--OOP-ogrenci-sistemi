
import java.util.ArrayList;
import java.util.List;

public class BilgiPaketi {

private List<Dersler> tumDersler;

public BilgiPaketi() {
    tumDersler = new ArrayList<>();
}

public void dersEkle(Dersler ders) {
    tumDersler.add(ders);
}

public void transkriptSorgula(Ogrenci ogrenci) {
    System.out.println(ogrenci.getAdSoyad() + " Ders Listesi:");
    for (Dersler ders : tumDersler) {
        if (ders.ogrenciKayitliMi(ogrenci.getNo())) {
            System.out.print(ders.dAd + " dersi ");
            System.out.print("kredisi " + ders.kredi + " ");
            System.out.println("harf notu " + ders.harfNotu(0) + " ");
        }
    }
}
}
