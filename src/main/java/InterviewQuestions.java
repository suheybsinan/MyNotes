public class InterviewQuestions {
    public static void main(String[] args) {

        /*
        Interview Sorusu: "primitive" ve "non-primitive" data type'lari arasindaki fark nedir?
        1)"primitive" ler sadece bizim atadigimiz degeri icerir,
        "non-primitive" ler bizim atadigimiz deger ve method'lar icerir.
        2) "primitive" ler kucuk harfle baslar, "non-primitive" ler buyuk harfle baslar.
        3) "primitive" leri Java uretmistir ve 8 tanedir,
                "non-primitive" leri Java ve developerlar uretebilir, sinirsiz sayidadir.
        4) "primitive" ler memory'de data type'ina gore yer kaplar,
        "non-primitive" ler icin Java memeory'de hepayni buyuklukte yer ayirir.

        */

        /*
                1)Access modifier'lar genis'den dara; public > protected > default > private
                2)Class'lar protected ve private olamazlar, sadece public ve default olabilirler
                3)Access Modifier'lar ne ise yarar?
                        Variablelara methodlara classlara ulasmayi duzenler.
                4)Kac tane access modifier var ?
                        public > protected > default > private
                        i) "public"ler icin hicbir sinirlama yoktur projenin her yerinden ulasilabilir
                        ii) "protected" ayni package'in icinden ya da farkli packagelarda o packagedeki cocuklar ulasabilir.
                        iii) "default" sadece ayni packageden ulasilabilir. Bu yuzden "default"larin diger adi "package private"dir
                        iv) "private"  sadece class icinden ulasilabilir, class disina cikildiginda ulasilamaz
                        v) "protected" ile "default"un farki nedir ?
                           Package disina ciktigimizda childlardan "protected"lara ulasabiliriz. "default"lara ulasamayiz.
         */

        /*
        OOP Principals:
          i)Inheritance +
          ii)Polymorphism: Method Overloading + Method Overriding
          iii)Encapsulation -
          iv)Abstraction -
         */




        //****************************************
        /*

        int a = 12;
        int b = 5; // Swap'den sonra ==> a=5 ve b=12
        int temp = 0;

        System.out.println("a: " + a);//12
        System.out.println("b: " + b);//5

        //1.Yol:
        //I.Adim
        temp = a;

        //II.Adim
        a = b;

        //III.Adim
        b = temp;

        System.out.println("a: " + a);//5
        System.out.println("b: " + b);//12

        //2.Yol:
        int x = 12;
        int y = 5;

        x = x + y;
        y = x - y;
        x = x - y;


        //****************************************



        //Example 1: Bir String'deki bir character'in tekrarli veya tekrarszi olup olmadigini gosteren kodu yaziniz
        //               "aab" ==> b-> tekrarsiz a-> tekrarsiz  seklinde



        String t = "aab";

        char ch1 = t.charAt(0);

        if (t.indexOf(ch1) == t.lastIndexOf(ch1)) {
            System.out.println(ch1);
        }

        char ch2 = t.charAt(1);
        if (t.indexOf(ch2) == t.lastIndexOf(ch2)) {
            System.out.println(ch2);
        }

        char ch3 = t.charAt(2);
        if (t.indexOf(ch3) == t.lastIndexOf(ch3)) {
            System.out.println(ch3);
        }


        /*

        Markette belli baslı sertifikalar öne cıkarır sizi.
        OCA sertifikası olanı teknik mulakata almaya gerek duymuyorlar
        mesela Seren hocamın yazdıgı ISTQB de cok önem azretmeye basladı markette
        oracle den java sertifikasi.


         */
        // BVA Testi (Boundry Value Analysis) = Kritik degerlerden oncesinden ve sonrasindan bir daha daha alarak yapilan test.
        //        Ornegin asagidaki soruda 7 kritik deger ve once sonra toplam 9 deger ile yapilan test.


        /*

        //INTERWIEW QUESTIONS
        //String karakterleri teker teker yazdiran;
        //Eger 'a' karakterini gorurse yazdirmayi durduran kodu yaziniz

        String cumle="Ogrenmek yasamin tek kanitidir";

        for (int i = 0;     i < cumle.length();        i++) {
            if(cumle.charAt(i) == 'a'){
                break;
            }//if body
            System.out.print(cumle.charAt(i)+"  ");

        }


        // break ve continue key word lerin anlamlari , ne ise yararlar.
        // break loop tan disari atar.
        // continue bazi sartlar icin loop un adimlarini atlamamizi saglar.



        // util class a su su metodlari olusturdum su durumlarda kullaniliyor.
        // QA olarak olusturacagiz. selenium da ..


        /*

        //Interwiew
        //Size verilen bir String'i ters ceviren kodu yaziniz
        String str="Mustafa";//afatsuM
        String ters= "";//yeni bir conteyner olusturduk
        for (int i = str.length()-1; i >-1 ; i--) {
            char harf=str.charAt(i);
            // ters=ters+harf;
            ters+=harf;
        }
        System.out.println(ters);


        //           civic, nalan, kucuk, 11211 ==> Palindrome
        //           Logic: String'i ters cevir sonra da duz hali ile ters halini karsilatir, ayni ise "Palindrome" de.
        //Example 1: 5'den 8'e kadar tamsayilarin toplamini veren kodu yaziniz.
        //           5 + 6 + 7 + 8 ==> 26
        //Example 2: 7'den 9'a kadar tamsayilarin carpimini veren kodu yaziniz.
        //           7*8*9 ==> 504
    /*
            Example 1: Asagidaki ciktiyi verecek kodu yaziniz
                        Week: 1
                          Day: 1
                          Day: 2
                          Day: 3
                          .....
                        Week: 2
                          Day: 1
                          Day: 2
                          Day: 3
                          ....
        */

        //Note: Array'lerden bahsederken "length" kullanin, List'lerden bahsederken "size" kullanın.


        /*
        Interview Sorusu: Method ile Constructor'in farki var midir? Varsa nedir?
        Cevap:            Method ile Constructor farkli yapilardir.
                          i)Method'larda "return type" vardir ama "constructor"larda "return type" yoktur.
                          ii)Method'larin ismi yaptiklari ise gore developer'lar tarafindan belirlenir.
                             Constructor'larin ismi ise her zaman Class ismi ile ayni olmalidir.
         */

        /*
        "throw" ile "throws" keyword'leri arasindaki fark nedir?
        1)"throw" method body'si icinde, "throws" ise method paranetzinden hemen sonra kullanilir.
        2)"throw" method body'si icinde istenilen yerde istenildigi kadar kullanilir,
          "throws" ise method paranetzinden hemen sonra sadece bir kere kullanilabilir.
        3)"throw" dan sonra "new" keyword ve "constructor" kullanilarak object olusturulur.
          "throws" dan sonra sadece Exception Class ismi yazilir
        4)"throw" belli sartlar icin Exception atmada kullanilir, "throws" ise application'i Exception attiktan sonra durdurur.
     */

        /*
        1)Exception olsa da, olmasa da calistirmamiz gereken kod'lari "finally block" icine yazariz.
        2)DB ile baglantiyi kesme isini yapan kod'lar gibi kod'lar her halukarda calistirilmalidir, bu tarz
          ko'lari finally block icine koyariz.
        3)"try block" yalniz kullanilamaz
          "try block" + 1 "catch block" mumkundur
          "try block" + 1 "catch block" + 1 "finally block" mumkundur
          "try block" + coklu "catch block" mumkundur
          "try block" + coklu "catch block" + 1 finally block mumkundur
          "try block" + 1 "finally block" mumkundur
        4)Coklu "finally block" kullanilamaz
     */






    }
}
