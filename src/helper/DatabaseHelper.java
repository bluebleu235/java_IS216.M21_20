/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package helper;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author nhokk
 */
public class DatabaseHelper {

    public static Connection openConnection() throws Exception {
        //Class.forName("oracle.jdbc.driver.OracleDriver");
        String url = "jdbc:mysql://localhost:3306/is216";
        var user = "root";
        var password = "";
        Connection con = DriverManager.getConnection(url, user, password);
// Buoc 2: Tao doi tuong Connection  
        //Connection con = DriverManager.getConnection(
                //"jdbc:oracle:thin:@localhost:1521:orcl", "system", "123");
        return con; 
    }

}
