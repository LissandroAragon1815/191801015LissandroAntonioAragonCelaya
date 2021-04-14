
package Vista;

import Clases.Clientes;
import Clases.DaoClientes;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;

/**
 *
 * @author ntnrc
 */
public class Pagar extends javax.swing.JFrame {
    DefaultListModel modelo = new DefaultListModel();
    private void crearModelo() throws SQLException{
        modelo.clear();
        List<Clientes> lista = new ArrayList<>();
        lista = DaoClientes.listaClientes();
        for(Clientes cliente:lista){
                modelo.addElement(cliente);
            }
    }
    /**
     * Creates new form Pagar
     */
    public Pagar() {
        initComponents();
        setResizable(false);
        setTitle("Pagar");
        setLocationRelativeTo(null);
        try{
            this.crearModelo();
        } catch (SQLException ex){
            Logger.getLogger(Pagar.class.getName()).log(Level.SEVERE, null, ex);
        }
        jList1.setModel(modelo);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel4 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jButtonGestion = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        jButtonReporte = new javax.swing.JButton();
        jLabelinfo = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        jLabelID = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jButtonSemana = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabelSemana = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel4.setBackground(new java.awt.Color(238, 243, 224));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Impact", 0, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Micro Préstamos");
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });
        jPanel4.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(306, 0, -1, -1));

        getContentPane().add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 900, 40));

        jPanel2.setBackground(new java.awt.Color(99, 52, 133));
        jPanel2.setPreferredSize(new java.awt.Dimension(225, 490));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButtonGestion.setFont(new java.awt.Font("Constantia", 0, 24)); // NOI18N
        jButtonGestion.setText("Gestión");
        jButtonGestion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonGestionActionPerformed(evt);
            }
        });
        jPanel2.add(jButtonGestion, new org.netbeans.lib.awtextra.AbsoluteConstraints(54, 65, 125, 50));

        jPanel6.setBackground(new java.awt.Color(108, 60, 137));

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 240, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 130, Short.MAX_VALUE)
        );

        jPanel2.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 240, 130));

        jButtonReporte.setFont(new java.awt.Font("Constantia", 0, 24)); // NOI18N
        jButtonReporte.setText("Reporte");
        jButtonReporte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonReporteActionPerformed(evt);
            }
        });
        jPanel2.add(jButtonReporte, new org.netbeans.lib.awtextra.AbsoluteConstraints(54, 161, 125, 50));

        jLabelinfo.setFont(new java.awt.Font("Caladea", 3, 24)); // NOI18N
        jLabelinfo.setText("i");
        jLabelinfo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelinfoMouseClicked(evt);
            }
        });
        jPanel2.add(jLabelinfo, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 490, 17, -1));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 240, 530));

        jPanel3.setBackground(new java.awt.Color(108, 60, 137));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 240, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 130, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 240, 130));

        jPanel5.setBackground(new java.awt.Color(108, 60, 137));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jList1.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jList1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jList1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jList1);

        jPanel5.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 20, 570, 200));

        jLabelID.setText(" ");
        jPanel5.add(jLabelID, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 240, 20, -1));

        jLabel3.setText("ID: ");
        jPanel5.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 240, -1, -1));

        jButtonSemana.setText("Pagar Semana");
        jButtonSemana.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSemanaActionPerformed(evt);
            }
        });
        jPanel5.add(jButtonSemana, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 350, -1, -1));

        jLabel4.setText("Semana numero:");
        jPanel5.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 240, -1, -1));
        jPanel5.add(jLabelSemana, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 240, 20, 20));

        getContentPane().add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 40, 660, 530));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonGestionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonGestionActionPerformed
        Gestion gestion= new Gestion();
        gestion.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButtonGestionActionPerformed

    private void jButtonReporteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonReporteActionPerformed
        Reporte reporte= new Reporte();
        reporte.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButtonReporteActionPerformed

    private void jLabelinfoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelinfoMouseClicked
        Informacion informacion= new Informacion();
        informacion.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jLabelinfoMouseClicked

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        Menu menu = new Menu();
        menu.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jLabel2MouseClicked

    private void jButtonSemanaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSemanaActionPerformed
        String a = jLabelID.getText();
        int id = Integer.parseInt(a);
        a = jLabelSemana.getText();
        int semanas = Integer.parseInt(a);
        semanas++;
        Clientes cliente =new Clientes(id, semanas);
        
        try{
            DaoClientes.pago(cliente);
        } catch (SQLException ex){
            Logger.getLogger(Pagar.class.getName()).log(Level.SEVERE, null, ex);
        }
        finally{
            
            try{
                this.crearModelo();
            } catch (SQLException ex){
                Logger.getLogger(Pagar.class.getName()).log(Level.SEVERE, null, ex);
            }
        jList1.setModel(modelo);
        }
    }//GEN-LAST:event_jButtonSemanaActionPerformed

    private void jList1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jList1MouseClicked
        if(evt.getClickCount() == 1){
            int index = jList1.getSelectedIndex();
            Clientes cliente = (Clientes)modelo.getElementAt(index);
            jLabelID.setText(""+cliente.getId());   
            jLabelSemana.setText(""+cliente.getSemanas());
        }
    }//GEN-LAST:event_jList1MouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try
        {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels())
            {
                if ("Nimbus".equals(info.getName()))
                {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex)
        {
            java.util.logging.Logger.getLogger(Pagar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex)
        {
            java.util.logging.Logger.getLogger(Pagar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex)
        {
            java.util.logging.Logger.getLogger(Pagar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex)
        {
            java.util.logging.Logger.getLogger(Pagar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Pagar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonGestion;
    private javax.swing.JButton jButtonReporte;
    private javax.swing.JButton jButtonSemana;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabelID;
    private javax.swing.JLabel jLabelSemana;
    private javax.swing.JLabel jLabelinfo;
    private javax.swing.JList<String> jList1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
