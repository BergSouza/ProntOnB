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
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import plus_life.Plus_Life;

/**
 *
 * @author Bergson
 */
public class Tela_Médico extends javax.swing.JFrame {

    /**
     * Creates new form Tela_Administrador
     */
    public Tela_Médico() throws IOException {
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
        mudafonte(fonte, tamanho);
    }
        
    public void mudacorprincipal(String cor){
        jPanel2.setBackground(Color.decode(cor));
        Selecao.setBackground(Color.decode(cor));
        btnAtualizar.setBackground(Color.decode(cor));
        criterioPesquisa3.setBackground(Color.decode(cor));
        txtA.setForeground(Color.decode(cor));
        btnPesquisa.setBackground(Color.decode(cor));
        btnExcluir.setBackground(Color.decode(cor));
        btnVisualizar.setBackground(Color.decode(cor));
        btnSair.setForeground(Color.decode(cor));
        Selecao.setBackground(Color.decode(cor));
    }
    
    public void mudacorsecundaria(String cor){
        jPanel1.setBackground(Color.decode(cor));
        Selecao.setForeground(Color.decode(cor));
        btnAtualizar.setForeground(Color.decode(cor));
        jLabel2.setForeground(Color.decode(cor));
        criterioPesquisa3.setForeground(Color.decode(cor));
        txtA.setBackground(Color.decode(cor));
        btnExcluir.setForeground(Color.decode(cor));
        btnVisualizar.setForeground(Color.decode(cor));
        btnSair.setBackground(Color.decode(cor));
        
        Selecao.setForeground(Color.decode(cor));
    }
    public void mudafonte(String fonte, String tamanhoo){
        int tamanho = Integer.parseInt(tamanhoo);
        jLabel2.setFont(new Font(fonte, Font.BOLD, 14+tamanho));
        Selecao.setFont(new Font(fonte, Font.BOLD, 1+tamanho));
        btnAtualizar.setFont(new Font(fonte, Font.BOLD, 1+tamanho));
        txtA.setFont(new Font(fonte, Font.BOLD, 2+tamanho));
        btnExcluir.setFont(new Font(fonte, Font.BOLD, 1+tamanho));
        btnVisualizar.setFont(new Font(fonte, Font.BOLD, 1+tamanho));
        btnSair.setFont(new Font(fonte, Font.BOLD, 4+tamanho));
        Tabela.setFont(new Font(fonte, Font.BOLD, 1+tamanho));
        Selecao.setFont(new Font(fonte, Font.BOLD, 1+tamanho));
    }
    
    public void pegadados(String id,String Nome){
        CampoID.setText(id);
        CampoNomeMedico.setText(Nome);
    }
    
