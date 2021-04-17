import model.Solo;
import model.TexturaSolo;
import org.junit.Assert;
import org.junit.Test;

public class SoloTest{

    @Test
    public void testeValoresIdeaisSoloArgiloso() {
        Solo solo = new Solo(9.0, 0.35, 6.0, 1.5, 9.0, 0.0, 0.0);
        Assert.assertEquals(solo.getFosforo(), TexturaSolo.ARGILOSO.getValoresIdeais().getFosforo(), 0.0);
        Assert.assertEquals(solo.getPotassio(), TexturaSolo.ARGILOSO.getValoresIdeais().getPotassio(), 0.0);
        Assert.assertEquals(solo.getCalcio(), TexturaSolo.ARGILOSO.getValoresIdeais().getCalcio(), 0.0);
        Assert.assertEquals(solo.getMagnesio(), TexturaSolo.ARGILOSO.getValoresIdeais().getMagnesio(), 0.0);
        Assert.assertEquals(solo.getEnxofre(), TexturaSolo.ARGILOSO.getValoresIdeais().getEnxofre(), 0.0);
        Assert.assertEquals(solo.getAluminio(), TexturaSolo.ARGILOSO.getValoresIdeais().getAluminio(), 0.0); 
        Assert.assertEquals(solo.getAcidez(), TexturaSolo.ARGILOSO.getValoresIdeais().getAcidez(), 0.0); 
    }
    
    @Test
    public void testeValoresIdeaisSoloTexturaMedia() {
        Solo solo = new Solo(12.0, 0.25, 3.0, 1.0, 6.0, 0.0, 0.0);
        Assert.assertEquals(solo.getFosforo(), TexturaSolo.TEXTURA_MEDIA.getValoresIdeais().getFosforo(), 0.0);
        Assert.assertEquals(solo.getPotassio(), TexturaSolo.TEXTURA_MEDIA.getValoresIdeais().getPotassio(), 0.0);
        Assert.assertEquals(solo.getCalcio(), TexturaSolo.TEXTURA_MEDIA.getValoresIdeais().getCalcio(), 0.0);
        Assert.assertEquals(solo.getMagnesio(), TexturaSolo.TEXTURA_MEDIA.getValoresIdeais().getMagnesio(), 0.0);
        Assert.assertEquals(solo.getEnxofre(), TexturaSolo.TEXTURA_MEDIA.getValoresIdeais().getEnxofre(), 0.0);
        Assert.assertEquals(solo.getAluminio(), TexturaSolo.TEXTURA_MEDIA.getValoresIdeais().getAluminio(), 0.0); 
        Assert.assertEquals(solo.getAcidez(), TexturaSolo.TEXTURA_MEDIA.getValoresIdeais().getAcidez(), 0.0);
    }
    
    @Test
    public void testeGetSCmol() {
        Assert.assertEquals(7.54, new Solo(8.59, 0.15, 5.76, 1.63, 3.67, 0.0, 5.35).getSCmol(), 0.0);
    }

    @Test
    public void testeGetCTCCmol() {
        Assert.assertEquals(12.89, new Solo(8.59, 0.15, 5.76, 1.63, 3.67, 0.0, 5.35).getCTCCmol(), 0.0);    
    }

    @Test
    public void testeGetVPercentual() {
        Assert.assertEquals(58.49, new Solo(8.59, 0.15, 5.76, 1.63, 3.67, 0.0, 5.35).getVPercentual(), 0.1);
    }
    
    @Test
    public void testeGetMOPercentual() {
        Assert.assertEquals(3.07, new Solo(8.59, 0.15, 5.76, 1.63, 3.67, 0.0, 5.35).getMOPercentual(30.7), 0.1);
    }
    
    @Test
    public void testeGetCarbono() {
        Assert.assertEquals(17.84, new Solo(8.59, 0.15, 5.76, 1.63, 3.67, 0.0, 5.35).getCarbono(3.07), 0.1);
    }
}
    




