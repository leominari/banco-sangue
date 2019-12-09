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
import java.text.DateFormat;
import java.util.Date;

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
        doador.leDoador();
        query = "INSERT INTO `doador`(`nome`, `dataNascimento`, `sexo`, `nomeMae`, `nomePai`, `documento`, `endereco`, `bairro`, `numero`, `complemento`) VALUES ('" + doador.getNomeCompleto() + "','" + doador.getDataNascimento() + "', '" + doador.getSexo() + "','" + doador.getNomeMae() + "', '" + doador.getNomePai() + "','" + doador.getDocumento() + "', '" + doador.getEndereco() + "', '" + doador.getBairro() + "'," + doador.getNumero() + ", '" + doador.getComplemento() + "');";
        ConexaoMysql banco = new ConexaoMysql();
        return banco.upQuery(query);
    }

    public boolean novaTriagem(Triagem triagem) {
        query = "INSERT INTO `triagem`(`idDoador`,`anemia`, `hepatiteb`, `sifilis`, `htlv`, `hepatitec`, `chagas`, `aids`) VALUES (" + triagem.getIdDoador() + ",'" + triagem.isAnemia() + "', '" + triagem.isHepatiteB() + "','" + triagem.isSifilis() + "', '" + triagem.isHtlv() + "','" + triagem.isHepatiteC() + "', '" + triagem.isChagas() + "', '" + triagem.isAids() + "');";
        ConexaoMysql banco = new ConexaoMysql();
        return banco.upQuery(query);
    }

    public boolean novaDoacao(Doador doador) {
        Date dia = new Date();
        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        String datual = dateFormat.format(dia);
        query = "INSERT INTO doacoes(idDoador, dataDoacao, idTriagem) VALUES (" + doador.getIdDoador() + ",'" + datual + "',(SELECT idTriagem FROM triagem WHERE triagem.idDoador = " + doador.getIdDoador() + " order by triagem.idTriagem desc limit 1));";
        ConexaoMysql banco = new ConexaoMysql();
        return banco.upQuery(query);
    }

    public String ultimaDoacao(int idDoador) throws SQLException {
        ResultSet rs;
        String data = "0000-00-00";
        query = "SELECT dataDoacao FROM `doacoes` WHERE doacoes.idDoador = " + idDoador + " order by doacoes.idDoacoes desc limit 1";
        ConexaoMysql banco = new ConexaoMysql();
        rs = banco.exQuery(query);
        if (rs.next()) {
            data = rs.getString("dataDoacao");
        }
        return data;
    }
}
