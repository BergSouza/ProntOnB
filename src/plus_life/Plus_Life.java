/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package plus_life;

import Banco_de_dados.Conexao;
import Telas.Tela_login;

/**
 *
 * @author HARDWARE
 */
public class Plus_Life {
    
    private String versao = "0.8.3";
    private String novidades = ""
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
    }
    
}
