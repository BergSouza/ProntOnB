/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Telas;

import Banco_de_dados.Conexao;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import Telas.Tela_Administrador;
import java.awt.Color;
import java.awt.Font;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.sql.ResultSet;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
/**
 *
 * @author HARDWARE
 */
public class Tela_visualizar_medico extends javax.swing.JFrame {

    /**
     * Creates new form cadastrar_medico
     */
    public Tela_visualizar_medico() throws IOException {
        initComponents();
        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        confereconfig();
    }
    
    public void confereconfig() throws IOException{
        File file = new File("C:\\PlusLife\\config.pl");
        FileReader freader = new FileReader(file);
        BufferedReader breader = new BufferedReader(freader);
        String corp = breader.readLine();
        String cors = breader.readLine();
        String fonte = breader.readLine();
        String tamanho = breader.readLine();
        String icones = breader.readLine();
        mudacorprincipal(corp);
        mudacorsecundaria(cors);
        mudafonte(fonte, tamanho);
        setaicones(icones);
    }
        
    public void mudacorprincipal(String cor){
        jPanel1.setBackground(Color.decode(cor));
        jPanel3.setBackground(Color.decode(cor));
        jLabel2.setForeground(Color.decode(cor));
        jLabel3.setForeground(Color.decode(cor));
        jLabel4.setForeground(Color.decode(cor));
        jLabel5.setForeground(Color.decode(cor));
        jLabel6.setForeground(Color.decode(cor));
        jLabel7.setForeground(Color.decode(cor));
        jLabel8.setForeground(Color.decode(cor));
        jLabel9.setForeground(Color.decode(cor));
        jLabel12.setForeground(Color.decode(cor));
        jButton2.setForeground(Color.decode(cor));
        
        CheckMasculino.setForeground(Color.decode(cor));
        CheckFeminino.setForeground(Color.decode(cor));
    }
    
    public void mudacorsecundaria(String cor){
        jLabel1.setForeground(Color.decode(cor));
        
        
        jPanel2.setBackground(Color.decode(cor));
        
        jButton2.setBackground(Color.decode(cor));
        
        CheckMasculino.setBackground(Color.decode(cor));
        CheckFeminino.setBackground(Color.decode(cor));
    }
    
    public void mudafonte(String fonte, String tamanhoo){
        int tamanho = Integer.parseInt(tamanhoo);
        jLabel1.setFont(new Font(fonte, Font.BOLD, 14+tamanho));
        jLabel2.setFont(new Font(fonte, Font.BOLD, 8+tamanho));
        jLabel3.setFont(new Font(fonte, Font.BOLD, 8+tamanho));
        jLabel4.setFont(new Font(fonte, Font.BOLD, 8+tamanho));
        jLabel5.setFont(new Font(fonte, Font.BOLD, 8+tamanho));
        jLabel6.setFont(new Font(fonte, Font.BOLD, 8+tamanho));
        jLabel7.setFont(new Font(fonte, Font.BOLD, 8+tamanho));
        jLabel9.setFont(new Font(fonte, Font.BOLD, 8+tamanho));
        jLabel12.setFont(new Font(fonte, Font.BOLD, 8+tamanho));
        
        CampoNome.setFont(new Font(fonte, Font.BOLD, 1+tamanho));
        CampoCPF.setFont(new Font(fonte, Font.BOLD, 1+tamanho));
        CampoEndereco.setFont(new Font(fonte, Font.BOLD, 1+tamanho));
        CampoTelefone.setFont(new Font(fonte, Font.BOLD, 1+tamanho));
        CampoCRM.setFont(new Font(fonte, Font.BOLD, 1+tamanho));
        CampoIdentity.setFont(new Font(fonte, Font.BOLD, 1+tamanho));
        CampoRG.setFont(new Font(fonte, Font.BOLD, 1+tamanho));
        
        CheckMasculino.setFont(new Font(fonte, Font.BOLD, 1+tamanho));
        CheckFeminino.setFont(new Font(fonte, Font.BOLD, 1+tamanho));
        
        jButton2.setFont(new Font(fonte, Font.BOLD, 1+tamanho));
        
    
    }
    public void setaicones(String icones){
        if(icones.equals("Sem icones")){
            
        }
        if(icones.equals("Icones 1")){
            ImageIcon editar = new ImageIcon(getClass().getResource("/img/icons/platualizar.png"));           
            jButton2.setIcon(editar);
        }
        if(icones.equals("Icones 2")){
            ImageIcon editar = new ImageIcon(getClass().getResource("/img/icons/atualizar2.png"));           
            jButton2.setIcon(editar);
        }
        if(icones.equals("Icones 3")){
            ImageIcon editar = new ImageIcon(getClass().getResource("/img/icons/atualizar.png"));           
            jButton2.setIcon(editar);
        }
    }
    
    public String pegavalores(String identity,String id,String nome, String cpf, String rg,String crm,String telefone, String endereco, String sexo,String senha){
        CampoIdentity.setText(identity);
        identityy.setText(identity);
        campoid.setText(id);
        CampoNome.setText(nome);
        CampoCPF.setText(cpf);
        CampoCRM.setText(crm);
        CampoRG.setText(rg);
        CampoTelefone.setText(telefone);
        CampoEndereco.setText(endereco);
        if(sexo.equals("M")){
            CheckMasculino.setSelected(true);
        }if(sexo.equals("F")){
            CheckFeminino.setSelected(true);
        }
        return "a";
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel8 = new javax.swing.JLabel();
        jCheckBox1 = new javax.swing.JCheckBox();
        campoid = new javax.swing.JTextField();
        identityy = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        CampoNome = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        CampoCPF = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        CampoRG = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        CampoCRM = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        CampoTelefone = new javax.swing.JTextField();
        CampoEndereco = new javax.swing.JTextField();
        CheckMasculino = new javax.swing.JCheckBox();
        CheckFeminino = new javax.swing.JCheckBox();
        jLabel12 = new javax.swing.JLabel();
        CampoIdentity = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();

        jLabel8.setText("jLabel8");

        jCheckBox1.setText("jCheckBox1");

        campoid.setText("jTextField1");

        identityy.setText("jTextField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Visualizar M??dico(a)");
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(34, 11, 476, -1));

