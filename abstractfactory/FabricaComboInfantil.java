package tp3.abstractfactory;

public class FabricaComboInfantil implements FabricaCombo {

    @Override
    public PlatoPrincipal crearPlato() {
        return new HamburguesaSimple();
    }

    @Override
    public Bebida crearBebida() {
        return new JugoNatural();
    }

    @Override
    public Postre crearPostre() {
        return new Helado();
    }
}
