package day03;

import java.util.Scanner;

public class C01_method {
    public static void main(String[] args) {
         Scanner scan = new Scanner(System.in);
        System.out.println("lutfen iki sayi girniz:");
        double sayi1=scan.nextDouble();
        double sayi2=scan.nextDouble();
        System.out.println("yapmak istedginiz islemi seciniz:"+
                "\n\t-toplmama icin +\n\t çıkarma için -\n\tÇarpma için *\n\tBolme için /");
        char islem=scan.next().charAt(0);
        System.out.println(calculator(islem, sayi1, sayi2));

   /* }
    public static String islemAl(){
        String input =

    }*/

    }

    public static double calculator(char islemTipi,double num1, double num2){
        double sonuc=0;
        switch (islemTipi){
            case '+' :
                sonuc = num1+num2;
                break;
            case '-' :
                 sonuc = num1-num2;
                break;
            case '*' :
                 sonuc = num1*num2;
                 break;
            case '/' :
                bolme(num1,num2);
                break;
        }


        return  sonuc;
    }


    public static double bolme(double bolen, double bolunen) {
        if (bolen==0 && !(bolunen==0))
            return Double.POSITIVE_INFINITY;
        else if (bolen==0 && bolunen==0)
            return Double.NaN;
        else return bolunen/bolen;

    }
}
