/**Clase C reenombrada a clase Saludar
 * @author Cristian Cazas
 */
public class Saludar{
    /**Encapsulamiento del método imprimirSaludo
     * @author Cristian Cazas
     */
    public static void imprimirSaludo() {
        if (Datos.edad < 18) {
            System.out.println("Hola, joven " + Datos.nombre);
        } else {
            System.out.println("Hola, señor/a " + Datos.nombre);
        }
    }
}
