package eci.edu.dosw.parcial.Parcial_Corte_1_CVDS.DOSW.Parcial;

public class ReporteTablas extends Reporte {
    public ReporteTablas(Exportador exportador) {
        super(exportador);
    }

    @Override
    public void generar() {
        String contenido = "Tabla de calificaciones";
        exportador.exportar(contenido);
    }
}