    public void excluir(String id, String nome) throws Exception{ 
        try {
            Conexao conexao = new Conexao();
            Connection con = conexao.abrir();
            
            int resposta = 0;
            
            
            
            if(Selecao.getSelectedIndex() == 0){
                resposta = JOptionPane.showConfirmDialog(null, "Concluir Consulta Com o Paciente "+nome+" ?");
                UIManager.put("OptionPane.yesButtonText", "Sim");
                UIManager.put("OptionPane.noButtonText", "Não"); 
                if(resposta == 0){
                    String sql = "INSERT INTO consultas_r SELECT * FROM consultas WHERE id_consulta = "+id+" ";
                    PreparedStatement stmt = con.prepareStatement(sql);
                    stmt.execute();
                    stmt.close();

                    String sql2 = "DELETE FROM consultas WHERE id_consulta = "+id+" ";
                    PreparedStatement stmt2 = con.prepareStatement(sql2);
                    stmt2.execute();
                    stmt2.close();
                    JOptionPane.showMessageDialog(rootPane, "Consulta Concluída!");
                    MostraConsultas();
                    
                }
                
                    
            }
            
            
            if(Selecao.getSelectedIndex() == 1){
                resposta = JOptionPane.showConfirmDialog(null, "Deletar o Registro da Consulta Com o Paciente "+nome+" ?");
                UIManager.put("OptionPane.yesButtonText", "Sim");
                UIManager.put("OptionPane.noButtonText", "Não"); 
                if(resposta == 0){
                    String sql = "DELETE FROM consultas_r WHERE id_consulta = "+id+" ";
                    PreparedStatement stmt = con.prepareStatement(sql);
                    stmt.execute();
                    stmt.close();
                    JOptionPane.showMessageDialog(rootPane, "Consulta Deletada!");
                    MostraConsultas();
                }else{
                    
                }
                
            }
            
            
            
        } catch (SQLException ex) {
            Logger.getLogger(teste.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(teste.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        
    }
    
    public void visualizar(String id) throws Exception{ 
       
            Conexao conexao = new Conexao();
            Connection con = conexao.abrir();
            
            int resposta = 0;
                        
            if(Selecao.getSelectedIndex() == 0){
                java.sql.Statement st = con.createStatement();
                st.executeQuery("select * from consultas where id_consulta = "+id+"");
                ResultSet rs = st.getResultSet();
                
                Tela_visualizar_consulta consulta = new Tela_visualizar_consulta();
                consulta.setVisible(true);
                consulta.setLocationRelativeTo(null);
                while(rs.next()){
                    consulta.pegavalores(rs.getString("id_consulta"),rs.getString("nome_paciente"),rs.getString("nome_medico"),rs.getString("rg_paciente"), rs.getString("data_nasc_paciente"), rs.getString("sexo_paciente"), rs.getString("data_consulta"), rs.getString("hora_consulta"),rs.getString("minuto_consulta"));
                
            }
            }
            if(Selecao.getSelectedIndex() == 1){
                java.sql.Statement st = con.createStatement();
                st.executeQuery("select * from consultas_r where id_consulta = "+id+"");
                ResultSet rs = st.getResultSet();
                
                Tela_visualizar_consulta consulta = new Tela_visualizar_consulta();
                consulta.setVisible(true);
                consulta.setLocationRelativeTo(null);
                while(rs.next()){
                    consulta.pegavalores(rs.getString("id_consulta"),rs.getString("nome_paciente"),rs.getString("nome_medico"),rs.getString("rg_paciente"), rs.getString("data_nasc_paciente"), rs.getString("sexo_paciente"), rs.getString("data_consulta"), rs.getString("hora_consulta"),rs.getString("minuto_consulta"));
                
            }
            }
    }
    public void MostraConsultas() throws Exception{
        try {
            //Registra JDBC driver
            Conexao conexao = new Conexao();
            Connection con = conexao.abrir();
            
            
            if(Selecao.getSelectedIndex() == 0){
                int pesquisaa = 0;
                txtA.setText("Todas as Suas Consultas (Organizadas pela Data)");
                pesquisaa = 1;
                
                
                //Executa a query de seleção
                java.sql.Statement st = con.createStatement();
                if(pesquisaa == 0){
                    st.executeQuery("select * from consultas where id_medico = "+CampoID.getText());
                }
                if(pesquisaa == 1){
                    st.executeQuery("select * from consultas where id_medico = "+CampoID.getText()+" ORDER BY data_consulta DESC");
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
                    Tabela.setValueAt(rs.getString("id_consulta"), a, 0);
                    Tabela.setValueAt(rs.getString("nome_paciente"), a, 1);
                    Tabela.setValueAt(rs.getString("data_nasc_paciente"), a, 2);
                    Tabela.setValueAt(rs.getString("data_consulta"), a, 3);
                    Tabela.setValueAt((rs.getString("hora_consulta"))+":"+(rs.getString("minuto_consulta")), a, 4);
                    a++;
                }
            }if(Selecao.getSelectedIndex() == 1){
                int pesquisaa = 0;
                txtA.setText("Todas as Suas Consultas (Já Realizadas)");
                pesquisaa = 1;
                
                
                //Executa a query de seleção
                java.sql.Statement st = con.createStatement();
                if(pesquisaa == 0){
                    st.executeQuery("select * from consultas_r where id_medico = "+CampoID.getText());
                }
                if(pesquisaa == 1){
                    st.executeQuery("select * from consultas_r where id_medico = "+CampoID.getText()+" ORDER BY data_consulta DESC");
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
                    Tabela.setValueAt(rs.getString("id_consulta"), a, 0);
                    Tabela.setValueAt(rs.getString("nome_paciente"), a, 1);
                    Tabela.setValueAt(rs.getString("data_nasc_paciente"), a, 2);
                    Tabela.setValueAt(rs.getString("data_consulta"), a, 3);
                    Tabela.setValueAt((rs.getString("hora_consulta"))+":"+(rs.getString("minuto_consulta")), a, 4);
                    a++;
                }
            }
            
           
        } catch (SQLException | ClassNotFoundException e) {
            JOptionPane.showMessageDialog(rootPane, e);
        } catch (Exception ex) {
            Logger.getLogger(teste.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
     
    } 
    public void PesquisaConsultas(String pesquisa) throws Exception{
        try {
            //Registra JDBC driver
            Conexao conexao = new Conexao();
            Connection con = conexao.abrir();
            //Executa a query de seleção
            java.sql.Statement st = con.createStatement();
            int pesquisaa = 0;
            if(Selecao.getSelectedIndex() == 0){
                
                pesquisaa = 0;
                
                
            }if(Selecao.getSelectedIndex() == 1){
                
                pesquisaa = 1;
                
            }
            
            if(pesquisaa == 0){
                if(criterioPesquisa3.getSelectedIndex() == 0){
                    st.executeQuery("select * from consultas where id_consulta LIKE '%"+pesquisa+"%' AND id_medico = "+CampoID.getText());
                }
                if(criterioPesquisa3.getSelectedIndex() == 1){
                    st.executeQuery("select * from consultas where nome_paciente LIKE '%"+pesquisa+"%' AND id_medico = "+CampoID.getText());
                }
                if(criterioPesquisa3.getSelectedIndex() == 2){
                    st.executeQuery("select * from consultas where data_nasc_paciente LIKE '%"+pesquisa+"%' AND id_medico = "+CampoID.getText());
                }
                if(criterioPesquisa3.getSelectedIndex() == 3){
                    st.executeQuery("select * from consultas where data_consulta LIKE '%"+pesquisa+"%' AND id_medico = "+CampoID.getText());
                }
                if(criterioPesquisa3.getSelectedIndex() == 4){
                    st.executeQuery("select * from consultas where hora_consulta LIKE '%"+pesquisa+"%' AND id_medico = "+CampoID.getText());
                }
            
            }
            if(pesquisaa == 1){
                if(criterioPesquisa3.getSelectedIndex() == 0){
                    st.executeQuery("select * from consultas_r where id_consulta LIKE '%"+pesquisa+"%' AND id_medico = "+CampoID.getText()+" ORDER BY data_consulta DESC");
                }
                if(criterioPesquisa3.getSelectedIndex() == 1){
                    st.executeQuery("select * from consultas_r where nome_paciente LIKE '%"+pesquisa+"%' AND id_medico = "+CampoID.getText()+" ORDER BY data_consulta DESC");
                }
                if(criterioPesquisa3.getSelectedIndex() == 2){
                    st.executeQuery("select * from consultas_r where data_nasc_paciente LIKE '%"+pesquisa+"%' AND id_medico = "+CampoID.getText()+" ORDER BY data_consulta DESC");
                }
                if(criterioPesquisa3.getSelectedIndex() == 3){
                    st.executeQuery("select * from consultas_r where data_consulta LIKE '%"+pesquisa+"%' AND id_medico = "+CampoID.getText()+" ORDER BY data_consulta DESC");
                }
                if(criterioPesquisa3.getSelectedIndex() == 4){
                    st.executeQuery("select * from consultas_r where hora_consulta LIKE '%"+pesquisa+"%' AND id_medico = "+CampoID.getText()+" ORDER BY data_consulta DESC");
                }
            
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
                Tabela.setValueAt(rs.getString("id_consulta"), a, 0);
                Tabela.setValueAt(rs.getString("nome_paciente"), a, 1);
                Tabela.setValueAt(rs.getString("data_nasc_paciente"), a, 2);
                Tabela.setValueAt(rs.getString("data_consulta"), a, 3);
                Tabela.setValueAt(rs.getString("hora_consulta")+":"+rs.getString("minuto_consulta"), a, 4);
                a++;
            }
           
        } catch (SQLException | ClassNotFoundException e) {
            JOptionPane.showMessageDialog(rootPane, e);
        } catch (Exception ex) {
            Logger.getLogger(teste.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        CampoID = new javax.swing.JTextField();
        CampoNomeMedico = new javax.swing.JTextField();
        btnAtualizar = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Tabela = new javax.swing.JTable();
        btnExcluir = new javax.swing.JButton();
        btnVisualizar = new javax.swing.JButton();
        txtA = new javax.swing.JLabel();
        btnPesquisa = new javax.swing.JButton();
        CampoPesquisa = new javax.swing.JTextField();
        criterioPesquisa3 = new javax.swing.JComboBox<>();
        Selecao = new javax.swing.JComboBox<>();
        jPanel2 = new javax.swing.JPanel();
        btnSair = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        CampoID.setText("jTextField1");

        CampoNomeMedico.setText("jTextField1");

        btnAtualizar.setBackground(new java.awt.Color(102, 153, 255));
        btnAtualizar.setForeground(new java.awt.Color(255, 255, 255));
        btnAtualizar.setText("Atualizar");
        btnAtualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtualizarActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Secretário(a)");
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "ID Consulta", "Nome do Paciente", "Data de Nascimento", "Data", "Horário"
            }
        ));
        jScrollPane1.setViewportView(Tabela);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 580, 220));

        btnExcluir.setBackground(new java.awt.Color(102, 153, 255));
        btnExcluir.setForeground(new java.awt.Color(255, 255, 255));
        btnExcluir.setText("Concluir");
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });
        jPanel1.add(btnExcluir, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 10, 90, 30));