        jPanel1.setBackground(new java.awt.Color(102, 153, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Visualizar M??dico");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 20, 620, 50));

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/PlusLife_Login_transparente.png"))); // NOI18N
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, 50));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 710, 70));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(102, 153, 255));
        jLabel2.setText("Nome:");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 100, -1, -1));

        CampoNome.setEditable(false);
        jPanel2.add(CampoNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 100, 183, 30));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(102, 153, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("CPF:");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 150, 60, -1));

        CampoCPF.setEditable(false);
        CampoCPF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CampoCPFActionPerformed(evt);
            }
        });
        jPanel2.add(CampoCPF, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 150, 183, 30));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(102, 153, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("RG:");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 200, 50, -1));

        CampoRG.setEditable(false);
        CampoRG.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CampoRGActionPerformed(evt);
            }
        });
        jPanel2.add(CampoRG, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 200, 183, 30));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(102, 153, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("CRM:");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 50, 60, -1));

        CampoCRM.setEditable(false);
        CampoCRM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CampoCRMActionPerformed(evt);
            }
        });
        jPanel2.add(CampoCRM, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 50, 183, 30));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(102, 153, 255));
        jLabel6.setText("Telefone:");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 100, -1, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(102, 153, 255));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Endere??o:");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 150, 100, 30));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(102, 153, 255));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Sexo:");
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 190, 60, 50));

        CampoTelefone.setEditable(false);
        CampoTelefone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CampoTelefoneActionPerformed(evt);
            }
        });
        jPanel2.add(CampoTelefone, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 100, 183, 30));

        CampoEndereco.setEditable(false);
        CampoEndereco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CampoEnderecoActionPerformed(evt);
            }
        });
        jPanel2.add(CampoEndereco, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 150, 183, 30));

        CheckMasculino.setBackground(new java.awt.Color(255, 255, 255));
        CheckMasculino.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        CheckMasculino.setForeground(new java.awt.Color(102, 153, 255));
        CheckMasculino.setText("Masculino\n");
        CheckMasculino.setEnabled(false);
        CheckMasculino.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CheckMasculinoActionPerformed(evt);
            }
        });
        jPanel2.add(CheckMasculino, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 180, -1, 60));

        CheckFeminino.setBackground(new java.awt.Color(255, 255, 255));
        CheckFeminino.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        CheckFeminino.setForeground(new java.awt.Color(102, 153, 255));
        CheckFeminino.setText("Feminino\n");
        CheckFeminino.setEnabled(false);
        CheckFeminino.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CheckFemininoActionPerformed(evt);
            }
        });
        jPanel2.add(CheckFeminino, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 180, -1, 60));

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(102, 153, 255));
        jLabel12.setText("Identity:");
        jPanel2.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, -1, -1));

        CampoIdentity.setEditable(false);
        jPanel2.add(CampoIdentity, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 50, 180, 30));

        jPanel3.setBackground(new java.awt.Color(102, 153, 255));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton2.setBackground(new java.awt.Color(255, 255, 255));
        jButton2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton2.setForeground(new java.awt.Color(102, 153, 255));
        jButton2.setText("Voltar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 20, 120, 40));

        jPanel2.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 290, 710, 80));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 710, 370));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CampoCPFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CampoCPFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CampoCPFActionPerformed

    private void CampoCRMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CampoCRMActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CampoCRMActionPerformed

    private void CampoTelefoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CampoTelefoneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CampoTelefoneActionPerformed

    private void CampoRGActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CampoRGActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CampoRGActionPerformed

    private void CampoEnderecoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CampoEnderecoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CampoEnderecoActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void CheckFemininoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CheckFemininoActionPerformed
        CheckMasculino.setSelected(false);
    }//GEN-LAST:event_CheckFemininoActionPerformed

    private void CheckMasculinoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CheckMasculinoActionPerformed
        CheckFeminino.setSelected(false);
    }//GEN-LAST:event_CheckMasculinoActionPerformed

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
            java.util.logging.Logger.getLogger(Tela_visualizar_medico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Tela_visualizar_medico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Tela_visualizar_medico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tela_visualizar_medico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new Tela_visualizar_medico().setVisible(true);
                } catch (IOException ex) {
                    Logger.getLogger(Tela_visualizar_medico.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField CampoCPF;
    private javax.swing.JTextField CampoCRM;
    private javax.swing.JTextField CampoEndereco;
    private javax.swing.JTextField CampoIdentity;
    private javax.swing.JTextField CampoNome;
    private javax.swing.JTextField CampoRG;
    private javax.swing.JTextField CampoTelefone;
    private javax.swing.JCheckBox CheckFeminino;
    private javax.swing.JCheckBox CheckMasculino;
    private javax.swing.JTextField campoid;
    private javax.swing.JTextField identityy;
    private javax.swing.JButton jButton2;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    // End of variables declaration//GEN-END:variables
}
