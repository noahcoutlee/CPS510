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

public class MainClass extends javax.swing.JFrame {
    
    // Declare Global Variables Here!												
    static Connection connection;
    static Employee loggedInEmployee = new Employee();
    
    
    /**
     * Creates new form MainClass
     */
    public MainClass() {
        initComponents();
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Connecting To Database");

        jLabel2.setText("If you can't get past this screen, make sure you're connected to the VPN");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(jLabel2))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(156, 156, 156)
                        .addComponent(jLabel1)))
                .addContainerGap(22, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jLabel1)
                .addGap(34, 34, 34)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(91, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) throws SQLException {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainClass.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainClass.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainClass.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainClass.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainClass().setVisible(true);
            }
        });
        
        connection = DriverManager.getConnection("jdbc:oracle:thin:vcbarnet/01065145@oracle12c.scs.ryerson.ca:1521:orcl12c");
        if (connection != null) {
            System.out.println("Connected to Database");
        }
        
        
        //Shows First Screen
        LoginScreen loginScreen = new LoginScreen();
        loginScreen.show();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}