        btnVisualizar.setBackground(new java.awt.Color(102, 153, 255));
        btnVisualizar.setForeground(new java.awt.Color(255, 255, 255));
        btnVisualizar.setText("Visualizar");
        btnVisualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVisualizarActionPerformed(evt);
            }
        });
        jPanel1.add(btnVisualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 10, 90, 30));

        txtA.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txtA.setForeground(new java.awt.Color(102, 153, 255));
        txtA.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtA.setText("Todas as Suas Consultas Marcadas");
        jPanel1.add(txtA, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 580, 30));

        btnPesquisa.setBackground(new java.awt.Color(102, 153, 255));
        btnPesquisa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/lupabranca.png"))); // NOI18N
        btnPesquisa.setName(""); // NOI18N
        btnPesquisa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesquisaActionPerformed(evt);
            }
        });
        jPanel1.add(btnPesquisa, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 10, 30, 30));
        jPanel1.add(CampoPesquisa, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 10, 190, 30));

        criterioPesquisa3.setBackground(new java.awt.Color(102, 153, 255));
        criterioPesquisa3.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        criterioPesquisa3.setForeground(new java.awt.Color(255, 255, 255));
        criterioPesquisa3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ID", "Nome do Paciente", "Data de Nascimento", "Data da Consulta", "Horário da Consulta" }));
        criterioPesquisa3.setBorder(null);
        jPanel1.add(criterioPesquisa3, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 10, 60, 30));

        Selecao.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Consultas Marcadas", "Consultas Realizadas" }));
        Selecao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SelecaoActionPerformed(evt);
            }
        });
        jPanel1.add(Selecao, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 90, 30));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 600, 330));

        jPanel2.setBackground(new java.awt.Color(102, 153, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnSair.setBackground(new java.awt.Color(255, 255, 255));
        btnSair.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnSair.setForeground(new java.awt.Color(102, 153, 255));
        btnSair.setText("Sair");
        btnSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSairActionPerformed(evt);
            }
        });
        jPanel2.add(btnSair, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 10, 90, 50));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/PlusLife_Login_transparente.png"))); // NOI18N
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, 50));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Médico");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 20, 380, 45));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 600, 70));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSairActionPerformed
        dispose();
        Plus_Life pl = new Plus_Life();
        pl.conferetelalogin();
    }//GEN-LAST:event_btnSairActionPerformed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        int selecionado = 0;
        String id = null;
        String nome = null;
        
        selecionado = Tabela.getSelectedRow();
        id = (String) Tabela.getValueAt(selecionado, 0);
        nome = (String) Tabela.getValueAt(selecionado, 1);
        
        try {
            excluir(id,nome);
        } catch (Exception ex) {
            Logger.getLogger(Tela_Médico.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnExcluirActionPerformed

    private void btnAtualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtualizarActionPerformed
        try {
            MostraConsultas();
        } catch (Exception ex) {
            Logger.getLogger(Tela_Médico.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnAtualizarActionPerformed

    private void btnVisualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVisualizarActionPerformed
        int selecionado = 0;
        String id = null;
        selecionado = Tabela.getSelectedRow();
        id = (String) Tabela.getValueAt(selecionado, 0);
        
        try {
            visualizar(id);
        } catch (Exception ex) {
            Logger.getLogger(Tela_Médico.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_btnVisualizarActionPerformed

    private void btnPesquisaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisaActionPerformed
        String pesquisa = null;
        String id = null;
        
        pesquisa = CampoPesquisa.getText();
            
        try {
            PesquisaConsultas(pesquisa);
        } catch (Exception ex) {
            Logger.getLogger(Tela_Médico.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnPesquisaActionPerformed

    private void SelecaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SelecaoActionPerformed
        try {
            MostraConsultas();
        } catch (Exception ex) {
            Logger.getLogger(Tela_Médico.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_SelecaoActionPerformed

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
            java.util.logging.Logger.getLogger(Tela_Médico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Tela_Médico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Tela_Médico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tela_Médico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new Tela_Médico().setVisible(true);
                } catch (IOException ex) {
                    Logger.getLogger(Tela_Médico.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField CampoID;
    private javax.swing.JTextField CampoNomeMedico;
    private javax.swing.JTextField CampoPesquisa;
    private javax.swing.JComboBox<String> Selecao;
    private javax.swing.JTable Tabela;
    private javax.swing.JButton btnAtualizar;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnPesquisa;
    private javax.swing.JButton btnSair;
    private javax.swing.JButton btnVisualizar;
    private javax.swing.JComboBox<String> criterioPesquisa3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel txtA;
    // End of variables declaration//GEN-END:variables
}
