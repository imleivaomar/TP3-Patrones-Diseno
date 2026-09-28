package tp3.abstractfactory;

public class FabricaComboVegano implements FabricaCombo {

    @Override
    public PlatoPrincipal crearPlato() {
        return new HamburguesaLentejas();
    }

    @Override
    public Bebida crearBebida() {
        return new LicuadoVegetal();
    }

    @Override
    public Postre crearPostre() {
        return new BudinVegano();
    }
}
