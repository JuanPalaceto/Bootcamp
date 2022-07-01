public class Main {
    public static void main(String[] args) {
        Cliente cliente = new Cliente();
        cliente.edad = 23;
        cliente.telefono="8342467065";
        cliente.nombre="Juan";
        cliente.credito=3.5;

        System.out.println("El cliente "+cliente.nombre+" tiene "+cliente.edad + " años. Su telefono es "+cliente.telefono+" y tiene un crédito de $" + cliente.credito);

        Trabajador trabajador = new Trabajador();
        trabajador.edad = 36;
        trabajador.telefono="8340000000";
        trabajador.nombre="Pedro";
        trabajador.salario=6500.50;

        System.out.println("El trabajador "+trabajador.nombre+" tiene "+trabajador.edad + " años. Su telefono es "+trabajador.telefono+" y tiene un salario de $" + trabajador.salario);
    }
}

class Persona {
    int edad;
    String nombre;
    String telefono;
}

class Cliente extends Persona {
    double credito;
}

class Trabajador extends Persona {
    double salario;
}