package model;

import java.util.Date;

public class Farmaceutico extends Pessoa {
    private String crf;
    private String senha;
    private String login;
    private String nomeSocial;

    public Farmaceutico(int id, String nome, String fone1, String fone2, String email, String cpfCnpj, String rgInscricaoEstadual, Date dataCadastro, String cep, String cidade, String bairro, String logradouro, String complemento) {
        super(id, nome, fone1, fone2, email, cpfCnpj, rgInscricaoEstadual, dataCadastro, cep, cidade, bairro, logradouro, complemento);
    }

    public String getCrf() {
        return crf;
    }

    public void setCrf(String crf) {
        this.crf = crf;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getNomeSocial() {
        return nomeSocial;
    }

    public void setNomeSocial(String nomeSocial) {
        this.nomeSocial = nomeSocial;
    }

    @Override
    public String toString() {
        return "Farmaceutico{" + super.toString() +
                "crf='" + crf + '\'' +
                ", senha='" + senha + '\'' +
                ", login='" + login + '\'' +
                ", nomeSocial='" + nomeSocial + '\'' +
                '}';
    }



}