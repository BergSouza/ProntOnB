/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package plus_life;

import Banco_de_dados.Conexao;

/**
 *
 * @author HARDWARE
 */
public class Plus_Life {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
        Conexao con = new Conexao();
        
        con.abrir();
    }
    
}
