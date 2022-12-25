package day05;

import java.util.HashMap;
import java.util.Map;

public class Maps {
    public static void main(String[] args) {
    Map<Integer,String> ogrenciMap = MapDepo.ornekMapOlustur();
        System.out.println(ogrenciMap);
        System.out.println(ogrenciMap.get(101));
        int ogrenciKey=101;
        String isimSoyIsim=MapDepo.isimSoyIsimYazdir(ogrenciMap,ogrenciKey);
        System.out.println(ogrenciKey+" nolu ogrencinin adi-soyadi: "+isimSoyIsim);
    }
}
