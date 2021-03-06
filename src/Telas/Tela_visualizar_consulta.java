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
import java.util.InputMismatchException;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
/**
 *
 * @author HARDWARE
 */
public class Tela_visualizar_consulta extends javax.swing.JFrame {

    /**
     * Creates new form cadastrar_medico
     */
    public Tela_visualizar_consulta() throws IOException {
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
        jLabel13.setForeground(Color.decode(cor));
        CampoNomeMed.setBackground(Color.decode(cor));
        CampoNome.setBackground(Color.decode(cor));
        CampoDataC.setBackground(Color.decode(cor));
        CampoDataN.setBackground(Color.decode(cor));
        CampoHorario.setBackground(Color.decode(cor));
        CampoRG.setBackground(Color.decode(cor));
        
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
        jLabel8.setFont(new Font(fonte, Font.BOLD, 8+tamanho));
        jLabel9.setFont(new Font(fonte, Font.BOLD, 8+tamanho));
        jLabel13.setFont(new Font(fonte, Font.BOLD, 8+tamanho));
        
        CampoNome.setFont(new Font(fonte, Font.BOLD, 1+tamanho));
        CampoRG.setFont(new Font(fonte, Font.BOLD, 1+tamanho));
        CampoDataN.setFont(new Font(fonte, Font.BOLD, 1+tamanho));
        CampoDataC.setFont(new Font(fonte, Font.BOLD, 1+tamanho));
        CampoNomeMed.setFont(new Font(fonte, Font.BOLD, 1+tamanho));
        
        jButton2.setFont(new Font(fonte, Font.BOLD, 1+tamanho));
        
        CheckMasculino.setFont(new Font(fonte, Font.BOLD, 4+tamanho));
        CheckFeminino.setFont(new Font(fonte, Font.BOLD, 4+tamanho));
    
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
    
    public String pegavalores(String id,String nome_paciente,String nome_medico,String rg,String data_nasc, String sexo, String data,String hora,String minuto){
        CampoNome.setText(nome_paciente);
        campoidd.setText(id);
        CampoNomeMed.setText(nome_medico);
        CampoRG.setText(rg);
        CampoDataN.setText(data_nasc);
        CampoDataC.setText(data);
        CampoHorario.setText(hora+":"+minuto);
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
        jComboBox5 = new javax.swing.JComboBox<>();
        campoidd = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        CampoRG = new javax.swing.JTextField();
        CheckMasculino = new javax.swing.JCheckBox();
        CheckFeminino = new javax.swing.JCheckBox();
        CampoHorario = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        CampoNome = new javax.swing.JTextField();
        CampoDataN = new javax.swing.JTextField();
        CampoDataC = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        CampoNomeMed = new javax.swing.JTextField();

        jLabel8.setText("jLabel8");

        jCheckBox1.setText("jCheckBox1");

        jComboBox5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jComboBox5.setForeground(new java.awt.Color(102, 153, 255));
        jComboBox5.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "00", "01", "02", "03", "04", "05", "06", "07", "08", "09", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23" }));

        campoidd.setText("jTextField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Visualizar Consulta");
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(34, 11, 476, -1));

        jPanel1.setBackground(new java.awt.Color(102, 153, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Visualizar Consulta");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 20, 510, 50));

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/PlusLife_Login_transparente.png"))); // NOI18N
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, 50));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 710, 70));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(102, 153, 255));
        jLabel2.setText("Nome do Paciente:");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, 190, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(102, 153, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Data de Nascimento:");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, 200, 30));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(102, 153, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Data da Consulta:");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 230, 210, 30));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(102, 153, 255));
        jLabel6.setText("RG:");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 110, -1, 30));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(102, 153, 255));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Hor??rio:");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 230, 100, 30));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(102, 153, 255));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Sexo:");
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 160, 70, 50));

        CampoRG.setEditable(false);
        CampoRG.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CampoRGActionPerformed(evt);
            }
        });
        jPanel2.add(CampoRG, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 110, 180, 30));

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
        jPanel2.add(CheckMasculino, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 160, -1, 50));

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
        jPanel2.add(CheckFeminino, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 160, -1, 50));

        CampoHorario.setEditable(false);
        jPanel2.add(CampoHorario, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 230, 130, 30));

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
        jPanel3.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 20, 110, 40));

        jPanel2.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 290, 710, 80));

        CampoNome.setEditable(false);
        jPanel2.add(CampoNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 110, 210, 30));

        CampoDataN.setEnabled(false);
        jPanel2.add(CampoDataN, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 170, 210, 30));

        CampoDataC.setEnabled(false);
        jPanel2.add(CampoDataC, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 230, 210, 30));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(102, 153, 255));
        jLabel5.setText("M??dico:");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 50, -1, -1));

        CampoNomeMed.setEditable(false);
        jPanel2.add(CampoNomeMed, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 50, 210, 30));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 710, 370));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CampoRGActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CampoRGActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CampoRGActionPerformed

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
            java.util.logging.Logger.getLogger(Tela_visualizar_consulta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Tela_visualizar_consulta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Tela_visualizar_consulta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tela_visualizar_consulta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
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
                    new Tela_visualizar_consulta().setVisible(true);
                } catch (IOException ex) {
                    Logger.getLogger(Tela_visualizar_consulta.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField CampoDataC;
    private javax.swing.JTextField CampoDataN;
    private javax.swing.JTextField CampoHorario;
    private javax.swing.JTextField CampoNome;
    private javax.swing.JTextField CampoNomeMed;
    private javax.swing.JTextField CampoRG;
    private javax.swing.JCheckBox CheckFeminino;
    private javax.swing.JCheckBox CheckMasculino;
    private javax.swing.JTextField campoidd;
    private javax.swing.JButton jButton2;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JComboBox<String> jComboBox5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
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
