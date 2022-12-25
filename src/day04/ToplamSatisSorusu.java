package day04;

import java.util.Scanner;

public class ToplamSatisSorusu {
    public static void main(String[] args) {
        //satıs yapılan bir firmada satisların toplam tutarını hesaplayarak
        //ekranda görüntüleyen programi yaziniz.
        Scanner scan =new Scanner(System.in);
        double tutar=0;
        double toplamTutar=0;
        char cevap;

        do {
            System.out.println("sattiginiz urun ne kadar:");
            double urunFiyati=scan.nextDouble();
            System.out.println("kaç adet sattiniz:");
            int adet=scan.nextInt();
            tutar=urunFiyati*adet;
            System.out.println("yeni deger girmek istiyor musunuz:");
            cevap=scan.next().charAt(0);
            toplamTutar+=tutar;


        }while (cevap=='e'||cevap=='E');

        System.out.println("toplam urun sayisi :"+toplamTutar);


    }
}
