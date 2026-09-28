package tp3.decorator;

public class ConSillaBebe extends ExtraAlquiler {

    private static final double COSTO_SILLA = 2500;

    public ConSillaBebe(Alquiler alquiler) {
        super(alquiler);
    }

    @Override
    public String getDescripcion() {
        return alquiler.getDescripcion() + " + silla de bebé";
    }

    @Override
    public double getCostoDiario() {
        return alquiler.getCostoDiario() + COSTO_SILLA;
    }
}
