/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Telas;

import Banco_de_dados.Conexao;
import java.awt.Color;
import java.awt.Font;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.ResultSet;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import plus_life.Plus_Life;

/**
 *
 * @author Bergson
 */
public class Tela_login2 extends javax.swing.JFrame {

    /**
     * Creates new form Tela_login
     */
    public Tela_login2() throws IOException {
        initComponents();
        
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
        jLabel4.setForeground(Color.decode(cor));
        jbtn_Config.setForeground(Color.decode(cor));
        jbtn_Logar.setForeground(Color.decode(cor));
        jButton2.setForeground(Color.decode(cor));
        jButton3.setForeground(Color.decode(cor));
    }
    
    public void mudacorsecundaria(String cor){
        txtVersao.setForeground(Color.decode(cor));
        jLabel1.setForeground(Color.decode(cor));
        jLabel4.setForeground(Color.decode(cor));
        jLabel2.setForeground(Color.decode(cor));
        jLabel3.setForeground(Color.decode(cor));
        jLabel6.setForeground(Color.decode(cor));
        jbtn_Config.setBackground(Color.decode(cor));
        jbtn_Logar.setBackground(Color.decode(cor));
        jButton2.setBackground(Color.decode(cor));
        jButton3.setBackground(Color.decode(cor));
    }
    
