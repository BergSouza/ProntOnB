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
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.InputMismatchException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author HARDWARE
 */
public class Tela_cadastrar_sec extends javax.swing.JFrame {

    /**
     * Creates new form tela_Sec
     */
    public Tela_cadastrar_sec() throws IOException {
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
        jLabel1.setForeground(Color.decode(cor));
        jPanel1.setBackground(Color.decode(cor));
        jPanel3.setBackground(Color.decode(cor));
        jLabel2.setForeground(Color.decode(cor));
        jLabel3.setForeground(Color.decode(cor));
        jLabel4.setForeground(Color.decode(cor));
        jLabel5.setForeground(Color.decode(cor));
        jLabel6.setForeground(Color.decode(cor));
        jLabel7.setForeground(Color.decode(cor));
        jLabel8.setForeground(Color.decode(cor));
        
        jLabel10.setForeground(Color.decode(cor));
        jButton1.setForeground(Color.decode(cor));
        jButton2.setForeground(Color.decode(cor));
        
        CheckMasculino.setForeground(Color.decode(cor));
        CheckFeminino.setForeground(Color.decode(cor));
    }
    
    public void mudacorsecundaria(String cor){
        
        
        
        jPanel2.setBackground(Color.decode(cor));
        
        jLabel9.setForeground(Color.decode(cor));
        
        jButton1.setBackground(Color.decode(cor));
        jButton2.setBackground(Color.decode(cor));
        
        CheckMasculino.setBackground(Color.decode(cor));
        CheckFeminino.setBackground(Color.decode(cor));
        
    }
    
