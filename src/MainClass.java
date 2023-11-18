import java.io.*;
import java.util.*;
import java.sql.*;

//import java.util.Scanner;

/**
 * CPS 510 Assignment - Payroll Management System
 * @author Bosko Pajkic, Noah Coutlee, Clay Barnett
 */

class Employee {
    int EMPLOYEE_ID;
    int DEPARTMENT_ID;
    String FIRST_NAME;
    String LAST_NAME;
    String DATE_OF_BIRTH;
    int SIN_NUMBER;
    String DATE_HIRED;
    String PAYROLL_TYPE;
    double SALARY;
    int VAC_DAYS_TOTAL;
    int VAC_DAYS_LEFT;
    int SICK_DAYS_TOTAL;
    int SICK_DAYS_LEFT;
    int PERS_DAYS_TOTAL;
    int PERS_DAYS_LEFT;
    String USERNAME;
    String PASSWORD;
    int BANK_ID;
    int BRANCH_NUMBER;
    int ACCOUNT_NUMBER;
}

public class MainClass {
    // Declare Global Variables Here!												
    static Connection connection;
    static Employee loggedInEmployee = new Employee();
    
    
    public static void main(String[] args) throws SQLException {
        connection = DriverManager.getConnection("jdbc:oracle:thin:vcbarnet/01065145@oracle12c.scs.ryerson.ca:1521:orcl12c");
        if (connection != null) {
            System.out.println("Connected to Database");
        }
        
        
        //Shows First Screen
        LoginScreen loginScreen = new LoginScreen();
        loginScreen.show();
    }
    

    
    // Put Global Functions Here
    
    
}


