/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.util.Date;

/**
 *
 * @author leo_m
 */
public class Doacao {
    private Date dataDoacao;
    private int doador;
    
    
    Doacao(Doador doador){
        dataDoacao = new Date();
        this.doador = doador.getIdDoador();
    }

    /**
     * @return the dataDoacao
     */
    public Date getDataDoacao() {
        return dataDoacao;
    }

    /**
     * @param dataDoacao the dataDoacao to set
     */
    public void setDataDoacao(Date dataDoacao) {
        this.dataDoacao = dataDoacao;
    }

    /**
     * @return the doador
     */
    public int getDoador() {
        return doador;
    }

    /**
     * @param doador the doador to set
     */
    public void setDoador(int doador) {
        this.doador = doador;
    }
    
    
}
