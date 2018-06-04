/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package plus_life;

import Telas.Tela_login;
import Telas.Tela_login2;
import java.io.BufferedReader;
import java.io.FileReader;
import javax.swing.SwingUtilities;
import Telas.Tela_login2;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JOptionPane;

/**
 *
 * @author HARDWARE
 */
      

public class Plus_Life {
    
    private String versao = "0.9.8.2 - BETA";
    private String novidades = ""
            + "v0.6: PlusLife conta com o Identity."
            + "v0.8: Sistema do Administrador 100% funcional\n"
            + "v0.8.2: Sistema do Administrador - Pesquisa Disponível\n"
            + "v0.9: Sistema de Secretário(a) 100% funcional\n"
            + "v0.9: Novo Sistema de Pesquisa por Critério\n"
            + "v0.9.6: A partir de agora o PlusLife está em BETA!\n"
            + "v0.9.6: Sistema de Médico(a) 100% funcional\n"
            + "v0.9.7: Novo Sistema de Launcher e Configurações\n"
            + "v0.9.7.2: Novo Sistema de Cores em Configurações\n"
            + "v0.9.7.3: Novo Sistema de Fontes em Configurações\n"
            + "v0.9.8: »NEW» Consultas Realizadas Com Relatório\n"
            + "v0.9.8.2: »NEW» Novo Sistema de Ícones no Layout\n";
    private String ajuda = "Identity: é o código único entre todos os usuários.Ex: O identity de um médico é diferente de uma secretária, e ambos diferentes de todos os outros. \n"
            +"Lançamento da Versão Final: Em breve, a qualquer momento";

    public String getVersao() {
        return versao;
    }

    public String getNovidades() {
        return novidades;
    }

    public String getAjuda() {
        return ajuda;
    }
    
    public static void criaarquivos() throws IOException{
        try {
                File diretorio = new File("C:\\PlusLife");
                diretorio.mkdir();
                
                FileReader arq = new FileReader("C:\\PlusLife\\config.pl");
                BufferedReader reader = new BufferedReader(arq);
                
            } catch (IOException ex2) {
                File diretorio = new File("C:\\PlusLife");
                diretorio.mkdir();
                
                FileWriter arq = new FileWriter("C:\\PlusLife\\config.pl");
                BufferedWriter writer = new BufferedWriter(arq);
                //writer.newLine();
                writer.write("#6699FF");
                writer.newLine();
                writer.write("#FFFFFF");
                writer.newLine();
                writer.write("Arial");
                writer.newLine();
                writer.write("10");
                writer.newLine();
                writer.write("Icones 1");
                writer.flush();
                writer.close();
            }
    }
    
    public static void conferetelalogin(){
        try{
            FileReader freader = new FileReader("C:\\PlusLife\\loginconfig.pl");
            BufferedReader breader = new BufferedReader(freader);
            String tipodetela = (String) breader.readLine();
            if(tipodetela.equals("1")){
                Tela_login2 login2 = new Tela_login2();
                login2.setVisible(true);
                login2.setLocationRelativeTo(null);
            }if(tipodetela.equals("0")){
                Tela_login login = new Tela_login();
                login.setVisible(true);
                login.setLocationRelativeTo(null);
            }
        } catch (IOException erro1) {
            
            try {
                File diretorio = new File("C:\\PlusLife");
                diretorio.mkdir();
                
                FileWriter arq = new FileWriter("C:\\PlusLife\\loginconfig.pl");
                BufferedWriter writer = new BufferedWriter(arq);
                //writer.newLine();
                writer.write("0");
                writer.flush();
                writer.close();
                conferetelalogin();
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, "Erro ao criar o diretorio");
                System.out.println(ex);
            }
            }
    }
    
    public static void main(String[] args) throws Exception {
        
        criaarquivos();
        conferetelalogin();
        
                  

    }
    
}
