package tp3.abstractfactory;

public class HamburguesaLentejas implements PlatoPrincipal {

    @Override
    public String getDescripcion() {
        return "Hamburguesa de lentejas con ensalada";
    }

    @Override
    public double getPrecio() {
        return 5200.0;
    }
}
