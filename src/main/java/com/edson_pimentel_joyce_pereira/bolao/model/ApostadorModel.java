/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.edson_pimentel_joyce_pereira.bolao.model;


import java.util.Date;
import javax.persistence.*;


/**
 *
 * @author Edson
 */
@Entity
public class ApostadorModel {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idApostador;
    
    @Column
    private String login;
    @Column
    private String senha;
    @Column
    private String email;
    @Column
    private String nome;
    @Column
    private long cpf;
    @Column
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date dataNascimento;
    @Column
    private int pontuacao;
    @Column
    private int numApostas;

    public ApostadorModel() {
    }

    public ApostadorModel(Long idApostador, String login, String senha, String email, String nome, long cpf, Date dataNascimento, int pontuacao, int numApostas) {
        this.idApostador = idApostador;
        this.login = login;
        this.senha = senha;
        this.email = email;
        this.nome = nome;
        this.cpf = cpf;
        this.dataNascimento = dataNascimento;
        this.pontuacao = pontuacao;
        this.numApostas = numApostas;
    }

    public Long getIdApostador() {
        return idApostador;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public long getCpf() {
        return cpf;
    }

    public void setCpf(long cpf) {
        this.cpf = cpf;
    }

    public Date getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public int getPontuacao() {
        return pontuacao;
    }

    public void setPontuacao(int pontuacao) {
        this.pontuacao = pontuacao;
    }

    public int getNumApostas() {
        return numApostas;
    }

    public void setNumApostas(int numApostas) {
        this.numApostas = numApostas;
    }
    
    public void GeraClassificacao(){}
    public void CheckCPF(){}
    public void CheckIdade(){}
    public void CheckLogin(){}
    public void CheckSenha(){}
    public void ConfirmaEmail(){}
    
}
