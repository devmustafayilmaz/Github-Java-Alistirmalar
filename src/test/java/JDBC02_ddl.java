import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBC02_ddl {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        /*
         A) CREATE TABLE, DROP TABLE, ALTER TABLE gibi DDL ifadeleri icin sonuc kümesi (ResultSet)
      dondurmeyen metotlar kullanilmalidir. Bunun icin JDBC'de 2 alternatif bulunmaktadir.


           1) execute() metodu
           2) executeUpdate() metodu.

   B) - execute() metodu her tur SQL ifadesiyle kullanibilen genel bir komuttur.
      - execute(), Boolean bir deger dondurur. DDL islemlerinde false dondururken,
        DML islemlerinde true deger dondurur.
      - Ozellikle, hangi tip SQL ifadesinin kullanilmasinin gerektiginin belli olmadigi
        durumlarda tercih edilmektedir.

   C) - executeUpdate() metodu ise INSERT, Update gibi DML islemlerinde yaygin kullanilir.
      - bu islemlerde islemden etkilenen satir sayisini dondurur.
      - Ayrıca, DDL islemlerinde de kullanilabilir ve bu islemlerde 0 dondurur.
         */

        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/sys?serverTimezone=UTC", "root", "Docker@123");

        Statement st =con.createStatement();
       /* String dropTable = "DROP TABLE ogrenciler";
        if (!st.execute(dropTable)){
            System.out.println("ogrenciler tablosu silindi");
        }else {
            System.out.println("ogrenciler tablosu silme islemi basariyla silinemedi!");
        }*/


        /*============================================================

         ============================================================*/
            String createTable = "CREATE TABLE ogrenciler" +
                                "(id INT," +
                                "birim VARCHAR(10)," +
                                "maas INT)";


        if (!st.execute(createTable)){
            System.out.println("ogrenciler oluştu");
        }else {
            System.out.println("ogrenciler tablosu silme islemi basariyla silinemedi!");
        }

/*=======================================================================
          ORNEK4: isciler tablosuna birden fazla yeni kayıt ekleyelim.

            INSERT INTO isciler VALUES(70, 'HR', 5000)
            INSERT INTO isciler VALUES(60, 'LAB', 3000)
            INSERT INTO isciler VALUES(50, 'ARGE', 4000)*/
        String [] sorgular ={"INSERT INTO ogrenciler VALUES(70,'HR',5000)",
                              "INSERT INTO ogrenciler VALUES(60,'LAB',3000)",
                                "INSERT INTO ogrenciler VALUES(50,'HR',4000)"};
        int count=0;
        for (String each:sorgular){
            count+=st.executeUpdate(each);
        }
        System.out.println(count + "satir eklendi");

        }
    }
