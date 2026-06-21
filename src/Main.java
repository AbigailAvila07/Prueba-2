import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int hombresAdultos = 0;
        int hombresMenores = 0;
        int mujeresAdultas = 0;
        int mujeresMenores = 0;

        System.out.print("Indique la cantidad de personas que desea ingresar: ");
        int cantidad = entrada.nextInt();
        entrada.nextLine();

        Persona[] registroPersonas = new Persona[cantidad];

        for (int posicion = 0; posicion < cantidad; posicion++) {

            System.out.println("\nRegistro de la persona " + (posicion + 1));

            System.out.print("Escriba su nombre: ");
            String nombrePersona = entrada.nextLine();

            System.out.print("Escriba su edad: ");
            int edadPersona = entrada.nextInt();
            entrada.nextLine();

            System.out.print("Escriba su género (hombre/mujer): ");
            String generoPersona = entrada.nextLine();

            registroPersonas[posicion] =
                    new Persona(nombrePersona, edadPersona, generoPersona);

            if (generoPersona.equalsIgnoreCase("hombre")
                    && edadPersona >= 18) {

                System.out.println("Se agregó un hombre adulto.");
                hombresAdultos++;

            } else if (generoPersona.equalsIgnoreCase("mujer")
                    && edadPersona >= 18) {

                System.out.println("Se agregó una mujer adulta.");
                mujeresAdultas++;

            } else if (generoPersona.equalsIgnoreCase("hombre")
                    && edadPersona < 18) {

                System.out.println("Se agregó un hombre menor.");
                hombresMenores++;

            } else if (generoPersona.equalsIgnoreCase("mujer")
                    && edadPersona < 18) {

                System.out.println("Se agregó una mujer menor.");
                mujeresMenores++;

            } else {
                System.out.println("El género ingresado no es válido.");
            }
        }

        System.out.println("\n=== Personas registradas ===");

        for (int posicion = 0; posicion < cantidad; posicion++) {
            System.out.println(registroPersonas[posicion].DatosPersona());
        }

        System.out.println("\n=== Resumen del registro ===");
        System.out.println("Cantidad de hombres adultos: " + hombresAdultos);
        System.out.println("Cantidad de hombres menores: " + hombresMenores);
        System.out.println("Cantidad de mujeres adultas: " + mujeresAdultas);
        System.out.println("Cantidad de mujeres menores: " + mujeresMenores);

        entrada.close();
    }
}