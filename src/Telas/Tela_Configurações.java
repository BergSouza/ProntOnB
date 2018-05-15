/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Telas;

import java.awt.Color;
import java.awt.Font;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import plus_life.Plus_Life;
import static plus_life.Plus_Life.conferetelalogin;

/**
 *
 * @author Bergson
 */
public class Tela_Configurações extends javax.swing.JFrame {

    /**
     * Creates new form Tela_Configurações
     */
    public Tela_Configurações() throws IOException {
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
        mudacorprincipal(corp);
        mudacorsecundaria(cors);
        mudafonte(fonte,tamanho);
        corprincipal.setText(corp);
        corsecundaria.setText(cors);
        
        campofonte.setText(fonte);
        tamanhofonte.setText(tamanho);
    }
        
    public void mudacorprincipal(String cor){
        selecaocor.setBackground(Color.decode(cor));
        selecaofonte.setBackground(Color.decode(cor));
        selecaotamanhofonte.setBackground(Color.decode(cor));
        btnOk.setBackground(Color.decode(cor));
        btnInverter.setBackground(Color.decode(cor));
        painelcabecalho.setBackground(Color.decode(cor));
        painelrodape.setBackground(Color.decode(cor));
        btnconfirmarrodape.setForeground(Color.decode(cor));
        btncancelarrodape.setForeground(Color.decode(cor));
        txta.setForeground(Color.decode(cor));
        txta1.setForeground(Color.decode(cor));
        txta2.setForeground(Color.decode(cor));
        txta3.setForeground(Color.decode(cor));
        txta4.setForeground(Color.decode(cor));
        txtb.setForeground(Color.decode(cor));
        txtc.setForeground(Color.decode(cor));
        corprincipal.setText(cor);
    }
    
    public void mudacorsecundaria(String cor){
        selecaocor.setForeground(Color.decode(cor));
        selecaofonte.setForeground(Color.decode(cor));
        selecaotamanhofonte.setForeground(Color.decode(cor));
        btnOk.setForeground(Color.decode(cor));
        btnInverter.setForeground(Color.decode(cor));
        painelcabecalho.setForeground(Color.decode(cor));
        painelrodape.setForeground(Color.decode(cor));
        btnconfirmarrodape.setBackground(Color.decode(cor));
        btncancelarrodape.setBackground(Color.decode(cor));
        txtcabecalho.setForeground(Color.decode(cor));
        jPanel2.setBackground(Color.decode(cor));
        corsecundaria.setText(cor);
    }
    
    public void mudafonte(String fonte, String tamanhoo){
        int tamanho = Integer.parseInt(tamanhoo);
        txtcabecalho.setFont(new Font(fonte, Font.BOLD, 8+tamanho));
        txta.setFont(new Font(fonte, Font.BOLD, 2+tamanho));
        txta1.setFont(new Font(fonte, Font.BOLD, 2+tamanho));
        txta2.setFont(new Font(fonte, Font.BOLD, 2+tamanho));
        selecaocor.setFont(new Font(fonte, Font.BOLD, 1+tamanho));
        btnOk.setFont(new Font(fonte, Font.BOLD, 1+tamanho));
        btnInverter.setFont(new Font(fonte, Font.BOLD, 1+tamanho));
        selecaofonte.setFont(new Font(fonte, Font.BOLD, 1+tamanho));
        selecaotamanhofonte.setFont(new Font(fonte, Font.BOLD, 1+tamanho));
        btnconfirmarrodape.setFont(new Font(fonte, Font.BOLD, 1+tamanho));
        btncancelarrodape.setFont(new Font(fonte, Font.BOLD, 1+tamanho));
        
    }
    
