package tp3.abstractfactory;

public class LicuadoVegetal implements Bebida {

    @Override
    public String getDescripcion() {
        return "Licuado de banana con leche de almendras";
    }

    @Override
    public double getPrecio() {
        return 2100.0;
    }
}
