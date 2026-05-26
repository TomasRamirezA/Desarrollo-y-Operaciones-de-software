package edu.dosw.lab.Reto4;

/**
 * Enumeración que representa los diferentes tipos de bancos disponibles.
 * Cada banco tiene un código asociado.
 */
public enum Banco {
    BANCOLOMBIA("01"),
    DAVIVIENDA("02");

    private final String codigo;

    /**
     * Constructor del metodo enum Banco.
     * @param codigo El código único del banco.
     */
    Banco(String codigo) {
        this.codigo = codigo;
    }

    /**
     * Obtiene el código asociado al banco.
     * @return El código del banco.
     */
    public String getCodigo() {
        return codigo;
    }
}
