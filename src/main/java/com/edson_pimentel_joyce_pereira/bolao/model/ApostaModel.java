/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.edson_pimentel_joyce_pereira.bolao.model;

/**
 *
 * @author Edson
 */
import javax.persistence.*;

@Entity
public class ApostaModel {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idAposta;
    @Column
    @ManyToOne
    private RodadaModel rodada;
    @Column
    private int pontosFeitos;

    public ApostaModel() {

    }

    public ApostaModel(Long idAposta, RodadaModel rodada, int pontosFeitos) {
        this.idAposta = idAposta;
        this.rodada = rodada;
        this.pontosFeitos = pontosFeitos;
    }

    public Long getIdAposta() {
        return idAposta;
    }

    
    public RodadaModel getRodada() {
        return rodada;
    }

    private void setRodada(RodadaModel rodada) {
        this.rodada = rodada;
    }

    public int getPontosFeitos() {
        return pontosFeitos;
    }

    private void setPontosFeitos(int pontosFeitos) {
        this.pontosFeitos = pontosFeitos;
    }

    public void VerificaAposta(){}

    public void InformaPontos(){}
}