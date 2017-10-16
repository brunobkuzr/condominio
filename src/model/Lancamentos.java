/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Lucas_Reinert
 */
public class Lancamentos {
    private String referencia;
    private String serie;
    private float valor;
    private int tipoRateio;

    public Lancamentos() {
    }

    public String getReferencia() {
        return referencia;
    }

    public void setReferencia(String referencia) {
        this.referencia = referencia;
    }

    public String getSerie() {
        return serie;
    }

    public void setSerie(String serie) {
        this.serie = serie;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    public int getTipoRateio() {
        return tipoRateio;
    }

    public void setTipoRateio(int tipoRateio) {
        this.tipoRateio = tipoRateio;
    }
    
    
}
