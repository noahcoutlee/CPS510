
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

public class EmpPaystubs extends javax.swing.JFrame {

    /**
     * Creates new form EmpPaystubs
     */
    
    public EmpPaystubs() {
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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 534, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(34, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(backButton)
                .addGap(93, 93, 93))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(backButton)
                .addContainerGap(23, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        // TODO add your handling code here:
        EmployeeHomePage empHomePage = new EmployeeHomePage();
        empHomePage.show();
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
        String sql = "SELECT pay_date, gross_amount, tax_federal, tax_provincial, CPP, EI, net_amount " +
                         "FROM all_employee_paystub_view " +
                         "WHERE employee_id = ?";
            try (PreparedStatement preparedStatement = MainClass.connection.prepareStatement(sql)) {
                preparedStatement.setInt(1, MainClass.loggedInEmployee.EMPLOYEE_ID);
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
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backButton;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable paystubTable;
    // End of variables declaration//GEN-END:variables
}
