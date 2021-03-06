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
import java.sql.PreparedStatement;
import Banco_de_dados.Conexao;
import java.awt.Color;
import java.awt.Font;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
/**
 *
 * @author HARDWARE
 */
public class Tela_cadastrar_convenios extends javax.swing.JFrame {

    /**
     * Creates new form cadastrar_convenios
     */
    public Tela_cadastrar_convenios() throws IOException {
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
        jPanel2.setBackground(Color.decode(cor));
        jLabel2.setForeground(Color.decode(cor));
        jLabel3.setForeground(Color.decode(cor));
        jLabel4.setForeground(Color.decode(cor));
        jLabel5.setForeground(Color.decode(cor));
        jLabel6.setForeground(Color.decode(cor));
        jLabel7.setForeground(Color.decode(cor));
        jButton1.setForeground(Color.decode(cor));
        jButton2.setForeground(Color.decode(cor));
    }
    
    public void mudacorsecundaria(String cor){
        jLabel1.setForeground(Color.decode(cor));
        
        
        jPanel3.setBackground(Color.decode(cor));
        
        jButton1.setBackground(Color.decode(cor));
        jButton2.setBackground(Color.decode(cor));
        
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
        
        CampoNome.setFont(new Font(fonte, Font.BOLD, 1+tamanho));
        CampoCNPJ.setFont(new Font(fonte, Font.BOLD, 1+tamanho));
        CampoEndereco.setFont(new Font(fonte, Font.BOLD, 1+tamanho));
        CampoTelefone.setFont(new Font(fonte, Font.BOLD, 1+tamanho));
        CampoPlano  .setFont(new Font(fonte, Font.BOLD, 1+tamanho));
        
        jButton1.setFont(new Font(fonte, Font.BOLD, 1+tamanho));
        jButton2.setFont(new Font(fonte, Font.BOLD, 1+tamanho));
        
    
    }
    public void setaicones(String icones){
        if(icones.equals("Sem icones")){
            
        }
        if(icones.equals("Icones 1")){
            ImageIcon atualizar = new ImageIcon(getClass().getResource("/img/icons/pllogar.png"));           
            jButton1.setIcon(atualizar);
            ImageIcon editar = new ImageIcon(getClass().getResource("/img/icons/plcancelar.png"));           
            jButton2.setIcon(editar);
        }
        if(icones.equals("Icones 2")){
            ImageIcon atualizar = new ImageIcon(getClass().getResource("/img/icons/logar2.png"));           
            jButton1.setIcon(atualizar);
            ImageIcon editar = new ImageIcon(getClass().getResource("/img/icons/cancelar2.png"));           
            jButton2.setIcon(editar);
        }
        if(icones.equals("Icones 3")){
            ImageIcon atualizar = new ImageIcon(getClass().getResource("/img/icons/logar.png"));           
            jButton1.setIcon(atualizar);
            ImageIcon editar = new ImageIcon(getClass().getResource("/img/icons/cancelar.png"));           
            jButton2.setIcon(editar);
        }
    }
    
    public void adiciona() throws Exception{ 
        try {
            Conexao conexao = new Conexao();
            Connection con = conexao.abrir();
            
            int campos = 0;
            if(CampoCNPJ.getText() == null){
                JOptionPane.showMessageDialog(null, "Insira um CNPJ!");
                campos = 1;
            }
            if(CampoNome.getText() == null){
                JOptionPane.showMessageDialog(null, "Insira um Nome!");
                campos = 1;
            }
            if(CampoPlano.getText() == null){
                JOptionPane.showMessageDialog(null, "Insira um Plano!");
                campos = 1;
            }
            
            if(campos == 0){
                
            
            String sql = "INSERT INTO convenios(nome_convenio,endereco_convenio,telefone_convenio,cnpj_convenio,plano_convenio) VALUES(?,?,?,?,?)";
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setString(1, CampoNome.getText());
            stmt.setString(2, CampoEndereco.getText());
            stmt.setString(3, CampoTelefone.getText());
            stmt.setString(4, CampoCNPJ.getText());
            stmt.setString(5, CampoPlano.getText());
            stmt.execute();
            stmt.close(); 
            JOptionPane.showMessageDialog(null, "Conv??nio cadastrado com sucesso!");
            
            
            }
        } catch (SQLException ex) {
            Logger.getLogger(teste.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Algo deu errado!");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(teste.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Algo deu errado!");
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

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        CampoNome = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        CampoEndereco = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        CampoTelefone = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        CampoCNPJ = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        CampoPlano = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Cadastro Conv??nio");
        setBackground(new java.awt.Color(255, 255, 255));
        setMinimumSize(new java.awt.Dimension(380, 380));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(102, 153, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Cadastro Conv??nio");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 20, 400, 50));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/PlusLife_Login_transparente.png"))); // NOI18N
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, -1, 70));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 480, 70));

        jPanel2.setBackground(new java.awt.Color(102, 153, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton2.setBackground(new java.awt.Color(255, 255, 255));
        jButton2.setForeground(new java.awt.Color(102, 153, 255));
        jButton2.setText("Cancelar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 20, 120, 40));

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setForeground(new java.awt.Color(102, 153, 255));
        jButton1.setText("Cadastrar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 20, 120, 40));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 350, 480, 80));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        CampoNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CampoNomeActionPerformed(evt);
            }
        });
        jPanel3.add(CampoNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 30, 250, 30));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(102, 153, 255));
        jLabel2.setText("Nome:*");
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 30, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(102, 153, 255));
        jLabel4.setText("Endere??o:");
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 80, -1, -1));

        CampoEndereco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CampoEnderecoActionPerformed(evt);
            }
        });
        jPanel3.add(CampoEndereco, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 80, 247, 30));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(102, 153, 255));
        jLabel3.setText("Telefone:");
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 130, -1, -1));

        CampoTelefone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CampoTelefoneActionPerformed(evt);
            }
        });
        jPanel3.add(CampoTelefone, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 130, 247, 30));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(102, 153, 255));
        jLabel5.setText("CNPJ:*");
        jPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(75, 180, 70, -1));
        jPanel3.add(CampoCNPJ, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 180, 247, 30));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(102, 153, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Plano:*");
        jPanel3.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 230, 70, -1));
        jPanel3.add(CampoPlano, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 230, 247, 30));

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 480, 300));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CampoNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CampoNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CampoNomeActionPerformed

    private void CampoEnderecoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CampoEnderecoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CampoEnderecoActionPerformed

    private void CampoTelefoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CampoTelefoneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CampoTelefoneActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try {
            adiciona();
            
        } catch (Exception ex) {
            Logger.getLogger(Tela_cadastrar_convenios.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(Tela_cadastrar_convenios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Tela_cadastrar_convenios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Tela_cadastrar_convenios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tela_cadastrar_convenios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new Tela_cadastrar_convenios().setVisible(true);
                } catch (IOException ex) {
                    Logger.getLogger(Tela_cadastrar_convenios.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField CampoCNPJ;
    private javax.swing.JTextField CampoEndereco;
    private javax.swing.JTextField CampoNome;
    private javax.swing.JTextField CampoPlano;
    private javax.swing.JTextField CampoTelefone;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    // End of variables declaration//GEN-END:variables
}
