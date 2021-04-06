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
public enum FontesFosforo {
    SUPERFOSFATO_SIMPLES{
        public double valorFonteFosforo() {
            return 18.0;
        }
        
        public ItemCorrecaoFornece[] correcaoFosforoFornece(CorrecaoFosforo correcaoFosforo){
            ItemCorrecaoFornece[] itemCorrecaoFornece = new ItemCorrecaoFornece[2];
            itemCorrecaoFornece[0] = new ItemCorrecaoFornece(correcaoFosforo.quantidadeAplicarFosforo()*0.28, Nutrientes.CALCIO);
            itemCorrecaoFornece[1] = new ItemCorrecaoFornece(correcaoFosforo.quantidadeAplicarFosforo()*0.1, Nutrientes.ENXOFRE);
            return itemCorrecaoFornece;
        }
        
    },
    SUPERFOSFATO_TRIPLO{
        public double valorFonteFosforo() {
            return 41.0;
        }
        
        public ItemCorrecaoFornece[] correcaoFosforoFornece(CorrecaoFosforo correcaoFosforo){
            ItemCorrecaoFornece[] itemCorrecaoFornece = new ItemCorrecaoFornece[1];
            itemCorrecaoFornece[0] = new ItemCorrecaoFornece(correcaoFosforo.quantidadeAplicarFosforo()*0.2, Nutrientes.CALCIO);
            return itemCorrecaoFornece;
        }
    },
    MAP{
        public double valorFonteFosforo() {
            return 48.0;
        }
        
        public ItemCorrecaoFornece[] correcaoFosforoFornece(CorrecaoFosforo correcaoFosforo){
            ItemCorrecaoFornece[] itemCorrecaoFornece = new ItemCorrecaoFornece[1];
            itemCorrecaoFornece[0] = new ItemCorrecaoFornece(correcaoFosforo.quantidadeAplicarFosforo()*0.09, Nutrientes.NITROGENIO);
            return itemCorrecaoFornece;
        }
    },
    DAP{
        public double valorFonteFosforo() {
            return 45.0;
        }
        
        public ItemCorrecaoFornece[] correcaoFosforoFornece(CorrecaoFosforo correcaoFosforo){
            ItemCorrecaoFornece[] itemCorrecaoFornece = new ItemCorrecaoFornece[1];
            itemCorrecaoFornece[0] = new ItemCorrecaoFornece(correcaoFosforo.quantidadeAplicarFosforo()*0.16, Nutrientes.NITROGENIO);
            return itemCorrecaoFornece;
        }
    },
    YOORIN{
        public double valorFonteFosforo() {
            return 18.0;
        }
        
        public ItemCorrecaoFornece[] correcaoFosforoFornece(CorrecaoFosforo correcaoFosforo){
            ItemCorrecaoFornece[] itemCorrecaoFornece = new ItemCorrecaoFornece[2];
            itemCorrecaoFornece[0] = new ItemCorrecaoFornece(correcaoFosforo.quantidadeAplicarFosforo()*0.15, Nutrientes.MAGNESIO);
            itemCorrecaoFornece[1] = new ItemCorrecaoFornece(correcaoFosforo.quantidadeAplicarFosforo()*0.28, Nutrientes.CALCIO);
            return itemCorrecaoFornece;
        }
    },
    FOSFATO_ARAD{
        public double valorFonteFosforo() {
            return 33.0;
        }
        
        public ItemCorrecaoFornece[] correcaoFosforoFornece(CorrecaoFosforo correcaoFosforo){
            ItemCorrecaoFornece[] itemCorrecaoFornece = new ItemCorrecaoFornece[1];
            itemCorrecaoFornece[0] = new ItemCorrecaoFornece(correcaoFosforo.quantidadeAplicarFosforo()*0.52, Nutrientes.CALCIO);
            return itemCorrecaoFornece;
        }
    },
    FOSFATO_GAFSA{
        public double valorFonteFosforo() {
            return 29.0;
        }
        
        public ItemCorrecaoFornece[] correcaoFosforoFornece(CorrecaoFosforo correcaoFosforo){
            ItemCorrecaoFornece[] itemCorrecaoFornece = new ItemCorrecaoFornece[1];
            itemCorrecaoFornece[0] = new ItemCorrecaoFornece(correcaoFosforo.quantidadeAplicarFosforo()*0.52, Nutrientes.CALCIO);
            return itemCorrecaoFornece;
        }
    },
    FOSFATO_DAOUI{
        public double valorFonteFosforo() {
            return 32.0;
        }
        
        public ItemCorrecaoFornece[] correcaoFosforoFornece(CorrecaoFosforo correcaoFosforo){
            ItemCorrecaoFornece[] itemCorrecaoFornece = new ItemCorrecaoFornece[1];
            itemCorrecaoFornece[0] = new ItemCorrecaoFornece(correcaoFosforo.quantidadeAplicarFosforo()*0.45, Nutrientes.CALCIO);
            return itemCorrecaoFornece;
        }
    },
    FOSF_PATOS_MINAS{
        public double valorFonteFosforo() {
            return 24.0;
        }
        
        public ItemCorrecaoFornece[] correcaoFosforoFornece(CorrecaoFosforo correcaoFosforo){
            ItemCorrecaoFornece[] itemCorrecaoFornece = new ItemCorrecaoFornece[1];
            itemCorrecaoFornece[0] = new ItemCorrecaoFornece(correcaoFosforo.quantidadeAplicarFosforo()*0.28, Nutrientes.CALCIO);
            return itemCorrecaoFornece;
        }
    },
    ESCORIA_THOMAS{
        public double valorFonteFosforo() {
            return 18.5;
        }
        
        public ItemCorrecaoFornece[] correcaoFosforoFornece(CorrecaoFosforo correcaoFosforo){
            ItemCorrecaoFornece[] itemCorrecaoFornece = new ItemCorrecaoFornece[1];
            itemCorrecaoFornece[0] = new ItemCorrecaoFornece(correcaoFosforo.quantidadeAplicarFosforo()*0.44, Nutrientes.CALCIO);
            return itemCorrecaoFornece;
        }
    },
    ACIDO_FOSFORICO{
        public double valorFonteFosforo() {
            return 52.0;
        }
        
        public ItemCorrecaoFornece[] correcaoFosforoFornece(CorrecaoFosforo correcaoFosforo){
            ItemCorrecaoFornece[] itemCorrecaoFornece = new ItemCorrecaoFornece[1];
            itemCorrecaoFornece[0] = new ItemCorrecaoFornece(0.0, null);
            return itemCorrecaoFornece;
        }
    },
    MULTIF_MAGNESIANO{
        public double valorFonteFosforo() {
            return 18.0;
        }
        
        public ItemCorrecaoFornece[] correcaoFosforoFornece(CorrecaoFosforo correcaoFosforo){
            ItemCorrecaoFornece[] itemCorrecaoFornece = new ItemCorrecaoFornece[2];
            itemCorrecaoFornece[0] = new ItemCorrecaoFornece(correcaoFosforo.quantidadeAplicarFosforo()*0.11, Nutrientes.ENXOFRE);
            itemCorrecaoFornece[1] = new ItemCorrecaoFornece(correcaoFosforo.quantidadeAplicarFosforo()*0.18, Nutrientes.CALCIO);
            return itemCorrecaoFornece;
        }
    };
    
    public abstract double valorFonteFosforo();
    public abstract ItemCorrecaoFornece[] correcaoFosforoFornece(CorrecaoFosforo correcaoFosforo);

}
