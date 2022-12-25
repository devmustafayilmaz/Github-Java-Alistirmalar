package day01;

public class Q1_Print {
    public static void main(String[] args) {
    /*
        Konsolda :
       "Hello "\ / 'World'"
       yazdiriniz.
       /*
      \n (or \r)  : Starts from a new line : Metni bir alt satırdan itibaren yazdırır.
              \t  : Horizontal tab         : Metni yatayda 1 tab miktarı kaydırır.
              \\  : Prints a back slash    : \  Ters slash yazdırır
              \'  : Prints single quote    : '  Tek tırnak yazdırır.
              \"  : Prints double quote    : "  Çift tırnak yazdırır.
     */

        System.out.println("\"Hello\"\\ / 'World'\"");
        System.out.println("****************************************\n\t\t\"ATM'ye Hosgeldiniz\"");
        System.out.println("************************************" +
                "\n\t\t\"ATM'ye Hosgeldiniz\"\n\n\t" +
                "1- Bakiye Sorgulama\n\t" +
                "2- Para Yatirma\n\t" +
                "3- Para Cekme\n\t" +
                "4- Menu'den Cikis\n\n" +
                "************************************");

        System.out.println(3+7);            // 10      matematiksel toplama
        System.out.println("ali" + "ayse"); // aliayse concatination



    }
}
