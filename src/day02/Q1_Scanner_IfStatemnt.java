package day02;

import java.util.Scanner;

public class Q1_Scanner_IfStatemnt {
    public static void main(String[] args) {

    /*
         Kullaniciya
         * 1 = Gunde kac bardak cay ictigini,
         * 2 = Her bardak icin kac kup seker kullandigini sorup;
         kullanicinin yillik ve 40 yillik seker tuketimini kg bazinda  consolda yazdiran bir program yazin.
         * Kullanici eger seker kullanmiyorsa "Aferin, boyle devam et :)" ciktisini gorsun.
          (1 kup seker = 2.77 gr)
    */
        Scanner scan =new Scanner(System.in);
        System.out.println("Gunde kaç bardak cay iciyordunuz:");
        float bardak= scan.nextFloat();
        System.out.println("kaç seker atiyosunuz:");
        float seker= scan.nextFloat();

        if (seker!=0){

        double yillik=(bardak*seker*2.77*365)/1000;
        int yillik1=(int)yillik;
        double kirkYillik=yillik*40;
        System.out.println("yillik tüketim "+yillik1+" kg");


    }else{
            System.out.println("aferin bu şekilde devam et");
        }
 }

}