package eci.edu.dosw.parcial.Parcial_Corte_1_CVDS.DOSW.Parcial;

public class Usuario {
    private String nombre;

    public Usuario(String nombre) {
        this.nombre = nombre;
    }

    public void solicitarReporte(Reporte reporte) {
        System.out.println(nombre + " solicitó un reporte:");
        reporte.generar();
    }
}

