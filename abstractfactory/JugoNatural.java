package tp3.abstractfactory;

public class JugoNatural implements Bebida {

    @Override
    public String getDescripcion() {
        return "Jugo de naranja natural";
    }

    @Override
    public double getPrecio() {
        return 1500.0;
    }
}
