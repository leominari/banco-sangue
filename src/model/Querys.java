/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import controller.Doador;
import controller.Triagem;
import java.sql.Date;
import java.text.DateFormat;

/**
 *
 * @author leo_m
 */
public class Querys {

    private String query;

    public ResultSet doador(String documento) throws SQLException {
        ResultSet rs;
        query = "SELECT * FROM doador WHERE doador.documento = " + documento;
        ConexaoMysql banco = new ConexaoMysql();
        rs = banco.exQuery(query);
        return rs;

    }

    public boolean novoDoador(Doador doador) throws SQLException {
        ResultSet rs;
        doador.leDoador();
        query = "INSERT INTO `doador`(`nome`, `dataNascimento`, `sexo`, `nomeMae`, `nomePai`, `documento`, `endereco`, `bairro`, `numero`, `complemento`) VALUES ('" + doador.getNomeCompleto() + "','" + doador.getDataNascimento() + "', '" + doador.getSexo() + "','" + doador.getNomeMae() + "', '" + doador.getNomePai() + "'," + doador.getDocumento() + ", '" + doador.getEndereco() + "', '" + doador.getBairro() + "'," + doador.getNumero() + ", '" + doador.getComplemento() + "');";
        ConexaoMysql banco = new ConexaoMysql();
        return banco.upQuery(query);
    }

    public boolean novaTriagem(Triagem triagem) {
        ResultSet rs;
        query = "INSERT INTO `triagem`(`idDoador`,`anemia`, `hepatiteb`, `sifilis`, `htlv`, `hepatitec`, `chagas`, `aids`) VALUES (" + triagem.getIdDoador() + ",'" + triagem.isAnemia() + "', '" + triagem.isHepatiteB() + "','" + triagem.isSifilis() + "', '" + triagem.isHtlv() + "','" + triagem.isHepatiteC() + "', '" + triagem.isChagas() + "', '" + triagem.isAids() + "');";
        ConexaoMysql banco = new ConexaoMysql();
        return banco.upQuery(query);
    }

    public boolean novaDoacao() {
        return true;
    }

    public int ultimaTriagem(int doador) {
//        ResultSet rs;
//        doador.leDoador();
//        query = "INSERT INTO `doador`(`nome`, `dataNascimento`, `sexo`, `nomeMae`, `nomePai`, `documento`, `endereco`, `bairro`, `numero`, `complemento`) VALUES ('" + doador.getNomeCompleto() + "','" + doador.getDataNascimento() + "', '" + doador.getSexo() + "','" + doador.getNomeMae() + "', '" + doador.getNomePai() + "'," + doador.getDocumento() + ", '" + doador.getEndereco() + "', '" + doador.getBairro() + "'," + doador.getNumero() + ", '" + doador.getComplemento() + "');";
//        ConexaoMysql banco = new ConexaoMysql();
//        return banco.upQuery(query);
        return 1;
    }
}
