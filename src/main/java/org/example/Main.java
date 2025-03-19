class A {
    static String nombre = "SinNombre";
    static int edad = 0;
    static double salario = 0.0;

    static void datos(String n, int e, double s) {
        nombre = n;
        edad = e;
        salario = s;
    }

    static void mostrar() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Salario: " + salario);
    }
}



class C {
    void imprimirSaludo() {
        if (A.edad < 18) {
            System.out.println("Hola, joven " + A.nombre);
        } else {
            System.out.println("Hola, señor/a " + A.nombre);
        }
    }
}


/**
 * Encapsulamiento de la clase main
 * @author David Salgado
 */
public class Main {
    /**
     * @param args
     * // Se renombró la variable 'b' a 'calcularBono' para mejorar la legibilidad del código.
     */
    public static void main(String[] args) {
        A.datos("Juan Perez", 45, 50000);
        A.mostrar();
        calcularBono bono = new calcularBono();
        bono.calcularBono();
        C c = new C();
        c.imprimirSaludo();
    }
}
