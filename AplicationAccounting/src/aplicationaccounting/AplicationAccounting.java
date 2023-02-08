/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aplicationaccounting;
import java.sql.Connection;
import java.sql.DriverManager;
/**
 *
 * @author Yoggg
 */
public class AplicationAccounting {

    Connection con = null;
    
    public static Connection connectDB(){    
        try{
            Class.forName("org.sqlite.JDBC");
            Connection con = DriverManager.getConnection("jdbc:sqlite:akunting.sqlite");
            System.out.println("Connection Success!!");
            
            return con;
        }catch(Exception e){
            System.out.println("Connection Failed"+e);
            return null;
        }
    }
       
    public static void main(String[] args) {
        // TODO code application logic here
      connectDB();
    }
    
}
