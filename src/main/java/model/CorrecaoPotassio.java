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
    
    public double valorFontePotassio(FontesPotassio fontesPotassio){
        switch(fontesPotassio){
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
                    / this.valorFontePotassio(this.fontePotassio);
    }
    
    public ItemCorrecaoFornece[] correcaoPotassioFornece(){
        ItemCorrecaoFornece[] itemCorrecaoFornece = new ItemCorrecaoFornece[2];
        switch (this.fontePotassio){
            case SULFATO_POTASSIO:
                itemCorrecaoFornece[0] = new ItemCorrecaoFornece(this.quantidadeAplicarPotassio()*0.17, Nutrientes.ENXOFRE);
                return itemCorrecaoFornece;
            case SULFATO_POTASSIO_MAGNESIO:
                itemCorrecaoFornece[0] = new ItemCorrecaoFornece(this.quantidadeAplicarPotassio()*0.22, Nutrientes.ENXOFRE);
                itemCorrecaoFornece[1] = new ItemCorrecaoFornece(this.quantidadeAplicarPotassio()*0.18, Nutrientes.MAGNESIO);
                return itemCorrecaoFornece;
            default:
                return null;
        }        
    }
        
    public double custoAlqueirePotassio(){
        return (this.valorFontePotassio * this.quantidadeAplicarPotassio()/1000);
    }
    
}

