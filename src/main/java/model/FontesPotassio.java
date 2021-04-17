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
public enum FontesPotassio implements FontesElementos {
    CLORETO_POTASSIO{
        @Override
        public double valorFonte() {
            return 58.0;
        }
        
        @Override
        public ItemCorrecaoFornece[] correcaoFornece(CorrecaoElemento correcaoElemento){
            return null;
        }
    },
    SULFATO_POTASSIO{
        @Override
        public double valorFonte() {
            return 52.0;
        }
        
        @Override
        public ItemCorrecaoFornece[] correcaoFornece(CorrecaoElemento correcaoElemento){
            ItemCorrecaoFornece[] itemCorrecaoFornece = new ItemCorrecaoFornece[1];
            itemCorrecaoFornece[0] = new ItemCorrecaoFornece(correcaoElemento.quantidadeAplicarElemento()*0.17, Nutrientes.ENXOFRE);
            return itemCorrecaoFornece;
        }
    },
    SULFATO_POTASSIO_MAGNESIO{
        @Override
        public double valorFonte() {
            return 22.0;
        }
        
        @Override
        public ItemCorrecaoFornece[] correcaoFornece(CorrecaoElemento correcaoElemento){
            ItemCorrecaoFornece[] itemCorrecaoFornece = new ItemCorrecaoFornece[2];
            itemCorrecaoFornece[0] = new ItemCorrecaoFornece(correcaoElemento.quantidadeAplicarElemento()*0.22, Nutrientes.ENXOFRE);
            itemCorrecaoFornece[1] = new ItemCorrecaoFornece(correcaoElemento.quantidadeAplicarElemento()*0.18, Nutrientes.MAGNESIO);
            return itemCorrecaoFornece;
        }
    };    
}
