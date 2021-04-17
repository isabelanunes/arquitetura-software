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
public enum FontesFosforo implements FontesElementos{
    SUPERFOSFATO_SIMPLES{
        @Override
        public double valorFonte() {
            return 18.0;
        }
        
        @Override
        public ItemCorrecaoFornece[] correcaoFornece(CorrecaoElemento correcaoElemento){
            return new ItemCorrecaoFornece[] {new ItemCorrecaoFornece(correcaoElemento.quantidadeAplicarElemento()*0.28, Nutrientes.CALCIO),
                   new ItemCorrecaoFornece(correcaoElemento.quantidadeAplicarElemento()*0.1, Nutrientes.ENXOFRE)};
        }
        
    },
    SUPERFOSFATO_TRIPLO{
        @Override
        public double valorFonte() {
            return 41.0;
        }
        
        @Override
        public ItemCorrecaoFornece[] correcaoFornece(CorrecaoElemento correcaoElemento){
            return new ItemCorrecaoFornece[] {new ItemCorrecaoFornece(correcaoElemento.quantidadeAplicarElemento()*0.2, Nutrientes.CALCIO)};
        }
    },
    MAP{
        @Override
        public double valorFonte() {
            return 48.0;
        }
        
        @Override
        public ItemCorrecaoFornece[] correcaoFornece(CorrecaoElemento correcaoElemento){
            return new ItemCorrecaoFornece[] {new ItemCorrecaoFornece(correcaoElemento.quantidadeAplicarElemento()*0.09, Nutrientes.NITROGENIO)};
        }
    },
    DAP{
        @Override
        public double valorFonte() {
            return 45.0;
        }
        
        @Override
        public ItemCorrecaoFornece[] correcaoFornece(CorrecaoElemento correcaoElemento){
            return new ItemCorrecaoFornece[] { new ItemCorrecaoFornece(correcaoElemento.quantidadeAplicarElemento()*0.16, Nutrientes.NITROGENIO)};
        }
    },
    YOORIN{
        @Override
        public double valorFonte() {
            return 18.0;
        }
        
        @Override
        public ItemCorrecaoFornece[] correcaoFornece(CorrecaoElemento correcaoElemento){
            return new ItemCorrecaoFornece[] {new ItemCorrecaoFornece(correcaoElemento.quantidadeAplicarElemento()*0.15, Nutrientes.MAGNESIO),
                   new ItemCorrecaoFornece(correcaoElemento.quantidadeAplicarElemento()*0.28, Nutrientes.CALCIO)};
        }
    },
    FOSFATO_ARAD{
        @Override
        public double valorFonte() {
            return 33.0;
        }
        
        @Override
        public ItemCorrecaoFornece[] correcaoFornece(CorrecaoElemento correcaoElemento){
            return new ItemCorrecaoFornece[] {new ItemCorrecaoFornece(correcaoElemento.quantidadeAplicarElemento()*0.52, Nutrientes.CALCIO)};
        }
    },
    FOSFATO_GAFSA{
        @Override
        public double valorFonte() {
            return 29.0;
        }
        
        @Override
        public ItemCorrecaoFornece[] correcaoFornece(CorrecaoElemento correcaoElemento){
            return new ItemCorrecaoFornece[] {new ItemCorrecaoFornece(correcaoElemento.quantidadeAplicarElemento()*0.52, Nutrientes.CALCIO)};
        }
    },
    FOSFATO_DAOUI{
        @Override
        public double valorFonte() {
            return 32.0;
        }
        
        @Override
        public ItemCorrecaoFornece[] correcaoFornece(CorrecaoElemento correcaoElemento){
            return new ItemCorrecaoFornece[] {new ItemCorrecaoFornece(correcaoElemento.quantidadeAplicarElemento()*0.45, Nutrientes.CALCIO)};
        }
    },
    FOSF_PATOS_MINAS{
        @Override
        public double valorFonte() {
            return 24.0;
        }
        
        @Override
        public ItemCorrecaoFornece[] correcaoFornece(CorrecaoElemento correcaoElemento){
            return  new ItemCorrecaoFornece[] {new ItemCorrecaoFornece(correcaoElemento.quantidadeAplicarElemento()*0.28, Nutrientes.CALCIO)};
        }
    },
    ESCORIA_THOMAS{
        @Override
        public double valorFonte() {
            return 18.5;
        }
        
        @Override
        public ItemCorrecaoFornece[] correcaoFornece(CorrecaoElemento correcaoElemento){
            return new ItemCorrecaoFornece[] {new ItemCorrecaoFornece(correcaoElemento.quantidadeAplicarElemento()*0.44, Nutrientes.CALCIO)};
        }
    },
    ACIDO_FOSFORICO{
        @Override
        public double valorFonte() {
            return 52.0;
        }
        
        @Override
        public ItemCorrecaoFornece[] correcaoFornece(CorrecaoElemento correcaoElemento){
            return new ItemCorrecaoFornece[] {new ItemCorrecaoFornece(0.0, null)};
        }
    },
    MULTIF_MAGNESIANO{
        @Override
        public double valorFonte() {
            return 18.0;
        }
        
        @Override
        public ItemCorrecaoFornece[] correcaoFornece(CorrecaoElemento correcaoElemento){
            return new ItemCorrecaoFornece[]{new ItemCorrecaoFornece(correcaoElemento.quantidadeAplicarElemento()*0.11, Nutrientes.ENXOFRE),
                   new ItemCorrecaoFornece(correcaoElemento.quantidadeAplicarElemento()*0.18, Nutrientes.CALCIO)};
        }
    };
}
