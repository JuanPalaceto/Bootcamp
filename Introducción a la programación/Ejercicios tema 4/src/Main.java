public class Main {

    public static void main(String[] args) {
        System.out.println("If - Else If - Else");
        int numeroIf = -10;
        if (numeroIf > 0) {
            System.out.println("El número es positivo");
        } else if (numeroIf < 0) {
            System.out.println("El número es negativo");
        } else {
            System.out.println("El número es 0");
        }

        System.out.println("While");
        int numeroWhile = 0;
        while (numeroWhile < 3) {
            numeroWhile++;
            System.out.println(numeroWhile);
        }

        System.out.println("Do While");
        do {
            numeroWhile++;
            System.out.println(numeroWhile);
        } while (numeroWhile < 3);

        System.out.println("For");
        for (int numeroFor = 0; numeroFor <= 3; numeroFor++){
            System.out.println(numeroFor);
        }

        System.out.println("Switch");
        String estacion = "Verano";
        switch (estacion) {
            case "Primavera":
                System.out.println("La estación es Primavera");
                break;
            case "Verano":
                System.out.println("La estación es Verano");
                break;
            case "Otoño":
                System.out.println("La estación es Otoño");
                break;
            case "Invierno":
                System.out.println("La estación es Invierno");
                break;
            default:
                System.out.println("Esta es la opción default, no es una una estación");
        }
    }

}
