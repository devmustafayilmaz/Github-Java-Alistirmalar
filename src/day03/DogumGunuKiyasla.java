package day03;

import java.util.Scanner;

public class DogumGunuKiyasla {
    //kullanıcıdan iki farkli dogum gunu tarihini alıp,
    //kimin önce doğduğunu consolda yazdiran bir progrma yazdirin.
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("lutfen Yil / Ay / Gun olarak "
        + " istediğiniz doğum gününü giriniz:");
        int yil1= scan.nextInt();
        int ay1= scan.nextInt();
        int gun1= scan.nextInt();
        System.out.println("lutfen Yil / Ay / Gun olarak "
                + " istediğiniz doğum gününü giriniz:");
        int yil2= scan.nextInt();
        int ay2= scan.nextInt();
        int gun2= scan.nextInt();
        if (yil1 > yil2) {
            System.out.println("ayse ahmetten buyuktur..");
        }else if (yil1<yil2){
            System.out.println("ahmet ayseden buyuktur..");
        }else {

            if(ay1>ay2){
                System.out.println("ayse ahmetten buyuktur..");
            }else if (ay2>ay1){
                System.out.println("ahmet ayşeden buyuktur.");
            }else{
                if (gun1>gun2){
                    System.out.println("ayşe ahmetten buyuktur.");
                }else if (gun2>gun1){
                    System.out.println("ahmet ayşeden buyuktur..");
                }else {
                    System.out.println("ayni gün doğdunuz..");
                }
            }


        }

        int ahmetDogumGunu = yil1 * 10000 + ay1 * 100 +gun1;
        int ayseDogumGunu = yil2 * 10000 + ay2 * 100 +gun2;
        if (ahmetDogumGunu>ayseDogumGunu){
            System.out.println("ahmet ayseden buyuktur.");
        }else if (ayseDogumGunu>ahmetDogumGunu){
            System.out.println("ayşe ahmetten buyuktur.");
        }else{
            System.out.println("aynı yaştasınız..");
        }

    }

}