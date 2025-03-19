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

public class Main {
    public static void main(String[] args) {
        Datos.datos("Juan Perez", 45, 50000);
        Datos.mostrar();
        B b = new B();
        b.calcularBono();
        Saludar saludo = new Saludar();
        Saludar.imprimirSaludo();
    }
}
