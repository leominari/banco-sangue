/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.sql.SQLException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import javax.swing.JOptionPane;
import model.Querys;

/**
 *
 * @author leo_m
 */
public class Tempo {

    public static int diffInDays(Calendar c1, Calendar c2) {
        int MILLIS_IN_DAY = 86400000;

        c1.set(Calendar.MILLISECOND, 0);
        c1.set(Calendar.SECOND, 0);
        c1.set(Calendar.MINUTE, 0);
        c1.set(Calendar.HOUR_OF_DAY, 0);

        c2.set(Calendar.MILLISECOND, 0);
        c2.set(Calendar.SECOND, 0);
        c2.set(Calendar.MINUTE, 0);
        c2.set(Calendar.HOUR_OF_DAY, 0);
        return (31 + (int) ((c1.getTimeInMillis() - c2.getTimeInMillis()) / MILLIS_IN_DAY));
    }

    public int tempoDoacao(int idDoador) throws SQLException {
        String tmp, datual;
        Querys qr = new Querys();
        tmp = qr.ultimaDoacao(idDoador);
        if(tmp.equals("0000-00-00")){
            return 0;
        }
        Date d1 = new Date();
        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        datual = dateFormat.format(d1);
        Calendar c1 = Calendar.getInstance();
        Calendar c2 = Calendar.getInstance();
        c2.setTime(d1);
        c1.set(Integer.parseInt(tmp.substring(0, 4)), Integer.parseInt(tmp.substring(5, 7)), Integer.parseInt(tmp.substring(8, 10)));
        return diffInDays(c2, c1);
    }
}
