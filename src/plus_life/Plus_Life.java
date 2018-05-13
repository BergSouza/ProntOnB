/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package plus_life;

import Telas.Tela_login;
import Telas.Tela_login2;
import com.jgoodies.looks.plastic.PlasticLookAndFeel;
import com.jgoodies.looks.plastic.md;
import com.jgoodies.looks.plastic.theme.AbstractSkyTheme;
import com.jgoodies.looks.plastic.theme.BrownSugar;
import com.jgoodies.looks.plastic.theme.DarkStar;
import com.jgoodies.looks.plastic.theme.DesertBlue;
import com.jgoodies.looks.plastic.theme.DesertBluer;
import com.jgoodies.looks.plastic.theme.ExperienceBlue;
import com.jgoodies.looks.plastic.theme.ExperienceRoyale;
import com.jgoodies.looks.plastic.theme.InvertedColorTheme;
import com.jgoodies.looks.plastic.theme.Silver;
import com.jgoodies.looks.plastic.theme.SkyYellow;
import java.io.BufferedReader;
import java.io.FileReader;
import javax.swing.SwingUtilities;
import Telas.Tela_login2;

/**
 *
 * @author HARDWARE
 */
      

public class Plus_Life {
    
    private String versao = "0.9.6 - BETA";
    private String novidades = ""
            + "v0.9.6: Sistema de Médico(a) 100% funcional\n"
            + "v0.9: Novo Sistema de Pesquisa por Critério\n"
            + "v0.9: Sistema de Secretário(a) 100% funcional\n"
            + "v0.8.2: Sistema do Administrador - Pesquisa Disponível\n"
            + "v0.8: Sistema do Administrador 100% funcional\n"
            + "v0.6: PlusLife conta com o Identity.";
    private String ajuda = "Identity: é o código único entre todos os usuários.Ex: O identity de um médico é diferente de uma secretária, e ambos diferentes de todos os outros.";

    public String getVersao() {
        return versao;
    }

    public String getNovidades() {
        return novidades;
    }

    public String getAjuda() {
        return ajuda;
    }
    
    
    public static void main(String[] args) throws Exception {
        
        Tela_login login = new Tela_login();
        login.setVisible(true);
        login.setLocationRelativeTo(null);
        
        FileReader freader = new FileReader("C:\\PlusLife\\loginconfig.pl");
        BufferedReader breader = new BufferedReader(freader);
        String tipodetela = (String) breader.readLine();
        if(tipodetela.equals("1")){
            Tela_login2 login2 = new Tela_login2();
            login2.setVisible(true);
            login2.setLocationRelativeTo(null);
            login.dispose();
        }if(tipodetela.equals("0")){
            
        }
        
        
        
        
        PlasticLookAndFeel.setPlasticTheme(new Silver());

                  

    }
    
}
