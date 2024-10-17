private List<Ders> tumDersler;

public class BilgiPaketi() {
    tumDersler = new ArrayList<>();
}

public void dersEkle(Ders ders) {
    tumDersler.add(ders);
}

public void transkriptSorgula(Ogrenci ogrenci) {
    System.out.println(ogrenci.getAdSoyad() + " Ders Listesi:");
    for (Ders ders : tumDersler) {
        if (ders.ogrenciKayitliMi(ogrenci.getNumara())) {
            System.out.print(ders.dersAdi + " dersi ");
            System.out.print("kredisi " + ders.kredi + " ");
            System.out.println("harf notu " + ders.harfNotu(0) + " ");
        }
    }
}
