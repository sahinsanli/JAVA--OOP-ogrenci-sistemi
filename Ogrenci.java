public class Ogrenci{
    private final int no;
    private final  String ad;
    private final String soyad;
    private final String bolum;
    private final String fakulte;
    private final int girisYili;
    private final int Sinif;
    public Ogrenci(String ad,String soyad,int no,String bolum,String fakulte,int Sinif,int girisYili){
        
        this.ad=ad;
        this.soyad=soyad;
        this.bolum=bolum;
        this.fakulte=fakulte;
        this.no=no;
        this.girisYili=girisYili;
        this.Sinif=Sinif;

    }
    public String getAd() {
        return ad;
    }
    public String getSoyad() {
        return soyad;
    }
    public int getNo() {
        return no;
    }
    public int getSinif() {
        return Sinif;
    }
    public int getGirisYili() {
        return girisYili;
    }
    public String getBolum() {
        return bolum;
    }
    public String getFakulte() {
        return fakulte;
    }

   


}
