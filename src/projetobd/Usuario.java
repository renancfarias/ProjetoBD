/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetobd;

public class Usuario {
    private String nome_perfil;
    private String nome_real;
    private String email;
    private String senha;
    private String bio;
    private boolean privaciade;

    public Usuario(String nome_perfil, String nome_real, String email, String senha, String bio, boolean privaciade) {
        this.nome_perfil = nome_perfil;
        this.nome_real = nome_real;
        this.email = email;
        this.senha = senha;
        this.bio = bio;
        this.privaciade = privaciade;
    }
    

    /**
     * @return the nome_perfil
     */
    public String getNome_perfil() {
        return nome_perfil;
    }

    /**
     * @param nome_perfil the nome_perfil to set
     */
    public void setNome_perfil(String nome_perfil) {
        this.nome_perfil = nome_perfil;
    }

    /**
     * @return the nome_real
     */
    public String getNome_real() {
        return nome_real;
    }

    /**
     * @param nome_real the nome_real to set
     */
    public void setNome_real(String nome_real) {
        this.nome_real = nome_real;
    }

    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * @return the senha
     */
    public String getSenha() {
        return senha;
    }

    /**
     * @param senha the senha to set
     */
    public void setSenha(String senha) {
        this.senha = senha;
    }

    /**
     * @return the bio
     */
    public String getBio() {
        return bio;
    }

    /**
     * @param bio the bio to set
     */
    public void setBio(String bio) {
        this.bio = bio;
    }

    /**
     * @return the privaciade
     */
    public boolean isPrivaciade() {
        return privaciade;
    }

    /**
     * @param privaciade the privaciade to set
     */
    public void setPrivaciade(boolean privaciade) {
        this.privaciade = privaciade;
    }
                           
}


