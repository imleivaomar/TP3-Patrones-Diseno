package tp3.abstractfactory;

public class Main {

    public static void main(String[] args) {
        System.out.println("=== ABSTRACT FACTORY: Combos de la app de delivery ===");

        FabricaCombo fabrica = elegirFabrica("vegano");
        Pedido pedido1 = new Pedido("Sofía", fabrica);
        pedido1.mostrarResumen();

        fabrica = elegirFabrica("infantil");
        Pedido pedido2 = new Pedido("Tomás", fabrica);
        pedido2.mostrarResumen();
        System.out.println();
    }

    private static FabricaCombo elegirFabrica(String tipo) {
        return switch (tipo) {
            case "vegano" -> new FabricaComboVegano();
            case "infantil" -> new FabricaComboInfantil();
            default -> throw new IllegalArgumentException("Tipo de combo no válido: " + tipo);
        };
    }
}
