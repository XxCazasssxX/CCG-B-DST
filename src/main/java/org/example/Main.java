class Datos {
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
        if (Datos.edad > 50) {
            bono = Datos.salario * 0.10;
        } else {
            bono = Datos.salario * 0.05;
        }
        System.out.println("Bono: " + bono);
    }
}

class C {
    void imprimirSaludo() {
        if (Datos.edad < 18) {
            System.out.println("Hola, joven " + Datos.nombre);
        } else {
            System.out.println("Hola, señor/a " + Datos.nombre);
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Datos.datos("Juan Perez", 45, 50000);
        Datos.mostrar();
        B b = new B();
        b.calcularBono();
        C c = new C();
        c.imprimirSaludo();
    }
}
