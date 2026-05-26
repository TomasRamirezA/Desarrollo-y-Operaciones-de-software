package eci.edu.dosw.parcial.Parcial_Corte_1_CVDS.DOSW.Parcial;

public class Universidad {

    public static void main(String[] args) {
        Usuario profe1 = new Usuario("Profesor Juan");
        Usuario profe2 = new Usuario("Profesora Ana");

        Reporte reporte1 = new ReporteTablas(new PDF());
        Reporte reporte2 = new ReporteTablas(new Excel());

        profe1.solicitarReporte(reporte1);
        profe2.solicitarReporte(reporte2);
    }
}
