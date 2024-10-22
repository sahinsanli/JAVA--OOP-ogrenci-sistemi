class app {
    public static void main(String[] args) {
        Ogrenci ogrenci1 = new Ogrenci("Ali ", "Veli", 1, "Yazilim", "Teknoloji", 2024, 1);
        Ogrenci ogrenci2 = new Ogrenci("ahmet ", "kaya", 2, "enerji", "Teknoloji", 2023, 2);
        Ogrenci ogrenci3 = new Ogrenci("şaban ", "kirat", 3, "inşaat", "Teknoloji", 2022, 3);

        Akademisyen akademisyen1 = new Akademisyen("sahin", "sanli");
        Akademisyen akademisyen2 = new Akademisyen("zeki ", "sanli");

        BilgiPaketi bilgiPaketi = new BilgiPaketi();

       
        TemelDers ders1 = new TemelDers("mat",1,1,true,akademisyen1,10);
        //UygulamaliDers lab1 = new UygulamaliDers("YTM", 301, 2, false, akademisyen2, 3);

        bilgiPaketi.dersEkle(ders1);
        //bilgiPaketi.dersEkle(lab1);

        ders1.derseYazilim(ogrenci1);
        ders1.derseYazilim(ogrenci2);
        ders1.derseYazilim(ogrenci3);

        //lab1.derseYazilim(ogrenci1);
        //lab1.derseYazilim(ogrenci3);

        ders1.listeyiYazdir();
        //lab1.listeyiYazdir();

        bilgiPaketi.transkriptSorgula(ogrenci1);
        bilgiPaketi.transkriptSorgula(ogrenci2);
    }
}