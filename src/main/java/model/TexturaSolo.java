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

/*  Essa classe enum foi baseada no c�digo de Gabriel Costa Silva: 
    <https://github.com/gabrielcostasilva/sa-soilcorrection> */

public enum TexturaSolo {
    
    ARGILOSO{
        public Solo getValoresIdeais() {
            return new Solo(9.0, 0.35, 6.0, 1.5, 9.0, 0.0, 0.0);
        }
    },
    TEXTURA_MEDIA{
         public Solo getValoresIdeais() {
            return new Solo(12.0, 0.25, 3.0, 1.0, 6.0, 0.0, 0.0);
        }
    };
    
    public abstract Solo getValoresIdeais();

}
