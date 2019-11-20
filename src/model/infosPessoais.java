/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author leo_m
 */
public class infosPessoais {
    private int idDoador;
    private String nomeCompleto;
    private String nomeMae;
    private String nomePai;
    private String documento;
    private String endereco;
    private String bairro;
    private Integer numero;
    private String complemento;
    private Date dataNascimento;
    private String query;

    void getInfosPessoais(String documento) throws SQLException {
        ResultSet rs;
        query = "SELECT * FROM doador WHERE doador.documento = " + documento;
        ConexaoMysql banco = new ConexaoMysql();
        rs = banco.exQuery(query);
        while (rs.next()) {
            this.idDoador = Integer.parseInt(rs.getString("idDoador")) ;
            this.nomeCompleto = rs.getString("nome");
            System.out.println(nomeCompleto);
        }

    }
}
