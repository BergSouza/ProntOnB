/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Telas;

import Banco_de_dados.Conexao;
import com.itextpdf.text.pdf.PdfWriter;
import java.awt.Color;
import java.awt.Font;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.event.DocumentListener;
import javax.swing.event.UndoableEditListener;
import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.Document;
import javax.swing.text.Element;
import javax.swing.text.Position;
import javax.swing.text.Segment;
import plus_life.Plus_Life;
import static plus_life.Plus_Life.conferetelalogin;


/**
 *
 * @author Bergson
 */
public class Tela_Secretária extends javax.swing.JFrame {

    /**
     * Creates new form Tela_Administrador
     */
    public Tela_Secretária() throws IOException {
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
        jPanel2.setBackground(Color.decode(cor));
        Selecao.setBackground(Color.decode(cor));
        btnAtualizar.setBackground(Color.decode(cor));
        criterioPesquisa1.setBackground(Color.decode(cor));
        criterioPesquisa2.setBackground(Color.decode(cor));
        criterioPesquisa3.setBackground(Color.decode(cor));
        txtA.setForeground(Color.decode(cor));
        btnPesquisa.setBackground(Color.decode(cor));
        btnEditar.setBackground(Color.decode(cor));
        btnExcluir.setBackground(Color.decode(cor));
        btnCadastrar.setBackground(Color.decode(cor));
        btnVisualizar.setBackground(Color.decode(cor));
        btnSair.setForeground(Color.decode(cor));
    }
    
    public void mudacorsecundaria(String cor){
        jPanel1.setBackground(Color.decode(cor));
        Selecao.setForeground(Color.decode(cor));
        btnAtualizar.setForeground(Color.decode(cor));
        jLabel2.setForeground(Color.decode(cor));
        criterioPesquisa1.setForeground(Color.decode(cor));
        criterioPesquisa2.setForeground(Color.decode(cor));
        criterioPesquisa3.setForeground(Color.decode(cor));
        txtA.setBackground(Color.decode(cor));
        btnEditar.setForeground(Color.decode(cor));
        btnExcluir.setForeground(Color.decode(cor));
        btnCadastrar.setForeground(Color.decode(cor));
        btnVisualizar.setForeground(Color.decode(cor));
        btnSair.setBackground(Color.decode(cor));
    }
    
