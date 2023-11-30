
import java.util.List;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
import java.sql.*;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author victorbarnett
 */

public class QueryTablesPage extends javax.swing.JFrame {

    /**
     * Creates new form EmpPaystubs
     */
    
    public QueryTablesPage() {
        DefaultTableModel tableModel = new DefaultTableModel();
        List<Paystub> paystubs = getPaystubsFromDatabase();
        // Add columns to the model
        tableModel.addColumn("Pay Date");
        tableModel.addColumn("Gross Amount");
        tableModel.addColumn("Tax Federal");
        tableModel.addColumn("Tax Provincial");
        tableModel.addColumn("CPP");
        tableModel.addColumn("EI");
        tableModel.addColumn("Net Amount");

        // Add rows to the model
        for (Paystub paystub : paystubs) {
            Object[] rowData = {
                    paystub.getPayDate(),
                    paystub.getGrossAmount(),
                    paystub.getTaxFederal(),
                    paystub.getTaxProvincial(),
                    paystub.getCPP(),
                    paystub.getEI(),
                    paystub.getNetAmount()
            };
            tableModel.addRow(rowData);
        }
        
        initComponents();
        paystubTable.setModel(tableModel);
        
        
        
        
        
        
        
        
        
        
        
        
        DefaultTableModel tableModel2 = new DefaultTableModel();
        List<Department> departments = getDepartmentsFromDatabase();
        // Add columns to the model
        tableModel2.addColumn("Name");
        tableModel2.addColumn("Number of Employees");
        tableModel2.addColumn("Department ID");

        // Add rows to the model
        for (Department department : departments) {
            Object[] rowData = {
                    department.name,
                    department.numEmployees,
                    department.departmentID
            };
            tableModel2.addRow(rowData);
        }
        
        departmentTable.setModel(tableModel2);
        
        
        
        
        
        
        DefaultTableModel tableModel3 = new DefaultTableModel();
        List<TaxBracket> taxBrackets = getTaxBracketsFromDatabase();
        // Add columns to the model
        tableModel3.addColumn("Tax Bracket ID");
        tableModel3.addColumn("Year");
        tableModel3.addColumn("Region");
        tableModel3.addColumn("Lower Amount");
        tableModel3.addColumn("Upper Amount");
        tableModel3.addColumn("Tax Rate");

        // Add rows to the model
        for (TaxBracket taxBracket : taxBrackets) {
            Object[] rowData = {
                    taxBracket.tbID,
                    taxBracket.year,
                    taxBracket.region,
                    taxBracket.lower_amount,
                    taxBracket.upper_amount,
                    taxBracket.taxRate
            };
            tableModel3.addRow(rowData);
        }
        
        TaxBracketTable.setModel(tableModel3);
        
        
        
        
        
        
        
        DefaultTableModel tableModel4 = new DefaultTableModel();
        List<Employee> employees = getEmployeesFromDatabase();
        // Add columns to the model
        tableModel4.addColumn("Employee ID");
        tableModel4.addColumn("Department IDt");
        tableModel4.addColumn("First Name");
        tableModel4.addColumn("Last Name");
        tableModel4.addColumn("Date of Birth");
        tableModel4.addColumn("SIN Number");
        tableModel4.addColumn("Date Hired");
        tableModel4.addColumn("Payroll Type");
        tableModel4.addColumn("Salary");
        tableModel4.addColumn("Vacation Total");
        tableModel4.addColumn("Vacation Left");
        tableModel4.addColumn("Sick Total");
        tableModel4.addColumn("Sick Left");
        tableModel4.addColumn("Personal Days Total");
        tableModel4.addColumn("Personal Days Left");
        tableModel4.addColumn("Username");
        tableModel4.addColumn("Password");
        tableModel4.addColumn("Bank ID");
        tableModel4.addColumn("Bank Branch");
        tableModel4.addColumn("Bank Account Number");
        tableModel4.addColumn("Is Admin");

        // Add rows to the model
        for (Employee employee : employees) {
            Object[] rowData = {
                    employee.EMPLOYEE_ID,
                    employee.DEPARTMENT_ID,
                    employee.FIRST_NAME,
                    employee.LAST_NAME,
                    employee.DATE_OF_BIRTH,
                    employee.SIN_NUMBER,
                    employee.DATE_HIRED,
                    employee.PAYROLL_TYPE,
                    employee.SALARY,
                    employee.VAC_DAYS_TOTAL,
                    employee.VAC_DAYS_LEFT,
                    employee.SICK_DAYS_TOTAL,
                    employee.SICK_DAYS_LEFT,
                    employee.PERS_DAYS_TOTAL,
                    employee.PERS_DAYS_LEFT,
                    employee.USERNAME,
                    employee.PASSWORD,
                    employee.BANK_ID,
                    employee.BRANCH_NUMBER,
                    employee.ACCOUNT_NUMBER,
                    employee.IS_ADMIN
            };
            tableModel4.addRow(rowData);
        }
        
        employeeTable.setModel(tableModel4);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        paystubTable = new javax.swing.JTable();
        backButton = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        employeeTable = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        departmentTable = new javax.swing.JTable();
        jScrollPane4 = new javax.swing.JScrollPane();
        TaxBracketTable = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        paystubTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(paystubTable);

        backButton.setText("Back");
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });

        employeeTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(employeeTable);

        departmentTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane3.setViewportView(departmentTable);

        TaxBracketTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane4.setViewportView(TaxBracketTable);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(106, 106, 106)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(backButton)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 534, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 534, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jScrollPane2)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 534, Short.MAX_VALUE)))
                .addContainerGap(93, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(backButton)
                .addContainerGap(30, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        DatabaseOperationsPage databaseScreen = new DatabaseOperationsPage();
        databaseScreen.show();

        dispose();          
    }//GEN-LAST:event_backButtonActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
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
            java.util.logging.Logger.getLogger(EmpPaystubs.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EmpPaystubs.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EmpPaystubs.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EmpPaystubs.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EmpPaystubs().setVisible(true);
            }
        });
    }
    
    private List<Paystub> getPaystubsFromDatabase() {
        List<Paystub> paystubs = new ArrayList<>();
        String sql = "SELECT * FROM all_employee_paystub_view ";
            try (PreparedStatement preparedStatement = MainClass.connection.prepareStatement(sql)) {
                try (ResultSet resultSet = preparedStatement.executeQuery()) {
                    while (resultSet.next()) {
                        Date payDate = resultSet.getDate("pay_date");
                        float grossAmount = resultSet.getFloat("gross_amount");
                        float taxFederal = resultSet.getFloat("tax_federal");
                        float taxProvincial = resultSet.getFloat("tax_provincial");
                        float CPP = resultSet.getFloat("CPP");
                        float EI = resultSet.getFloat("EI");
                        float netAmount = resultSet.getFloat("net_amount");
                        Paystub paystub = new Paystub(payDate, grossAmount, taxFederal, taxProvincial, CPP, EI, netAmount);
                        paystubs.add(paystub);
                    }
                }
        
            } catch (SQLException e) {
                e.printStackTrace(); // Handle the exception appropriately
            }

        return paystubs;
    }
    
    private List<Department> getDepartmentsFromDatabase() {
        List<Department> departments = new ArrayList<>();
        String sql = "SELECT * FROM DEPARTMENT ";
            try (PreparedStatement preparedStatement = MainClass.connection.prepareStatement(sql)) {
                try (ResultSet resultSet = preparedStatement.executeQuery()) {
                    while (resultSet.next()) {
                        Department department = new Department(resultSet.getString("Name"), resultSet.getInt("Number_Of_Employees"), resultSet.getInt("Department_ID"));
                        departments.add(department);
                    }
                }
        
            } catch (SQLException e) {
                e.printStackTrace(); // Handle the exception appropriately
            }

        return departments;
    }
    
    private List<TaxBracket> getTaxBracketsFromDatabase() {
        List<TaxBracket> taxBrackets = new ArrayList<>();
        String sql = "SELECT * FROM TAX_BRACKET ";
            try (PreparedStatement preparedStatement = MainClass.connection.prepareStatement(sql)) {
                try (ResultSet resultSet = preparedStatement.executeQuery()) {
                    while (resultSet.next()) {
                        TaxBracket taxBracket = new TaxBracket(resultSet.getInt("TB_ID"), resultSet.getInt("Year"), resultSet.getString("Region"), resultSet.getInt("Lower_Amount"), resultSet.getInt("Upper_Amount"), resultSet.getInt("Tax_Rate"));
                        taxBrackets.add(taxBracket);
                    }
                }
        
            } catch (SQLException e) {
                e.printStackTrace(); // Handle the exception appropriately
            }

        return taxBrackets;
    }
    
    private List<Employee> getEmployeesFromDatabase() {
        List<Employee> employees = new ArrayList<>();
        String sql = "SELECT * FROM EMPLOYEE ";
            try (PreparedStatement preparedStatement = MainClass.connection.prepareStatement(sql)) {
                try (ResultSet resultSet = preparedStatement.executeQuery()) {
                    while (resultSet.next()) {
                        Employee employee = new Employee(resultSet.getInt("Employee_ID"), resultSet.getInt("Department_ID"), resultSet.getString("First_Name"), resultSet.getString("Last_Name"), resultSet.getString("Date_Of_Birth"), resultSet.getInt("Sin_Number"),resultSet.getString("Date_Hired"), resultSet.getString("Payroll_Type"), resultSet.getInt("Salary"), resultSet.getInt("Vac_Days_Total"), resultSet.getInt("Vac_Days_Left"), resultSet.getInt("Sick_Days_Total"), resultSet.getInt("Sick_Days_Left"), resultSet.getInt("Pers_Days_Total"), resultSet.getInt("Pers_Days_Left"), resultSet.getString("Username"), resultSet.getString("Password"), resultSet.getInt("Bank_ID"), resultSet.getInt("Branch_Number"), resultSet.getInt("Account_Number"), resultSet.getInt("Is_Admin"));
                        employees.add(employee);
                    }
                }
        
            } catch (SQLException e) {
                e.printStackTrace(); // Handle the exception appropriately
            }

        return employees;
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable TaxBracketTable;
    private javax.swing.JButton backButton;
    private javax.swing.JTable departmentTable;
    private javax.swing.JTable employeeTable;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTable paystubTable;
    // End of variables declaration//GEN-END:variables
}
