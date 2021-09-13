package sample;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class InsertInfo extends Main{

    public Connection connect() {
        Connection conn;
        try {
            conn = DriverManager.getConnection("jdbc:sqlite:C:/Users/pooja/Downloads/db/userinfo.db");
            return conn;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }
    }


    public void insert(User account) {
        String query = "INSERT INTO info_table(ID,FULLNAME,EMAIL,PASSWORD) VALUES(?,?,?,?)";
        try (Connection conn = this.connect();
             PreparedStatement pstmt = conn.prepareStatement(query)) {
            pstmt.setInt(1, User.getId());
            pstmt.setString(2, account.getName());
            pstmt.setString(3, account.getEmailId());
            pstmt.setString(4, account.getPassword());
            pstmt.executeUpdate();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public boolean authenticate(String name, String pw) {
        String query = "SELECT * FROM info_table WHERE (FULLNAME = ?)";
        try (Connection conn = this.connect();
             PreparedStatement pstmt = conn.prepareStatement(query)) {
            pstmt.setString(1, name);
            ResultSet result = pstmt.executeQuery();
            if((result.getString("PASSWORD")).equals(pw)){
                return true;
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } return false;
    }
    public void insert_prod(CommProd cp){
        String query = "INSERT INTO prod_table(title,desc,quantity,category,id,ship_add,price) VALUES(?,?,?,?,?,?,?)";
        try (Connection conn = this.connect();
             PreparedStatement pstmt = conn.prepareStatement(query)) {

            pstmt.setString(1, cp.getProdTitle());
            pstmt.setString(2, cp.getDescription());
            pstmt.setInt(3, cp.getQuantity());
            pstmt.setString(4, "Books");
           // pstmt.setInt(5, cp.getID());
            pstmt.setInt(5, User.getId());
            pstmt.setString(6, cp.getAd());
            pstmt.setDouble(7, cp.getPrice());

            pstmt.executeUpdate();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    public void insert_prod(EssProd cp){
        String query = "INSERT INTO prod_table(title,desc,quantity,category,id,ship_add,price) VALUES(?,?,?,?,?,?,?)";
        try (Connection conn = this.connect();
             PreparedStatement pstmt = conn.prepareStatement(query)) {

            pstmt.setString(1, cp.getProdTitle());
            pstmt.setString(2, cp.getDescription());
            pstmt.setInt(3, cp.getQuantity());
            pstmt.setString(4, "Books");
            // pstmt.setInt(5, cp.getID());
            pstmt.setInt(5, User.getId());
            pstmt.setString(6, cp.getShipAdd());
            pstmt.setDouble(7,0.0);

            pstmt.executeUpdate();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
   CommProd get_prod(String name){
        String query = "SELECT * FROM prod_table WHERE (title = ?)";
        try (Connection conn = this.connect();
             PreparedStatement pstmt = conn.prepareStatement(query))
        {
            pstmt.setString(1, name);
            ResultSet result = pstmt.executeQuery();

            CommProd c=new CommProd(result.getString("title"),result.getString("desc"),Integer.parseInt(result.getString("quantity")),Double.parseDouble(result.getString("price")),"");
            return  c;
            }
         catch (Exception e){
            System.out.println(e.getMessage());
        }
        CommProd c1=new CommProd(" "," ",0,0.0," ");
        return c1;
    }

}


