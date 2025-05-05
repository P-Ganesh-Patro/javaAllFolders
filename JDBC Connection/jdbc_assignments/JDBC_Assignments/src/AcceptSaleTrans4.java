import java.sql.Timestamp;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.*;

public class AcceptSaleTrans4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        DBdetails dBdetails = new DBdetails();
        String sqlString = "insert into sales(itemName, qty, price, totalPrice, sale_date) values(?,?,?,?,?)";
        try (Connection conn = dBdetails.getObjConnection()) {
            System.out.print("Please Enter Item Name:- ");
            String itemName = in.nextLine();
            System.out.print("please enter quantity:- ");
            int qty = in.nextInt();
            System.out.print("Enter The price of each one:- ");
            int price = in.nextInt();
            int totalPrice = qty * price;
            Timestamp curDate = new Timestamp(System.currentTimeMillis());
            SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
            String date = dateFormat.format(curDate);
            PreparedStatement ppsmnt = conn.prepareStatement(sqlString);
            ppsmnt.setString(1, itemName);
            ppsmnt.setInt(2, qty);
            ppsmnt.setInt(3, price);
            ppsmnt.setInt(4, totalPrice);
            ppsmnt.setString(5, date);
            int insert_data = ppsmnt.executeUpdate();
            System.out.println(insert_data + " row affected..");
            
            Statement stmnt = conn.createStatement();
            ResultSet rs = stmnt.executeQuery("select * from sales");
            System.out.println("--------------------------------------------------------------------------");
            ResultSetMetaData rsmd = rs.getMetaData();
            for (int i = 1; i <= rsmd.getColumnCount(); i++) {
                System.out.print(rsmd.getColumnLabel(i) + "  |  ");
            }
            System.out.println();
            System.out.println("--------------------------------------------------------------------------");
            while (rs.next()) {
                for (int i = 1; i <= rsmd.getColumnCount(); i++) {
                    System.out.print(rs.getString(i) + "    |   ");
                }
                System.out.println();
            }
            System.out.println("------------------------------------------------------------------------");

        } catch (Exception e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
        in.close();
    }

}
