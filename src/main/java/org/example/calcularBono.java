public class calcularBono {
    /**
     * Encapsulamiento del metodo calcularBono
     * Actualizacion del nombre de la clase para mayor claridad
     * @author David Salgado
     */

    public void calcularBono() {
        double bono = 0;
        if (A.edad > 50) {
            bono = A.salario * 0.10;
        } else {
            bono = A.salario * 0.05;
        }
        System.out.println("Bono: " + bono);
    }
}
