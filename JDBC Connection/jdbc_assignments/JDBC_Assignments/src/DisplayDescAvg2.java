import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;

public class DisplayDescAvg2 {
    public static void main(String[] args) {
        DBdetails dBdetails = new DBdetails();
        String sqlString = "select avg(p.price) avg_price, c.CatDesc, p.prodName from products p inner join categories c on c.proId = p.prodId GROUP by c.CatDesc, p.prodName";
        try (Connection conn = dBdetails.getObjConnection()) {
            Statement stmnt = conn.createStatement();
            ResultSet rs = stmnt.executeQuery(sqlString);
            ResultSetMetaData rsmd = rs.getMetaData();
            System.out.println("---------------------------------");
            for (int i = 1; i <= rsmd.getColumnCount(); i++) {
                System.out.print(rsmd.getColumnLabel(i) + "   |   ");
            }
            System.out.println();
            System.out.println("---------------------------------------");

            while (rs.next()) {
                for (int i = 1; i <= rsmd.getColumnCount(); i++) {
                    System.out.print(rs.getString(i) + " | ");
                }
                System.out.println();

            }
            System.out.println("----------------------------------------");

        } catch (Exception e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
    }

}
