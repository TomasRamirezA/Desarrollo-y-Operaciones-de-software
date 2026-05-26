package edu.dosw.lab.Reto3;

import java.util.*;

public class Votacion {

    private static final List<Integer> FIBONACCI = Arrays.asList(1, 2, 3, 5, 8, 13);
    private final Scanner sc;

    public Votacion(Scanner sc) {
        this.sc = sc;
    }

    public int votar() {
        boolean consenso = false;
        int valor = -1;

        while (!consenso) {
            System.out.print("numero de integrantes que hay ");
            int n = sc.nextInt();

            List<Integer> votos = new ArrayList<>();
            for (int i = 1; i <= n; i++) {
                int voto = pedirVoto(i);
                votos.add(voto);
            }

            consenso = votos.stream().distinct().count() == 1;
            if (consenso) {
                valor = votos.get(0);
                System.out.println("acuerdo alcanzado: " + valor);
            } else {
                System.out.println("votos: " + votos);
                System.out.println("no se llego a un acuerdo, vuelvan a votar.\n");
            }
        }
        return valor;
    }

    private int pedirVoto(int integrante) {
        int voto;
        while (true) {
            System.out.print("integrante " + integrante + " voto (1,2,3,5,8,13): ");
            voto = sc.nextInt();
            if (FIBONACCI.contains(voto)) break;
            System.out.println("valor invalido, intente otra vez");
        }
        return voto;
    }
}
