package tp3.decorator;

public class Main {

    public static void main(String[] args) {
        System.out.println("=== DECORATOR: Alquiler de autos con extras ===");

        Alquiler simple = new AlquilerBasico("Fiat Cronos", 35000);
        mostrar(simple, 3);

        Alquiler familiar = new ConSeguroTotal(new ConSillaBebe(new ConGPS(new AlquilerBasico("Toyota SW4", 60000))));
        mostrar(familiar, 5);

        Alquiler conDosSillas = new ConSillaBebe(new ConSillaBebe(new AlquilerBasico("VW Amarok", 55000)));
        mostrar(conDosSillas, 2);
        System.out.println();
    }

    private static void mostrar(Alquiler alquiler, int dias) {
        System.out.println(alquiler.getDescripcion());
        System.out.printf("  Costo diario: $%.2f | %d días: $%.2f%n",
                alquiler.getCostoDiario(), dias, alquiler.getCostoDiario() * dias);
    }
}
