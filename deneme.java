public class deneme {

    int yas;
    String ad;
    String soyad;

    deneme(int yas,String ad,String soyad){
        this.ad=ad;
        this.soyad=soyad;
        this.yas=yas;


    }

    public void  fonk(){
        System.out.println("bu araba hizlaniyor");
    }
    public void  fonk2(int maxSpeed){
        System.out.println("this car's max speed is: " + maxSpeed);
        

    }
}
