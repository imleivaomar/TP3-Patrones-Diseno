package tp3.adapter;

public class Main {

    public static void main(String[] args) {
        System.out.println("=== ADAPTER: Monitor de temperatura del invernadero ===");

        MonitorInvernadero monitor = new MonitorInvernadero();
        monitor.agregarSensor(new SensorNacional("Sector tomates", 24.5));
        monitor.agregarSensor(new SensorNacional("Sector lechugas", 19.0));

        TermometroImportado importado1 = new TermometroImportado("ThermoX-200", 95.0f);
        TermometroImportado importado2 = new TermometroImportado("ThermoX-200", 71.6f);
        monitor.agregarSensor(new AdaptadorTermometro(importado1, "Sector frutillas"));
        monitor.agregarSensor(new AdaptadorTermometro(importado2, "Depósito"));

        monitor.verificarTemperaturas();
        System.out.println();
    }
}
