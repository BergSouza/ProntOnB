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
import javax.swing.JOptionPane;
/**
 *
 * @author HARDWARE
 */
public class Tela_cadastrar_consulta extends javax.swing.JFrame {

    /**
     * Creates new form cadastrar_medico
     */
    public Tela_cadastrar_consulta() throws Exception {
        initComponents();
        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        MostraMedicos();
        
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
        mudafonte(fonte, tamanho);
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
        jLabel13.setForeground(Color.decode(cor));
        jLabel14.setForeground(Color.decode(cor));
        jLabel15.setForeground(Color.decode(cor));
        jLabel16.setForeground(Color.decode(cor));
        jLabel17.setForeground(Color.decode(cor));
        criterioPesquisa1.setForeground(Color.decode(cor));
        btnPesquisa.setBackground(Color.decode(cor));
        
        SelectCAno.setForeground(Color.decode(cor));
        SelectCMes.setForeground(Color.decode(cor));
        SelectCDia.setForeground(Color.decode(cor));
        SelectNAno.setForeground(Color.decode(cor));
        SelectNMes.setForeground(Color.decode(cor));
        SelectNDia1.setForeground(Color.decode(cor));
        SelectHora.setForeground(Color.decode(cor));
        SelectMinuto.setForeground(Color.decode(cor));
        
        jButton1.setForeground(Color.decode(cor));
        jButton2.setForeground(Color.decode(cor));
        
        CheckMasculino.setForeground(Color.decode(cor));
        CheckFeminino.setForeground(Color.decode(cor));
    }
    
    public void mudacorsecundaria(String cor){
        jLabel1.setForeground(Color.decode(cor));
        
        
        jPanel2.setBackground(Color.decode(cor));
        jLabel2.setForeground(Color.decode(cor));
        criterioPesquisa1.setBackground(Color.decode(cor));
        btnPesquisa.setBackground(Color.decode(cor));
        
        SelectCAno.setBackground(Color.decode(cor));
        SelectCMes.setBackground(Color.decode(cor));
        SelectCDia.setBackground(Color.decode(cor));
        SelectNAno.setBackground(Color.decode(cor));
        SelectNMes.setBackground(Color.decode(cor));
        SelectNDia1.setBackground(Color.decode(cor));
        SelectHora.setBackground(Color.decode(cor));
        SelectMinuto.setBackground(Color.decode(cor));
        
        jButton1.setBackground(Color.decode(cor));
        jButton2.setBackground(Color.decode(cor));
        
        CheckMasculino.setBackground(Color.decode(cor));
        CheckFeminino.setBackground(Color.decode(cor));
    }
    
