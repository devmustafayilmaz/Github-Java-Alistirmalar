package day02;

import java.util.Scanner;

public class Q2_Scanner_IfStatement {
    public static void main(String[] args) {
        /*
    Bir dersten alinan vize, final ve devam puanlarinin girilip ortalama hesaplandiktan sonra dersten gecilip
    gecilmedigini consola yazdiran bir program yazalim.
     */
        // ortalama = vizenin %10'i + finalin %80'si + devam puaninin %10'u

        Scanner scan =new Scanner(System.in);
        System.out.println("vize notunu giriniz:\n"+"Final notunu giriniz:\n"+"devam günü :");
        double vize=scan.nextDouble();
        double fiNal=scan.nextDouble();
        int gun=scan.nextInt();
        double ortalama = (vize*10/100)+(fiNal*80/100)+(gun*10/100);
        if(ortalama>60 && gun>10){
            System.out.println("geçtiniz..."+ortalama);
        }else if (ortalama>=55 && gun>10){
            System.out.println("şartlı geçtiniz.."+ortalama);
        }else{
            System.out.println("kaldiniz..."+ortalama);
        }
    }
}
