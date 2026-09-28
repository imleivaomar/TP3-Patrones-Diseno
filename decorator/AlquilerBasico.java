package tp3.decorator;

public class AlquilerBasico implements Alquiler {

    private final String modeloAuto;
    private final double tarifaDiaria;

    public AlquilerBasico(String modeloAuto, double tarifaDiaria) {
        this.modeloAuto = modeloAuto;
        this.tarifaDiaria = tarifaDiaria;
    }

    @Override
    public String getDescripcion() {
        return "Alquiler de " + modeloAuto;
    }

    @Override
    public double getCostoDiario() {
        return tarifaDiaria;
    }
}