    public void mudafonte(String fonte, String tamanhoo){
        int tamanho = Integer.parseInt(tamanhoo);
        jLabel1.setFont(new Font(fonte, Font.BOLD, 14+tamanho));
        jLabel2.setFont(new Font(fonte, Font.BOLD, 14+tamanho));
        jLabel3.setFont(new Font(fonte, Font.BOLD, 8+tamanho));
        jLabel4.setFont(new Font(fonte, Font.BOLD, 8+tamanho));
        jLabel5.setFont(new Font(fonte, Font.BOLD, 8+tamanho));
        jLabel6.setFont(new Font(fonte, Font.BOLD, 8+tamanho));
        jLabel7.setFont(new Font(fonte, Font.BOLD, 8+tamanho));
        jLabel8.setFont(new Font(fonte, Font.BOLD, 8+tamanho));
        jLabel9.setFont(new Font(fonte, Font.BOLD, 8+tamanho));
        jLabel15.setFont(new Font(fonte, Font.BOLD, 14+tamanho));
        jLabel16.setFont(new Font(fonte, Font.BOLD, 14+tamanho));
        jLabel12.setFont(new Font(fonte, Font.BOLD, 8+tamanho));
        jLabel13.setFont(new Font(fonte, Font.BOLD, 8+tamanho));
        jLabel14.setFont(new Font(fonte, Font.BOLD, 8+tamanho));
        jLabel17.setFont(new Font(fonte, Font.BOLD, 14+tamanho));
        
        Tabela.setFont(new Font(fonte, Font.BOLD, 1+tamanho));
        CampoPesquisa.setFont(new Font(fonte, Font.BOLD, 1+tamanho));
        CampoNome.setFont(new Font(fonte, Font.BOLD, 1+tamanho));
        CampoRG.setFont(new Font(fonte, Font.BOLD, 1+tamanho));
        
        SelectCAno.setFont(new Font(fonte, Font.BOLD, 4+tamanho));
        SelectCMes.setFont(new Font(fonte, Font.BOLD, 4+tamanho));
        SelectCDia.setFont(new Font(fonte, Font.BOLD, 4+tamanho));
        SelectNAno.setFont(new Font(fonte, Font.BOLD, 4+tamanho));
        SelectNMes.setFont(new Font(fonte, Font.BOLD, 4+tamanho));
        SelectNDia1.setFont(new Font(fonte, Font.BOLD, 4+tamanho));
        SelectHora.setFont(new Font(fonte, Font.BOLD, 4+tamanho));
        SelectMinuto.setFont(new Font(fonte, Font.BOLD, 4+tamanho));
        
        jButton1.setFont(new Font(fonte, Font.BOLD, 1+tamanho));
        jButton2.setFont(new Font(fonte, Font.BOLD, 1+tamanho));
        
        criterioPesquisa1.setFont(new Font(fonte, Font.BOLD, 1+tamanho));
        
        CheckMasculino.setFont(new Font(fonte, Font.BOLD, 4+tamanho));
        CheckFeminino.setFont(new Font(fonte, Font.BOLD, 4+tamanho));
    
    }
    public void MostraMedicos() throws Exception{
        try {
            //Registra JDBC driver
            Conexao conexao = new Conexao();
            Connection con = conexao.abrir();
            //Executa a query de seleção
            java.sql.Statement st = con.createStatement();
            st.executeQuery("select * from medicos");
            ResultSet rs = st.getResultSet();
                        
            int a = 0;
            //Lista os alunos no console
            int numtabelas = Tabela.getRowCount();
            for (int b = 0 ; b < numtabelas ; b++ ) {
                Tabela.setValueAt(" ", b, 0);
                Tabela.setValueAt(" ", b, 1);
                Tabela.setValueAt(" ", b, 2);
                Tabela.setValueAt(" ", b, 3);
                Tabela.setValueAt(" ", b, 4);
            }
            int linhas = 0;
            while (rs.next()) {
                linhas++;
                Tabela.setValueAt(rs.getString("id_medico"), a, 0);
                Tabela.setValueAt(rs.getString("nome_medico"), a, 1);
                Tabela.setValueAt(rs.getString("cpf_medico"), a, 2);
                Tabela.setValueAt(rs.getString("rg_medico"), a, 3);
                Tabela.setValueAt(rs.getString("telefone_medico"), a, 4);
                a++;
            }
           
        } catch (SQLException | ClassNotFoundException e) {
            JOptionPane.showMessageDialog(rootPane, e);
        } catch (Exception ex) {
            Logger.getLogger(teste.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
     
    } 
    
    public void PesquisaMedicos(String pesquisa) throws Exception{
        try {
            //Registra JDBC driver
            Conexao conexao = new Conexao();
            Connection con = conexao.abrir();
            //Executa a query de seleção
            java.sql.Statement st = con.createStatement();
            if(criterioPesquisa1.getSelectedIndex() == 0){
                st.executeQuery("select * from medicos where id_medico like '%"+pesquisa+"%'");
            }
            if(criterioPesquisa1.getSelectedIndex() == 1){
                st.executeQuery("select * from medicos where nome_medico like '%"+pesquisa+"%'");
            }
            if(criterioPesquisa1.getSelectedIndex() == 2){
                st.executeQuery("select * from medicos where cpf_medico like '%"+pesquisa+"%'");
            }
            if(criterioPesquisa1.getSelectedIndex() == 3){
                st.executeQuery("select * from medicos where rg_medico like '%"+pesquisa+"%'");
            }
            if(criterioPesquisa1.getSelectedIndex() == 4){
                st.executeQuery("select * from medicos where telefone_medico like '%"+pesquisa+"%'");
            }
            
            ResultSet rs = st.getResultSet();
                        
            int a = 0;
            //Lista os alunos no console
            int numtabelas = Tabela.getRowCount();
            for (int b = 0 ; b < numtabelas ; b++ ) {
                Tabela.setValueAt(" ", b, 0);
                Tabela.setValueAt(" ", b, 1);
                Tabela.setValueAt(" ", b, 2);
                Tabela.setValueAt(" ", b, 3);
                Tabela.setValueAt(" ", b, 4);
            }
            int linhas = 0;
            while (rs.next()) {
                linhas++;
                Tabela.setValueAt(rs.getString("id_medico"), a, 0);
                Tabela.setValueAt(rs.getString("nome_medico"), a, 1);
                Tabela.setValueAt(rs.getString("cpf_medico"), a, 2);
                Tabela.setValueAt(rs.getString("rg_medico"), a, 3);
                Tabela.setValueAt(rs.getString("telefone_medico"), a, 4);
                a++;
            }
           
        } catch (SQLException | ClassNotFoundException e) {
            JOptionPane.showMessageDialog(rootPane, e);
        } catch (Exception ex) {
            Logger.getLogger(teste.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    public void pegaValores() throws Exception{
        
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
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        btnPesquisa = new javax.swing.JButton();
        criterioPesquisa1 = new javax.swing.JComboBox<>();
        CampoPesquisa = new javax.swing.JTextField();
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
        jPanel3 = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        SelectMinuto = new javax.swing.JComboBox<>();
        SelectCDia = new javax.swing.JComboBox<>();
        SelectCMes = new javax.swing.JComboBox<>();
        SelectCAno = new javax.swing.JComboBox<>();
        SelectHora = new javax.swing.JComboBox<>();
        SelectNMes = new javax.swing.JComboBox<>();
        SelectNAno = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        SelectNDia1 = new javax.swing.JComboBox<>();
        CampoNome = new javax.swing.JTextField();
        ScrollTab = new javax.swing.JScrollPane();
        Tabela = new javax.swing.JTable();

        jLabel8.setText("jLabel8");

        jCheckBox1.setText("jCheckBox1");

        jComboBox5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jComboBox5.setForeground(new java.awt.Color(102, 153, 255));
        jComboBox5.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "00", "01", "02", "03", "04", "05", "06", "07", "08", "09", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23" }));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Marcar Consulta");
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(102, 153, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Marcar Consulta");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 20, 320, 50));

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/PlusLife_Login_transparente.png"))); // NOI18N
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, 50));

        btnPesquisa.setBackground(new java.awt.Color(255, 255, 255));
        btnPesquisa.setForeground(new java.awt.Color(102, 153, 255));
        btnPesquisa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/lupaazul.png"))); // NOI18N
        btnPesquisa.setName(""); // NOI18N
        btnPesquisa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesquisaActionPerformed(evt);
            }
        });
        jPanel1.add(btnPesquisa, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 30, 30, 30));

