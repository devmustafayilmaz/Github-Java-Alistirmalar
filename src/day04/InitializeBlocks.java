package day04;

public class InitializeBlocks {
    /*
        Java’da bulunan initialization(ilk kullanima hazirlama) blocks konusundan bahsedecegim.
        Java da 2 turlu initialization block vardir.

        static initialization block
        instance initialization block

        Bir sinif yuklediginde ilk olarak ve sadece 1 kez static initialization block calisir.
        Instance olusturulduğunda her defasında instance initialization block calisir.

        Aşağıda basit bir ornek yapalim ;
     */
    static {
        System.out.println("Static Initialization Block");
    }

    {
        System.out.println("Instance Initialization Block");
    }

    public static void main(String[] args) {

        System.out.println("Main -1 ");
        InitializeBlocks initial = new InitializeBlocks();
        InitializeBlocks initial2 = new InitializeBlocks();

        /*
        Bu ornekte ilk olarak  Main-1 den once static initialization block calisacaktir.

        Daha sonrasinda 2 instance olusturdugumuz icin 2 defa instance initialization block calisacaktir.

        static initialization block ise sadece bir kez calisir.
         */

    }


}
