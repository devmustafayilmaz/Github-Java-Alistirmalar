package day04;

import java.util.Random;
import java.util.Scanner;
//bir sayi tahmin oyunu yapacağız. sayi tahmin oyununda kullanıcının üç hakkı vardır.
//her tahminden sonra eğer bilinemezse kullanıcıya ipucuyu ve kaç hakkı kaldığını ekrana çıktı olarak göstereceğiz.
//bilmesi halinde "TEBRİK" eden bir çıktı vereceğiz.
// o halde programı do-While döngüsü ile yazalım.

public class TahminOyunuu {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        Random random=new Random();
        int randomSayi= random.nextInt(10);
        int count=0;
        int count2=2;
        do {

            System.out.println("lutfen 0-10 arasında tahmin giriniz:");
            int tahmin=scan.nextInt();
            if (tahmin>10){
                System.out.println("yukarıdaki ifadeyi doğru oku 0-10 arasi gireceksin!!!");
            }

            if (tahmin<randomSayi) {
                System.out.println("daha buyuk sayi giriniz!!");
                if(count2==0){
                    System.out.println("hakkın bitti gecmis olsun!!");
                } else{
                    System.out.println(" ipucunu iyi kullan "+count2+" hakkın kaldı!!!" );
                }
            }
            else if (tahmin>randomSayi) {
                System.out.println("daha kucuk bir sayi giriniz:");
                if(count2==0){
                    System.out.println("hakkın bitti gecmis olsun!!");
                }else{
                    System.out.println(" ipucunu iyi kullan "+count2+" hakkın kaldı!!!" );
                }
            }
            else{
                System.out.println("Tebrikler :))))) BİLDİN !!!!!");
                break;
            }
            count++;
            count2--;



        }while (count<3);
        System.out.println("random sayi "+randomSayi);
    }
}
