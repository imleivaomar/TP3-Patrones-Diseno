package tp3.abstractfactory;

public class Pedido {

    private final String cliente;
    private final PlatoPrincipal plato;
    private final Bebida bebida;
    private final Postre postre;

    public Pedido(String cliente, FabricaCombo fabrica) {
        this.cliente = cliente;
        this.plato = fabrica.crearPlato();
        this.bebida = fabrica.crearBebida();
        this.postre = fabrica.crearPostre();
    }

    public double calcularTotal() {
        return plato.getPrecio() + bebida.getPrecio() + postre.getPrecio();
    }

    public void mostrarResumen() {
        System.out.println("Pedido de " + cliente + ":");
        System.out.printf("  Plato:  %-45s $%.2f%n", plato.getDescripcion(), plato.getPrecio());
        System.out.printf("  Bebida: %-45s $%.2f%n", bebida.getDescripcion(), bebida.getPrecio());
        System.out.printf("  Postre: %-45s $%.2f%n", postre.getDescripcion(), postre.getPrecio());
        System.out.printf("  TOTAL:  $%.2f%n", calcularTotal());
    }
}
