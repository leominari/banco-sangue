/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author leo_m
 */
public class CorrigeData {

    private String data;
    private String dia;
    private String mes;
    private String ano;

    public String correcao(String data) {
        dia = data.substring(0, 2);
        mes = data.substring(3, 5);
        ano = data.substring(6, 10);
        this.data = ano + "-" + mes + "-" + dia ;
        return this.data;

    }
}
