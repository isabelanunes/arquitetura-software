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
public enum FontesPotassio {
    CLORETO_POTASSIO{
        public double valorFontePotassio() {
            return 58.0;
        }
        
        public ItemCorrecaoFornece[] correcaoPotassioFornece(CorrecaoPotassio correcaoPotassio){
            return null;
        }
    },
    SULFATO_POTASSIO{
        public double valorFontePotassio() {
            return 52.0;
        }
        
        public ItemCorrecaoFornece[] correcaoPotassioFornece(CorrecaoPotassio correcaoPotassio){
            ItemCorrecaoFornece[] itemCorrecaoFornece = new ItemCorrecaoFornece[1];
            itemCorrecaoFornece[0] = new ItemCorrecaoFornece(correcaoPotassio.quantidadeAplicarPotassio()*0.17, Nutrientes.ENXOFRE);
            return itemCorrecaoFornece;
        }
    },
    SULFATO_POTASSIO_MAGNESIO{
        public double valorFontePotassio() {
            return 22.0;
        }
        
        public ItemCorrecaoFornece[] correcaoPotassioFornece(CorrecaoPotassio correcaoPotassio){
            ItemCorrecaoFornece[] itemCorrecaoFornece = new ItemCorrecaoFornece[2];
            itemCorrecaoFornece[0] = new ItemCorrecaoFornece(correcaoPotassio.quantidadeAplicarPotassio()*0.22, Nutrientes.ENXOFRE);
            itemCorrecaoFornece[1] = new ItemCorrecaoFornece(correcaoPotassio.quantidadeAplicarPotassio()*0.18, Nutrientes.MAGNESIO);
            return itemCorrecaoFornece;
        }
    };
    
    public abstract double valorFontePotassio();
    public abstract ItemCorrecaoFornece[] correcaoPotassioFornece(CorrecaoPotassio correcaoPotassio);
}