    public void mudafonte(String fonte, String tamanhoo){
        int tamanho = Integer.parseInt(tamanhoo);
        jLabel2.setFont(new Font(fonte, Font.BOLD, 4+tamanho));
        jLabel3.setFont(new Font(fonte, Font.BOLD, 4+tamanho));
        CampoA.setFont(new Font(fonte, Font.BOLD, 1+tamanho));
        CampoPass.setFont(new Font(fonte, Font.BOLD, 1+tamanho));
        jLabel4.setFont(new Font(fonte, Font.BOLD, 14+tamanho));
        jButton2.setFont(new Font(fonte, Font.BOLD, 8+tamanho));
        jbtn_Config.setFont(new Font(fonte, Font.BOLD, 8+tamanho));
        jButton3.setFont(new Font(fonte, Font.BOLD, 8+tamanho));
        jLabel6.setFont(new Font(fonte, Font.BOLD, 1+tamanho));
        txtVersao.setFont(new Font(fonte, Font.BOLD, 6+tamanho));
        jLabel1.setFont(new Font(fonte, Font.BOLD, 14+tamanho));
        jbtn_Logar.setFont(new Font(fonte, Font.BOLD, 4+tamanho));
    }
    public void setaicones(String icones){
        if(icones.equals("Sem icones")){
            
        }
        if(icones.equals("Icones 1")){
            ImageIcon config = new ImageIcon(getClass().getResource("/img/icons/plconfig.png"));           
            jbtn_Config.setIcon(config);
            ImageIcon identity = new ImageIcon(getClass().getResource("/img/icons/user.png"));           
            jLabel2.setIcon(identity);
            ImageIcon senha = new ImageIcon(getClass().getResource("/img/icons/senha.png"));           
            jLabel3.setIcon(senha);
            ImageIcon login = new ImageIcon(getClass().getResource("/img/icons/pllogar.png"));           
            jbtn_Logar.setIcon(login);
        }
        if(icones.equals("Icones 2")){
            ImageIcon config = new ImageIcon(getClass().getResource("/img/icons/config2.png"));           
            jbtn_Config.setIcon(config);
            ImageIcon identity = new ImageIcon(getClass().getResource("/img/icons/user.png"));           
            jLabel2.setIcon(identity);
            ImageIcon senha = new ImageIcon(getClass().getResource("/img/icons/senha.png"));           
            jLabel3.setIcon(senha);
            ImageIcon login = new ImageIcon(getClass().getResource("/img/icons/logar2.png"));           
            jbtn_Logar.setIcon(login);
        }
        if(icones.equals("Icones 3")){
            ImageIcon config = new ImageIcon(getClass().getResource("/img/icons/config.png"));           
            jbtn_Config.setIcon(config);
            ImageIcon identity = new ImageIcon(getClass().getResource("/img/icons/user2.png"));           
            jLabel2.setIcon(identity);
            ImageIcon senha = new ImageIcon(getClass().getResource("/img/icons/senha2.png"));           
            jLabel3.setIcon(senha);
            ImageIcon login = new ImageIcon(getClass().getResource("/img/icons/logar.png"));           
            jbtn_Logar.setIcon(login);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jCheckBox1 = new javax.swing.JCheckBox();
        jCheckBox2 = new javax.swing.JCheckBox();
        jButton1 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        CampoA = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jbtn_Config = new javax.swing.JButton();
        CampoPass = new javax.swing.JPasswordField();
        jLabel4 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtVersao = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jbtn_Logar = new javax.swing.JButton();

        jCheckBox1.setBackground(new java.awt.Color(102, 153, 255));
        jCheckBox1.setText("Secret??ria");

        jCheckBox2.setBackground(new java.awt.Color(102, 153, 255));
        jCheckBox2.setText("M??dico");

        jButton1.setBackground(new java.awt.Color(102, 153, 255));
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Sair");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Login");
        setBackground(new java.awt.Color(0, 0, 0));
        setUndecorated(true);
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(102, 153, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Login");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 163, 52));
        jPanel1.add(CampoA, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, 240, 28));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Identity:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, 91, 40));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Senha:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 190, 79, 30));

        jbtn_Config.setBackground(new java.awt.Color(255, 255, 255));
        jbtn_Config.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jbtn_Config.setForeground(new java.awt.Color(102, 153, 255));
        jbtn_Config.setText("Configura????es");
        jbtn_Config.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn_ConfigActionPerformed(evt);
            }
        });
        jPanel1.add(jbtn_Config, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 340, 240, 30));
        jPanel1.add(CampoPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 220, 240, 31));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("PlusLife");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 50, -1, 70));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/PlusLife_Login_transparente.png"))); // NOI18N
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 50, 52));

        txtVersao.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        txtVersao.setForeground(new java.awt.Color(255, 255, 255));
        txtVersao.setText("v0.0");
        jPanel1.add(txtVersao, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 10, 180, 50));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Direitos Reservados - Ciriguela 2018");
        jLabel6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel6MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 310, -1, 30));

        jButton2.setBackground(new java.awt.Color(255, 255, 255));
        jButton2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton2.setForeground(new java.awt.Color(102, 153, 255));
        jButton2.setText("<");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 260, 50, 40));

        jButton3.setBackground(new java.awt.Color(255, 255, 255));
        jButton3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton3.setForeground(new java.awt.Color(102, 153, 255));
        jButton3.setText("X");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 260, 50, 40));

        jbtn_Logar.setBackground(new java.awt.Color(255, 255, 255));
        jbtn_Logar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jbtn_Logar.setForeground(new java.awt.Color(102, 153, 255));
        jbtn_Logar.setText("Logar");
        jbtn_Logar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn_LogarActionPerformed(evt);
            }
        });
        jPanel1.add(jbtn_Logar, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 260, 140, 41));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 300, 380));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jbtn_ConfigActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn_ConfigActionPerformed
        try {                                           
            Tela_Configura????es config = new Tela_Configura????es();
            config.setVisible(true);
            config.setLocationRelativeTo(null);
            config.confereconfig();
            dispose();
            
        } catch (Exception ex) {
            Logger.getLogger(Tela_login2.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jbtn_ConfigActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        Plus_Life pl = new Plus_Life();
        String versao = pl.getVersao();
        txtVersao.setText("v"+versao);
        
    }//GEN-LAST:event_formWindowOpened

    private void jLabel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseClicked
        Tela_Ciriguela ciri = new Tela_Ciriguela();
        ciri.setVisible(true);
        ciri.setLocationRelativeTo(null);
        dispose();
    }//GEN-LAST:event_jLabel6MouseClicked

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        try {
            File diretorio = new File("C:\\PlusLife");
            diretorio.mkdir();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Erro ao criar o diretorio");
            System.out.println(ex);
        }
        try {
            FileWriter arq = new FileWriter("C:\\PlusLife\\loginconfig.pl");
            BufferedWriter writer = new BufferedWriter(arq);
            //writer.newLine();
            writer.write("0");
            writer.flush();
            writer.close();
        } catch (IOException ex) {
            Logger.getLogger(Tela_login.class.getName()).log(Level.SEVERE, null, ex);
        }
        Tela_login login;
        try {
            login = new Tela_login();
            login.setVisible(true);
            login.setLocationRelativeTo(null);
            dispose();
        } catch (IOException ex) {
            Logger.getLogger(Tela_login2.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        dispose();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jbtn_LogarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn_LogarActionPerformed
        try {                                           
            String identity = CampoA.getText();
            String senha = CampoPass.getText();
            
            Conexao conexao = new Conexao();
            Connection con = conexao.abrir();
            
            java.sql.Statement st = con.createStatement();
            st.executeQuery("select identity,senha_admin from administradores");
            ResultSet rs = st.getResultSet();
            
            int login = 0;
            
            while(rs.next()){
                if(rs.getString("identity").equals(identity) && rs.getString("senha_admin").equals(senha)){
                    dispose();
                    Tela_Administrador tela_admin = new Tela_Administrador();
                    tela_admin.setVisible(true);
                    tela_admin.setLocationRelativeTo(null);
                    tela_admin.atualizar();
                    login = 1;
                    try {
                        tela_admin.MostraSecs();
                    } catch (Exception ex) {
                        Logger.getLogger(Tela_login.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            }
            
            
            
            java.sql.Statement st2 = con.createStatement();
            st2.executeQuery("select * from medicos");
            ResultSet rs2 = st2.getResultSet();
            
            
            while(rs2.next()){
                if(rs2.getString("identity").equals(identity) && rs2.getString("senha_medico").equals(senha)){
                    dispose();
                    Tela_M??dico tela_medico = new Tela_M??dico();
                    tela_medico.setVisible(true);
                    tela_medico.pegadados(rs2.getString("id_medico"),rs2.getString("nome_medico"));
                    tela_medico.setLocationRelativeTo(null);
                    tela_medico.MostraConsultas();
                    login = 1;
                    
                    
                }
            }
            
            
            
            java.sql.Statement st3 = con.createStatement();
            st3.executeQuery("select * from secs");
            ResultSet rs3 = st3.getResultSet();
            
            
            while(rs3.next()){
                if(rs3.getString("identity").equals(identity) && rs3.getString("senha_sec").equals(senha)){
                    dispose();
                    Tela_Secret??ria tela_sec = new Tela_Secret??ria();
                    tela_sec.setVisible(true);
                    tela_sec.setLocationRelativeTo(null);
                    tela_sec.atualizar();
                    login = 1;
                    try {
                        tela_sec.MostraMedicos();
                    } catch (Exception ex) {
                        Logger.getLogger(Tela_login.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            }
            
            if(login == 0){
                JOptionPane.showMessageDialog(null, "Login Inv??lido");
            }
            
            /*TEMPOR??RIO*/
            
        } catch (Exception ex) {
            Logger.getLogger(Tela_login.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jbtn_LogarActionPerformed

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
            java.util.logging.Logger.getLogger(Tela_login2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Tela_login2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Tela_login2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tela_login2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new Tela_login2().setVisible(true);
                } catch (IOException ex) {
                    Logger.getLogger(Tela_login2.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField CampoA;
    private javax.swing.JPasswordField CampoPass;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JCheckBox jCheckBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton jbtn_Config;
    private javax.swing.JButton jbtn_Logar;
    private javax.swing.JLabel txtVersao;
    // End of variables declaration//GEN-END:variables
}
