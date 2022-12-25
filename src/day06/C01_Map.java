package day06;

import day05.MapDepo;
import java.util.Arrays;
import java.util.Map;
import java.util.TreeMap;
public class C01_Map {
    public static void main(String[] args) {
        // verilen bir cümlede kullan,lan herbir harfi
        // ve o harfin kullanim miktarini
        // A=5, b=3....gibi yazdirin

        String str = "Javayi balonu patlamadan bitirelim";
        // J=1, a=7, v=1, y=1....
        String[] harflerArr=str.split("");
        //System.out.println(Arrays.toString(harflerArr));
        Map<String,Integer>kullanimMiktariMap=new TreeMap<>();

        //1-tüm harfleri sirasi ile ele alacağız
        int sayac=1;
        for (int i = 0; i < harflerArr.length; i++) {
            // 2- ele aldığımız hafin, daha önce map e eklenip eklenmediğini kontrol edelim.
            if (kullanimMiktariMap.containsKey(harflerArr[i])) {
                continue;
            }else {
                // kod buraya geldiyse o harf map e eklenmemiştir.
                // o zaman bu harfin kullanim miktarini kabul etmiş oluruz.
                for (int j = i+1; j < harflerArr.length; j++) {
                    if (harflerArr[j].equals(harflerArr[i])) {
                        sayac++;
                    }
                }
                // Sayma işlemi bitti key ve value yu map e ekleyelim.
                kullanimMiktariMap.put(harflerArr[i],sayac);
                sayac=1;
            }
        }
        System.out.println(kullanimMiktariMap);
    }
}
