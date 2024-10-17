
import java.util.ArrayList;
import java.util.List;

abstract  class Dersler {
   protected  String dAd;
   protected int dKod;
   protected int donem;
   protected  boolean secmelimi;
   protected Akademisyen dSorumluadi;
   protected int kredi;
     private List<Ogrenci> ogrenciListesi;

     public void DerseYazilim(Ogrenci ogrenci){
        ogrenciListesi.add(ogrenci);
     }
    
   public  Dersler(String dAd,int dKod,int donem,boolean secmelimi,Akademisyen dSorumluadi,int kredi){

        this.dAd=dAd;
        this.dKod=dKod;
        this.donem=donem;
        this.dSorumluadi=dSorumluadi;
        this.kredi=kredi;
        this.secmelimi=secmelimi;
        ogrenciListesi = new ArrayList<>();


    }
    public abstract String nothesapla(double...notlar);
    public void derseYazilim(Ogrenci ogrenci) {
        ogrenciListesi.add(ogrenci);
        }
        public boolean ogrenciKayitliMi(int numara) {
            for (Ogrenci ogrenci : ogrenciListesi) {
            if(ogrenci.getNo() == numara)
            return true;
            }
            return false;
            }

            public void listeyiYazdir() {
               // System.out.println(dAd + &quot; Öğrenci Listesi:&quot;);
                for (Ogrenci ogrenci : ogrenciListesi) {
                System.out.println(ogrenci.getAd()+ogrenci.getSoyad());
                }

            }

    protected String harfNotu(double ortalama){
        if(ortalama >= 90){
            System.out.println("AA");
        }
        else if( ortalama  >= 80)
        {
            System.out.println("BA");
        }
        else if( ortalama  >= 70)
        {
            System.out.println("BB");
        }
        else if( ortalama  >= 60)
        {
            System.out.println("CB");
        }
        else if( ortalama  >= 40)
        {
            System.out.println("CC");
        }
        else if( ortalama  >= 30)
        {
            System.out.println("DD");
        }
        else{
            System.out.println("FF");
        }
        return null;
        


    }


}


abstract class TemelDers extends Dersler{
    public TemelDers(String dAd,int dKod,int donem,boolean secmelimi,Akademisyen dSorumluadi,int kredi){
        super(dAd, dKod, donem, secmelimi, dSorumluadi, kredi);   

    }

    @Override
    public String nothesapla(double...notlar){

        if(notlar.length !=3)

        throw new IllegalArgumentException("Temel dersler için 3 not girilmelidir");

        double ortalama = (notlar[0] * 0.3 + (notlar[1]* 0.5) + (notlar[2] * 0.2));
        return super.harfNotu(ortalama);
    }
        

    }
    public abstract  class UygulamaliDers extends Dersler {
public UygulamaliDers(String dAd,int dKod,int donem,boolean secmelimi,Akademisyen dSorumluadi,int kredi) {
super(dAd, dKod, donem, secmelimi, dSorumluadi, kredi);
}


public String notHesapla(double... notlar) {
if (notlar.length != 2) {

}
double ortalama = (notlar[0] * 0.4) + (notlar[1] * 0.6);
return super.harfNotu(ortalama);
}
}
 abstract class MeslekiEğitimDersi extends Dersler {
public MeslekiEğitimDersi(String dAd,int dKod,int donem,boolean secmelimi,Akademisyen dSorumluadi,int kredi) {
super(dAd, dKod, donem, secmelimi, dSorumluadi, kredi);
}


public String notHesapla(double... notlar) {
if (notlar.length != 1) {

}
return super.harfNotu(notlar[0]);
}







    




}



