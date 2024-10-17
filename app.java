
public   class app {

    static  void myMethod(){
        System.out.println("i just got executed");
    }
    static int plusMethod(int x , int y){
        return x + y;
    }

    static double  plusMethod(double x , double y){
        return x + y;
    }

   public static int faktr(int x){
       if(x==1 || x==0){
        return 1;
       }
       else{
        return x*faktr(x-1);
       }
    }

    public class Main {
        int x = 5;

    }

public static void main(String[] args) throws Exception{
Ogrenci adOgrenci = new Ogrenci("sahin", "sanli", 42788, "yazilim", "of tek fak", 3, 2022);


Ogrenci ogrenci1 = new Ogrenci("Ali","Veli", 1, "Yazilim","Teknoloji", 2024, 1);
Ogrenci ogrenci2 = new Ogrenci("Ali","Veli", 2,"Yazilim","Teknoloji", 2024, 1);
BilgiPaketi bilgiPaketi = new BilgiPaketi();
TemelDers ders1 = new TemelDers("Matematik",101,"Güz",
false, akademisyen1, 2);
UygulamaliDers lab1 = new UygulamaliDers("YTM",301,
false, akademisyen2, 3);

ders1.derseYazilim(ogrenci1);
ders1.derseYazilim(ogrenci2);
ders1.derseYazilim(ogrenci3);
lab1.derseYazilim(ogrenci1);
lab1.derseYazilim(ogrenci3);
ders1.listeyiYazdir();
lab1.listeyiYazdir();







 







}




}