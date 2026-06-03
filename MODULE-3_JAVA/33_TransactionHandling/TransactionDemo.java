import java.sql.*;

class TransactionDemo{
    public static void main(String args[]){

        try{

            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection con=DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/bankdb",
                "root",
                "password"
            );

            con.setAutoCommit(false);

            PreparedStatement ps1=con.prepareStatement(
                "update accounts set balance=balance-1000 where id=1"
            );

            PreparedStatement ps2=con.prepareStatement(
                "update accounts set balance=balance+1000 where id=2"
            );

            ps1.executeUpdate();
            ps2.executeUpdate();

            con.commit();

            System.out.println("Transaction Successful");

            con.close();

        }
        catch(Exception e){
            System.out.println("Transaction Failed");
        }
    }
}