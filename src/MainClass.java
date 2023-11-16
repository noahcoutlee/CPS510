
import java.io.*;
import java.util.*;


//import java.util.Scanner;

/**
 * CPS 510 Assignment - Payroll Management System
 * @author Bosko Pajkic, Noah Coutlee, Clay Barnett
 */


public class MainClass {
    // Declare Global Variables Here!
    static String FirstName = "Bosko";
    
    
    
    
    public static void main(String[] args) {
        // Put DataBase Code Here? Put in 
        

        greet(FirstName);

        FirstName = "Pajkic";
        greet(FirstName);

        //Shows First Screen
        LoginScreen loginScreen = new LoginScreen();
        loginScreen.show();
    }
    
    
    
    
    // Put Functions Here
    public static void greet(String message) {
        System.out.println(message);
    }
    
    
}
