import model.Solo;
import org.junit.Assert;
import org.junit.Test;

public class SoloTest{

    @Test
    public void valorIdealFosforoSolo1() {
        Solo solo = new Solo();
        solo.setTipoSolo(1);
        Assert.assertEquals(9, solo.valorIdealFosforo(solo));
    }

    @Test
    public void valorIdealFosforoSolo2() {
        Solo solo = new Solo();
        solo.setTipoSolo(2);
        Assert.assertEquals(12, solo.valorIdealFosforo(solo));
    }

    @Test
    public void valorIdealPotassioSolo1() {
        Solo solo = new Solo();
        solo.setTipoSolo(1);
        Assert.assertEquals(0.35, solo.valorIdealPotassio(solo), 0.0);
    }

    @Test
    public void valorIdealPotassioSolo2() {
        Solo solo = new Solo();
        solo.setTipoSolo(2);
        Assert.assertEquals(0.25, solo.valorIdealPotassio(solo),0.0);
    }

    @Test
    public void valorIdealCalcioSolo1() {
        Solo solo = new Solo();
        solo.setTipoSolo(1);
        Assert.assertEquals(6, solo.valorIdealCalcio(solo));
    }

    @Test
    public void valorIdealCalcioSolo2() {
        Solo solo = new Solo();
        solo.setTipoSolo(2);
        Assert.assertEquals(4, solo.valorIdealCalcio(solo));
    }

    @Test
    public void valorIdealMagnesioSolo1() {
        Solo solo = new Solo();
        solo.setTipoSolo(1);
        Assert.assertEquals(1.5, solo.valorIdealMagnesio(solo),0.0);
    }

    @Test
    public void valorIdealMagnesioSolo2() {
        Solo solo = new Solo();
        solo.setTipoSolo(2);
        Assert.assertEquals(1.0, solo.valorIdealMagnesio(solo),0.0);
    }

    @Test
    public void valorIdealEnxofreSolo1() {
        Solo solo = new Solo();
        solo.setTipoSolo(1);
        Assert.assertEquals(9, solo.valorIdealEnxofre(solo));
    }

    @Test
    public void valorIdealEnxofreSolo2() {
        Solo solo = new Solo();
        solo.setTipoSolo(2);
        Assert.assertEquals(6, solo.valorIdealEnxofre(solo));
    }

    @Test
    public void valorIdealAluminioSolo1() {
        Solo solo = new Solo();
        Assert.assertEquals(0, solo.valorIdealAluminio());
    }

    @Test
    public void valorIdealAluminioSolo2() {
        Solo solo = new Solo();
        Assert.assertEquals(0, solo.valorIdealAluminio());
    }

}



