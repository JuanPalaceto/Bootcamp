import com.sun.security.jgss.GSSUtil;

public class Main {
    public static void main(String[] args) {
        // Primera parte
        suma(10, 20, 30);
        // System.out.println(suma(10, 20, 30));

        // Segunda Parte
        Coche miCoche = new Coche();
        miCoche.aumentaPuerta();
        System.out.println(miCoche.puertas);
    }

    // Primera Parte
    public static int suma ( int num1, int num2, int num3){
        return num1 + num2 + num3;
    }
}

// Segunda Parte
class Coche {
    public int puertas;

    public void aumentaPuerta(){
        this.puertas++;
    }
}
