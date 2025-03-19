<<<<<<< HEAD
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
=======
class B {
    void calcularBono() {
        double bono = 0;
        if (Datos.edad > 50) {
            bono = Datos.salario * 0.10;
        } else {
            bono = Datos.salario * 0.05;
        }
        System.out.println("Bono: " + bono);
    }
}

>>>>>>> ad7625fd7b61a5359a6b195a4ac86237c84dc452
public class Main {
    /**
     * @param args
     * // Se renombró la variable 'b' a 'calcularBono' para mejorar la legibilidad del código.
     */
    public static void main(String[] args) {
<<<<<<< HEAD
        A.datos("Juan Perez", 45, 50000);
        A.mostrar();
        calcularBono bono = new calcularBono();
        bono.calcularBono();
        C c = new C();
        c.imprimirSaludo();
=======
        Datos.datos("Juan Perez", 45, 50000);
        Datos.mostrar();
        B b = new B();
        b.calcularBono();
        Saludar saludo = new Saludar();
        Saludar.imprimirSaludo();
>>>>>>> ad7625fd7b61a5359a6b195a4ac86237c84dc452
    }
}
