package eci.edu.dosw.parcial.Parcial_Corte_1_CVDS.DOSW;

import eci.edu.dosw.parcial.Parcial_Corte_1_CVDS.DOSW.Parcial.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ApplicationTests {
    @Test
    void contextLoads() {
        Assertions.assertTrue(true);
    }

    @Test
    void testReporteTablasPDF() {
        Reporte reporte = new ReporteTablas(new PDF());
        Assertions.assertDoesNotThrow(reporte::generar);
    }

    @Test
    void testReporteTablasExcel() {
        Reporte reporte = new ReporteTablas(new Excel());
        Assertions.assertDoesNotThrow(reporte::generar);
    }

    @Test
    void testReporteTablasHtml() {
        Reporte reporte = new ReporteTablas(new Html());
        Assertions.assertDoesNotThrow(reporte::generar);
    }

    @Test
    void testUsuarioSolicitaReporte() {
        Usuario usuario = new Usuario("Profesor Juan");
        Reporte reporte = new ReporteTablas(new PDF());
        Assertions.assertDoesNotThrow(() -> usuario.solicitarReporte(reporte));
    }

    @Test
    void testUniversidadMain() {
        Assertions.assertDoesNotThrow(() -> Universidad.main(new String[]{}));
    }
}
