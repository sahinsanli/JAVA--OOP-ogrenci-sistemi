 public abstract  class MeslekiEğitimDersi extends Dersler {
    public MeslekiEğitimDersi(String dAd,int dKod,int donem,boolean secmelimi,Akademisyen dSorumluadi,int kredi) {
    super(dAd, dKod, donem, secmelimi, dSorumluadi, kredi);
    
    }
    
    public String notHesapla(double... notlar) {
    if (notlar.length != 1) {
    
    }
    double ortalama = (notlar[0] * 0.4) + (notlar[1] * 0.6);
    return super.harfNotu(notlar[0]);
    }
}