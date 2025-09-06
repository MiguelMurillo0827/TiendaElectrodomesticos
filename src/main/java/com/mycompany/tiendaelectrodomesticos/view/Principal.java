package com.mycompany.tiendaelectrodomesticos.view;

import com.mycompany.tiendaelectrodomesticos.service.IServicioElectrodomestico;
import com.mycompany.tiendaelectrodomesticos.service.ServicioElectrodomestico;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class Principal extends javax.swing.JFrame {

    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(Principal.class.getName());
    IServicioElectrodomestico servicioElectrodomestico = ServicioElectrodomestico.getInstance();
    public Principal() {
        initComponents();
        setLocationRelativeTo(null);
        
    }
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu5 = new javax.swing.JMenu();
        jMenu1 = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();
        jMenuItemAddTelevisor = new javax.swing.JMenuItem();
        jMenuItemSearchTelevisor = new javax.swing.JMenuItem();
        jMenuItemEditTelevisor = new javax.swing.JMenuItem();
        jMenuItemListTelevisor = new javax.swing.JMenuItem();
        jMenuItemDeleteTelevisor = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        jMenuItemAddLavadora = new javax.swing.JMenuItem();
        jMenuItemSearchLavadora = new javax.swing.JMenuItem();
        jMenuItemEditLavadora = new javax.swing.JMenuItem();
        jMenuItemListLavadora = new javax.swing.JMenuItem();
        jMenuItemDeleteLavadora = new javax.swing.JMenuItem();
        jMenuItemProgramarLavadora = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem6 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Principal");
        setResizable(false);

        jMenu5.setText("Archivo");
        jMenu5.setAutoscrolls(true);
        jMenu5.setVerifyInputWhenFocusTarget(false);
        jMenuBar1.add(jMenu5);

        jMenu1.setText("Producto");

        jMenu3.setText("Televisor");

        jMenuItemAddTelevisor.setText("Add Televisor");
        jMenuItemAddTelevisor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemAddTelevisorActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItemAddTelevisor);

        jMenuItemSearchTelevisor.setText("Search Televisor");
        jMenuItemSearchTelevisor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemSearchTelevisorActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItemSearchTelevisor);

        jMenuItemEditTelevisor.setText("Edit Televisor");
        jMenuItemEditTelevisor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemEditTelevisorActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItemEditTelevisor);

        jMenuItemListTelevisor.setText("List Televisor");
        jMenuItemListTelevisor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemListTelevisorActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItemListTelevisor);

        jMenuItemDeleteTelevisor.setText("Delete Televisor");
        jMenuItemDeleteTelevisor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemDeleteTelevisorActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItemDeleteTelevisor);

        jMenu1.add(jMenu3);

        jMenu4.setText("Lavadora");

        jMenuItemAddLavadora.setText("Add Lavadora");
        jMenuItemAddLavadora.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemAddLavadoraActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItemAddLavadora);

        jMenuItemSearchLavadora.setText("Search Lavadora");
        jMenuItemSearchLavadora.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemSearchLavadoraActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItemSearchLavadora);

        jMenuItemEditLavadora.setText("Edit Lavadora");
        jMenuItemEditLavadora.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemEditLavadoraActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItemEditLavadora);

        jMenuItemListLavadora.setText("List Lavadora");
        jMenuItemListLavadora.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemListLavadoraActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItemListLavadora);

        jMenuItemDeleteLavadora.setText("Delete Lavadora");
        jMenuItemDeleteLavadora.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemDeleteLavadoraActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItemDeleteLavadora);

        jMenuItemProgramarLavadora.setText("Programar Lavadora");
        jMenuItemProgramarLavadora.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemProgramarLavadoraActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItemProgramarLavadora);

        jMenu1.add(jMenu4);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Ayuda");
        jMenu2.setAutoscrolls(true);
        jMenu2.setVerifyInputWhenFocusTarget(false);

        jMenuItem6.setText("Acerca de ...");
        jMenuItem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem6ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem6);

        jMenuBar1.add(jMenu2);
        jMenu2.getAccessibleContext().setAccessibleDescription("");

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 562, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 379, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem6ActionPerformed
       JOptionPane.showMessageDialog(
    this,
    "Desarrollado por:\nJuan Manuel Blandón Ramirez\nJaminton Julian Leyton Camacho\nMiguel Angel Murillo De Los Rios\nDavid Estiven Mendez Lara"
);

    }//GEN-LAST:event_jMenuItem6ActionPerformed

    private void jMenuItemAddTelevisorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemAddTelevisorActionPerformed
        AddTelevisor gui = new AddTelevisor(servicioElectrodomestico);
        gui.setVisible(true);
    }//GEN-LAST:event_jMenuItemAddTelevisorActionPerformed

    private void jMenuItemSearchTelevisorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemSearchTelevisorActionPerformed
        SearchTelevisor gui = new SearchTelevisor(servicioElectrodomestico);
        gui.setVisible(true);
    }//GEN-LAST:event_jMenuItemSearchTelevisorActionPerformed

    private void jMenuItemEditTelevisorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemEditTelevisorActionPerformed
        EditTelevisor gui = new EditTelevisor(servicioElectrodomestico);
        gui.setVisible(true);
    }//GEN-LAST:event_jMenuItemEditTelevisorActionPerformed

    private void jMenuItemListTelevisorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemListTelevisorActionPerformed
       ListTelevisor gui = new ListTelevisor(servicioElectrodomestico);
       gui.setVisible(true);
    }//GEN-LAST:event_jMenuItemListTelevisorActionPerformed

    private void jMenuItemDeleteTelevisorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemDeleteTelevisorActionPerformed
       DeleteTelevisor gui = new DeleteTelevisor(servicioElectrodomestico);
       gui.setVisible(true);
    }//GEN-LAST:event_jMenuItemDeleteTelevisorActionPerformed

    private void jMenuItemDeleteLavadoraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemDeleteLavadoraActionPerformed
       DeleteLavadora gui = new DeleteLavadora(servicioElectrodomestico);
       gui.setVisible(true);
    }//GEN-LAST:event_jMenuItemDeleteLavadoraActionPerformed

    private void jMenuItemListLavadoraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemListLavadoraActionPerformed
       ListLavadora gui = new ListLavadora(servicioElectrodomestico);
       gui.setVisible(true);
    }//GEN-LAST:event_jMenuItemListLavadoraActionPerformed

    private void jMenuItemEditLavadoraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemEditLavadoraActionPerformed
       EditLavadora gui = new EditLavadora(servicioElectrodomestico);
       gui.setVisible(true);
    }//GEN-LAST:event_jMenuItemEditLavadoraActionPerformed

    private void jMenuItemSearchLavadoraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemSearchLavadoraActionPerformed
       SearchLavadora gui = new SearchLavadora(servicioElectrodomestico);
       gui.setVisible(true);
    }//GEN-LAST:event_jMenuItemSearchLavadoraActionPerformed

    private void jMenuItemAddLavadoraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemAddLavadoraActionPerformed
       AddLavadora gui = new AddLavadora(servicioElectrodomestico);
       gui.setVisible(true);
    }//GEN-LAST:event_jMenuItemAddLavadoraActionPerformed

    private void jMenuItemProgramarLavadoraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemProgramarLavadoraActionPerformed
        ProgramarLavadora gui = new ProgramarLavadora(servicioElectrodomestico);
        gui.setVisible(true);
    }//GEN-LAST:event_jMenuItemProgramarLavadoraActionPerformed

    /**
     * @param args the command line arguments
     */


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItemAddLavadora;
    private javax.swing.JMenuItem jMenuItemAddTelevisor;
    private javax.swing.JMenuItem jMenuItemDeleteLavadora;
    private javax.swing.JMenuItem jMenuItemDeleteTelevisor;
    private javax.swing.JMenuItem jMenuItemEditLavadora;
    private javax.swing.JMenuItem jMenuItemEditTelevisor;
    private javax.swing.JMenuItem jMenuItemListLavadora;
    private javax.swing.JMenuItem jMenuItemListTelevisor;
    private javax.swing.JMenuItem jMenuItemProgramarLavadora;
    private javax.swing.JMenuItem jMenuItemSearchLavadora;
    private javax.swing.JMenuItem jMenuItemSearchTelevisor;
    // End of variables declaration//GEN-END:variables
}
