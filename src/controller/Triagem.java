/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

/**
 *
 * @author leo_m
 */
public class Triagem {
    private int idDoador;
    private boolean anemia;
    private boolean hepatiteB;
    private boolean hepatiteC;
    private boolean sifilis;
    private boolean aids;
    private boolean chagas;
    private boolean htlv;

    
    public void leTriagem(){
        System.out.println(anemia);
        System.out.println(hepatiteB);
        System.out.println(hepatiteC);
        System.out.println(sifilis);
        System.out.println(aids);
        System.out.println(chagas);
        System.out.println(htlv);
    }
    
    public boolean liberacao(){
        return !(anemia && hepatiteB && hepatiteC && sifilis && aids && chagas && htlv);
    }
    
    
    /**
     * @return the anemia
     */
    public boolean isAnemia() {
        return anemia;
    }

    /**
     * @param anemia the anemia to set
     */
    public void setAnemia(boolean anemia) {
        this.anemia = anemia;
    }

    /**
     * @return the hepatiteB
     */
    public boolean isHepatiteB() {
        return hepatiteB;
    }

    /**
     * @param hepatiteB the hepatiteB to set
     */
    public void setHepatiteB(boolean hepatiteB) {
        this.hepatiteB = hepatiteB;
    }

    /**
     * @return the hepatiteC
     */
    public boolean isHepatiteC() {
        return hepatiteC;
    }

    /**
     * @param hepatiteC the hepatiteC to set
     */
    public void setHepatiteC(boolean hepatiteC) {
        this.hepatiteC = hepatiteC;
    }

    /**
     * @return the sifilis
     */
    public boolean isSifilis() {
        return sifilis;
    }

    /**
     * @param sifilis the sifilis to set
     */
    public void setSifilis(boolean sifilis) {
        this.sifilis = sifilis;
    }

    /**
     * @return the aids
     */
    public boolean isAids() {
        return aids;
    }

    /**
     * @param aids the aids to set
     */
    public void setAids(boolean aids) {
        this.aids = aids;
    }

    /**
     * @return the chagas
     */
    public boolean isChagas() {
        return chagas;
    }

    /**
     * @param chagas the chagas to set
     */
    public void setChagas(boolean chagas) {
        this.chagas = chagas;
    }

    /**
     * @return the htlv
     */
    public boolean isHtlv() {
        return htlv;
    }

    /**
     * @param htlv the htlv to set
     */
    public void setHtlv(boolean htlv) {
        this.htlv = htlv;
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

}
