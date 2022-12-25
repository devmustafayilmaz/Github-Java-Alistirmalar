package day05;

import java.util.HashMap;
import java.util.Map;

public class Mapss {
    public static void main(String[] args) {
        Map<Integer,String>ogrenciMap=MapDepo.ornekMapOlustur();
        ogrenciMap.put(105,"Hasan-Can-11-K-MF");
        ogrenciMap.put(108,"Hikmet-Han-10-M-TM");
        System.out.println(ogrenciMap);

        // 108 numarali ogrencinin isim ve soyisim bilgilerini yazınız..

        System.out.println(MapDepo.isimSoyIsimYazdir(ogrenciMap,108));
        // 104 numarali öğrencinin şubesini K yapiniz..
        int ogrenciKey=105;
        String yeniSube="N";
        ogrenciMap=MapDepo.ogrenciyeYeniSubeAta(ogrenciMap,ogrenciKey,yeniSube);

        System.out.println(ogrenciMap);

    }
}
