import model.Solo;
import model.TexturaSolo;
import org.junit.Assert;
import org.junit.Test;

public class SoloTest{

    @Test
    public void testeValoresIdeaisSoloArgiloso() {
        Solo solo = new Solo(TexturaSolo.ARGILOSO, 8.59, 0.15, 5.76, 1.63, 3.67, 0.0, 0.0);
        Assert.assertEquals(9, solo.getValorIdealFosforo(), 0.0);
        Assert.assertEquals(0.35, solo.getValorIdealPotassio(), 0.0);
        Assert.assertEquals(6.0, solo.getValorIdealCalcio(), 0.0);
        Assert.assertEquals(1.5, solo.getValorIdealMagnesio(), 0.0);
        Assert.assertEquals(9.0, solo.getValorIdealEnxofre(), 0.0);
        Assert.assertEquals(0.0, solo.getValorIdealAluminio(), 0.0);
    }
    
    @Test
    public void testeValoresIdeaisSoloTexturaMedia() {
        Solo solo = new Solo(TexturaSolo.TEXTURA_MEDIA, 8.59, 0.15, 5.76, 1.63, 3.67, 0.0, 5.35);
        Assert.assertEquals(12.0, solo.getValorIdealFosforo(), 0.0);
        Assert.assertEquals(0.25, solo.getValorIdealPotassio(), 0.0);
        Assert.assertEquals(4.0, solo.getValorIdealCalcio(), 0.0);
        Assert.assertEquals(1.0, solo.getValorIdealMagnesio(), 0.0);
        Assert.assertEquals(6.0, solo.getValorIdealEnxofre(), 0.0);
        Assert.assertEquals(0.0, solo.getValorIdealAluminio(), 0.0);
    }
    
    @Test
    public void testeGetSCmol() {
        Solo solo = new Solo(TexturaSolo.ARGILOSO, 8.59, 0.15, 5.76, 1.63, 3.67, 0.0, 5.35);
        Assert.assertEquals(7.54, solo.getSCmol(), 0.0);
    }

    @Test
    public void testeGetCTCCmol() {
        Solo solo = new Solo(TexturaSolo.ARGILOSO, 8.59, 0.15, 5.76, 1.63, 3.67, 0.0, 5.35);
        Assert.assertEquals(12.89, solo.getCTCCmol(), 0.0);    
    }

    @Test
    public void testeGetVPercentual() {
        Solo solo = new Solo(TexturaSolo.ARGILOSO, 8.59, 0.15, 5.76, 1.63, 3.67, 0.0, 5.35);
        Assert.assertEquals(58.49, solo.getVPercentual(), 0.1);
    }
    
    @Test
    public void testeGetMOPercentual() {
        Solo solo = new Solo(TexturaSolo.ARGILOSO, 8.59, 0.15, 5.76, 1.63, 3.67, 0.0, 5.35);
        Assert.assertEquals(3.07, solo.getMOPercentual(30.7), 0.1);
    }
    
    @Test
    public void testeGetCarbono() {
        Solo solo = new Solo(TexturaSolo.ARGILOSO, 8.59, 0.15, 5.76, 1.63, 3.67, 0.0, 5.35);
        Assert.assertEquals(17.84, solo.getCarbono(3.07), 0.1);
    }
}
    




