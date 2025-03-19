/** Clase A cambiada a clase Datos y encapsulada
 * @author Cristian Cazas
 */
public class Datos {
    public static String nombre = "SinNombre";
    public static int edad = 0;
    public static double salario = 0.0;

    /**Encapsulamiento de los del constructor datos
     * @param nombre
     * @param edad
     * @param salario
     * @author Cristian Cazas
     */
    public static void datos(String nombre, int edad, double salario) {
        nombre = nombre;
        edad = edad;
        salario = salario;
    }

    /**Encapsulamiento del método mostrar
     * @author Cristian Cazas
     */
    public static void mostrar() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Salario: " + salario);
    }
}
