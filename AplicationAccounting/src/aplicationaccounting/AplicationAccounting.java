/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aplicationaccounting;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.DriverManager;
/**
 *
 * @author Yoggg
 */
public class AplicationAccounting {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
      connect();
    }
    public static void connect(){
        Connection conn = null;
        try{
            String url = "jdbc:sqlite:temp.db";
            conn = DriverManager.getConnection(url);
            System.out.println("Connect berhasil bangsat ");
        }
        catch(SQLException e){
         System.out.println(e.getMessage());
    }finally{
            try{
            if(conn!=null){
            conn.close();
            }
            }catch(SQLException ex){
            System.out.println(ex.getMessage());
          }
    
    }
        
    }
    
    
}
