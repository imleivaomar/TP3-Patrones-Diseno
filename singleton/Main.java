package tp3.singleton;

public class Main {

    public static void main(String[] args) {
        System.out.println("=== SINGLETON: Generador de turnos de la clínica ===");

        PuestoRecepcion guardia = new PuestoRecepcion("Guardia");
        PuestoRecepcion consultorios = new PuestoRecepcion("Consultorios externos");

        guardia.atenderPaciente("Lucía Gómez", "Clínica médica");
        consultorios.atenderPaciente("Martín Díaz", "Traumatología");
        guardia.atenderPaciente("Ana Pérez", "Pediatría");
        consultorios.atenderPaciente("Jorge Ruiz", "Cardiología");

        GeneradorDeTurnos g1 = GeneradorDeTurnos.getInstancia();
        GeneradorDeTurnos g2 = GeneradorDeTurnos.getInstancia();

        System.out.println("Último número emitido: " + g1.getUltimoNumero());
        System.out.println("¿g1 y g2 son la misma instancia? " + (g1 == g2));
        System.out.println();
    }
}
