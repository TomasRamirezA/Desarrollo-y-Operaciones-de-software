package eci.edu.dosw.parcial.Parcial_Corte_1_CVDS.DOSW.Parcial;

public abstract class Reporte {
    protected Exportador exportador;

    public Reporte(Exportador exportador) {
        this.exportador = exportador;
    }

    public abstract void generar();
    }

    interface Exportador {
        void exportar(String contenido);
    }