        criterioPesquisa1.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        criterioPesquisa1.setForeground(new java.awt.Color(102, 153, 255));
        criterioPesquisa1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ID", "Nome", "CPF", "RG", "Telefone" }));
        criterioPesquisa1.setSelectedIndex(1);
        criterioPesquisa1.setBorder(null);
        criterioPesquisa1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        criterioPesquisa1.setDebugGraphicsOptions(javax.swing.DebugGraphics.LOG_OPTION);
        criterioPesquisa1.setLightWeightPopupEnabled(false);
        criterioPesquisa1.setOpaque(false);
        jPanel1.add(criterioPesquisa1, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 30, 80, 30));
        jPanel1.add(CampoPesquisa, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 30, 160, 30));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 710, 70));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(102, 153, 255));
        jLabel2.setText("Médico");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, 30));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(102, 153, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Data de Nascimento:");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, 200, 30));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(102, 153, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Data da Consulta:");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 240, 210, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(102, 153, 255));
        jLabel6.setText("RG:");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 130, -1, 30));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(102, 153, 255));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Horário:");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 240, 100, 30));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(102, 153, 255));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Sexo:");
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 170, 70, 50));

        CampoRG.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CampoRGActionPerformed(evt);
            }
        });
        jPanel2.add(CampoRG, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 130, 180, 30));

        CheckMasculino.setBackground(new java.awt.Color(255, 255, 255));
        CheckMasculino.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        CheckMasculino.setForeground(new java.awt.Color(102, 153, 255));
        CheckMasculino.setText("Masculino\n");
        CheckMasculino.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CheckMasculinoActionPerformed(evt);
            }
        });
        jPanel2.add(CheckMasculino, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 170, -1, 50));

        CheckFeminino.setBackground(new java.awt.Color(255, 255, 255));
        CheckFeminino.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        CheckFeminino.setForeground(new java.awt.Color(102, 153, 255));
        CheckFeminino.setText("Feminino\n");
        CheckFeminino.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CheckFemininoActionPerformed(evt);
            }
        });
        jPanel2.add(CheckFeminino, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 170, -1, 50));

        jPanel3.setBackground(new java.awt.Color(102, 153, 255));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton2.setBackground(new java.awt.Color(255, 255, 255));
        jButton2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton2.setForeground(new java.awt.Color(102, 153, 255));
        jButton2.setText("Cancelar\n");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 20, 110, 40));

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(102, 153, 255));
        jButton1.setText("Marcar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 20, 100, 40));

        jPanel2.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 290, 710, 80));

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(102, 153, 255));
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("/");
        jPanel2.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 170, 60, 40));

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(102, 153, 255));
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setText(":");
        jPanel2.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 230, 60, 40));

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(102, 153, 255));
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setText("/");
        jPanel2.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 230, 60, 40));

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(102, 153, 255));
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel16.setText("/");
        jPanel2.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 230, 60, 40));

        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(102, 153, 255));
        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel17.setText("/");
        jPanel2.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 170, 60, 40));

        SelectMinuto.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        SelectMinuto.setForeground(new java.awt.Color(102, 153, 255));
        SelectMinuto.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "00", "01", "02", "03", "04", "05", "06", "07", "08", "09", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31", "32", "33", "34", "35", "36", "37", "38", "39", "40", "41", "42", "43", "44", "45", "46", "47", "48", "49", "50", "51", "52", "53", "54", "55", "56", "57", "58", "59" }));
        jPanel2.add(SelectMinuto, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 240, 50, 30));

        SelectCDia.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        SelectCDia.setForeground(new java.awt.Color(102, 153, 255));
        SelectCDia.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));
        jPanel2.add(SelectCDia, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 240, 50, 30));

        SelectCMes.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        SelectCMes.setForeground(new java.awt.Color(102, 153, 255));
        SelectCMes.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "01", "02", "03", "04", "05", "06", "07", "08", "09", "11", "12" }));
        SelectCMes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SelectCMesActionPerformed(evt);
            }
        });
        jPanel2.add(SelectCMes, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 240, 50, 30));

        SelectCAno.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        SelectCAno.setForeground(new java.awt.Color(102, 153, 255));
        SelectCAno.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "2018", "2019", "2020", "2021", "2022", "2021", "2022", "2023", "2024", "2025", "2026", "2027", "2028", "2029", "2030", "2031", "2032", "2033", "2034", "2035" }));
        jPanel2.add(SelectCAno, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 240, 70, 30));

        SelectHora.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        SelectHora.setForeground(new java.awt.Color(102, 153, 255));
        SelectHora.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "00", "01", "02", "03", "04", "05", "06", "07", "08", "09", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23" }));
        jPanel2.add(SelectHora, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 240, 50, 30));

        SelectNMes.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        SelectNMes.setForeground(new java.awt.Color(102, 153, 255));
        SelectNMes.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "01", "02", "03", "04", "05", "06", "07", "08", "09", "11", "12" }));
        SelectNMes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SelectNMesActionPerformed(evt);
            }
        });
        jPanel2.add(SelectNMes, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 180, 50, 30));

        SelectNAno.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        SelectNAno.setForeground(new java.awt.Color(102, 153, 255));
        SelectNAno.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "2018", "2017", "2016", "2015", "2014", "2013", "2012", "2011", "2010", "2009", "2008", "2007", "2006", "2005", "2004", "2003", "2002", "2001", "2000", "1999", "1998", "1997", "1996", "1995", "1994", "1993", "1992", "1991", "1990", "1989", "1988", "1987", "1986", "1985", "1984", "1983", "1982", "1981", "1980", "1979", "1978", "1977", "1976", "1975", "1974", "1973", "1972", "1971", "1970", "1969", "1968", "1967", "1966", "1965", "1964", "1963", "1962", "1961", "1960", "1959", "1958", "1957", "1956", "1955", "1954", "1953", "1952", "1951", "1950", "1949", "1948", "1947", "1946", "1945", "1944", "1943", "1942", "1941", "1940", "1939", "1938", "1937", "1936", "1935", "1934", "1933", "1932", "1931", "1930", "1929", "1928", "1927", "1926", "1925", "1924", "1923", "1922", "1921", "1920", "1919", "1918", "1917", "1916", "1915", "1914", "1913", "1912", "1911", "1910", "1909", "1908", "1907", "1906", "1905", "1904", "1903", "1902", "1901", "1900", "1899", "1898", "1897", "1896", "1895", "1894", "1893", "1892", "1891", "1890", "1889", "1888", "1887", "1886", "1885", "1884", "1883", "1882", "1881", "1880", "1879", "1878", "1877", "1876", "1875", "1874", "1873", "1872", "1871", "1870", "1869", "1868", "1867", "1866", "1865", "1864", "1863", "1862", "1861", "1860", "1859", "1858", "1857", "1856", "1855", "1854", "1853", "1852", "1851", "1850" }));
        jPanel2.add(SelectNAno, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 180, 70, 30));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(102, 153, 255));
        jLabel5.setText("Nome do Paciente:");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 130, -1, -1));

        SelectNDia1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        SelectNDia1.setForeground(new java.awt.Color(102, 153, 255));
        SelectNDia1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));
        jPanel2.add(SelectNDia1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 180, 50, 30));
        jPanel2.add(CampoNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 130, 210, 30));

        Tabela.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, ""},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "ID", "Nome", "CPF", "RG", "Telefone"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        Tabela.setDropMode(javax.swing.DropMode.INSERT_ROWS);
        ScrollTab.setViewportView(Tabela);

        jPanel2.add(ScrollTab, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 10, 590, 100));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 710, 370));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CampoRGActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CampoRGActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CampoRGActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try {
            int campos = 0;
            if(Tabela.getSelectedRow() >= 0 && Tabela.getSelectedRow() < 100){
                campos = 0;
            }else{
                campos = 1;
                JOptionPane.showMessageDialog(null, "Selecione um Médico!");
            }
            if(CampoNome.getText() == null){
                JOptionPane.showMessageDialog(null, "Insira um Nome!");
                campos = 1;
            }
            if(CampoRG.getText() == null){
                JOptionPane.showMessageDialog(null, "Insira um RG!");
                campos = 1;
            }
            Conexao conexao = new Conexao();
            Connection con = conexao.abrir();
            
            String SexoPaciente = null;
            /*Secretárias*/
            
            
            /*Médicos*/
            
            if(CheckMasculino.isSelected()){
                SexoPaciente = "M";
            }else if(CheckFeminino.isSelected()){
                SexoPaciente = "F";
            }else{
                campos = 1;
                JOptionPane.showMessageDialog(null, "Selecione um Sexo!");
            }
            
            
            if(campos == 0){
                String data_nasc = (String) SelectCDia.getSelectedItem()+"/"+SelectNMes.getSelectedItem()+"/"+SelectNAno.getSelectedItem();
                String data_consulta = (String) SelectCDia.getSelectedItem()+"/"+SelectCMes.getSelectedItem()+"/"+SelectCAno.getSelectedItem();
                String hora_consulta = (String) SelectHora.getSelectedItem();
                String minuto_consulta = (String) SelectMinuto.getSelectedItem();
                String id_medico = (String) Tabela.getValueAt(Tabela.getSelectedRow(), 0);
                String nome_medico = (String) Tabela.getValueAt(Tabela.getSelectedRow(), 1);
                String sql = "INSERT INTO consultas(nome_paciente,id_medico,nome_medico,rg_paciente,data_nasc_paciente,sexo_paciente,data_consulta,hora_consulta,minuto_consulta) VALUES(?,?,?,?,?,?,?,?,?)";
                PreparedStatement stmt = con.prepareStatement(sql);
                stmt.setString(1, CampoNome.getText());
                stmt.setString(2, id_medico);
                stmt.setString(3, nome_medico);
                stmt.setString(4, CampoRG.getText());
                stmt.setString(5, data_nasc);
                stmt.setString(6, SexoPaciente);
                stmt.setString(7, data_consulta);
                stmt.setString(8, hora_consulta);
                stmt.setString(9, minuto_consulta);
                stmt.execute();
                stmt.close(); 
                JOptionPane.showMessageDialog(null, "Consulta Marcada!");
            }
            
            
            
            
        } catch (SQLException ex) {
            Logger.getLogger(teste.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Algo deu errado!");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(teste.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Algo deu errado!");
        } catch (Exception ex) {
            Logger.getLogger(Tela_cadastrar_consulta.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Algo deu errado!");
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void CheckFemininoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CheckFemininoActionPerformed
        CheckMasculino.setSelected(false);
    }//GEN-LAST:event_CheckFemininoActionPerformed

    private void CheckMasculinoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CheckMasculinoActionPerformed
        CheckFeminino.setSelected(false);
    }//GEN-LAST:event_CheckMasculinoActionPerformed

    private void SelectCMesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SelectCMesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SelectCMesActionPerformed

    private void SelectNMesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SelectNMesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SelectNMesActionPerformed

    private void btnPesquisaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisaActionPerformed
        String pesquisa = null;
        String id = null;
        pesquisa = CampoPesquisa.getText();
            try {
                PesquisaMedicos(pesquisa);
            } catch (Exception ex) {
                Logger.getLogger(Tela_Administrador.class.getName()).log(Level.SEVERE, null, ex);
            }
    }//GEN-LAST:event_btnPesquisaActionPerformed

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
            java.util.logging.Logger.getLogger(Tela_cadastrar_consulta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Tela_cadastrar_consulta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Tela_cadastrar_consulta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tela_cadastrar_consulta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new Tela_cadastrar_consulta().setVisible(true);
                } catch (Exception ex) {
                    Logger.getLogger(Tela_cadastrar_consulta.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField CampoNome;
    private javax.swing.JTextField CampoPesquisa;
    private javax.swing.JTextField CampoRG;
    private javax.swing.JCheckBox CheckFeminino;
    private javax.swing.JCheckBox CheckMasculino;
    private javax.swing.JScrollPane ScrollTab;
    private javax.swing.JComboBox<String> SelectCAno;
    private javax.swing.JComboBox<String> SelectCDia;
    private javax.swing.JComboBox<String> SelectCMes;
    private javax.swing.JComboBox<String> SelectHora;
    private javax.swing.JComboBox<String> SelectMinuto;
    private javax.swing.JComboBox<String> SelectNAno;
    private javax.swing.JComboBox<String> SelectNDia1;
    private javax.swing.JComboBox<String> SelectNMes;
    private javax.swing.JTable Tabela;
    private javax.swing.JButton btnPesquisa;
    private javax.swing.JComboBox<String> criterioPesquisa1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JComboBox<String> jComboBox5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
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
