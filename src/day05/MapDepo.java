package day05;

import java.util.HashMap;
import java.util.Map;

public class  MapDepo {
    //ogrenci map olusturup bize donduren method
    public static Map<Integer,String> ornekMapOlustur(){
        Map<Integer,String>ogrenciMap=new HashMap<>();
        ogrenciMap.put(101,"Ali-Can-10-H-MF");
        ogrenciMap.put(102,"Veli-Cem-11-M-Soz");
        ogrenciMap.put(103,"Ali-Cem-11-H-TM");
        ogrenciMap.put(104,"Ayse-Can-10-H-MF");
        ogrenciMap.put(105,"Ayse-Cem-11-M-TM");
        ogrenciMap.put(106,"Fatma-Han-10-K-Soz");
        return ogrenciMap;

    }


    public static String isimSoyIsimYazdir(Map<Integer, String> ogrenciMap, int ogrenciKey) {

        String ogrenciValue = ogrenciMap.get(ogrenciKey);//Ayse-Cem-11-M-TM
        String [] valueArr = ogrenciValue.split("-");
        String isimSoyIsim = valueArr[0]+" "+valueArr[1];

        return isimSoyIsim;
    }


    public static Map<Integer,String> ogrenciyeYeniSubeAta(Map<Integer, String> ogrenciMap, int ogrenciKey,String yeniSube) {
        // istenen Key varsa, update edip yeni map'e dondureceğiz.
        // yoksa gelen map'i aynen geri dondureceğiz.
        // ogrenci key map'de var mi?

        if (ogrenciMap.containsKey(ogrenciKey)){
            // istenen Key varsa, update edip yeni map'e dondureceğiz.

            String istenenKeyinValuesu=ogrenciMap.get(ogrenciKey); //Ayse-Can-10-H-MF
            String [] istenenKeyValueArr = istenenKeyinValuesu.split("-");//[Ayse,Can,10,H,MF]
            // yeni sube degerini atayacağız.
            istenenKeyValueArr[3]=yeniSube;
            String istenenKeyinYeniValuesu=istenenKeyValueArr[1]+"-"+
                                istenenKeyValueArr[2]+"-"+
                                istenenKeyValueArr[3]+"-"+
                                istenenKeyValueArr[4];
            ogrenciMap.put(ogrenciKey,istenenKeyinYeniValuesu);

        }
        return ogrenciMap;
    }
}
