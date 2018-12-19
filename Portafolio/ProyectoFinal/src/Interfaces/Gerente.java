/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces;

import Negocio.UsuarioNegocio;
import java.awt.Color;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Image;
import java.awt.Toolkit;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Eduardo
 */
public class Gerente extends javax.swing.JFrame {
    ListarUsuariosP objListar;
    RegistrarMarcas objRegisMarcas;
    GridBagLayout layout =  new GridBagLayout();

    /**
     * Creates new form Gerente
     */
    public Gerente() throws SQLException, ClassNotFoundException {
        this.objListar = new ListarUsuariosP();
        this.objRegisMarcas = new RegistrarMarcas();
        objListar.setVisible(false);
        objRegisMarcas.setVisible(false);
        
        
        initComponents();
        this.getContentPane().setBackground(Color.WHITE);
         GridBagConstraints c = new GridBagConstraints();
         this.setLocationRelativeTo(null);
          c.gridx = 0;
          c.gridy = 0 ;
         jPGerente.setLayout(layout);
          c.gridx = 0;
          c.gridy = 0 ;
         jPGerente.add(objListar);
          c.gridx = 0;
          c.gridy = 0 ;
         jPGerente.add(objRegisMarcas);
          c.gridx = 0;
          c.gridy = 0 ;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPGerente = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        MenuRegistorConsumidores = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        MenuListarUsuarios = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenuRegistrarMarcas = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPGerente.setBackground(new java.awt.Color(255, 255, 255));
        jPGerente.setName(""); // NOI18N
        jPGerente.setPreferredSize(new java.awt.Dimension(0, 560));

        javax.swing.GroupLayout jPGerenteLayout = new javax.swing.GroupLayout(jPGerente);
        jPGerente.setLayout(jPGerenteLayout);
        jPGerenteLayout.setHorizontalGroup(
            jPGerenteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1404, Short.MAX_VALUE)
        );
        jPGerenteLayout.setVerticalGroup(
            jPGerenteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 589, Short.MAX_VALUE)
        );

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/Iconocompleto.png"))); // NOI18N

        jMenuBar1.setBackground(new java.awt.Color(255, 255, 255));

        jMenu1.setText("Reporte");
        jMenu1.setFont(new java.awt.Font("Georgia", 3, 24)); // NOI18N

        MenuRegistorConsumidores.setFont(new java.awt.Font("Georgia", 3, 14)); // NOI18N
        MenuRegistorConsumidores.setText("Registro Consumidores");
        MenuRegistorConsumidores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuRegistorConsumidoresActionPerformed(evt);
            }
        });
        jMenu1.add(MenuRegistorConsumidores);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Usuarios");
        jMenu2.setFont(new java.awt.Font("Georgia", 3, 24)); // NOI18N

        MenuListarUsuarios.setFont(new java.awt.Font("Georgia", 3, 14)); // NOI18N
        MenuListarUsuarios.setText("Listar Usuarios");
        MenuListarUsuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuListarUsuariosActionPerformed(evt);
            }
        });
        jMenu2.add(MenuListarUsuarios);

        jMenuBar1.add(jMenu2);

        jMenu3.setText("Marcas");
        jMenu3.setFont(new java.awt.Font("Georgia", 3, 24)); // NOI18N

        jMenuRegistrarMarcas.setFont(new java.awt.Font("Georgia", 3, 14)); // NOI18N
        jMenuRegistrarMarcas.setText("Registrar Marcas");
        jMenuRegistrarMarcas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuRegistrarMarcasActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuRegistrarMarcas);

        jMenuBar1.add(jMenu3);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPGerente, javax.swing.GroupLayout.DEFAULT_SIZE, 1404, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPGerente, javax.swing.GroupLayout.DEFAULT_SIZE, 589, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void MenuListarUsuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuListarUsuariosActionPerformed
        
            objListar.setVisible(true);
            objRegisMarcas.setVisible(false);

    }//GEN-LAST:event_MenuListarUsuariosActionPerformed

    private void jMenuRegistrarMarcasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuRegistrarMarcasActionPerformed
        objListar.setVisible(false);
        objRegisMarcas.setVisible(true);
    }//GEN-LAST:event_jMenuRegistrarMarcasActionPerformed

    private void MenuRegistorConsumidoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuRegistorConsumidoresActionPerformed
       UsuarioNegocio negocio = new UsuarioNegocio();
       ResultSet rsNumUsuarios;
       ResultSet rsCorreosEnviados;
       ResultSet rsNumeroValo;
       ResultSet rsDscEntregados;
       rsNumUsuarios = null;
       rsCorreosEnviados = null;
       rsNumeroValo = null;
       rsDscEntregados = null;
       
        try {
            rsNumUsuarios = negocio.NumeroUsuariosReg();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Gerente.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(Gerente.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            rsCorreosEnviados = negocio.CorreosEnviados();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Gerente.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(Gerente.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            rsNumeroValo = negocio.NumeroValoraciones();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Gerente.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(Gerente.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            rsDscEntregados = negocio.DescuentosEntregados();
            
            // TODO add your handling code here:
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Gerente.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(Gerente.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        String ruta="C:\\Users\\Admin\\Desktop\\ReporteUsuarios.txt";
        File archivo = new File(ruta);
        BufferedWriter bw = null;
        if(archivo.exists()){
        
           try {            
               bw= new BufferedWriter(new FileWriter(archivo));
           } catch (IOException ex) {
               Logger.getLogger(Gerente.class.getName()).log(Level.SEVERE, null, ex);
           }
           try {
               while(rsNumUsuarios.next()){
                 bw.newLine();
                 bw.write("Cantidad de consumidores registrados en el sistema "+rsNumUsuarios.getString(1));
               }
               while(rsCorreosEnviados.next()){
                bw.newLine();
                bw.write("Cantidad de ofertas enviadas por correo "+rsCorreosEnviados.getString(1));
               }
               while(rsNumeroValo.next()){
                   bw.newLine();
                   bw.write("Cantidad de valoraciones echas por los usuarios "+rsNumeroValo.getString(1));
               }while(rsDscEntregados.next()){
                   bw.newLine();
                   bw.write("|RUBRO|"+rsDscEntregados.getString(1)+       "   |PRODUCTO| "+rsDscEntregados.getString(3)+"|   PORCENTAJE DESCUENTO |%" +rsDscEntregados.getString(4));
               }
               JOptionPane.showMessageDialog(null, "El archivo se ah creado en  "+ruta+" ");
           } catch (SQLException ex) {
               Logger.getLogger(Gerente.class.getName()).log(Level.SEVERE, null, ex);
           } catch (IOException ex) {
               Logger.getLogger(Gerente.class.getName()).log(Level.SEVERE, null, ex);
           }
            
        }else{
           try {
               bw= new BufferedWriter(new FileWriter(archivo));
               bw.write("El archivo ha sido creado");
           } catch (IOException ex) {
               Logger.getLogger(Administrador.class.getName()).log(Level.SEVERE, null, ex);
           }
           
        }
          try {
            bw.close();
        } catch (IOException ex) {
            Logger.getLogger(Administrador.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_MenuRegistorConsumidoresActionPerformed

    /**
     * @param args the command line arguments
     * @return 
     */
    @Override
    public Image getIconImage() {
        Image retValue = Toolkit.getDefaultToolkit().
                getImage(ClassLoader.getSystemResource("Img/iconoV2.png"));


        return retValue;
    }
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
            java.util.logging.Logger.getLogger(Gerente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Gerente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Gerente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Gerente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new Gerente().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(Gerente.class.getName()).log(Level.SEVERE, null, ex);
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(Gerente.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem MenuListarUsuarios;
    private javax.swing.JMenuItem MenuRegistorConsumidores;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuRegistrarMarcas;
    private javax.swing.JPanel jPGerente;
    // End of variables declaration//GEN-END:variables
}
