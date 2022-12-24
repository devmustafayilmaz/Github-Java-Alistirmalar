package day05;

import java.util.Arrays;

public class A1 {
    public static void main(String[] args) {
        int []arr={32,435,5,4,7,4,3,6,7,7,8,98,6};
        enKucukVeEnBuyukSayiYaz(arr);
    }
    public static void enKucukVeEnBuyukSayiYaz(int[]arr){
        Arrays.sort(arr);
        System.out.println("enBuyukSayi : "+arr[arr.length - 1]);
        System.out.println("enKucukSayi: "+arr[0]);
    }
}
