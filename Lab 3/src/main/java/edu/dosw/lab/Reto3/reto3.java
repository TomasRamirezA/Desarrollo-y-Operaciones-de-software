package edu.dosw.lab.Reto3;

import java.util.*;

public class reto3 {

    private static final Scanner sc = new Scanner(System.in);

    public static void iniciarPrograma() {
        List<Historia> historias = Arrays.asList(
                new Historia("historia 1: como usuario quiero registrarme para poder acceder a la aplicacion"),
                new Historia("historia 2: como usuario quiero consultar cuanto saldo tengo"),
                new Historia("historia 3: como usuario quiero realizar un deposito")
        );

        Votacion votacion = new Votacion(sc);

        for (Historia historia : historias) {
            System.out.println("\nestimando: " + historia.getDescripcion());
            int puntaje = votacion.votar();
            historia.setPuntaje(puntaje);
        }

        System.out.println("\n--- resumen ---");
        for (Historia historia : historias) {
            System.out.println(historia.getDescripcion() + " -> " + historia.getPuntaje());
        }
    }
}
