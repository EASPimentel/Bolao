/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.edson_pimentel_joyce_pereira.bolao.model;

import javax.persistence.*;

/**
 *
 * @author edsonpimentel
 */
@Entity
public class SelecaoModel {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idSelecao;
    @Column
    private String nome;
    @Column
    private String abreviacao;
    @Column
    private int vitorias;
    @Column
    private int derrotas;
    @Column
    private int empates;
    @Column
    private int golsFeitos;
    @Column
    private int golsSofridos;
    @Column
    private int saldoGol;
    @Column
    private int cartaoAmarelo;
    @Column
    private int cartaoVermelho;

    public SelecaoModel() {
    }

    public SelecaoModel(Long idSelecao, String nome, String abreviacao, int vitorias, int derrotas, int empates, int golsFeitos, int golsSofridos, int saldoGol, int cartaoAmarelo, int cartaoVermelho) {
        this.idSelecao = idSelecao;
        this.nome = nome;
        this.abreviacao = abreviacao;
        this.vitorias = vitorias;
        this.derrotas = derrotas;
        this.empates = empates;
        this.golsFeitos = golsFeitos;
        this.golsSofridos = golsSofridos;
        this.saldoGol = saldoGol;
        this.cartaoAmarelo = cartaoAmarelo;
        this.cartaoVermelho = cartaoVermelho;
    }

    public Long getIdSelecao() {
        return idSelecao;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getAbreviacao() {
        return abreviacao;
    }

    public void setAbreviacao(String abreviacao) {
        this.abreviacao = abreviacao;
    }

    public int getVitorias() {
        return vitorias;
    }

    public void setVitorias(int vitorias) {
        this.vitorias = vitorias;
    }

    public int getDerrotas() {
        return derrotas;
    }

    public void setDerrotas(int derrotas) {
        this.derrotas = derrotas;
    }

    public int getEmpates() {
        return empates;
    }

    public void setEmpates(int empates) {
        this.empates = empates;
    }

    public int getGolsFeitos() {
        return golsFeitos;
    }

    public void setGolsFeitos(int golsFeitos) {
        this.golsFeitos = golsFeitos;
    }

    public int getGolsSofridos() {
        return golsSofridos;
    }

    public void setGolsSofridos(int golsSofridos) {
        this.golsSofridos = golsSofridos;
    }

    public int getSaldoGol() {
        return saldoGol;
    }

    public void setSaldoGol(int saldoGol) {
        this.saldoGol = saldoGol;
    }

    public int getCartaoAmarelo() {
        return cartaoAmarelo;
    }

    public void setCartaoAmarelo(int cartaoAmarelo) {
        this.cartaoAmarelo = cartaoAmarelo;
    }

    public int getCartaoVermelho() {
        return cartaoVermelho;
    }

    public void setCartaoVermelho(int cartaoVermelho) {
        this.cartaoVermelho = cartaoVermelho;
    }
    
    
}
