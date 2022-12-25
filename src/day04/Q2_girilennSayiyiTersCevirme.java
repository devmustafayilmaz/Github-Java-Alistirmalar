package day04;

import java.util.Scanner;

public class Q2_girilennSayiyiTersCevirme {
    public static void main(String[] args) {
        int input=86754;
        System.out.println(reverseNumber(input));

    }public static int reverseNumber(int input){

        int reverseNumber=0;
        while(input>0){
            reverseNumber=input%10+reverseNumber*10;
            input=input/10;




        }return reverseNumber;


    }
}
