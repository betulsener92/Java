package Variables;

public class Variables01 {
    //Variable nasil olusturulur??

    //1)Access Modifier   2)Data Type     3)Variable ismi   4) =    5)Deger   6) ;
    // Java'da ";" Ingilizce'deki "." gibidir
    // Ingilizce'de "cumle" deriz, Java'da "statement" deriz

    // "=" sembolu "Assignment Operator" olarak adlandirilir
    // "Assignment(Atama) Operator" sagdaki degeri alir soldaki variable'in icine koyar

    public int age = 13;
    public int height = 183;

    //Java'da Data Type'lari
    /*
                                    Primitive Data Types
         1)int: Integer'ın kisaltmasi. Integer tam sayi demektir.   32 bit kullanir.
                Matematik'te tam sayilarin basi ve sonu yoktur fakat Java'da tam sayilarin basi ve sonu vardir
                En kucuk int = -2,147,483,648
                En buyuk int =  2,147,483,647

         2)byte: Tam sayilar icin kullanilir.   8 bit kullanir.
                 En kucuk byte = -128
                 En buyuk byte = 127

         3)short: Tamsayilar icin.   16 bit kullanir.
                  En kucuk short = -32768
                  En buyuk short =  32767

         4)long: Tamsayilar icindir.   64 bit kullanir.
                 En kucuk long = -9,223,372,036,854,755,808
                 En buyuk long =  9,223,372,036,854,755,807

         5)float: Ondalık sayilar icindir.   32 bit kullanir.
                  "float" virgulden sonra 7 basamak icerebilir
                  "float" degerlerinde sona "f" veya "F" koymanız gerekir

         6)double: Ondalik sayilar icindir.    64 bit kullanir.
                   "double" virgulden sonra 16 basamak icerebilir

         7)boolean: "true" veya "false" degerleri icin kullanilir. 1 bit kullanir.

         8)char: Tek karakterler icin kullanilir.  16 bit kullanir
                 A, c, 2, ?, _, =
                 Note: "char" lara deger verirken, degeri tek tırnak arasına koyunuz. Yoksa hata verir.
                 Note: Java buyuk ve kucuk harflere duyarlidir.
                       Java icin TRUE ile true tamamen farklidir.

         Note: Numeric Data Types: byte < short < int < long < float < double
               Numeric Olmayan Data Types: boolean - char

                                      Non-Primitive Data Types
         String   : Isim, adres, kimlik numarasi gibi bir veya birden fazla karakter iceren degerlerde kullanilir.
                    String degerleri mutlaka cift tirnak icine konulmalidir
                    String non-primitive dir. Yani bir String olusturdugunuzda Java size bir suru method verir.

     */
    public byte price = 12;
    public short populationOfVillage = 23000;

    public float priceOfShirt = 13.99F;
    public double weightOfCell = 0.000012045;

    //Siz "long" demenize ragmen Java verilen sayiyi "int" kabul eder
    //Bu yuzden, long bir Variable'a "int" araliginin disinda bir sayi verirseniz mutlaka sonuna "l" veya "L" koyunuz
    public long populationOfWorld = 7000000000L;

    //Burada "L" koymadigimiz halde problem yok cunku "1234" int araligina uyar.
    public long x = 1234;

    public boolean isOld = true;
    public boolean isRich = false;

    public char initial = 'S';

    public String name = "Tom Hanks";

    //Note: "main method" arabanin motoru gibidir.
    //      "main method" calismadan hic birsey calismaz.
    //      pvsm yazip entera basarak çalıştirilir

     /*      Primitive ile Non-Primitive lerin farkı?
      1) Non-primitive data type larinda degerin yaninda methodlar vardir.
         Primitive data typlarin da ise sadece deger vardir, method yoktur.
      2)Primitive data type larinda Java tarafindan olusturulmustur, toplam 8 tanedir, biz primitive data olusturamayiz
        Non-Primitive data type lari Java tarafindan da olusturulmustur, biz de olusturabiliriz. Non-Primitive sayilamayacak
        kadar coktur, cunku her developer Non-Primitive data type olusturabilir.
      3)Primitive data type lari kucuk harflerle baslar
        Non-Primitive data type isimleri büyük harfle baslar.
      4)Primitive data type lar memoryde farkli buyuklukte yerler kullanir.
        Non-Primitive lerin hepsi memoryde ayni buyuklukte yer kullanirlar.

        Her class non-primitive data tipidir.
        Betul
      */

    public static void main(String[] args) {


    }

}
