import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class InsertNewProduct3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        DBdetails dBdetails = new DBdetails();

        String sqlString = "insert into products values(?, ?, ?)";

        try (Connection conn = dBdetails.getObjConnection();) {
            System.out.print("Please Enter The Product id:- ");
            int ProdId = in.nextInt();
            in.nextLine();
            System.out.print("Please Enter Product Name:- ");
            String prodName = in.nextLine();
            System.out.print("Please Enter Product price:- ");
            int produPrice = in.nextInt();
            PreparedStatement ppsmnt = conn.prepareStatement(sqlString);
            ppsmnt.setInt(1, ProdId);
            ppsmnt.setString(2, prodName);
            ppsmnt.setInt(3, produPrice);
            int insert_row = ppsmnt.executeUpdate();
            System.out.println(insert_row + " row affected...");

        } catch (Exception e) {
            System.out.println("error:- " + e.getMessage());
            e.printStackTrace();
        }
        in.close();

    }

}
