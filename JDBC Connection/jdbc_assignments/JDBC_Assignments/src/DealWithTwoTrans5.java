import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.Savepoint;
import java.util.Scanner;

public class DealWithTwoTrans5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        DBdetails dBdetails = new DBdetails();
        try (Connection conn = dBdetails.getObjConnection();) {
            conn.setAutoCommit(false);

            String updateProduct1 = "update products set prodName= ?  where ProdId = ?";
            String insertProduct2 = "insert into products values(?,?,?)";
            Savepoint savepoint1 = null;
            try {
                System.out.println("Please enter the update details:- ");
                // in.nextLine();
                System.out.println("Please Enter the ProdName:- ");
                String prodname = in.nextLine();
                System.out.println("Please Enter Prod Id:- ");
                int prodId = in.nextInt();

                PreparedStatement ppsmnt = conn.prepareStatement(updateProduct1);
                ppsmnt.setString(1, prodname);
                ppsmnt.setInt(2, prodId);
                int updateTable = ppsmnt.executeUpdate();
                System.out.println(updateTable + " row affected...updated");

                savepoint1 = conn.setSavepoint();

                System.out.println("Please enter the insert data:- ");
                System.out.println("Enter the proid:- ");
                int prod_Id = in.nextInt();
                System.out.println("Enter the product Name:- ");
                in.nextLine();
                String prod_name = in.nextLine();
                System.out.println("Enter the price:- ");
                int prod_price = in.nextInt();

                PreparedStatement ppsmnt1 = conn.prepareStatement(insertProduct2);
                ppsmnt1.setInt(1, prod_Id);
                ppsmnt1.setString(2, prod_name);
                ppsmnt1.setInt(3, prod_price);
                int insertTable = ppsmnt1.executeUpdate();
                System.out.println(insertTable + " row affected...inserted");

                conn.releaseSavepoint(savepoint1);
                System.out.println("Transactions success");
                conn.commit();

            } catch (Exception e) {

                conn.rollback();
                System.out.println("Transaction faild...");
                e.printStackTrace();
                try {
                    conn.rollback(savepoint1);

                } catch (Exception e1) {
                    System.out.println("Error:- " + e1.getMessage());

                }
            }
            in.close();
        } catch (Exception e) {
            System.out.println("Error:- " + e.getMessage());
            e.printStackTrace();
        }
    }

}