    public void mudafonte(String fonte, String tamanhoo){
        int tamanho = Integer.parseInt(tamanhoo);
        jLabel2.setFont(new Font(fonte, Font.BOLD, 14+tamanho));
        Selecao.setFont(new Font(fonte, Font.BOLD, 1+tamanho));
        btnAtualizar.setFont(new Font(fonte, Font.BOLD, 1+tamanho));
        criterioPesquisa1.setFont(new Font(fonte, Font.BOLD, 0+tamanho));
        criterioPesquisa2.setFont(new Font(fonte, Font.BOLD, 0+tamanho));
        txtA.setFont(new Font(fonte, Font.BOLD, 2+tamanho));
        btnEditar.setFont(new Font(fonte, Font.BOLD, 1+tamanho));
        btnExcluir.setFont(new Font(fonte, Font.BOLD, 1+tamanho));
        btnCadastrar.setFont(new Font(fonte, Font.BOLD, 1+tamanho));
        btnVisualizar.setFont(new Font(fonte, Font.BOLD, 1+tamanho));
        btnSair.setFont(new Font(fonte, Font.BOLD, 4+tamanho));
        Tabela.setFont(new Font(fonte, Font.BOLD, 1+tamanho));
        Tabela2.setFont(new Font(fonte, Font.BOLD, 1+tamanho));
        Tabela3.setFont(new Font(fonte, Font.BOLD, 1+tamanho));
        
        CampoPesquisa.setFont(new Font(fonte, Font.BOLD, 1+tamanho));
    }
    public void setaicones(String icones){
        if(icones.equals("Sem icones")){
            
        }
        if(icones.equals("Icones 1")){
            ImageIcon atualizar = new ImageIcon(getClass().getResource("/img/icons/atualizar.png"));           
            btnAtualizar.setIcon(atualizar);
            ImageIcon editar = new ImageIcon(getClass().getResource("/img/icons/editar.png"));           
            btnEditar.setIcon(editar);
            ImageIcon visualizar = new ImageIcon(getClass().getResource("/img/icons/visualizar.png"));           
            btnVisualizar.setIcon(visualizar);
            ImageIcon lixeira = new ImageIcon(getClass().getResource("/img/icons/lixeira.png"));           
            btnExcluir.setIcon(lixeira);
            if(Selecao.getSelectedIndex() == 0 || Selecao.getSelectedIndex() == 1 || Selecao.getSelectedIndex() == 2){
                ImageIcon adicionar = new ImageIcon(getClass().getResource("/img/icons/adicionar.png"));           
                btnCadastrar.setIcon(adicionar);
            }if(Selecao.getSelectedIndex() == 3){
                ImageIcon adicionar = new ImageIcon(getClass().getResource("/img/icons/relatorio.png"));           
                btnCadastrar.setIcon(adicionar);
            }
            ImageIcon sair = new ImageIcon(getClass().getResource("/img/icons/plcancelar.png"));           
            btnSair.setIcon(sair);
        }
        if(icones.equals("Icones 2")){
            ImageIcon atualizar = new ImageIcon(getClass().getResource("/img/icons/atualizar.png"));           
            btnAtualizar.setIcon(atualizar);
            ImageIcon editar = new ImageIcon(getClass().getResource("/img/icons/editar.png"));           
            btnEditar.setIcon(editar);
            ImageIcon visualizar = new ImageIcon(getClass().getResource("/img/icons/visualizar.png"));           
            btnVisualizar.setIcon(visualizar);
            ImageIcon lixeira = new ImageIcon(getClass().getResource("/img/icons/lixeira.png"));           
            btnExcluir.setIcon(lixeira);if(Selecao.getSelectedIndex() == 0){
            if(Selecao.getSelectedIndex() == 0 || Selecao.getSelectedIndex() == 1 || Selecao.getSelectedIndex() == 2){
                ImageIcon adicionar = new ImageIcon(getClass().getResource("/img/icons/adicionar.png"));           
                btnCadastrar.setIcon(adicionar);
            }if(Selecao.getSelectedIndex() == 3){
                ImageIcon adicionar = new ImageIcon(getClass().getResource("/img/icons/relatorio.png"));           
                btnCadastrar.setIcon(adicionar);
            }
            }
            ImageIcon sair = new ImageIcon(getClass().getResource("/img/icons/cancelar2.png"));           
            btnSair.setIcon(sair);
        }
        if(icones.equals("Icones 3")){
            ImageIcon atualizar = new ImageIcon(getClass().getResource("/img/icons/atualizar2.png"));           
            btnAtualizar.setIcon(atualizar);
            ImageIcon editar = new ImageIcon(getClass().getResource("/img/icons/editar2.png"));           
            btnEditar.setIcon(editar);
            ImageIcon visualizar = new ImageIcon(getClass().getResource("/img/icons/visualizar2.png"));           
            btnVisualizar.setIcon(visualizar);
            ImageIcon lixeira = new ImageIcon(getClass().getResource("/img/icons/lixeira2.png"));           
            btnExcluir.setIcon(lixeira);
            if(Selecao.getSelectedIndex() == 0 || Selecao.getSelectedIndex() == 1 || Selecao.getSelectedIndex() == 2){
                ImageIcon adicionar = new ImageIcon(getClass().getResource("/img/icons/adicionar2.png"));           
                btnCadastrar.setIcon(adicionar);
            }if(Selecao.getSelectedIndex() == 3){
                ImageIcon adicionar = new ImageIcon(getClass().getResource("/img/icons/relatorio2.png"));           
                btnCadastrar.setIcon(adicionar);
            }
            
            ImageIcon sair = new ImageIcon(getClass().getResource("/img/icons/cancelar.png"));           
            btnSair.setIcon(sair);
        }
    }
    
    
    public void atualizar(){
        if(Selecao.getSelectedIndex() == 0){
            try {
                txtA.setText("Médicos(a)");
                Tabela3.setVisible(false);
                jScrollPane1.setVisible(false);
                Tabela2.setVisible(false);
                ScrollTab2.setVisible(false);
                Tabela.setVisible(true);
                MostraMedicos();
                ScrollTab.setVisible(true);
                
                criterioPesquisa1.setVisible(true);
                criterioPesquisa2.setVisible(false);
                criterioPesquisa3.setVisible(false);
                
                
                btnCadastrar.setText("Cadastrar");
            } catch (Exception ex) {
                Logger.getLogger(Tela_Administrador.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        if(Selecao.getSelectedIndex() == 1){
            try {
                txtA.setText("Convênios");
                Tabela2.setVisible(true);
                ScrollTab2.setVisible(true);
                Tabela.setVisible(false);
                ScrollTab.setVisible(false);
                Tabela3.setVisible(false);
                jScrollPane1.setVisible(false);
                MostraConvenios();
                
                criterioPesquisa1.setVisible(false);
                criterioPesquisa2.setVisible(true);
                criterioPesquisa3.setVisible(false);
                
                ;
            } catch (Exception ex) {
                Logger.getLogger(Tela_Administrador.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        if(Selecao.getSelectedIndex() == 2){
            try {
                txtA.setText("Consultas Marcadas");
                Tabela2.setVisible(false);
                ScrollTab2.setVisible(false);
                Tabela.setVisible(false);
                ScrollTab.setVisible(false);
                Tabela3.setVisible(true);
                jScrollPane1.setVisible(true);
                
                criterioPesquisa1.setVisible(false);
                criterioPesquisa2.setVisible(false);
                criterioPesquisa3.setVisible(true);
                
                btnCadastrar.setText("Marcar");
                MostraConsultas();
            } catch (Exception ex) {
                Logger.getLogger(Tela_Administrador.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        if(Selecao.getSelectedIndex() == 3){
            try {
                txtA.setText("Consultas Realizadas");
                Tabela2.setVisible(false);
                ScrollTab2.setVisible(false);
                Tabela.setVisible(false);
                ScrollTab.setVisible(false);
                Tabela3.setVisible(true);
                jScrollPane1.setVisible(true);
                
                criterioPesquisa1.setVisible(false);
                criterioPesquisa2.setVisible(false);
                criterioPesquisa3.setVisible(true);
                
                btnCadastrar.setText("Relatório");
                MostraConsultasConcluidas();
            } catch (Exception ex) {
                Logger.getLogger(Tela_Administrador.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
    public void excluir(String id, String nome) throws Exception{ 
        try {
            Conexao conexao = new Conexao();
            Connection con = conexao.abrir();
            
            int resposta = 0;
            
            
            
            if(Selecao.getSelectedIndex() == 0){
                resposta = JOptionPane.showConfirmDialog(null, "Deseja realmente excluir o Médico(a) "+nome+" ?");
                UIManager.put("OptionPane.yesButtonText", "Sim");
                UIManager.put("OptionPane.noButtonText", "Não"); 
                if(resposta == 0){
                    String sql = "DELETE FROM medicos WHERE id_medico = "+id+" ";
                    PreparedStatement stmt = con.prepareStatement(sql);
                    stmt.execute();
                    stmt.close();
                    JOptionPane.showMessageDialog(rootPane, "Médico(a) excluído!");
                    atualizar();
                }else{
                    
                }
                
            }
            
            
            if(Selecao.getSelectedIndex() == 1){
                resposta = JOptionPane.showConfirmDialog(null, "Deseja realmente excluir o Convênio "+nome+" ?");
                UIManager.put("OptionPane.yesButtonText", "Sim");
                UIManager.put("OptionPane.noButtonText", "Não"); 
                if(resposta == 0){
                    String sql = "DELETE FROM convenios WHERE id_convenio = "+id+" ";
                    PreparedStatement stmt = con.prepareStatement(sql);
                    stmt.execute();
                    stmt.close();
                    JOptionPane.showMessageDialog(rootPane, "Convênio excluído!");
                    atualizar();
                }else{
                    
                }
                
            }
            
            if(Selecao.getSelectedIndex() == 2){
                resposta = JOptionPane.showConfirmDialog(null, "Deseja realmente cancelar a Consulta do Paciente "+nome+" ?");
                UIManager.put("OptionPane.yesButtonText", "Sim");
                UIManager.put("OptionPane.noButtonText", "Não"); 
                if(resposta == 0){
                    String sql = "DELETE FROM consultas WHERE id_consulta = "+id+" ";
                    PreparedStatement stmt = con.prepareStatement(sql);
                    stmt.execute();
                    stmt.close();
                    JOptionPane.showMessageDialog(rootPane, "Consulta cancelada!");
                    atualizar();
                }else{
                    
                }
                
            }
            
            if(Selecao.getSelectedIndex() == 3){
                resposta = JOptionPane.showConfirmDialog(null, "Deseja realmente deletar o registro da Consulta do Paciente "+nome+" ?");
                UIManager.put("OptionPane.yesButtonText", "Sim");
                UIManager.put("OptionPane.noButtonText", "Não"); 
                if(resposta == 0){
                    String sql = "DELETE FROM consultas_r WHERE id_consulta = "+id+" ";
                    PreparedStatement stmt = con.prepareStatement(sql);
                    stmt.execute();
                    stmt.close();
                    JOptionPane.showMessageDialog(rootPane, "Consulta deletada!");
                    atualizar();
                }else{
                    
                }
                
            }
            
            
        } catch (SQLException ex) {
            Logger.getLogger(teste.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(teste.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        
    }
    
    public void editar(String id) throws Exception{ 
        try {
            Conexao conexao = new Conexao();
            Connection con = conexao.abrir();
            
            int resposta = 0;
            
            
            if(Selecao.getSelectedIndex() == 0){
                java.sql.Statement st = con.createStatement();
                st.executeQuery("select * from medicos where id_medico = "+id+"");
                ResultSet rs = st.getResultSet();
                
                Tela_editar_medico medico = new Tela_editar_medico();
                medico.setVisible(true);
                medico.setLocationRelativeTo(null);
                while(rs.next()){
                    medico.pegavalores(rs.getString("identity"), rs.getString("id_medico"), rs.getString("nome_medico"), rs.getString("cpf_medico"), rs.getString("rg_medico"), rs.getString("crm_medico"), rs.getString("telefone_medico"), rs.getString("endereco_medico"), rs.getString("sexo_medico"),rs.getString("senha_medico"));
                }
                
                
                
            }
            
            if(Selecao.getSelectedIndex() == 1){
                java.sql.Statement st = con.createStatement();
                st.executeQuery("select * from convenios where id_convenio = "+id+"");
                ResultSet rs = st.getResultSet();
                
                Tela_editar_convenios convenio = new Tela_editar_convenios();
                convenio.setVisible(true);
                convenio.setLocationRelativeTo(null);
                while(rs.next()){
                    convenio.pegavalores(rs.getString("id_convenio"), rs.getString("nome_convenio"), rs.getString("endereco_convenio"), rs.getString("telefone_convenio"), rs.getString("cnpj_convenio"), rs.getString("plano_convenio"));
                }
                
                
                
            }
            
            if(Selecao.getSelectedIndex() == 2){
                java.sql.Statement st = con.createStatement();
                st.executeQuery("select * from consultas where id_consulta = "+id+"");
                ResultSet rs = st.getResultSet();
                
                Tela_editar_consulta consulta = new Tela_editar_consulta();
                consulta.setVisible(true);
                consulta.setLocationRelativeTo(null);
                while(rs.next()){
                    consulta.pegavalores("consultas",rs.getString("id_consulta"),rs.getString("nome_paciente"),rs.getString("id_medico"),rs.getString("rg_paciente"), rs.getString("data_nasc_paciente"), rs.getString("sexo_paciente"), rs.getString("data_consulta"), rs.getString("hora_consulta"), rs.getString("minuto_consulta"));
                }
                
                
                
            }
            if(Selecao.getSelectedIndex() == 3){
                java.sql.Statement st = con.createStatement();
                st.executeQuery("select * from consultas_r where id_consulta = "+id+"");
                ResultSet rs = st.getResultSet();
                
                Tela_editar_consulta consulta = new Tela_editar_consulta();
                consulta.setVisible(true);
                consulta.setLocationRelativeTo(null);
                while(rs.next()){
                    consulta.pegavalores("consultas_r",rs.getString("id_consulta"),rs.getString("nome_paciente"),rs.getString("id_medico"),rs.getString("rg_paciente"), rs.getString("data_nasc_paciente"), rs.getString("sexo_paciente"), rs.getString("data_consulta"), rs.getString("hora_consulta"), rs.getString("minuto_consulta"));
                }
                
                
                
            }
            
            
        } catch (SQLException ex) {
            Logger.getLogger(teste.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(teste.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        
    }
    
    
    public void visualizar(String id) throws Exception{ 
        try {
            Conexao conexao = new Conexao();
            Connection con = conexao.abrir();
            
            int resposta = 0;
            
            
            if(Selecao.getSelectedIndex() == 0){
                java.sql.Statement st = con.createStatement();
                st.executeQuery("select * from medicos where id_medico = "+id+"");
                ResultSet rs = st.getResultSet();
                
                Tela_visualizar_medico medico = new Tela_visualizar_medico();
                medico.setVisible(true);
                medico.setLocationRelativeTo(null);
                while(rs.next()){
                    medico.pegavalores(rs.getString("identity"), rs.getString("id_medico"), rs.getString("nome_medico"), rs.getString("cpf_medico"), rs.getString("rg_medico"), rs.getString("crm_medico"), rs.getString("telefone_medico"), rs.getString("endereco_medico"), rs.getString("sexo_medico"),rs.getString("senha_medico"));
                }
                
                
                
            }
            
            if(Selecao.getSelectedIndex() == 1){
                java.sql.Statement st = con.createStatement();
                st.executeQuery("select * from convenios where id_convenio = "+id+"");
                ResultSet rs = st.getResultSet();
                
                Tela_visualizar_convenios convenio = new Tela_visualizar_convenios();
                convenio.setVisible(true);
                convenio.setLocationRelativeTo(null);
                while(rs.next()){
                    convenio.pegavalores(rs.getString("id_convenio"), rs.getString("nome_convenio"), rs.getString("endereco_convenio"), rs.getString("telefone_convenio"), rs.getString("cnpj_convenio"), rs.getString("plano_convenio"));
                }
                
                
                
            }
            
            if(Selecao.getSelectedIndex() == 2){
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
            if(Selecao.getSelectedIndex() == 3){
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
            
            
        } catch (SQLException ex) {
            Logger.getLogger(teste.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(teste.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        
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
    
    
    public void MostraConvenios() throws Exception{
        try {
            //Registra JDBC driver
            Conexao conexao = new Conexao();
            Connection con = conexao.abrir();
            //Executa a query de seleção
            java.sql.Statement st = con.createStatement();
            st.executeQuery("select * from convenios");
            ResultSet rs = st.getResultSet();
                        
            int a = 0;
            //Lista os alunos no console
            int numtabelas = Tabela2.getRowCount();
            for (int b = 0 ; b < numtabelas ; b++ ) {
                Tabela2.setValueAt(" ", b, 0);
                Tabela2.setValueAt(" ", b, 1);
                Tabela2.setValueAt(" ", b, 2);
                Tabela2.setValueAt(" ", b, 3);
            }
            int linhas = 0;
            while (rs.next()) {
                linhas++;
                Tabela2.setValueAt(rs.getString("id_convenio"), a, 0);
                Tabela2.setValueAt(rs.getString("nome_convenio"), a, 1);
                Tabela2.setValueAt(rs.getString("telefone_convenio"), a, 2);
                Tabela2.setValueAt(rs.getString("cnpj_convenio"), a, 3);
                a++;
            }
           
        } catch (SQLException | ClassNotFoundException e) {
            JOptionPane.showMessageDialog(rootPane, e);
        } catch (Exception ex) {
            Logger.getLogger(teste.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    public void PesquisaConvenios(String pesquisa) throws Exception{
        try {
            //Registra JDBC driver
            Conexao conexao = new Conexao();
            Connection con = conexao.abrir();
            //Executa a query de seleção
            java.sql.Statement st = con.createStatement();
            if(criterioPesquisa2.getSelectedIndex() == 0){
                st.executeQuery("select * from convenios where id LIKE '%"+pesquisa+"%'");
            }
            if(criterioPesquisa2.getSelectedIndex() == 1){
                st.executeQuery("select * from convenios where nome_convenio LIKE '%"+pesquisa+"%'");
            }
            
            if(criterioPesquisa2.getSelectedIndex() == 2){
                st.executeQuery("select * from convenios where telefone_convenio LIKE '%"+pesquisa+"%'");
            }
            
            if(criterioPesquisa2.getSelectedIndex() == 4){
                st.executeQuery("select * from convenios where cnpj_convenio LIKE '%"+pesquisa+"%'");
            }
            
            
            
            ResultSet rs = st.getResultSet();
                        
            int a = 0;
            //Lista os alunos no console
            int numtabelas = Tabela2.getRowCount();
            for (int b = 0 ; b < numtabelas ; b++ ) {
                Tabela2.setValueAt(" ", b, 0);
                Tabela2.setValueAt(" ", b, 1);
                Tabela2.setValueAt(" ", b, 2);
                Tabela2.setValueAt(" ", b, 3);
            }
            int linhas = 0;
            while (rs.next()) {
                linhas++;
                Tabela2.setValueAt(rs.getString("id_convenio"), a, 0);
                Tabela2.setValueAt(rs.getString("nome_convenio"), a, 1);
                Tabela2.setValueAt(rs.getString("telefone_convenio"), a, 2);
                Tabela2.setValueAt(rs.getString("cnpj_convenio"), a, 3);
                a++;
            }
           
        } catch (SQLException | ClassNotFoundException e) {
            JOptionPane.showMessageDialog(rootPane, e);
        } catch (Exception ex) {
            Logger.getLogger(teste.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    
    public void MostraConsultas() throws Exception{
        try {
            //Registra JDBC driver
            Conexao conexao = new Conexao();
            Connection con = conexao.abrir();
            //Executa a query de seleção
            java.sql.Statement st = con.createStatement();
            st.executeQuery("select * from consultas");
            ResultSet rs = st.getResultSet();
                        
            int a = 0;
            //Lista os alunos no console
            int numtabelas = Tabela3.getRowCount();
            for (int b = 0 ; b < numtabelas ; b++ ) {
                Tabela3.setValueAt(" ", b, 0);
                Tabela3.setValueAt(" ", b, 1);
                Tabela3.setValueAt(" ", b, 2);
                Tabela3.setValueAt(" ", b, 3);
                Tabela3.setValueAt(" ", b, 4);
                Tabela3.setValueAt(" ", b, 5);
            }
            int linhas = 0;
            while (rs.next()) {
                linhas++;
                Tabela3.setValueAt(rs.getString("id_consulta"), a, 0);
                Tabela3.setValueAt(rs.getString("nome_paciente"), a, 1);
                /*if(rs.getString("sexo_paciente").equals("M")){
                    Tabela3.setValueAt("Masculino", a, 2);
                }else{
                    if(rs.getString("sexo_paciente").equals("F")){
                    Tabela3.setValueAt("Feminino", a, 2);
                }
                }*/
                Tabela3.setValueAt(rs.getString("nome_medico"), a, 2);
                Tabela3.setValueAt(rs.getString("data_nasc_paciente"), a, 3);
                Tabela3.setValueAt(rs.getString("data_consulta"), a, 4);
                Tabela3.setValueAt((rs.getString("hora_consulta"))+":"+((rs.getString("minuto_consulta"))), a, 5);
                a++;
            }
           
        } catch (SQLException | ClassNotFoundException e) {
            JOptionPane.showMessageDialog(rootPane, e);
        } catch (Exception ex) {
            Logger.getLogger(teste.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
     
    } 
    
    public void MostraConsultasConcluidas() throws Exception{
        try {
            //Registra JDBC driver
            Conexao conexao = new Conexao();
            Connection con = conexao.abrir();
            //Executa a query de seleção
            java.sql.Statement st = con.createStatement();
            st.executeQuery("select * from consultas_r");
            ResultSet rs = st.getResultSet();
                        
            int a = 0;
            //Lista os alunos no console
            int numtabelas = Tabela3.getRowCount();
            for (int b = 0 ; b < numtabelas ; b++ ) {
                Tabela3.setValueAt(" ", b, 0);
                Tabela3.setValueAt(" ", b, 1);
                Tabela3.setValueAt(" ", b, 2);
                Tabela3.setValueAt(" ", b, 3);
                Tabela3.setValueAt(" ", b, 4);
                Tabela3.setValueAt(" ", b, 5);
            }
            int linhas = 0;
            while (rs.next()) {
                linhas++;
                Tabela3.setValueAt(rs.getString("id_consulta"), a, 0);
                Tabela3.setValueAt(rs.getString("nome_paciente"), a, 1);
                /*if(rs.getString("sexo_paciente").equals("M")){
                    Tabela3.setValueAt("Masculino", a, 2);
                }else{
                    if(rs.getString("sexo_paciente").equals("F")){
                    Tabela3.setValueAt("Feminino", a, 2);
                }
                }*/
                Tabela3.setValueAt(rs.getString("nome_medico"), a, 2);
                Tabela3.setValueAt(rs.getString("data_nasc_paciente"), a, 3);
                Tabela3.setValueAt(rs.getString("data_consulta"), a, 4);
                Tabela3.setValueAt((rs.getString("hora_consulta"))+":"+((rs.getString("minuto_consulta"))), a, 5);
                a++;
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
            if(criterioPesquisa3.getSelectedIndex() == 0){
                st.executeQuery("select * from consultas where id_consulta LIKE '%"+pesquisa+"%'");
            }
            if(criterioPesquisa3.getSelectedIndex() == 1){
                st.executeQuery("select * from consultas where nome_paciente LIKE '%"+pesquisa+"%'");
            }
            if(criterioPesquisa3.getSelectedIndex() == 2){
                st.executeQuery("select * from consultas where sexo_paciente LIKE '%"+pesquisa+"%'");
            }
            if(criterioPesquisa3.getSelectedIndex() == 3){
                st.executeQuery("select * from consultas where data_nasc_paciente LIKE '%"+pesquisa+"%'");
            }
            if(criterioPesquisa3.getSelectedIndex() == 4){
                st.executeQuery("select * from consultas where data_consulta LIKE '%"+pesquisa+"%'");
            }
            if(criterioPesquisa3.getSelectedIndex() == 5){
                st.executeQuery("select * from consultas where hora_consulta LIKE '%"+pesquisa+"%'");
            }
            
            ResultSet rs = st.getResultSet();
                        
            int a = 0;
            //Lista os alunos no console
            int numtabelas = Tabela.getRowCount();
            for (int b = 0 ; b < numtabelas ; b++ ) {
                Tabela3.setValueAt(" ", b, 0);
                Tabela3.setValueAt(" ", b, 1);
                Tabela3.setValueAt(" ", b, 2);
                Tabela3.setValueAt(" ", b, 3);
                Tabela3.setValueAt(" ", b, 4);
                Tabela3.setValueAt(" ", b, 5);
            }
            int linhas = 0;
            while (rs.next()) {
                linhas++;
                Tabela3.setValueAt(rs.getString("id_consulta"), a, 0);
                Tabela3.setValueAt(rs.getString("nome_paciente"), a, 1);
                /*if(rs.getString("sexo_paciente") == "M"){
                    Tabela3.setValueAt("Masculino", a, 2);
                }else{
                    if(rs.getString("sexo_paciente") == "F"){
                    Tabela3.setValueAt("Feminino", a, 2);
                }
                }*/
                Tabela3.setValueAt(rs.getString("nome_medico"), a, 2);
                
                Tabela3.setValueAt(rs.getString("data_nasc_paciente"), a, 3);
                Tabela3.setValueAt(rs.getString("data_consulta"), a, 4);
                Tabela3.setValueAt(rs.getString("hora_consulta")+":"+rs.getString("minuto_consulta"), a, 5);
                a++;
            }
           
        } catch (SQLException | ClassNotFoundException e) {
            JOptionPane.showMessageDialog(rootPane, e);
        } catch (Exception ex) {
            Logger.getLogger(teste.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    public void PesquisaConsultasConcluidas(String pesquisa) throws Exception{
        try {
            //Registra JDBC driver
            Conexao conexao = new Conexao();
            Connection con = conexao.abrir();
            //Executa a query de seleção
            java.sql.Statement st = con.createStatement();
            if(criterioPesquisa3.getSelectedIndex() == 0){
                st.executeQuery("select * from consultas_r where id_consulta LIKE '%"+pesquisa+"%'");
            }
            if(criterioPesquisa3.getSelectedIndex() == 1){
                st.executeQuery("select * from consultas_r where nome_paciente LIKE '%"+pesquisa+"%'");
            }
            if(criterioPesquisa3.getSelectedIndex() == 2){
                st.executeQuery("select * from consultas_r where sexo_paciente LIKE '%"+pesquisa+"%'");
            }
            if(criterioPesquisa3.getSelectedIndex() == 3){
                st.executeQuery("select * from consultas_r where data_nasc_paciente LIKE '%"+pesquisa+"%'");
            }
            if(criterioPesquisa3.getSelectedIndex() == 4){
                st.executeQuery("select * from consultas_r where data_consulta LIKE '%"+pesquisa+"%'");
            }
            if(criterioPesquisa3.getSelectedIndex() == 5){
                st.executeQuery("select * from consultas where hora_consulta LIKE '%"+pesquisa+"%'");
            }
            
            ResultSet rs = st.getResultSet();
                        
            int a = 0;
            //Lista os alunos no console
            int numtabelas = Tabela.getRowCount();
            for (int b = 0 ; b < numtabelas ; b++ ) {
                Tabela3.setValueAt(" ", b, 0);
                Tabela3.setValueAt(" ", b, 1);
                Tabela3.setValueAt(" ", b, 2);
                Tabela3.setValueAt(" ", b, 3);
                Tabela3.setValueAt(" ", b, 4);
                Tabela3.setValueAt(" ", b, 5);
            }
            int linhas = 0;
            while (rs.next()) {
                linhas++;
                Tabela3.setValueAt(rs.getString("id_consulta"), a, 0);
                Tabela3.setValueAt(rs.getString("nome_paciente"), a, 1);
                /*if(rs.getString("sexo_paciente") == "M"){
                    Tabela3.setValueAt("Masculino", a, 2);
                }else{
                    if(rs.getString("sexo_paciente") == "F"){
                    Tabela3.setValueAt("Feminino", a, 2);
                }
                }*/
                Tabela3.setValueAt(rs.getString("nome_medico"), a, 2);
                
                Tabela3.setValueAt(rs.getString("data_nasc_paciente"), a, 3);
                Tabela3.setValueAt(rs.getString("data_consulta"), a, 4);
                Tabela3.setValueAt(rs.getString("hora_consulta")+":"+rs.getString("minuto_consulta"), a, 5);
                a++;
            }
           
        } catch (SQLException | ClassNotFoundException e) {
            JOptionPane.showMessageDialog(rootPane, e);
        } catch (Exception ex) {
            Logger.getLogger(teste.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    public static void GeraRelatorio(){
        
    }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Tabela3 = new javax.swing.JTable();
        ScrollTab = new javax.swing.JScrollPane();
        Tabela = new javax.swing.JTable();
        ScrollTab2 = new javax.swing.JScrollPane();
        Tabela2 = new javax.swing.JTable();
        btnCadastrar = new javax.swing.JButton();
        Selecao = new javax.swing.JComboBox<>();
        btnEditar = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();
        btnVisualizar = new javax.swing.JButton();
        btnAtualizar = new javax.swing.JButton();
        txtA = new javax.swing.JLabel();
        btnPesquisa = new javax.swing.JButton();
        CampoPesquisa = new javax.swing.JTextField();
        criterioPesquisa1 = new javax.swing.JComboBox<>();
        criterioPesquisa2 = new javax.swing.JComboBox<>();
        criterioPesquisa3 = new javax.swing.JComboBox<>();
        jPanel2 = new javax.swing.JPanel();
        btnSair = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Secretário(a)");
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Tabela3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "ID Consulta", "Nome do Paciente", "Médico", "Data de Nascimento", "Data", "Horário"
            }
        ));
        jScrollPane1.setViewportView(Tabela3);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 620, 220));

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

        jPanel1.add(ScrollTab, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 620, 220));

        Tabela2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "ID", "Nome", "Telefone", "CNPJ"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        ScrollTab2.setViewportView(Tabela2);

        jPanel1.add(ScrollTab2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 620, 220));

        btnCadastrar.setBackground(new java.awt.Color(102, 153, 255));
        btnCadastrar.setForeground(new java.awt.Color(255, 255, 255));
        btnCadastrar.setText("Cadastrar");
        btnCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarActionPerformed(evt);
            }
        });
        jPanel1.add(btnCadastrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 50, 120, 30));

        Selecao.setBackground(new java.awt.Color(102, 153, 255));
        Selecao.setForeground(new java.awt.Color(255, 255, 255));
        Selecao.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Médicos(a)", "Convênios", "Consultas", "Consultas Concluídas" }));
        Selecao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SelecaoActionPerformed(evt);
            }
        });
        jPanel1.add(Selecao, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 128, 30));

        btnEditar.setBackground(new java.awt.Color(102, 153, 255));
        btnEditar.setForeground(new java.awt.Color(255, 255, 255));
        btnEditar.setText("Editar");
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });
        jPanel1.add(btnEditar, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 10, 120, 30));

        btnExcluir.setBackground(new java.awt.Color(102, 153, 255));
        btnExcluir.setForeground(new java.awt.Color(255, 255, 255));
        btnExcluir.setText("Excluir");
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });
        jPanel1.add(btnExcluir, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 50, 120, 30));

        btnVisualizar.setBackground(new java.awt.Color(102, 153, 255));
        btnVisualizar.setForeground(new java.awt.Color(255, 255, 255));
        btnVisualizar.setText("Visualizar");
        btnVisualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVisualizarActionPerformed(evt);
            }
        });
        jPanel1.add(btnVisualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 10, 120, 30));

        btnAtualizar.setBackground(new java.awt.Color(102, 153, 255));
        btnAtualizar.setForeground(new java.awt.Color(255, 255, 255));
        btnAtualizar.setText("Atualizar");
        btnAtualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtualizarActionPerformed(evt);
            }
        });
        jPanel1.add(btnAtualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 130, 30));

        txtA.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txtA.setForeground(new java.awt.Color(102, 153, 255));
        txtA.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtA.setText("Médicos(a)");
        jPanel1.add(txtA, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 50, 220, 30));

        btnPesquisa.setBackground(new java.awt.Color(102, 153, 255));
        btnPesquisa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/lupabranca.png"))); // NOI18N
        btnPesquisa.setName(""); // NOI18N
        btnPesquisa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesquisaActionPerformed(evt);
            }
        });
        jPanel1.add(btnPesquisa, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 10, 30, 30));
        jPanel1.add(CampoPesquisa, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 10, 140, 30));

        criterioPesquisa1.setBackground(new java.awt.Color(102, 153, 255));
        criterioPesquisa1.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        criterioPesquisa1.setForeground(new java.awt.Color(255, 255, 255));
        criterioPesquisa1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ID", "Nome", "CPF", "RG", "Telefone" }));
        criterioPesquisa1.setSelectedIndex(1);
        criterioPesquisa1.setBorder(null);
        criterioPesquisa1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        criterioPesquisa1.setLightWeightPopupEnabled(false);
        criterioPesquisa1.setOpaque(false);
        jPanel1.add(criterioPesquisa1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 10, 50, 30));

        criterioPesquisa2.setBackground(new java.awt.Color(102, 153, 255));
        criterioPesquisa2.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        criterioPesquisa2.setForeground(new java.awt.Color(255, 255, 255));
        criterioPesquisa2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ID", "Nome", "Telefone", "CNPJ" }));
        criterioPesquisa2.setSelectedIndex(1);
        criterioPesquisa2.setBorder(null);
        criterioPesquisa2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel1.add(criterioPesquisa2, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 10, 50, 30));

        criterioPesquisa3.setBackground(new java.awt.Color(102, 153, 255));
        criterioPesquisa3.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        criterioPesquisa3.setForeground(new java.awt.Color(255, 255, 255));
        criterioPesquisa3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ID", "Nome do Paciente", "Sexo", "Data de Nascimento", "Data da Consulta", "Horário da Consulta" }));
        criterioPesquisa3.setSelectedIndex(1);
        criterioPesquisa3.setBorder(null);
        jPanel1.add(criterioPesquisa3, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 10, 50, 30));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 640, 330));

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
        jPanel2.add(btnSair, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 10, 120, 50));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/PlusLife_Login_transparente.png"))); // NOI18N
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, 50));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Secretário(a)");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 20, 360, 45));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 640, 70));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSairActionPerformed
        dispose();
        Plus_Life pl = new Plus_Life();
        pl.conferetelalogin();
    }//GEN-LAST:event_btnSairActionPerformed

    private void btnCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarActionPerformed
        if(Selecao.getSelectedIndex() == 0){
            Tela_cadastrar_medico medico;
            try {
                medico = new Tela_cadastrar_medico();
                medico.setVisible(true);
                medico.setLocationRelativeTo(null);
            } catch (IOException ex) {
                Logger.getLogger(Tela_Secretária.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        }
        if(Selecao.getSelectedIndex() == 1){
            Tela_cadastrar_convenios convenio;
            try {
                convenio = new Tela_cadastrar_convenios();
                convenio.setVisible(true);
                convenio.setLocationRelativeTo(null);
            } catch (IOException ex) {
                Logger.getLogger(Tela_Secretária.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        }
        if(Selecao.getSelectedIndex() == 2){
            int selecionado = Tabela3.getSelectedRow();
            Tela_cadastrar_consulta consulta;
            try {
                consulta = new Tela_cadastrar_consulta();
                consulta.setVisible(true);
                consulta.setLocationRelativeTo(null);
            } catch (Exception ex) {
                Logger.getLogger(Tela_Secretária.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        }
        if(Selecao.getSelectedIndex() == 3){
            
            File diretorio = new File("C:\\PlusLife");
                Conexao conexao = new Conexao();
                Connection con;
            try {
                con = conexao.abrir();
                java.sql.Statement st = con.createStatement();
                st.executeQuery("SELECT * FROM consultas_r");
                diretorio.mkdir();
                
                FileWriter arq;
            try {
                ResultSet rs = st.getResultSet();
                arq = new FileWriter("C:\\PlusLife\\Relatorio Consultas Realizadas.txt");
                BufferedWriter writer = new BufferedWriter(arq);
                while(rs.next()){
                    writer.write("                  ");
                    writer.newLine();               
                    String id = rs.getString("id_consulta");
                    char[] idarray = id.toCharArray();
                    int idd = idarray.length;
                    writer.write("                  ------- DADOS CONSULTA ID: "+rs.getString("id_consulta")+" ");
                    int a = 7-idd;
                    int b = 0;
                    while(b < a){
                        writer.write("-");
                        b++;
                    }
                    writer.newLine();
                    writer.write("                  » Nome Paciente: "+rs.getString("nome_paciente"));
                    writer.newLine();
                    if(rs.getString("sexo_paciente").equals("M")){
                        writer.write("                  » Sexo Paciente: Masculino");
                    }if(rs.getString("sexo_paciente").equals("F")){
                        writer.write("                  » Sexo Paciente: Feminino");
                    }
                    writer.newLine();
                    writer.write("                  » Nome Médico: "+rs.getString("nome_medico"));
                    writer.newLine();
                    writer.write("                  » Data Nascimento Paciente: "+rs.getString("data_nasc_paciente"));
                    writer.newLine();
                    writer.write("                  » Data da Consulta: "+rs.getString("data_consulta"));
                    writer.newLine();
                    writer.write("                  » Hora da Consulta: "+rs.getString("hora_consulta")+":"+rs.getString("minuto_consulta"));
                    writer.newLine();
                }
                writer.flush();
                writer.close();
                JOptionPane.showMessageDialog(null, "Relatório gerado com sucesso em C:/PlusLife");
            } catch (IOException ex) {
                Logger.getLogger(Tela_Secretária.class.getName()).log(Level.SEVERE, null, ex);
            }
                
            } catch (Exception ex) {
                Logger.getLogger(Tela_Secretária.class.getName()).log(Level.SEVERE, null, ex);
            }
                
                
        }
        
    }//GEN-LAST:event_btnCadastrarActionPerformed

    private void SelecaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SelecaoActionPerformed
        atualizar();
        try {
            confereconfig();
        } catch (IOException ex) {
            Logger.getLogger(Tela_Secretária.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_SelecaoActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        int selecionado = 0;
        String id = null;
        if(Selecao.getSelectedIndex() == 0){
            selecionado = Tabela.getSelectedRow();
            id = (String) Tabela.getValueAt(selecionado, 0);
        }
        if(Selecao.getSelectedIndex() == 1){
            selecionado = Tabela2.getSelectedRow();
            id = (String) Tabela2.getValueAt(selecionado, 0);
        }
        if(Selecao.getSelectedIndex() == 2){
            selecionado = Tabela3.getSelectedRow();
            id = (String) Tabela3.getValueAt(selecionado, 0);
        }
        if(Selecao.getSelectedIndex() == 3){
            selecionado = Tabela3.getSelectedRow();
            id = (String) Tabela3.getValueAt(selecionado, 0);
        }
        try {
            editar(id);
        } catch (Exception ex) {
            Logger.getLogger(Tela_Administrador.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnEditarActionPerformed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        int selecionado = 0;
        String id = null;
        String nome = null;
        if(Selecao.getSelectedIndex() == 0){
            selecionado = Tabela.getSelectedRow();
            id = (String) Tabela.getValueAt(selecionado, 0);
            nome = (String) Tabela.getValueAt(selecionado, 1);
        }
        if(Selecao.getSelectedIndex() == 1){
            selecionado = Tabela2.getSelectedRow();
            id = (String) Tabela2.getValueAt(selecionado, 0);
            nome = (String) Tabela2.getValueAt(selecionado, 1);
        }
        if(Selecao.getSelectedIndex() == 2){
            selecionado = Tabela3.getSelectedRow();
            id = (String) Tabela3.getValueAt(selecionado, 0);
            nome = (String) Tabela3.getValueAt(selecionado, 1);
        }
        if(Selecao.getSelectedIndex() == 3){
            selecionado = Tabela3.getSelectedRow();
            id = (String) Tabela3.getValueAt(selecionado, 0);
            nome = (String) Tabela3.getValueAt(selecionado, 1);
        }
        try {
            excluir(id, nome);
        } catch (Exception ex) {
            Logger.getLogger(Tela_Administrador.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnExcluirActionPerformed

    private void btnAtualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtualizarActionPerformed
        atualizar();
    }//GEN-LAST:event_btnAtualizarActionPerformed

    private void btnVisualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVisualizarActionPerformed
        int selecionado = 0;
        String id = null;
        if(Selecao.getSelectedIndex() == 0){
            selecionado = Tabela.getSelectedRow();
            id = (String) Tabela.getValueAt(selecionado, 0);
        }
        if(Selecao.getSelectedIndex() == 1){
            selecionado = Tabela2.getSelectedRow();
            id = (String) Tabela2.getValueAt(selecionado, 0);
        }
        if(Selecao.getSelectedIndex() == 2){
            selecionado = Tabela3.getSelectedRow();
            id = (String) Tabela3.getValueAt(selecionado, 0);
        }
        if(Selecao.getSelectedIndex() == 3){
            selecionado = Tabela3.getSelectedRow();
            id = (String) Tabela3.getValueAt(selecionado, 0);
        }
        try {
            visualizar(id);
        } catch (Exception ex) {
            Logger.getLogger(Tela_Administrador.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnVisualizarActionPerformed

    private void btnPesquisaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisaActionPerformed
        String pesquisa = null;
        String id = null;
        if(Selecao.getSelectedIndex() == 0){
            pesquisa = CampoPesquisa.getText();
            try {
                PesquisaMedicos(pesquisa);
            } catch (Exception ex) {
                Logger.getLogger(Tela_Administrador.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        if(Selecao.getSelectedIndex() == 1){
            pesquisa = CampoPesquisa.getText();
            try {
                PesquisaConvenios(pesquisa);
            } catch (Exception ex) {
                Logger.getLogger(Tela_Administrador.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        if(Selecao.getSelectedIndex() == 2){
            pesquisa = CampoPesquisa.getText();
            try {
                PesquisaConsultas(pesquisa);
            } catch (Exception ex) {
                Logger.getLogger(Tela_Administrador.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        if(Selecao.getSelectedIndex() == 3){
            pesquisa = CampoPesquisa.getText();
            try {
                PesquisaConsultasConcluidas(pesquisa);
            } catch (Exception ex) {
                Logger.getLogger(Tela_Administrador.class.getName()).log(Level.SEVERE, null, ex);
            }
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
            java.util.logging.Logger.getLogger(Tela_Secretária.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Tela_Secretária.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Tela_Secretária.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tela_Secretária.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new Tela_Secretária().setVisible(true);
                } catch (IOException ex) {
                    Logger.getLogger(Tela_Secretária.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField CampoPesquisa;
    private javax.swing.JScrollPane ScrollTab;
    private javax.swing.JScrollPane ScrollTab2;
    private javax.swing.JComboBox<String> Selecao;
    private javax.swing.JTable Tabela;
    private javax.swing.JTable Tabela2;
    private javax.swing.JTable Tabela3;
    private javax.swing.JButton btnAtualizar;
    private javax.swing.JButton btnCadastrar;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnPesquisa;
    private javax.swing.JButton btnSair;
    private javax.swing.JButton btnVisualizar;
    private javax.swing.JComboBox<String> criterioPesquisa1;
    private javax.swing.JComboBox<String> criterioPesquisa2;
    private javax.swing.JComboBox<String> criterioPesquisa3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel txtA;
    // End of variables declaration//GEN-END:variables
}
