/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.edson_pimentel_joyce_pereira.bolao.model;

import java.util.Date;
import javax.persistence.*;


/**
 *
 * @author edsonpimentel
 */

@Entity
public class PartidaModel {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idPartida;
    @Column
    private Tipo_Partida tipo_partida;
    @Column
    @OneToOne
    private SelecaoModel mandante;
    @Column
    @OneToOne
    private SelecaoModel visitante;
    @Column
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date data;
    @Column
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date duracao;
    @Column
    private int gols_mandante;
    @Column
    private int gols_visitante;

    public PartidaModel() {
    }

    public PartidaModel(Long idPartida, Tipo_Partida tipo_partida, SelecaoModel mandante, SelecaoModel visitante, Date data, Date duracao, int gols_mandante, int gols_visitante) {
        this.idPartida = idPartida;
        this.tipo_partida = tipo_partida;
        this.mandante = mandante;
        this.visitante = visitante;
        this.data = data;
        this.duracao = duracao;
        this.gols_mandante = gols_mandante;
        this.gols_visitante = gols_visitante;
    }

    public Long getIdPartida() {
        return idPartida;
    }

    public Tipo_Partida getTipo_partida() {
        return tipo_partida;
    }

    public void setTipo_partida(Tipo_Partida tipo_partida) {
        this.tipo_partida = tipo_partida;
    }

    public SelecaoModel getMandante() {
        return mandante;
    }

    public void setMandante(SelecaoModel mandante) {
        this.mandante = mandante;
    }

    public SelecaoModel getVisitante() {
        return visitante;
    }

    public void setVisitante(SelecaoModel visitante) {
        this.visitante = visitante;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public Date getDuracao() {
        return duracao;
    }

    public void setDuracao(Date duracao) {
        this.duracao = duracao;
    }

    public int getGols_mandante() {
        return gols_mandante;
    }

    public void setGols_mandante(int gols_mandante) {
        this.gols_mandante = gols_mandante;
    }

    public int getGols_visitante() {
        return gols_visitante;
    }

    public void setGols_visitante(int gols_visitante) {
        this.gols_visitante = gols_visitante;
    }
    
    public void InformacaoPartida(){}
    public boolean Empate(){return true;}
    public boolean Prorrogacao(){return true;}
    public void Penaltis(){}
    public void Resultado(){}
    
}
