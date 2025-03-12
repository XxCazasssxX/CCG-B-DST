/**
 * 
 */
class datos {
    static String nombre = "SinNombre";
    static int edad = 0;
    static double salario = 0.0;

    static void datos(String nombre, int edad, double salario) {
        nombre = nombre;
        edad = edad;
        salario = salario;
    }

    static void mostrar() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Salario: " + salario);
    }
}

class B {
    void calcularBono() {
        double bono = 0;
        if (datos.edad > 50) {
            bono = datos.salario * 0.10;
        } else {
            bono = datos.salario * 0.05;
        }
        System.out.println("Bono: " + bono);
    }
}

class C {
    void imprimirSaludo() {
        if (datos.edad < 18) {
            System.out.println("Hola, joven " + datos.nombre);
        } else {
            System.out.println("Hola, señor/a " + datos.nombre);
        }
    }
}

public class Main {
    /**
     * @param args
     */
    public static void main(String[] args) {
        datos.datos("Juan Perez", 45, 50000);
        datos.mostrar();
        B b = new B();
        b.calcularBono();
        C c = new C();
        c.imprimirSaludo();
    }
}
