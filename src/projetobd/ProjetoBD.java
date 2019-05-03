/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetobd;
import java.util.Scanner;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;


public class ProjetoBD {

    
    public static void main(String[] args){
                Connection conn;
        try {
            conn = DriverManager.getConnection("jdbc:h2:../test",
                    "sa","password");
            Statement st = conn.createStatement();
            st.executeQuery("create table Usuario (nome_perfil varchar(255)," +
                            "nome_real varchar(255)," +
                            "email(255)," +
                            "senha(255)," +
                            "bio text," +
                            "privaciade int,");
            
            Scanner in;
            
            System.out.printf("Registrar Usuario:\n");
            System.out.printf("Nome Real: \n");
            String nomer = in.nextLine();
            System.out.printf("Nome do perfil: \n");
            String nomep = in.nextLine();
            System.out.printf("email: \n");
            String email = in.nextLine();
            System.out.printf("senha: \n");
            
                // código da aplicacao aqui
                conn.close();
        } catch (SQLException ex) {
            Logger.getLogger(ProjetoBD.class.getName()).log(Level.SEVERE, null, ex);
        }
                
        
     
    }
    
}
