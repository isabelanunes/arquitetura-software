/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.text.DecimalFormat;

/**
 *
 * @author Isabela Nunes
 */
public class CorrecaoFosforo implements CorrecaoElemento{
    private final double teorFosforoAtingir;
    private final FontesFosforo fonteFosforo;
    private final double eficienciaFosforo;
    private final double valorFonteFosforo;
    private final Solo solo;

    public CorrecaoFosforo(double teorFosforoAtingir, FontesFosforo fonteFosforo, double eficienciaFosforo, double valorFonteFosforo, Solo solo) {
        this.teorFosforoAtingir = teorFosforoAtingir;
        this.fonteFosforo = fonteFosforo;
        this.eficienciaFosforo = eficienciaFosforo;
        this.valorFonteFosforo = valorFonteFosforo;
        this.solo = solo;
    }
    
    @Override
    public double quantidadeAplicarElemento(){
        double necessidadeAdicionar = this.teorFosforoAtingir - this.solo.getFosforo();
        double quantidadeAplicar = (necessidadeAdicionar * 2 * 2.29) / (this.eficienciaFosforo / 100) * (100 / this.fonteFosforo.valorFonte());
        return necessidadeAdicionar > 0.01 ? quantidadeAplicar : 0.0;
    }
    
    @Override
    public ItemCorrecaoFornece[] correcaoElemento(){
        return this.fonteFosforo.correcaoFornece(this);
    }
    
    @Override
    public double calcularCustoAlqueire(){
        return (this.valorFonteFosforo * this.quantidadeAplicarElemento()/1000);
    }
    
}
