package tp3.abstractfactory;

public class HamburguesaSimple implements PlatoPrincipal {

    @Override
    public String getDescripcion() {
        return "Hamburguesa simple con papas";
    }

    @Override
    public double getPrecio() {
        return 4500.0;
    }
}
