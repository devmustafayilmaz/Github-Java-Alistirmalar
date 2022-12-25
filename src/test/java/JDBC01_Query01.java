import java.sql.*;

public class JDBC01_Query01 {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {

        // 1 - ilgili driver ı yüklemeliyiz - MySql kullandiğimiz için bildiriyoruz.
        // driver ı bulamama ihtimaline karşı forname methodu benden classNotFoundException için main methoda exeption fırlatmak istiyo
        Class.forName("com.mysql.cj.jdbc.Driver");

        // 2 - Bağlantıyı oluşturmak için username ve password girişi yapıcaz
        // burada da username ve password un yanlıs olmasina karsi getcollection methodu sql exception fırlatmamı istiyo.
        Connection con =DriverManager.getConnection("jdbc:mysql://localhost:3306/sys?serverTimezone=UTC", "root", "Docker@123");

        // 3 - SQl Queryleri için bir statement projesi olusturup java da kendimize sql sorguları için bir alan açacağız.

        Statement st =con.createStatement();


        // sql sorgularını yazabilir ve çalıştırabilirsin.

        ResultSet veri = st.executeQuery("SELECT * FROM calisanlar");

        // 5 - sonuçlari görmek için iteration ile set içersindeki elemanları while döngüsünde yazdiricaz

        while (veri.next()){
            System.out.println(veri.getInt("id")+" "+veri.getString("isim")+" "+veri.getString("sehir" )
                    +" "+veri.getInt("maas")+ " " + veri.getString("sirket"));
        }
        System.out.println("=============================ORNEK 2===============================");

        String sorgu="SELECT isim, sehir, maas FROM calisanlar ORDER BY maas DESC LIMIT 3";
        ResultSet veri2 = st.executeQuery(sorgu);
        while(veri2.next()){
            System.out.println(veri2.getString(1)+"  "+veri2.getString(2)+"  "+veri2.getInt(3));
        }
        // NOT1 : Sorgulama icin get ile istenirse sütun (field) ismini yazabilecegimiz gibi sutun index
        // (field olusturulma sirasina gore) yazilabilir.
        // NOT2 : sorgumuzda select'ten sonra sadece belli field lari döndürmesini istiyosak get ile çağırdığımız field inde leri sorguda belittiğimiz
        // sırayla bize geri döner.

        con.close();
        st.close();
        veri.close();
    }





}
