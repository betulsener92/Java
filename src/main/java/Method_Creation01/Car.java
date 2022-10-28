package Method_Creation01;

public class Car {
    public String marka = "Honda";
    public int fiyat = 20000;

    /*
        Note: Class ==> Variable ==> Object ==> Kullanacagiz
                         Method
     */

    public static void main(String[] args) {

        //Object nasil olusturulur?
        //1)Class ismini yaziniz        2)Objeye bir isim veriniz     3) =   4)new keyword unu kullan   5)Class ismi parantezle beraber(Constructor)
        Car                             myHonda                 =              new                        Car();

        System.out.println(myHonda.fiyat);
        System.out.println(myHonda.marka);

        myHonda.hareketEt();
        myHonda.dur();

        Car myCar = new Car();
        myCar.uc();

        //MethodCreation class indan object olusturduk
        MethodCreation obj = new MethodCreation();
        System.out.println(obj.toplamaYap(3,5));

        System.out.println(obj.ucSayiyiCarp(5.2,6,3.2));
    }

    public void hareketEt(){
        System.out.println("Honda guzel hareket eder...");
    }

    public void dur(){
        System.out.println("Honda guvenli durur...");
    }


    public void uc() {
        System.out.println("Ucuyorum");
    }

}
