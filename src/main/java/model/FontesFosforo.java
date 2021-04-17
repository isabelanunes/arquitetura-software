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
            ItemCorrecaoFornece[] itemCorrecaoFornece = new ItemCorrecaoFornece[2];
            itemCorrecaoFornece[0] = new ItemCorrecaoFornece(correcaoElemento.quantidadeAplicarElemento()*0.28, Nutrientes.CALCIO);
            itemCorrecaoFornece[1] = new ItemCorrecaoFornece(correcaoElemento.quantidadeAplicarElemento()*0.1, Nutrientes.ENXOFRE);
            return itemCorrecaoFornece;
        }
        
    },
    SUPERFOSFATO_TRIPLO{
        @Override
        public double valorFonte() {
            return 41.0;
        }
        
        @Override
        public ItemCorrecaoFornece[] correcaoFornece(CorrecaoElemento correcaoElemento){
            ItemCorrecaoFornece[] itemCorrecaoFornece = new ItemCorrecaoFornece[1];
            itemCorrecaoFornece[0] = new ItemCorrecaoFornece(correcaoElemento.quantidadeAplicarElemento()*0.2, Nutrientes.CALCIO);
            return itemCorrecaoFornece;
        }
    },
    MAP{
        @Override
        public double valorFonte() {
            return 48.0;
        }
        
        @Override
        public ItemCorrecaoFornece[] correcaoFornece(CorrecaoElemento correcaoElemento){
            ItemCorrecaoFornece[] itemCorrecaoFornece = new ItemCorrecaoFornece[1];
            itemCorrecaoFornece[0] = new ItemCorrecaoFornece(correcaoElemento.quantidadeAplicarElemento()*0.09, Nutrientes.NITROGENIO);
            return itemCorrecaoFornece;
        }
    },
    DAP{
        @Override
        public double valorFonte() {
            return 45.0;
        }
        
        @Override
        public ItemCorrecaoFornece[] correcaoFornece(CorrecaoElemento correcaoElemento){
            ItemCorrecaoFornece[] itemCorrecaoFornece = new ItemCorrecaoFornece[1];
            itemCorrecaoFornece[0] = new ItemCorrecaoFornece(correcaoElemento.quantidadeAplicarElemento()*0.16, Nutrientes.NITROGENIO);
            return itemCorrecaoFornece;
        }
    },
    YOORIN{
        @Override
        public double valorFonte() {
            return 18.0;
        }
        
        @Override
        public ItemCorrecaoFornece[] correcaoFornece(CorrecaoElemento correcaoElemento){
            ItemCorrecaoFornece[] itemCorrecaoFornece = new ItemCorrecaoFornece[2];
            itemCorrecaoFornece[0] = new ItemCorrecaoFornece(correcaoElemento.quantidadeAplicarElemento()*0.15, Nutrientes.MAGNESIO);
            itemCorrecaoFornece[1] = new ItemCorrecaoFornece(correcaoElemento.quantidadeAplicarElemento()*0.28, Nutrientes.CALCIO);
            return itemCorrecaoFornece;
        }
    },
    FOSFATO_ARAD{
        @Override
        public double valorFonte() {
            return 33.0;
        }
        
        @Override
        public ItemCorrecaoFornece[] correcaoFornece(CorrecaoElemento correcaoElemento){
            ItemCorrecaoFornece[] itemCorrecaoFornece = new ItemCorrecaoFornece[1];
            itemCorrecaoFornece[0] = new ItemCorrecaoFornece(correcaoElemento.quantidadeAplicarElemento()*0.52, Nutrientes.CALCIO);
            return itemCorrecaoFornece;
        }
    },
    FOSFATO_GAFSA{
        @Override
        public double valorFonte() {
            return 29.0;
        }
        
        @Override
        public ItemCorrecaoFornece[] correcaoFornece(CorrecaoElemento correcaoElemento){
            ItemCorrecaoFornece[] itemCorrecaoFornece = new ItemCorrecaoFornece[1];
            itemCorrecaoFornece[0] = new ItemCorrecaoFornece(correcaoElemento.quantidadeAplicarElemento()*0.52, Nutrientes.CALCIO);
            return itemCorrecaoFornece;
        }
    },
    FOSFATO_DAOUI{
        @Override
        public double valorFonte() {
            return 32.0;
        }
        
        @Override
        public ItemCorrecaoFornece[] correcaoFornece(CorrecaoElemento correcaoElemento){
            ItemCorrecaoFornece[] itemCorrecaoFornece = new ItemCorrecaoFornece[1];
            itemCorrecaoFornece[0] = new ItemCorrecaoFornece(correcaoElemento.quantidadeAplicarElemento()*0.45, Nutrientes.CALCIO);
            return itemCorrecaoFornece;
        }
    },
    FOSF_PATOS_MINAS{
        @Override
        public double valorFonte() {
            return 24.0;
        }
        
        @Override
        public ItemCorrecaoFornece[] correcaoFornece(CorrecaoElemento correcaoElemento){
            ItemCorrecaoFornece[] itemCorrecaoFornece = new ItemCorrecaoFornece[1];
            itemCorrecaoFornece[0] = new ItemCorrecaoFornece(correcaoElemento.quantidadeAplicarElemento()*0.28, Nutrientes.CALCIO);
            return itemCorrecaoFornece;
        }
    },
    ESCORIA_THOMAS{
        @Override
        public double valorFonte() {
            return 18.5;
        }
        
        @Override
        public ItemCorrecaoFornece[] correcaoFornece(CorrecaoElemento correcaoElemento){
            ItemCorrecaoFornece[] itemCorrecaoFornece = new ItemCorrecaoFornece[1];
            itemCorrecaoFornece[0] = new ItemCorrecaoFornece(correcaoElemento.quantidadeAplicarElemento()*0.44, Nutrientes.CALCIO);
            return itemCorrecaoFornece;
        }
    },
    ACIDO_FOSFORICO{
        @Override
        public double valorFonte() {
            return 52.0;
        }
        
        @Override
        public ItemCorrecaoFornece[] correcaoFornece(CorrecaoElemento correcaoElemento){
            ItemCorrecaoFornece[] itemCorrecaoFornece = new ItemCorrecaoFornece[1];
            itemCorrecaoFornece[0] = new ItemCorrecaoFornece(0.0, null);
            return itemCorrecaoFornece;
        }
    },
    MULTIF_MAGNESIANO{
        @Override
        public double valorFonte() {
            return 18.0;
        }
        
        @Override
        public ItemCorrecaoFornece[] correcaoFornece(CorrecaoElemento correcaoElemento){
            ItemCorrecaoFornece[] itemCorrecaoFornece = new ItemCorrecaoFornece[2];
            itemCorrecaoFornece[0] = new ItemCorrecaoFornece(correcaoElemento.quantidadeAplicarElemento()*0.11, Nutrientes.ENXOFRE);
            itemCorrecaoFornece[1] = new ItemCorrecaoFornece(correcaoElemento.quantidadeAplicarElemento()*0.18, Nutrientes.CALCIO);
            return itemCorrecaoFornece;
        }
    };
}
