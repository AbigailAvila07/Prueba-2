public class Persona {

    String nombrePersona;
    int edadPersona;
    String generoPersona;

    public Persona(String nombrePersona, int edadPersona, String generoPersona) {
        this.nombrePersona = nombrePersona;
        this.edadPersona = edadPersona;
        this.generoPersona = generoPersona;
    }

    public String DatosPersona() {
        return "Nombre registrado: " + nombrePersona +
                "\nEdad registrada: " + edadPersona +
                "\nGénero registrado: " + generoPersona;
    }
}