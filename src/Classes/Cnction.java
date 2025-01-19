/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Classes;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
public class Cnction {
    static Connection con;
    public static Connection getConnection(){
    try{
    Class.forName("com.mysql.jdbc.Driver");
    con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/cis","root","");
    }catch(ClassNotFoundException | SQLException ex){
        System.out.println(ex);
    }
    return con;
    
    }
}
// by creating this class we can recall the connection any time we want 