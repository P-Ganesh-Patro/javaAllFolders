import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.*;

public class UpdateNewName1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        DBdetails dBdetails = new DBdetails();

        String sqlQuery = "update products set prodName = ? where  prodId = ?";
        // pro-id = 101 - 105
        try (Connection conn = dBdetails.getObjConnection()) {
            System.out.println("DataBase Connected Successfully..");
            System.out.print("Please Enter Product Id:- ");
            int ProId = in.nextInt();
            in.nextLine();
            System.out.print("Please Enter Product Name:- ");
            String ProName = in.nextLine();
            PreparedStatement ppstmnt = conn.prepareStatement(sqlQuery);
            ppstmnt.setString(1, ProName);
            ppstmnt.setInt(2, ProId);
            int updated_row = ppstmnt.executeUpdate();
            System.out.println(updated_row + " row affected..");
        } catch (Exception e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
        in.close();
    }

}
