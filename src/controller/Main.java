/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import view.TelaInicial;

/**
 *
 * @author leo_m
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        TelaInicial ti = new TelaInicial();
        Doador doador = new Doador();
        ti.setVisible(true);
        ti.setDoador(doador);
    }
    
}
