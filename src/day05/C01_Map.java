package day05;

import java.util.Map;

public class C01_Map {
    public static void main(String[] args) {
        Map<Integer,String>ogrenciMap=MapDepo.ornekMapOlustur();
        System.out.println(ogrenciMap);

        ogrenciMap.put(110,"Fatih-Yan-10-P-MF");
        System.out.println(ogrenciMap);
        ogrenciMap.put(102,"Veli-Dem-12-D-Soz");
        System.out.println(ogrenciMap);
        // 103 nolu ogrencinin isim ve soyisimini yazdirin.
        System.out.println(MapDepo.isimSoyIsimYazdir(ogrenciMap, 103));

        //105 nolunogrencinin subesini s yapın
        System.out.println(MapDepo.ogrenciyeYeniSubeAta(ogrenciMap, 105, "S"));


    }
}
