package tp3.decorator;

public class ConSeguroTotal extends ExtraAlquiler {

    private static final double RECARGO = 0.15;

    public ConSeguroTotal(Alquiler alquiler) {
        super(alquiler);
    }

    @Override
    public String getDescripcion() {
        return alquiler.getDescripcion() + " + seguro total (15%)";
    }

    @Override
    public double getCostoDiario() {
        return alquiler.getCostoDiario() * (1 + RECARGO);
    }
}
