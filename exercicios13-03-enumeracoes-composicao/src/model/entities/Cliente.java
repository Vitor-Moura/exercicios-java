package model.entities;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Cliente {

    private String nome;
    private String email;
    private Date dataNascimento;

    private SimpleDateFormat formatoData = new SimpleDateFormat("dd/MM/yyyy");

    public Cliente(String nome, String email, Date dataNascimento) {
        this.nome = nome;
        this.email = email;
        this.dataNascimento = dataNascimento;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    @Override
    public String toString() {
        return nome + " (" + formatoData.format(dataNascimento) + ") - " + email;
    }
}
