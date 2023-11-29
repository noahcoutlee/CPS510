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
    int IS_ADMIN;
    ResultSet rs_emp;
    
    public Employee() {
        
    }
    
    public Employee(int EMPLOYEE_ID, int DEPARTMENT_ID, String FIRST_NAME, String LAST_NAME, String DATE_OF_BIRTH, int SIN_NUMBER, String DATE_HIRED, String PAYROLL_TYPE, double SALARY, int VAC_DAYS_TOTAL, int VAC_DAYS_LEFT, int SICK_DAYS_TOTAL, int SICK_DAYS_LEFT, int PERS_DAYS_TOTAL, int PERS_DAYS_LEFT, String USERNAME, String PASSWORD, int BANK_ID, int BRANCH_NUMBER, int ACCOUNT_NUMBER, int IS_ADMIN) {
        this.EMPLOYEE_ID = EMPLOYEE_ID;
        this.DEPARTMENT_ID = DEPARTMENT_ID;
        this.FIRST_NAME = FIRST_NAME;
        this.LAST_NAME = LAST_NAME;
        this.DATE_OF_BIRTH = DATE_OF_BIRTH;
        this.SIN_NUMBER = SIN_NUMBER;
        this.DATE_HIRED = DATE_HIRED;
        this.PAYROLL_TYPE = PAYROLL_TYPE;
        this.SALARY = SALARY;
        this.VAC_DAYS_TOTAL = VAC_DAYS_TOTAL;
        this.VAC_DAYS_LEFT = VAC_DAYS_LEFT;
        this.SICK_DAYS_TOTAL = SICK_DAYS_TOTAL;
        this.SICK_DAYS_LEFT = SICK_DAYS_LEFT;
        this.PERS_DAYS_TOTAL = PERS_DAYS_TOTAL;
        this.PERS_DAYS_LEFT = PERS_DAYS_LEFT;
        this.USERNAME = USERNAME;
        this.PASSWORD = PASSWORD;
        this.BANK_ID = BANK_ID;
        this.BRANCH_NUMBER = BRANCH_NUMBER;
        this.ACCOUNT_NUMBER = ACCOUNT_NUMBER;
        this.IS_ADMIN = IS_ADMIN;
    }
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


