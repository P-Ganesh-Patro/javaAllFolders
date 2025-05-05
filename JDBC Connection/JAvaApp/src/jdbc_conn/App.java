package jdbc_conn;

import java.util.Scanner;

import java.sql.Statement;
import java.sql.Types;
import java.text.SimpleDateFormat;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.Date;

public class App {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        try {
            Connection conn = DBConnection.getObjConnection();
            if (conn != null) {
                System.out.println("Database Connection Successfullly...");
            }
            Statement stmt = conn.createStatement();
            stmt.execute("use admin");
           
            System.out.println("Enter the values:- ");
            System.out.print("enter the item name:-");
            String itemName = in.nextLine();
            System.out.print("enter the item qty:-");
            int qty = in.nextInt();
            System.out.println("enter the item price:- ");
            int price = in.nextInt();
            Integer total_price = null;
            System.out.println("enter the date:- ");
            Date curDate = new Date(System.currentTimeMillis());
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            String date = sdf.format(curDate);
            // System.out.println(date);

            String sqlString = "{call insert_sales(?,?,?,?,?)}";
            CallableStatement clbl = conn.prepareCall(sqlString);
            if(total_price != null){
                clbl.setInt(4, total_price);

            }else{
                clbl.setNull(4, Types.INTEGER);
            }

            clbl.setString(1, itemName);
            clbl.setNull(2, Types.INTEGER);
            clbl.setInt(3, price);
            clbl.setInt(4, total_price);
            clbl.setDate(5, Date.valueOf(date));
            int insertData = clbl.executeUpdate();
            System.out.println(insertData + " data inserted..");
            System.out.println("data inserted..");
    


        } catch (Exception e) {
            System.out.println("failed database connection...");
            e.printStackTrace();
        }

    }

}
