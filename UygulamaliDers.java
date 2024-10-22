
public  abstract class  UygulamaliDers extends Dersler {

public UygulamaliDers(String dAd,int dKod,int donem,boolean secmelimi,Akademisyen dSorumluadi,int kredi) {
super(dAd, dKod, donem, secmelimi, dSorumluadi, kredi);
}


public String notHesapla(double...notlar) {
if (notlar.length != 2) {
}
double ortalama = (notlar[0] * 0.4) + (notlar[1] * 0.6);
return super.harfNotu(ortalama);
}
}








    








