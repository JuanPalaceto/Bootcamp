public class Main {

    public static void main(String[] args) {
        Persona persona = new Persona();

        persona.setEdad(23);
        persona.setNombre("Juan");
        persona.setTelefono("8342467065");

        int edad = persona.getEdad();
        String nombre = persona.getNombre();
        String telefono = persona.getTelefono();

        System.out.println("Hola, "+nombre+ " sabemos que tienes "+edad+" años y tu número" +
                " telefonico es " +telefono);
    }

}

class Persona {
    private int edad;
    private String nombre;
    private String telefono;

    public void setEdad(int edad){
        this.edad = edad;
    }

    public int getEdad(){
        return this.edad;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public String getNombre(){
        return this.nombre;
    }

    public void setTelefono(String telefono){
        this.telefono = telefono;
    }

    public String getTelefono(){
        return this.telefono;
    }
}