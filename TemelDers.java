 class TemelDers extends Dersler{
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
