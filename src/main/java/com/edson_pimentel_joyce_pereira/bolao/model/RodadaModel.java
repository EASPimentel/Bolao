/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.edson_pimentel_joyce_pereira.bolao.model;

import java.util.ArrayList;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;

/**
 *
 * @author edsonpimentel
 */
@Entity
class RodadaModel {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idRodada;    
    @Column
    @ManyToOne
    private ArrayList<PartidaModel> partidas;
    @Column
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date dataLimite;

    public RodadaModel() {
    }

    public RodadaModel(Long idRodada, ArrayList<PartidaModel> partidas, Date dataLimite) {
        this.idRodada = idRodada;
        this.partidas = partidas;
        this.dataLimite = dataLimite;
    }

    public Long getIdRodada() {
        return idRodada;
    }

    public ArrayList<PartidaModel> getPartidas() {
        return partidas;
    }

    public void setPartidas(ArrayList<PartidaModel> partidas) {
        this.partidas = partidas;
    }

    public Date getDataLimite() {
        return dataLimite;
    }

    public void setDataLimite(Date dataLimite) {
        this.dataLimite = dataLimite;
    }
    
   
    public void ResultadoGrupos(){}

    public void ResultadoMataMata(){}
}
