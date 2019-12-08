/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import controller.Doador;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import view.TelaInicial;

/**
 *
 * @author leo_m
 */
public class Principal {

    /**
     * @param args the command line arguments
     * @throws java.sql.SQLException
     * @throws java.text.ParseException
     */
    public static void main(String[] args) throws SQLException, ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        Date sqlDate = sdf.parse("21/07/1970");
        System.out.println(sqlDate);
        TelaInicial bs = new TelaInicial();
        bs.setVisible(true);
        Doador doador = new Doador();
        bs.setDoador(doador);
    }

}
