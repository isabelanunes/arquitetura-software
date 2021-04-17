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
            return new ItemCorrecaoFornece[]{new ItemCorrecaoFornece(correcaoElemento.quantidadeAplicarElemento()*0.17, Nutrientes.ENXOFRE)};
        }
    },
    SULFATO_POTASSIO_MAGNESIO{
        @Override
        public double valorFonte() {
            return 22.0;
        }
        
        @Override
        public ItemCorrecaoFornece[] correcaoFornece(CorrecaoElemento correcaoElemento){
            return new ItemCorrecaoFornece[] {new ItemCorrecaoFornece(correcaoElemento.quantidadeAplicarElemento()*0.22, Nutrientes.ENXOFRE),
                   new ItemCorrecaoFornece(correcaoElemento.quantidadeAplicarElemento()*0.18, Nutrientes.MAGNESIO)};
        }
    };    
}
