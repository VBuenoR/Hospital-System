package model;

import java.util.Date;

public class Fornecedor extends Pessoa{
    private String nomeFantasia;
    private String contato;

    public Fornecedor(int id, String nome, String fone1, String fone2, String email, String cpfCnpj, String rgInscricaoEstadual, Date dataCadastro, String cep, String cidade, String bairro, String logradouro, String complemento) {
        super(id, nome, fone1, fone2, email, cpfCnpj, rgInscricaoEstadual, dataCadastro, cep, cidade, bairro, logradouro, complemento);
    }

    public String getNomeFantasia() {
        return nomeFantasia;
    }

    public void setNomeFantasia(String nomeFantasia) {
        this.nomeFantasia = nomeFantasia;
    }

    public String getContato() {
        return contato;
    }

    public void setContato(String contato) {
        this.contato = contato;
    }

    @Override
    public String toString() {
        return "Fornecedor{" + super.toString() +
                "nomeFantasia='" + nomeFantasia + '\'' +
                ", contato='" + contato + '\'' +
                '}';
    }
}
