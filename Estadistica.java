package estadistica;

public class Estadistica {
    private int numElementos;
    private double sumaX, sumaX2;

    /** Esta función nos sirve para agregar datos a la serie
     *
     * @numElementos = Número de elementos de la serie de tipo int
     * @sumaX = Suma de los elementos de la serie de tipo double
     * @sumaX2 = Suma de los cuadrados de la serie de tipo double
     *
     */
    public void agrega(double d) {
        numElementos ++;
        sumaX += d;
        sumaX2 += d*d;
    }

    /** Esta función nos sirve para agregar n veces el dato d a la serie
     *
     * @param d = Dato agregado de tipo double
     * @param n = Dato agregado de tipo int
     *
     */
    public void agrega(double d, int n) {
        numElementos += n;
        sumaX += n*d;
        sumaX2 += n*d*d;
    }

    // Devuelve la media de la serie realizada
    public double media() {
        return sumaX / numElementos;
    }

    // Devuelve la varianza de la serie realizada
    public double varianza() {
        return (sumaX2 / numElementos) - Math.pow(media(), 2);
    }

    // Devuelve la desviación típica de la serie realizada
    public double desviacionTipica() {
        return Math.sqrt(varianza());
    }



}
