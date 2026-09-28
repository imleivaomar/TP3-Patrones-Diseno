package tp3.abstractfactory;

public class BudinVegano implements Postre {

    @Override
    public String getDescripcion() {
        return "Budín de limón sin huevo ni lácteos";
    }

    @Override
    public double getPrecio() {
        return 1800.0;
    }
}
