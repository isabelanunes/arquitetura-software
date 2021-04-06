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
public class CorrecaoFosforo {
    private double teorFosforoAtingir;
    private FontesFosforo fonteFosforo;
    private double eficienciaFosforo;
    private double valorFonteFosforo;
    private Solo solo;

    public CorrecaoFosforo(double teorFosforoAtingir, FontesFosforo fonteFosforo, double eficienciaFosforo, double valorFonteFosforo, Solo solo) {
        this.teorFosforoAtingir = teorFosforoAtingir;
        this.fonteFosforo = fonteFosforo;
        this.eficienciaFosforo = eficienciaFosforo;
        this.valorFonteFosforo = valorFonteFosforo;
        this.solo = solo;
    }
    
    public double quantidadeAplicarFosforo(){
        double necessidadeAdicionar = this.teorFosforoAtingir - this.solo.getFosforo();
        double quantidadeAplicar = (necessidadeAdicionar * 2 * 2.29) /
                (this.eficienciaFosforo / 100) * (100 / this.fonteFosforo.valorFonteFosforo());
        if (necessidadeAdicionar > 0.01)
            return quantidadeAplicar;
        else
            return 0.0;
    }
    
    public ItemCorrecaoFornece[] correcaoFosforoFornece(){
        return this.fonteFosforo.correcaoFosforoFornece(this);
    }
    
    public double custoAlqueireFosforo(){
        return (this.valorFonteFosforo * this.quantidadeAplicarFosforo()/1000);
    }
    
}
