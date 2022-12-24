package day05;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class A2 {
    public static void main(String[] args) {
        List<String>harfEkle=new ArrayList<>();

        //String [] arr={"i","a","c","A","d"};
        /*for (int i = 0; i < arr.length; i++) {
            harfEkle.add(arr[i]);
        }
        System.out.println(harfEkle);
        System.out.println();*/

        String [] arr1= {"ahmet","mehmet","gizem","emin","mustafa"};
        for (int i = 0; i < arr1.length; i++) {
            harfEkle.add(arr1[i]);
        }
        harfEkle.add("zeynep");
        harfEkle.add("ilker");
        System.out.println(harfEkle);
        List<Integer>sayilar=new ArrayList<>();
        int[] sayi = {1,3,4,5,5,6,7};
        for (int i = 0; i < sayi.length; i++) {
            sayilar.add(i);
        }
        System.out.println(sayilar);
        List<Integer>eklenecekListe = new ArrayList<>();
        eklenecekListe.add(9);
        eklenecekListe.add(10);
        sayilar.addAll(eklenecekListe);
        System.out.println(sayilar);
        System.out.println(sayilar.contains(7));




    }
}