    public void salvarconfiguracoes(String corprincipal, String corsecundaria){
        
        try{
            File diretorio = new File("C:\\PlusLife");
                diretorio.mkdir();
                
                FileWriter arq = new FileWriter("C:\\PlusLife\\config.pl");
                BufferedWriter writer = new BufferedWriter(arq);
                //writer.newLine();
                writer.write(corprincipal);
                writer.newLine();
                writer.write(corsecundaria);
                writer.newLine();
                writer.write((String) selecaofonte.getSelectedItem());
                writer.newLine();
                writer.write((String) selecaotamanhofonte.getSelectedItem());
                writer.flush();
                writer.close();
                JOptionPane.showMessageDialog(null, "Configurações salvas!");
                campofonte.setText((String) selecaofonte.getSelectedItem());
                tamanhofonte.setText((String) selecaotamanhofonte.getSelectedItem());
                
        } catch (IOException erro1) {
            
            try {
                File diretorio = new File("C:\\PlusLife");
                diretorio.mkdir();
                
                FileWriter arq = new FileWriter("C:\\PlusLife\\config.pl");
                BufferedWriter writer = new BufferedWriter(arq);
                //writer.newLine();
                writer.write("0");
                writer.flush();
                writer.close();
                salvarconfiguracoes(corprincipal,corsecundaria);
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, "Erro ao criar o diretorio");
                System.out.println(ex);
            }
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

        txtb = new javax.swing.JLabel();
        txtc = new javax.swing.JLabel();
        painelcabecalho = new javax.swing.JPanel();
        txtcabecalho = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        txta = new javax.swing.JLabel();
        cp7 = new javax.swing.JButton();
        cp1 = new javax.swing.JButton();
        cp2 = new javax.swing.JButton();
        cp3 = new javax.swing.JButton();
        cp4 = new javax.swing.JButton();
        cp5 = new javax.swing.JButton();
        cp6 = new javax.swing.JButton();
        cs1 = new javax.swing.JButton();
        cs2 = new javax.swing.JButton();
        cs3 = new javax.swing.JButton();
        cs4 = new javax.swing.JButton();
        cs5 = new javax.swing.JButton();
        cs6 = new javax.swing.JButton();
        cs7 = new javax.swing.JButton();
        selecaocor = new javax.swing.JComboBox<>();
        campocor = new javax.swing.JTextField();
        btnInverter = new javax.swing.JButton();
        btnOk = new javax.swing.JButton();
        txta1 = new javax.swing.JLabel();
        corprincipal = new javax.swing.JTextField();
        corsecundaria = new javax.swing.JTextField();
        selecaofonte = new javax.swing.JComboBox<>();
        txta2 = new javax.swing.JLabel();
        selecaotamanhofonte = new javax.swing.JComboBox<>();
        campofonte = new javax.swing.JTextField();
        txta3 = new javax.swing.JLabel();
        txta4 = new javax.swing.JLabel();
        tamanhofonte = new javax.swing.JTextField();
        painelrodape = new javax.swing.JPanel();
        btncancelarrodape = new javax.swing.JButton();
        btnconfirmarrodape = new javax.swing.JButton();

        txtb.setText("Cor Principal >>");
        txtb.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtbMouseClicked(evt);
            }
        });

        txtc.setText("Cor Secundária >>");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        painelcabecalho.setBackground(new java.awt.Color(102, 153, 255));
        painelcabecalho.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtcabecalho.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        txtcabecalho.setForeground(new java.awt.Color(255, 255, 255));
        txtcabecalho.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtcabecalho.setText("Configurações");
        painelcabecalho.add(txtcabecalho, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 10, 320, 50));

        getContentPane().add(painelcabecalho, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 520, 70));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txta.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txta.setForeground(new java.awt.Color(102, 153, 255));
        txta.setText("Digite Hexadecimal #");
        jPanel2.add(txta, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 10, 130, 30));

        cp7.setBackground(new java.awt.Color(35, 106, 229));
        cp7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cp7ActionPerformed(evt);
            }
        });
        jPanel2.add(cp7, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 80, 60, 50));

        cp1.setBackground(new java.awt.Color(102, 153, 255));
        cp1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cp1ActionPerformed(evt);
            }
        });
        jPanel2.add(cp1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 60, 50));

        cp2.setBackground(new java.awt.Color(255, 0, 74));
        cp2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cp2ActionPerformed(evt);
            }
        });
        jPanel2.add(cp2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 80, 60, 50));

        cp3.setBackground(new java.awt.Color(255, 197, 39));
        cp3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cp3ActionPerformed(evt);
            }
        });
        jPanel2.add(cp3, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 80, 60, 50));

        cp4.setBackground(new java.awt.Color(0, 159, 124));
        cp4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cp4ActionPerformed(evt);
            }
        });
        jPanel2.add(cp4, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 80, 60, 50));

        cp5.setBackground(new java.awt.Color(255, 0, 0));
        cp5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cp5ActionPerformed(evt);
            }
        });
        jPanel2.add(cp5, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 80, 60, 50));

        cp6.setBackground(new java.awt.Color(245, 101, 237));
        cp6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cp6ActionPerformed(evt);
            }
        });
        jPanel2.add(cp6, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 80, 60, 50));

        cs1.setBackground(new java.awt.Color(111, 113, 114));
        cs1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cs1ActionPerformed(evt);
            }
        });
        jPanel2.add(cs1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, 60, 50));

        cs2.setBackground(new java.awt.Color(255, 51, 102));
        cs2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cs2ActionPerformed(evt);
            }
        });
        jPanel2.add(cs2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 140, 60, 50));

        cs3.setBackground(new java.awt.Color(255, 255, 0));
        cs3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cs3ActionPerformed(evt);
            }
        });
        jPanel2.add(cs3, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 140, 60, 50));

        cs4.setBackground(new java.awt.Color(0, 153, 51));
        cs4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cs4ActionPerformed(evt);
            }
        });
        jPanel2.add(cs4, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 140, 60, 50));

        cs5.setBackground(new java.awt.Color(0, 0, 255));
        cs5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cs5ActionPerformed(evt);
            }
        });
        jPanel2.add(cs5, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 140, 60, 50));

        cs6.setBackground(new java.awt.Color(255, 255, 255));
        cs6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cs6ActionPerformed(evt);
            }
        });
        jPanel2.add(cs6, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 140, 60, 50));

        cs7.setBackground(new java.awt.Color(0, 0, 0));
        cs7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cs7ActionPerformed(evt);
            }
        });
        jPanel2.add(cs7, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 140, 60, 50));

        selecaocor.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Cor Principal", "Cor Secundária" }));
        jPanel2.add(selecaocor, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, 130, 30));
        jPanel2.add(campocor, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 40, 130, 30));

        btnInverter.setText("Inverter");
        btnInverter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInverterActionPerformed(evt);
            }
        });
        jPanel2.add(btnInverter, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 40, 130, 30));

        btnOk.setText("OK");
        btnOk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOkActionPerformed(evt);
            }
        });
        jPanel2.add(btnOk, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 40, 60, 30));

        txta1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txta1.setForeground(new java.awt.Color(102, 153, 255));
        txta1.setText("Atual:");
        jPanel2.add(txta1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 200, 60, 30));

        corprincipal.setEditable(false);
        jPanel2.add(corprincipal, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 10, 100, -1));

        corsecundaria.setEditable(false);
        jPanel2.add(corsecundaria, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 10, 90, -1));

        selecaofonte.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Arial", "Arial Black", "Arial Bold", "Arial Bold Italic", "Arial Italic", "Comic Sans MS", "Comic Sans MS Bold", "Courier 10", "Courier 12", "Courier 15", "Courier New", "Courier New Bold", "Courier New Bold Italic", "Courier New Italic", "Georgia", "Georgia Bold", "Georgia Bold Italic", "Georgia Italic", "Impact", "Lucida Console", "Lucida Sans Unicode", "Microsoft Sans Serif", "Modern", "MS Sans Serif 8", "MS Sans Serif 10", "MS Sans Serif 12", "MS Sans Serif 14", "MS Sans Serif 18", "MS Sans Serif 24", " ", "MS Serif 8", "MS Serif 10", "MS Serif 12", "MS Serif  14", "MS Serif  18", "MS Serif  24", "Palatino Linotype", "Palatino Linotype Bold", "Palatino Linotype Bold Italic", "Palatino Linotype Italic", "Roman", "Script", "Small Fonts", "Symbol 8", "Symbol 10", "Symbol 12", "Symbol 14", "Symbol 18", "Symbol 24", "Tahoma", "Tahoma Bold", "Times MS Visio Standard 2013 New Roman", "Times New Roman Bold", "Times New Roman Bold Italic", "Times New Roman Italic", "Trebuchet MS", "Trebuchet MS Bold", "Trebuchet MS Bold Italic", "Trebuchet MS Italic", "Verdana", "Verdana Bold", "Verdana Bold Italic", "Verdana Italic", "Webdings", "WingDings" }));
        selecaofonte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selecaofonteActionPerformed(evt);
            }
        });
        jPanel2.add(selecaofonte, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 230, 130, 30));

        txta2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txta2.setForeground(new java.awt.Color(102, 153, 255));
        txta2.setText("Cores:");
        jPanel2.add(txta2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 50, 30));

        selecaotamanhofonte.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "7", "8", "9", "10", "11" }));
        selecaotamanhofonte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selecaotamanhofonteActionPerformed(evt);
            }
        });
        jPanel2.add(selecaotamanhofonte, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 230, 60, 30));

        campofonte.setEditable(false);
        jPanel2.add(campofonte, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 230, 130, 30));

        txta3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txta3.setForeground(new java.awt.Color(102, 153, 255));
        txta3.setText("Fonte:");
        jPanel2.add(txta3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, 60, 30));

        txta4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txta4.setForeground(new java.awt.Color(102, 153, 255));
        txta4.setText("Nova:");
        jPanel2.add(txta4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 230, 60, 30));

        tamanhofonte.setEditable(false);
        jPanel2.add(tamanhofonte, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 230, 60, 30));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 520, 270));

        painelrodape.setBackground(new java.awt.Color(102, 153, 255));
        painelrodape.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btncancelarrodape.setBackground(new java.awt.Color(255, 255, 255));
        btncancelarrodape.setForeground(new java.awt.Color(102, 153, 255));
        btncancelarrodape.setText("Cancelar");
        btncancelarrodape.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncancelarrodapeActionPerformed(evt);
            }
        });
        painelrodape.add(btncancelarrodape, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 20, 97, 40));

        btnconfirmarrodape.setBackground(new java.awt.Color(255, 255, 255));
        btnconfirmarrodape.setForeground(new java.awt.Color(102, 153, 255));
        btnconfirmarrodape.setText("Cofirmar");
        btnconfirmarrodape.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnconfirmarrodapeActionPerformed(evt);
            }
        });
        painelrodape.add(btnconfirmarrodape, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 20, 97, 40));

        getContentPane().add(painelrodape, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 340, 520, 70));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btncancelarrodapeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncancelarrodapeActionPerformed
        dispose();
        Plus_Life pl = new Plus_Life();
        pl.conferetelalogin();
    }//GEN-LAST:event_btncancelarrodapeActionPerformed

    private void cp1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cp1ActionPerformed
        if(selecaocor.getSelectedIndex() == 0){
            mudacorprincipal("#6699FF");
        }if(selecaocor.getSelectedIndex() == 1){
            mudacorsecundaria("#6699FF");
        }
        
    }//GEN-LAST:event_cp1ActionPerformed

    private void cp2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cp2ActionPerformed
        if(selecaocor.getSelectedIndex() == 0){
            mudacorprincipal("#FF004A");
        }
        if(selecaocor.getSelectedIndex() == 1){
            mudacorsecundaria("#FF004A");
        }
    }//GEN-LAST:event_cp2ActionPerformed

    private void cp3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cp3ActionPerformed
        if(selecaocor.getSelectedIndex() == 0){
            mudacorprincipal("#FFC527");
        }
        if(selecaocor.getSelectedIndex() == 1){
            mudacorsecundaria("#FFC527");
        }
    }//GEN-LAST:event_cp3ActionPerformed

    private void cp4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cp4ActionPerformed
        if(selecaocor.getSelectedIndex() == 0){
            mudacorprincipal("#009F7C");
        }
        if(selecaocor.getSelectedIndex() == 1){
            mudacorsecundaria("#009F7C");
        }
    }//GEN-LAST:event_cp4ActionPerformed

    private void cp5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cp5ActionPerformed
        if(selecaocor.getSelectedIndex() == 0){
            mudacorprincipal("#FF0000");
        }
        if(selecaocor.getSelectedIndex() == 1){
            mudacorsecundaria("#FF0000");
        }
    }//GEN-LAST:event_cp5ActionPerformed

    private void cp6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cp6ActionPerformed
       if(selecaocor.getSelectedIndex() == 0){
           mudacorprincipal("#F565ED");
       }
       if(selecaocor.getSelectedIndex() == 1){
            mudacorsecundaria("#F565ED");
        }
    }//GEN-LAST:event_cp6ActionPerformed

    private void cp7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cp7ActionPerformed
        if(selecaocor.getSelectedIndex() == 0){
            mudacorprincipal("#236AE5");
        }
        if(selecaocor.getSelectedIndex() == 1){
            mudacorsecundaria("#236AE5");
        }
    }//GEN-LAST:event_cp7ActionPerformed

    private void cs1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cs1ActionPerformed
        if(selecaocor.getSelectedIndex() == 0){
            mudacorprincipal("#6F7172");
        }
        if(selecaocor.getSelectedIndex() == 1){
            mudacorsecundaria("#6F7172");
        }
    }//GEN-LAST:event_cs1ActionPerformed

    private void cs2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cs2ActionPerformed
        if(selecaocor.getSelectedIndex() == 0){
            mudacorprincipal("#FF3366");
        }
        if(selecaocor.getSelectedIndex() == 1){
            mudacorsecundaria("#FF3366");
        }
    }//GEN-LAST:event_cs2ActionPerformed

    private void cs3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cs3ActionPerformed
        if(selecaocor.getSelectedIndex() == 0){
            mudacorprincipal("#FFFF00"); 
        }
        if(selecaocor.getSelectedIndex() == 1){
            mudacorsecundaria("#FFFF00");
        }// TODO add your handling code here:
    }//GEN-LAST:event_cs3ActionPerformed

    private void cs4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cs4ActionPerformed
        if(selecaocor.getSelectedIndex() == 0){
            mudacorprincipal("#009933");
        }
        if(selecaocor.getSelectedIndex() == 1){
            mudacorsecundaria("#009933");
        }// TODO add your handling code here:
    }//GEN-LAST:event_cs4ActionPerformed

    private void cs5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cs5ActionPerformed
        if(selecaocor.getSelectedIndex() == 0){
            mudacorprincipal("#0000FF"); 
        }
        if(selecaocor.getSelectedIndex() == 1){
            mudacorsecundaria("#0000FF");
        }// TODO add your handling code here:
    }//GEN-LAST:event_cs5ActionPerformed

    private void cs6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cs6ActionPerformed
        if(selecaocor.getSelectedIndex() == 0){
            mudacorprincipal("#FFFFFF");  
        }
        if(selecaocor.getSelectedIndex() == 1){
            mudacorsecundaria("#FFFFFF");
        }// TODO add your handling code here:
    }//GEN-LAST:event_cs6ActionPerformed

    private void cs7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cs7ActionPerformed
        if(selecaocor.getSelectedIndex() == 0){
            mudacorprincipal("#000000"); 
        }
        if(selecaocor.getSelectedIndex() == 1){
            mudacorsecundaria("#000000");
        }// TODO add your handling code here:
    }//GEN-LAST:event_cs7ActionPerformed

    private void btnconfirmarrodapeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnconfirmarrodapeActionPerformed
        int resposta = JOptionPane.showConfirmDialog(null, "Deseja realmente salvar essas configurações?");
        UIManager.put("OptionPane.yesButtonText", "Sim");
        UIManager.put("OptionPane.noButtonText", "Não");
        if(resposta == 0){
            salvarconfiguracoes(corprincipal.getText(),corsecundaria.getText());
        }
    }//GEN-LAST:event_btnconfirmarrodapeActionPerformed

    private void txtbMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtbMouseClicked
        /*Tela_Config_Selecionar_Cor cp1;
        try {
            dispose();
            cp1 = new Tela_Config_Selecionar_Cor();
            cp1.setVisible(true);
            cp1.pegavalores("0", corprincipal.getText(), corsecundaria.getText());
        cp1.setLocationRelativeTo(null);
        } catch (IOException ex) {
            Logger.getLogger(Tela_Configurações.class.getName()).log(Level.SEVERE, null, ex);
        }*/
        
    }//GEN-LAST:event_txtbMouseClicked

    private void btnOkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOkActionPerformed
        String cor = campocor.getText();
        if(selecaocor.getSelectedIndex() == 0){
            try{
                mudacorprincipal(cor);
            } catch (Exception ex1){
                JOptionPane.showMessageDialog(null, "Digite o código com o #");
            }
        }
        if(selecaocor.getSelectedIndex() == 1){
            try{
                mudacorsecundaria(cor);
            } catch (Exception ex1){
                JOptionPane.showMessageDialog(null, "Digite o código com o #");
            }
        }
    }//GEN-LAST:event_btnOkActionPerformed

    private void btnInverterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInverterActionPerformed
        String a = corprincipal.getText();
        String b = corsecundaria.getText();
        mudacorprincipal(b);
        mudacorsecundaria(a);
    }//GEN-LAST:event_btnInverterActionPerformed

    private void selecaofonteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selecaofonteActionPerformed
        mudafonte((String) selecaofonte.getSelectedItem(), (String) selecaotamanhofonte.getSelectedItem());
    }//GEN-LAST:event_selecaofonteActionPerformed

    private void selecaotamanhofonteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selecaotamanhofonteActionPerformed
        mudafonte((String) selecaofonte.getSelectedItem(), (String) selecaotamanhofonte.getSelectedItem());
    }//GEN-LAST:event_selecaotamanhofonteActionPerformed

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
            java.util.logging.Logger.getLogger(Tela_Configurações.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Tela_Configurações.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Tela_Configurações.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tela_Configurações.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new Tela_Configurações().setVisible(true);
                    
                } catch (IOException ex) {
                    Logger.getLogger(Tela_Configurações.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnInverter;
    private javax.swing.JButton btnOk;
    private javax.swing.JButton btncancelarrodape;
    private javax.swing.JButton btnconfirmarrodape;
    private javax.swing.JTextField campocor;
    private javax.swing.JTextField campofonte;
    private javax.swing.JTextField corprincipal;
    private javax.swing.JTextField corsecundaria;
    private javax.swing.JButton cp1;
    private javax.swing.JButton cp2;
    private javax.swing.JButton cp3;
    private javax.swing.JButton cp4;
    private javax.swing.JButton cp5;
    private javax.swing.JButton cp6;
    private javax.swing.JButton cp7;
    private javax.swing.JButton cs1;
    private javax.swing.JButton cs2;
    private javax.swing.JButton cs3;
    private javax.swing.JButton cs4;
    private javax.swing.JButton cs5;
    private javax.swing.JButton cs6;
    private javax.swing.JButton cs7;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel painelcabecalho;
    private javax.swing.JPanel painelrodape;
    private javax.swing.JComboBox<String> selecaocor;
    private javax.swing.JComboBox<String> selecaofonte;
    private javax.swing.JComboBox<String> selecaotamanhofonte;
    private javax.swing.JTextField tamanhofonte;
    private javax.swing.JLabel txta;
    private javax.swing.JLabel txta1;
    private javax.swing.JLabel txta2;
    private javax.swing.JLabel txta3;
    private javax.swing.JLabel txta4;
    private javax.swing.JLabel txtb;
    private javax.swing.JLabel txtc;
    private javax.swing.JLabel txtcabecalho;
    // End of variables declaration//GEN-END:variables
}
