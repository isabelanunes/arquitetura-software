/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Isabela Nunes
 */
public class CorrecaoPotassio {
    private double participacaoPotassioDesejada;
    private Solo solo;
    private FontesPotassio fontePotassio;
    private double valorFontePotassio;

    public CorrecaoPotassio(double participacaoPotassioDesejada, Solo solo, FontesPotassio fontePotassio, double valorFontePotassio) {
        this.participacaoPotassioDesejada = participacaoPotassioDesejada;
        this.solo = solo;
        this.fontePotassio = fontePotassio;
        this.valorFontePotassio = valorFontePotassio;
    }
    
    public double participacaoPotassioAtual(){
        double participacao = this.solo.getPotassio() / 
               (this.solo.getCalcio() + this.solo.getMagnesio() + this.solo.getPotassio()
                + this.solo.getAcidez())*100;
        return participacao;
    }
    
    public double participacaoPotassioPercentualIdeal(){
        return 3.0;
    }
    
    public double participacaoPotassioCorrecao(){
     if(this.participacaoPotassioDesejada > 0.001)
            return this.participacaoPotassioDesejada;
        else
            return 0.0;
    }
    
    public double valorFontePotassio(){
        switch(this.fontePotassio){
            case CLORETO_POTASSIO:
                return 58.0;
            case SULFATO_POTASSIO:
                return 52.0;
            case SULFATO_POTASSIO_MAGNESIO:
                return 22.0;
            default:
                return 0.0;
        }
    }
    
    public double quantidadeAplicarPotassio(){
        double necessidadeAdicionar = this.solo.getPotassio()*
                this.participacaoPotassioDesejada/this.participacaoPotassioAtual()
                - this.solo.getPotassio();
        if(necessidadeAdicionar<0.01)
            return 0.0;
        else
            return necessidadeAdicionar * 39.1 * 10 * 2 * 1.2 * 100 / 0.85 /100 *100 
                    / this.valorFontePotassio();
    }
    
    public ItemCorrecaoFornece correcaoPotassioFornece1(){
        double valorItem = 0;
        switch (this.fontePotassio){
            case SULFATO_POTASSIO:
                valorItem = this.quantidadeAplicarPotassio()*0.17;
                return new ItemCorrecaoFornece(valorItem, Nutrientes.ENXOFRE);
            case SULFATO_POTASSIO_MAGNESIO:
                valorItem = this.quantidadeAplicarPotassio()*0.22;
                return new ItemCorrecaoFornece(valorItem, Nutrientes.ENXOFRE);
            default:
                return null;
        }        
    }
    
    public ItemCorrecaoFornece correcaoPotassioFornece2(){
        double valorItem;
        switch (this.fontePotassio){
            case SULFATO_POTASSIO_MAGNESIO:
                valorItem = this.quantidadeAplicarPotassio()*0.18;
                return new ItemCorrecaoFornece(valorItem, Nutrientes.MAGNESIO);
            default:
                return null;
        }        
    } 
    
    public double custoAlqueirePotassio(){
        return (this.valorFontePotassio * this.quantidadeAplicarPotassio()/1000);
    }
    
}

