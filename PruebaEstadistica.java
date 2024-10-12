package estadistica;
import java.util.Random;

public class PruebaEstadistica {
    public static void main(String[] args) {
        Estadistica est = new Estadistica();

        Random ran = new Random();
        for(int i = 0; i < 100000; i++){
            est.agrega(ran.nextGaussian());
        }
        System.out.println("Media = " + est.media());
        System.out.println("Desviación Típica = " + est.desviacionTipica());
        System.out.println("Varianza = " + est.varianza());
    }
}
