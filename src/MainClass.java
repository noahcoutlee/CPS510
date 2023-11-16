import java.io.*;
import java.util.*;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;
import java.util.Properties;

//import java.util.Scanner;

/**
 * CPS 510 Assignment - Payroll Management System
 * @author Bosko Pajkic, Noah Coutlee, Clay Barnett
 */


public class MainClass {
    // Declare Global Variables Here!
    static String FirstName = "Bosko";
    
    
    
    
    public static void main(String[] args) throws SQLException {
        // Put DataBase Code Here? Put in 
        Connection conn1 = null;

        String dbURL1 = "jdbc:oracle:thin:vcbarnet/01065145@oracle12c.scs.ryerson.ca:1521:orcl12c";  // that is school Oracle database and you can only use it in the labs
																						
	conn1 = DriverManager.getConnection(dbURL1);
        if (conn1 != null) {
            System.out.println("Connected with connection #1");
        }

        String query = "select * from DEPARTMENT";

        try (Statement stmt = conn1.createStatement()) {

        ResultSet rs = stmt.executeQuery(query);

        
        while (rs.next()) {
                
                System.out.println(rs.getString(3) + ", " + rs.getString(2));
        }
        } catch (SQLException e) {
            System.out.println("JEFF");
                System.out.println(e.getErrorCode());
        }
        
        
//        while (rs.next()) {
//                String name = rs.getString("DEPARTMENT_ID");
//                String num = rs.getString("NAME");
//                System.out.println(name + ", " + num);
//        }
//        } catch (SQLException e) {
//            System.out.println("JEFF");
//                System.out.println(e.getErrorCode());
//        }
//        
        
        
        
        

//        greet(FirstName);
//
//        FirstName = "Pajkic";
//        greet(FirstName);

        //Shows First Screen
        LoginScreen loginScreen = new LoginScreen();
        loginScreen.show();
    }
    
    
    
    
    // Put Functions Here
    public static void greet(String message) {
        System.out.println(message);
    }
    
    
}
