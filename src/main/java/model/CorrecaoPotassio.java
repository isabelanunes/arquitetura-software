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
public class CorrecaoPotassio extends CorrecaoElemento{
    private final double participacaoPotassioDesejada;
    
    public CorrecaoPotassio(double valorFonteElemento, Solo solo, FontesElementos fonte, double participacaoPotassioDesejada) {
        super(valorFonteElemento, solo, fonte);
        this.participacaoPotassioDesejada = participacaoPotassioDesejada;
    }
    
    public double participacaoPotassioAtual(){
        double participacao = this.solo.getPotassio() / (this.solo.getCalcio() + this.solo.getMagnesio() + this.solo.getPotassio() + this.solo.getAcidez())*100;
        return participacao;
    }
    
    public double participacaoPotassioPercentualIdeal(){
        return 3.0;
    }
    
    public double participacaoPotassioCorrecao(){
        return this.participacaoPotassioDesejada > 0.001 ?  this.participacaoPotassioDesejada : 0.0;
    }
    
    @Override
    public double quantidadeAplicarElemento(){
        double necessidadeAdicionar = solo.getPotassio()* this.participacaoPotassioDesejada/this.participacaoPotassioAtual() - this.solo.getPotassio();
        double quantidadeAplicar = necessidadeAdicionar * 110400 / fonte.getValorFonte();
        return necessidadeAdicionar > 0.01 ? quantidadeAplicar : 0.0;
    }
    
    
}

