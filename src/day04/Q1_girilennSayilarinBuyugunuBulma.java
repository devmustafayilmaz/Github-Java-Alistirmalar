package day04;

import java.util.Scanner;

public class Q1_girilennSayilarinBuyugunuBulma {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("lutfen 5 adet sayi giriniz:");

        int enBuyukSayi=0;
        int sayac=0;
        while(sayac<5){
            int sayi=scan.nextInt();
            if (sayi>enBuyukSayi){
                enBuyukSayi=sayi;

            }sayac++;




        }
        System.out.println("girilen 5 sayidan en buyugu : "+ enBuyukSayi);



    }
}
