
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
System.out.println("ad = " + adOgrenci.getAd());

int data = 40;
int data2 = 50;
System.out.println(data*data2);
 

int userScore = 423;
int maxScore = 500;

float percentage = (float) userScore/maxScore * 100;

System.out.println("user's  percentage is: " + percentage);

int day = 4;

 switch (day) {
    case 4:
        System.out.println("thursday");
        break;
    default:
        throw new AssertionError();
}

myMethod();

int myNum = plusMethod(8, 7);
double myNum2 = plusMethod(8.789 , 9.679);

System.out.println(myNum);
System.out.println(myNum2);

int number = 5;
int result = faktr(number);
System.out.println(result);

deneme d = new deneme();
d.fonk();
d.fonk2(300);



}




}