    public void mudafonte(String fonte, String tamanhoo){
        int tamanho = Integer.parseInt(tamanhoo);
        jLabel1.setFont(new Font(fonte, Font.BOLD, 8+tamanho));
        jLabel2.setFont(new Font(fonte, Font.BOLD, 8+tamanho));
        jLabel3.setFont(new Font(fonte, Font.BOLD, 8+tamanho));
        jLabel4.setFont(new Font(fonte, Font.BOLD, 8+tamanho));
        jLabel5.setFont(new Font(fonte, Font.BOLD, 8+tamanho));
        jLabel6.setFont(new Font(fonte, Font.BOLD, 8+tamanho));
        jLabel7.setFont(new Font(fonte, Font.BOLD, 8+tamanho));
        jLabel8.setFont(new Font(fonte, Font.BOLD, 8+tamanho));
        jLabel9.setFont(new Font(fonte, Font.BOLD, 8+tamanho));
        jLabel10.setFont(new Font(fonte, Font.BOLD, 8+tamanho));
        
        CampoNome.setFont(new Font(fonte, Font.BOLD, 1+tamanho));
        CampoCPF.setFont(new Font(fonte, Font.BOLD, 1+tamanho));
        CampoEndereco.setFont(new Font(fonte, Font.BOLD, 1+tamanho));
        CampoTelefone.setFont(new Font(fonte, Font.BOLD, 1+tamanho));
        CampoIdentity.setFont(new Font(fonte, Font.BOLD, 1+tamanho));
        CampoRG.setFont(new Font(fonte, Font.BOLD, 1+tamanho));
        
        CheckMasculino.setFont(new Font(fonte, Font.BOLD, 1+tamanho));
        CheckFeminino.setFont(new Font(fonte, Font.BOLD, 1+tamanho));
        
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
    
    public boolean VerificaCPF(String CPF){
        // considera-se erro CPF's formados por uma sequencia de numeros iguais
        if (CPF.equals("00000000000") || CPF.equals("11111111111") ||
            CPF.equals("22222222222") || CPF.equals("33333333333") ||
            CPF.equals("44444444444") || CPF.equals("55555555555") ||
            CPF.equals("66666666666") || CPF.equals("77777777777") ||
            CPF.equals("88888888888") || CPF.equals("99999999999") ||
           (CPF.length() != 11))
           return(false);

        char dig10, dig11;
        int sm, i, r, num, peso;

    // "try" - protege o codigo para eventuais erros de conversao de tipo (int)
        try {
    // Calculo do 1o. Digito Verificador
          sm = 0;
          peso = 10;
          for (i=0; i<9; i++) {              
    // converte o i-esimo caractere do CPF em um numero:
    // por exemplo, transforma o caractere '0' no inteiro 0         
    // (48 eh a posicao de '0' na tabela ASCII)         
            num = (int)(CPF.charAt(i) - 48); 
            sm = sm + (num * peso);
            peso = peso - 1;
          }

          r = 11 - (sm % 11);
          if ((r == 10) || (r == 11))
             dig10 = '0';
          else dig10 = (char)(r + 48); // converte no respectivo caractere numerico

    // Calculo do 2o. Digito Verificador
          sm = 0;
          peso = 11;
          for(i=0; i<10; i++) {
            num = (int)(CPF.charAt(i) - 48);
            sm = sm + (num * peso);
            peso = peso - 1;
          }

          r = 11 - (sm % 11);
          if ((r == 10) || (r == 11))
             dig11 = '0';
          else dig11 = (char)(r + 48);

    // Verifica se os digitos calculados conferem com os digitos informados.
          if ((dig10 == CPF.charAt(9)) && (dig11 == CPF.charAt(10)))
             return(true);
          else return(false);
        } catch (InputMismatchException erro) {
            return(false);
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

        jTextField5 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        CampoIdentity = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        CampoNome = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        CampoCPF = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        CampoRG = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        CampoTelefone = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        CampoEndereco = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        CheckMasculino = new javax.swing.JCheckBox();
        CheckFeminino = new javax.swing.JCheckBox();
        jLabel8 = new javax.swing.JLabel();
        CampoSenha = new javax.swing.JPasswordField();
        jPanel3 = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        jTextField5.setText("jTextField5");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Cadastro Secret??rio(a)");
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(102, 153, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(478, 70));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Cadastro Secret??rio(a)");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 10, 386, 70));

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/PlusLife_Login_transparente.png"))); // NOI18N
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 11, -1, 50));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(102, 153, 255));
        jLabel10.setText("Identity:*");
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 40, -1, -1));
        jPanel2.add(CampoIdentity, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 40, 248, 30));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 153, 255));
        jLabel1.setText("Nome:*");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 80, -1, 32));

        CampoNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CampoNomeActionPerformed(evt);
            }
        });
        jPanel2.add(CampoNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 90, 248, 27));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(102, 153, 255));
        jLabel2.setText("CPF:*");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 130, -1, -1));

        CampoCPF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CampoCPFActionPerformed(evt);
            }
        });
        jPanel2.add(CampoCPF, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 130, 248, 29));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(102, 153, 255));
        jLabel3.setText("RG:*");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 170, -1, -1));

        CampoRG.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CampoRGActionPerformed(evt);
            }
        });
        jPanel2.add(CampoRG, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 170, 248, 28));

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(102, 153, 255));
        jLabel4.setText("Telefone:");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 210, -1, -1));

        CampoTelefone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CampoTelefoneActionPerformed(evt);
            }
        });
        jPanel2.add(CampoTelefone, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 210, 248, 28));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(102, 153, 255));
        jLabel5.setText("Endere??o:");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 250, -1, -1));

        CampoEndereco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CampoEnderecoActionPerformed(evt);
            }
        });
        jPanel2.add(CampoEndereco, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 250, 248, 26));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(102, 153, 255));
        jLabel7.setText("Sexo:*");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 290, -1, -1));

        CheckMasculino.setBackground(new java.awt.Color(255, 255, 255));
        CheckMasculino.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        CheckMasculino.setForeground(new java.awt.Color(102, 153, 255));
        CheckMasculino.setText("Masculino ");
        CheckMasculino.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CheckMasculinoActionPerformed(evt);
            }
        });
        jPanel2.add(CheckMasculino, new org.netbeans.lib.awtextra.AbsoluteConstraints(155, 290, 100, -1));

        CheckFeminino.setBackground(new java.awt.Color(255, 255, 255));
        CheckFeminino.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        CheckFeminino.setForeground(new java.awt.Color(102, 153, 255));
        CheckFeminino.setText("Feminino");
        CheckFeminino.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CheckFemininoActionPerformed(evt);
            }
        });
        jPanel2.add(CheckFeminino, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 290, -1, -1));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(102, 153, 255));
        jLabel8.setText("Senha:*");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 330, -1, -1));
        jPanel2.add(CampoSenha, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 330, 248, 30));

        jPanel3.setBackground(new java.awt.Color(102, 153, 255));

        jButton2.setBackground(new java.awt.Color(255, 255, 255));
        jButton2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton2.setForeground(new java.awt.Color(102, 153, 255));
        jButton2.setText("Voltar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(102, 153, 255));
        jButton1.setText("Cadastrar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(235, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(15, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jPanel2.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 400, 490, 60));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 490, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CampoNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CampoNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CampoNomeActionPerformed

    private void CampoCPFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CampoCPFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CampoCPFActionPerformed

    private void CampoRGActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CampoRGActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CampoRGActionPerformed

    private void CampoTelefoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CampoTelefoneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CampoTelefoneActionPerformed

    private void CampoEnderecoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CampoEnderecoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CampoEnderecoActionPerformed

    private void CheckMasculinoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CheckMasculinoActionPerformed
        CheckFeminino.setSelected(false);
    }//GEN-LAST:event_CheckMasculinoActionPerformed

    private void CheckFemininoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CheckFemininoActionPerformed
        CheckMasculino.setSelected(false);
    }//GEN-LAST:event_CheckFemininoActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try {
            
            Conexao conexao = new Conexao();
            Connection con = conexao.abrir();
            
            String SexoSec = null;
            int campos = 0;
            if(CampoIdentity.getText() == null){
                JOptionPane.showMessageDialog(null, "Insira um Identity!");
                campos = 1;
            }
            if(CampoNome.getText() == null){
                JOptionPane.showMessageDialog(null, "Insira um Nome!");
                campos = 1;
            }
            if(CampoCPF.getText() == null){
                JOptionPane.showMessageDialog(null, "Insira um CPF!");
                campos = 1;
            }
            if(CampoRG.getText() == null){
                JOptionPane.showMessageDialog(null, "Insira um RG!");
                campos = 1;
            }
            if(CheckMasculino.isSelected() || CheckFeminino.isSelected()){
                
            }else{
                JOptionPane.showMessageDialog(null, "Selecione um Sexo!");
                campos = 1;
            }
            if(CampoSenha.getText() == null){
                JOptionPane.showMessageDialog(null, "Insira uma Senha!");
                campos = 1;
            }
            
            // Verifica CPF
            String CPF;

            CPF = CampoCPF.getText();

        
            if(VerificaCPF(CPF) == true){
                
            }else{JOptionPane.showMessageDialog(null, "CPF inv??lido!");
                    campos = 1;
            }
            
            /*Secret??rias*/
            
            java.sql.Statement st = con.createStatement();
            st.executeQuery("select identity from secs");
            ResultSet rs = st.getResultSet();
            
            int identity = 0;
            while(rs.next()){
                if(rs.getString("identity").equals(CampoIdentity.getText())){
                    identity = 1;
                }else{
                    
                }
            }
            
            /*M??dicos*/
            
            java.sql.Statement st2 = con.createStatement();
            st2.executeQuery("select identity from medicos");
            ResultSet rs2 = st2.getResultSet();
            
            while(rs2.next()){
                if(rs2.getString("identity").equals(CampoIdentity.getText())){
                    identity = 1;
                }else{
                    
                }
            }
            
            /*Administradores*/
            
            java.sql.Statement st3 = con.createStatement();
            st3.executeQuery("select identity from administradores");
            ResultSet rs3 = st3.getResultSet();
            
            while(rs3.next()){
                if(rs3.getString("identity").equals(CampoIdentity.getText())){
                    identity = 1;
                }else{
                    
                }
            }
            
            /*VERIFICA CPF CADASTRADO*/
            /*Secret??rias*/
            
            java.sql.Statement st4 = con.createStatement();
            st4.executeQuery("select cpf_sec from secs");
            ResultSet rs4 = st4.getResultSet();
            
            while(rs4.next()){
                if(rs4.getString("cpf_sec").equals(CPF)){
                    identity = 1;
                    JOptionPane.showMessageDialog(null, "CPF j?? Cadastrado!");
                }else{
                    
                }
            }
            
            /*M??dicos*/
            
            java.sql.Statement st5 = con.createStatement();
            st5.executeQuery("select cpf_medico from medicos");
            ResultSet rs5 = st5.getResultSet();
            
            while(rs5.next()){
                if(rs5.getString("cpf_medico").equals(CPF)){
                    identity = 1;
                    JOptionPane.showMessageDialog(null, "CPF j?? Cadastrado!");
                }else{
                    
                }
            }
            
            
            
            if(identity == 1){
                JOptionPane.showMessageDialog(null, "Identity j?? existe");
                campos = 1;
            }
            
            if(CheckMasculino.isSelected()){
                SexoSec = "M";
            }else if(CheckFeminino.isSelected()){
                SexoSec = "F";
            }
            
            if(identity == 0 && campos == 0){
                String sql = "INSERT INTO secs(identity,nome_sec,cpf_sec,rg_sec,telefone_sec,endereco_sec,sexo_sec,senha_sec) VALUES(?,?,?,?,?,?,?,?)";
                PreparedStatement stmt = con.prepareStatement(sql);
                stmt.setString(1, CampoIdentity.getText());
                stmt.setString(2, CampoNome.getText());
                stmt.setString(3, CampoCPF.getText());
                stmt.setString(4, CampoRG.getText());
                stmt.setString(5, CampoTelefone.getText());
                stmt.setString(6, CampoEndereco.getText());
                stmt.setString(7, SexoSec);
                stmt.setString(8, CampoSenha.getText());
                stmt.execute();
                stmt.close(); 
                JOptionPane.showMessageDialog(null, "Secret??rio(a) cadastrado!");
            }
            
            
        } catch (SQLException ex) {
            Logger.getLogger(teste.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Algo deu errado!");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(teste.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Algo deu errado!");
        } catch (Exception ex) {
            Logger.getLogger(Tela_cadastrar_medico.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Algo deu errado!");
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
            java.util.logging.Logger.getLogger(Tela_cadastrar_sec.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Tela_cadastrar_sec.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Tela_cadastrar_sec.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tela_cadastrar_sec.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new Tela_cadastrar_sec().setVisible(true);
                } catch (IOException ex) {
                    Logger.getLogger(Tela_cadastrar_sec.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField CampoCPF;
    private javax.swing.JTextField CampoEndereco;
    private javax.swing.JTextField CampoIdentity;
    private javax.swing.JTextField CampoNome;
    private javax.swing.JTextField CampoRG;
    private javax.swing.JPasswordField CampoSenha;
    private javax.swing.JTextField CampoTelefone;
    private javax.swing.JCheckBox CheckFeminino;
    private javax.swing.JCheckBox CheckMasculino;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
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
    private javax.swing.JTextField jTextField5;
    // End of variables declaration//GEN-END:variables
}
