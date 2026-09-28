package tp3.abstractfactory;

public class Helado implements Postre {

    @Override
    public String getDescripcion() {
        return "Helado de dulce de leche con juguete sorpresa";
    }

    @Override
    public double getPrecio() {
        return 1200.0;
    }
}
