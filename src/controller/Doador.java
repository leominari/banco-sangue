/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;


import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;
import javax.swing.JOptionPane;
import model.Querys;

/**
 *
 * @author leo_m
 */
public class Doador {

    private int idDoador;
    private String nomeCompleto;
    private String nomeMae;
    private String nomePai;
    private String documento;
    private String endereco;
    private String bairro;
    private Integer numero;
    private String complemento;
    private String dataNascimento;
    private String sexo;

    public void leDoador(){
        System.out.println(nomeCompleto);
        System.out.println(nomeMae);
        System.out.println(nomePai);
        System.out.println(documento);
        System.out.println(endereco);
        System.out.println(bairro);
        System.out.println(numero);
        System.out.println(complemento);
        System.out.println(dataNascimento);
        System.out.println(sexo);
    }
    
    public boolean getDados(String documento) throws SQLException {
        Querys dados = new Querys();
        ResultSet rs = dados.doador(documento);
        if (!rs.wasNull() && rs.next()) {
            this.idDoador = Integer.parseInt(rs.getString("idDoador"));
            this.nomeCompleto = rs.getString("nome");
            this.nomeMae = rs.getString("nomeMae");
            this.nomePai = rs.getString("nomePai");
            this.documento = rs.getString("documento");
            this.endereco = rs.getString("endereco");
            this.bairro = rs.getString("bairro");
            this.numero = Integer.parseInt(rs.getString("numero"));
            this.complemento = rs.getString("complemento");
            this.dataNascimento = rs.getString("dataNascimento");
            this.setSexo(rs.getString("sexo"));
            return true;
        } else {
            JOptionPane.showMessageDialog(null, "Doador nao encontrado, indo para pagina de cadastro.");
            return false;
        }
    }

    /**
     * @return the idDoador
     */
    public int getIdDoador() {
        return idDoador;
    }

    /**
     * @param idDoador the idDoador to set
     */
    public void setIdDoador(int idDoador) {
        this.idDoador = idDoador;
    }

    /**
     * @return the nomeCompleto
     */
    public String getNomeCompleto() {
        return nomeCompleto;
    }

    /**
     * @param nomeCompleto the nomeCompleto to set
     */
    public void setNomeCompleto(String nomeCompleto) {
        this.nomeCompleto = nomeCompleto;
    }

    /**
     * @return the nomeMae
     */
    public String getNomeMae() {
        return nomeMae;
    }

    /**
     * @param nomeMae the nomeMae to set
     */
    public void setNomeMae(String nomeMae) {
        this.nomeMae = nomeMae;
    }

    /**
     * @return the nomePai
     */
    public String getNomePai() {
        return nomePai;
    }

    /**
     * @param nomePai the nomePai to set
     */
    public void setNomePai(String nomePai) {
        this.nomePai = nomePai;
    }

    /**
     * @return the documento
     */
    public String getDocumento() {
        return documento;
    }

    /**
     * @param documento the documento to set
     */
    public void setDocumento(String documento) {
        this.documento = documento;
    }

    /**
     * @return the endereco
     */
    public String getEndereco() {
        return endereco;
    }

    /**
     * @param endereco the endereco to set
     */
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    /**
     * @return the bairro
     */
    public String getBairro() {
        return bairro;
    }

    /**
     * @param bairro the bairro to set
     */
    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    /**
     * @return the numero
     */
    public Integer getNumero() {
        return numero;
    }

    /**
     * @param numero the numero to set
     */
    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    /**
     * @return the complemento
     */
    public String getComplemento() {
        return complemento;
    }

    /**
     * @param complemento the complemento to set
     */
    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    /**
     * @return the dataNascimento
     */
    public String getDataNascimento() {
        return dataNascimento;
    }

    /**
     * @param dataNascimento the dataNascimento to set
     */
    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    /**
     * @return the sexo
     */
    public String getSexo() {
        return sexo;
    }

    /**
     * @param sexo the sexo to set
     */
    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

}
